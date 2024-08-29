import java.util.Scanner;

public class EsNavidad {
    public static void main(String[] args) {
        int numFechas;
        Scanner teclado = new Scanner(System.in);
        numFechas=teclado.nextInt();
        int dia=0;
        int mes=0;
        for (int i=1;i<=numFechas;i++){
            dia=teclado.nextInt();
            mes=teclado.nextInt();
            //es navidad?
            if(mes==12 && dia==25) {
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}
