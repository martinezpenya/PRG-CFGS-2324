package UD10.AWS.MariaDB;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 */
public class AWSTest {

    private static final String AWSDNS = "databasedmp.czm6oy6yqn23.us-east-1.rds.amazonaws.com";
    private static final String DBNAME = "starwars";
    private static final int PUERTO = 3306;
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123456Ab$";

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try (Connection con = DriverManager.getConnection("jdbc:mysql://" + AWSDNS + ":" + PUERTO + "/" + DBNAME, USERNAME, PASSWORD);) {
            Statement stmt = con.createStatement();
            //Query sin parámetros
            ResultSet rs = stmt.executeQuery("select * from films");
            System.out.println("Estas son las películas de Star Wars");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            System.out.print("Elige un número de película y te mostraré los personajes que aparecen en ella: ");
            String numPelicula = sc.nextLine();
            PreparedStatement pStmt = con.prepareStatement("SELECT C.id, name, C.height, C.mass, C.hair_color, C.skin_color "
                    + "FROM starwars.characters C, starwars.character_films CF, starwars.films F "
                    + "WHERE F.id=CF.id_film AND CF.id_character=C.id "
                    + "AND CF.id_film = ?;");
            pStmt.setString(1, numPelicula);
            //Query con parámetros
            ResultSet rs2 = pStmt.executeQuery();
            while (rs2.next()) {
                System.out.println(rs2.getInt(1) + "  " + rs2.getString(2) + "  " + rs2.getInt(3) + "  " + rs2.getFloat(4) + "  " + rs2.getString(5) + "  " + rs2.getString(6));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
