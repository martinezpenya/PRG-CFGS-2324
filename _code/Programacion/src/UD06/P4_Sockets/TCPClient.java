package UD06.P4_Sockets;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket;
        ObjectInputStream entrada;
        ObjectOutputStream eixida;
        String frase;

        socket = new Socket(InetAddress.getLocalHost(), 6000);
        eixida = new ObjectOutputStream(socket.getOutputStream());

        System.out.println("Introduce la frase a enviar en minúsculas");
        Scanner in = new Scanner(System.in);
        frase = in.nextLine();
        System.out.println("Se envia la frase " + frase);
        eixida.writeObject(frase);

        entrada = new ObjectInputStream(socket.getInputStream());
        System.out.println(
                "La frase recibida es: " + (String) entrada.readObject());

        socket.close();
    }
}