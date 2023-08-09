package UD05;

public class Anexo1Wrappers {

    public static void main(String[] args) {

        // WRAPPERS
        Integer i1 = new Integer(42);
        Integer i2 = new Integer("42");
        Float f1 = new Float(3.14f);
        Float f2 = new Float("3.14f");

        Integer y = new Integer(567);	   //Crea el objeto
        y++;				   //Lo desenvuelve, incrementa y lo vuelve a envolver 
        System.out.println("Valor: " + y); //Imprime el valor del Objeto y     

        // VALUEOF
        // Convierte el 101011 (base 2) a 43 y le asigna el valor al objeto Integer i1 
        Integer i3 = Integer.valueOf("101011", 2);
        System.out.println(i3);

        // Asigna 3.14 al objeto Float f3 
        Float f3 = Float.valueOf("3.14f");
        System.out.println(f3);

        // XXXVALUE
        Integer i4 = 120; // Crea un nuevo objeto wrapper
        byte b = i4.byteValue(); // Convierte el valor de i2 a un primitivo byte 
        short s1 = i4.shortValue(); // Otro de los métodos de Integer
        double d = i4.doubleValue(); // Otro de los métodos xxxValue de Integer 
        System.out.println(s1); // Muestra 120 como resultado

        Float f4 = 3.14f; // Crea un nuevo objeto wrapper
        short s2 = f4.shortValue(); // Convierte el valor de f2 en un primitivo short
        System.out.println(s2); // El resultado es 3 (truncado, no redondeado)

        // PARSEXXXX
        double d4 = Double.parseDouble("3.14"); // Convierte un String a primitivo 
        System.out.println("d4 = " + d4);	// El resultado será d4 = 3.14 
        long l2 = Long.parseLong("101010", 2);	// un String binario a primitivo
        System.out.println("l2 = " + l2);	// El resultado es L2 42

        // TOSTRING
        Double d1 = new Double("3.14");
        System.out.println("d1 = " + d1.toString()); // El resultado es d = 3.14 
        String d2 = Double.toString(3.14); // d2 = "3.14"
        System.out.println("d2 = " + d2); // El resultado es d = 3.14 
        String s3 = "hex = " + Long.toString(254, 16); // s = "hex = fe" 
        System.out.println("s3 = " + s3); // El resultado es d = 3.14

        // TOXXXSTRING
        String s4 = Integer.toHexString(254); // Convierte 254 a hex 
        System.out.println("254 es " + s4); // Resultado: "254 es fe" 
        String s5 = Long.toOctalString(254); // Convierte 254 a octal
        System.out.println("254(oct) = " + s5); // Resultado: "254(oct) = 376"
    }
}