/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author davpen
 */
import java.util.Scanner;
import java.util.TreeMap;

public class ProblemaE {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        TreeMap<Integer, Integer> mayores = new TreeMap<>();
        TreeMap<Integer, Integer> menores = new TreeMap<>();
        int u = tec.nextInt();

//        do {
//            int id = tec.nextInt();
//            int medida = tec.nextInt();
//            if (menores.containsKey(id) || mayores.containsKey(id)) {
//                int lectura = menores.get(id);
//            }
//            if (medida < u) {
//                menores.put(id, ++medida);
//            } else {
//                mayores.put(id, ++medida);
//            }
//        } while (!sensores.containsKey(0));
//
//        //for (TreeMap.Entry<Integer, Integer> entry : sensores.entrySet()) {
//        //    System.out.println(entry.getKey() + " " + entry.getValue());
//        //}
//    for (Integer id : sensores.keySet () 
//        ) {
//            Integer valor = sensores.get(id);
//        if (valor > u) {
//            mayores.append(id).append(" ");
//        } else {
//            menores.append(id).append(" ");
//        }

        System.out.println(mayores.toString().trim() + "\n" + menores.toString().trim());
    }

}
