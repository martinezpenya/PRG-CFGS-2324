package UD10.AWS.ORACLE;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 */
public class AWSTest {

    private static final String AWSDNS = "databaseintellij.crsegua40zq6.us-east-1.rds.amazonaws.com";
    private static final String DBNAME = "HARRYPOTTER";
    private static final int PUERTO = 6000;
    private static final String USERNAME = "HARRYPOTTER";
    private static final String PASSWORD = "admin";

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        //Class.forName("oracle.jdbc.OracleDriver");

        //try (Connection con = DriverManager.getConnection("jdbc:mysql://" + AWSDNS + ":" + PUERTO + "/" + DBNAME, USERNAME, PASSWORD);) {
//":" + DBNAME +
        String url = "jdbc:oracle:thin:@" + AWSDNS + ":" + PUERTO +  "/ORCL";
        System.out.println(url);
        try(Connection con= DriverManager.getConnection(url, USERNAME, PASSWORD);){
            Statement stmt = con.createStatement();
            //Query sin parámetros
            ResultSet rs = stmt.executeQuery("select * from HOUSE");
            System.out.println("Estas son las casas de Harry Potter");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
//            System.out.print("Elige un número de película y te mostraré los personajes que aparecen en ella: ");
//            String numPelicula = sc.nextLine();
//            PreparedStatement pStmt = con.prepareStatement("SELECT C.id, name, C.height, C.mass, C.hair_color, C.skin_color "
//                    + "FROM starwars.characters C, starwars.character_films CF, starwars.films F "
//                    + "WHERE F.id=CF.id_film AND CF.id_character=C.id "
//                    + "AND CF.id_film = ?;");
//            pStmt.setString(1, numPelicula);
//            //Query con parámetros
//            ResultSet rs2 = pStmt.executeQuery();
//            while (rs2.next()) {
//                System.out.println(rs2.getInt(1) + "  " + rs2.getString(2) + "  " + rs2.getInt(3) + "  " + rs2.getFloat(4) + "  " + rs2.getString(5) + "  " + rs2.getString(6));
//            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
