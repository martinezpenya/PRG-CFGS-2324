package UD06.P4_Sockets;

import java.io.*;
import java.net.*;
import java.util.Enumeration;

public class AWSServerSocket {

    private final static int PUERTO = 6000;

    private static void mostrarIPs(StringBuilder sb) {
        try {
            Enumeration Interfaces = NetworkInterface.getNetworkInterfaces();
            while (Interfaces.hasMoreElements()) {
                NetworkInterface Interface = (NetworkInterface) Interfaces.nextElement();
                Enumeration Addresses = Interface.getInetAddresses();
                while (Addresses.hasMoreElements()) {
                    InetAddress Address = (InetAddress) Addresses.nextElement();
                    sb.append("\n\t").append(Address.getHostAddress()).append(":").append(PUERTO);
                }
            }
        } catch (SocketException ex) {
            System.err.println("Error. Al intentar obtener las interfaces de red.");
        }
    }

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PUERTO);) {
            StringBuilder sb = new StringBuilder();
            sb.append("Server iniciado y escuchando en la ip y puerto: ");
            mostrarIPs(sb);
            System.out.println(sb.toString());
            while (true) {
                Socket clientSocket = serverSocket.accept();

                ObjectInputStream entrada = new ObjectInputStream(new BufferedInputStream(clientSocket.getInputStream()));
                String fraseRecibida = (String) entrada.readObject();
                System.out.println("La frase recibida es: " + fraseRecibida);

                ObjectOutputStream salida = new ObjectOutputStream(new BufferedOutputStream(clientSocket.getOutputStream()));
                String fraseDevuelta = fraseRecibida.toUpperCase();
                System.out.println("El server devuelve la frase: " + fraseDevuelta);
                salida.writeObject(fraseDevuelta);
                salida.flush();//vaciamos el buffer

                clientSocket.close(); //cerramos el socket cliente
                System.out.println("Server esperando una nueva conexión...");
            }
        } catch (ClassNotFoundException ex) {
            System.err.println("Error. Clase no encontrada");
        } catch (IOException ex) {
            System.err.println("Error. De entrada salida." + ex.toString());
        }
    }
}
