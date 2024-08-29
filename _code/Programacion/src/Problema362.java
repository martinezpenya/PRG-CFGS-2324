import java.util.*;

/*
 * El día de Navidad
 * La Navidad es una de las fiestas más esperadas. Cada uno tiene sus motivos
 * (religiosos, fiestas en el colegio y trabajo, villancicos…). Sobre todo los
 * más pequeños de la casa, están impacientes de que sea Navidad y preguntan
 * insistentemente a sus padres: "¿Ya es Navidad?", "¿Ya es Navidad?",
 * "¿Ya es Navidad?".
 * Nuestra tarea es hacer un programa que permita a nuestros niños saber si es
 * Navidad o no.
 */
/**
 *
 * @author David Martínez (wwww.martinezpenya.es|iesmre.com)
 */
public class Problema362 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt(); //número de casos
        tec.nextLine();
        for (int i = 0; i < n; i++) {
            int dia = tec.nextInt();
            int mes = tec.nextInt();
            System.out.println((dia==25 && mes==12)?"SI":"NO");
        }
    }

}
