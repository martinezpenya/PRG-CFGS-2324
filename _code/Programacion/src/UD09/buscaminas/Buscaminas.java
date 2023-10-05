package UD09.buscaminas;

/*

  @author David Martínez (wwww.martinezpenya.es|www.ieseduardoprimo.es)
 */
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Buscaminas extends Application {

    static int filas = 5;
    static int columnas = 5;
    static int numeroMinas = 2;
    static Mina[][] casilla;
    static GridPane root = new GridPane();
    static Stage escenarioGuardado;

    public void start(Stage primaryStage) {
        escenarioGuardado = primaryStage;
        primaryStage.setTitle("App " + this.getClass().getSimpleName());
        // Layout GridPane: nos permite crear una matriz/cuadricula
        root = new GridPane();
        root.setHgap(2);   // separación entre columnas
        root.setVgap(2);   // separación entre filas
        root.setPadding(new Insets(15, 15, 15, 15));

        jugarPartida();

        // creamos escena y asignamos a escenario
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public static void repetirPartida(Stage escenario) {
        // Layout GridPane: nos permite crear una matriz/cuadricula
        root = new GridPane();
        root.setHgap(2);   // separación entre columnas
        root.setVgap(2);   // separación entre filas
        root.setPadding(new Insets(15, 15, 15, 15));

        jugarPartida();

        // creamos escena y asignamos a escenario
        Scene scene = new Scene(root);
        escenarioGuardado.setScene(scene);
        escenarioGuardado.sizeToScene();
        escenarioGuardado.show();
    }

    public static void jugarPartida() {
        // Solicitud Datos
        solicitudDatos();
        // Inserción de botones
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                casilla[i][j] = new Mina();
                casilla[i][j].setPrefSize(45, 45);
                root.add(casilla[i][j], i, j);
            }
        }

        // Creamos minas aleatorias
        int minaFila;
        int minaColumna;

        for (int i = 0; i < numeroMinas; i++) {
            do {
                minaFila = (int) (Math.random() * filas);
                minaColumna = (int) (Math.random() * columnas);
            } while (casilla[minaColumna][minaFila].isEsMina() == true);

            casilla[minaColumna][minaFila].setEsMina(true);
        }
        actualizarContadores();
        // Comprobar si es mina
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                int a = i;
                int b = j;
                casilla[i][j].setOnMouseClicked(new EventHandler<MouseEvent>() {

                    @Override
                    public void handle(MouseEvent e) {
                        if (e.getButton() == MouseButton.PRIMARY && casilla[a][b].getEstado() == 0) {
                            actualizarMina(a, b);
                            casilla[a][b].setCasillaVisible(true);;
                            calcularResultado();
                        } else if (e.getButton() == MouseButton.SECONDARY && !casilla[a][b].isCasillaVisible()) {
                            marcarMina(a, b);
                        }
                    }
                });
            }
        }
    }

    public static void actualizarMina(int a, int b) {
        if (casilla[a][b].isEsMina() == true) {
            for (int i = 0; i < columnas; i++) {
                for (int j = 0; j < filas; j++) {
                    if (casilla[i][j].isEsMina() == true) {
                        ImageView imageView = new ImageView();
                        imageView.setPreserveRatio(true);
                        imageView.setFitWidth(25);
                        imageView.setImage(new Image("UD09/buscaminas/mina.png"));
                        casilla[i][j].setGraphic(imageView);
                        casilla[i][j].setStyle("-fx-background-color: #fb0000;" + "-fx-font-color: #ffffff;");
                    }
                }
            }
            finPartida("Pisaste una mina, ¡HAS PERDIDO!");
        } else {
            casilla[a][b].setStyle("-fx-background-color: #c7caf3;");
            /*contarAlrededor(a, b);*/
            casilla[a][b].setText(Integer.toString(casilla[a][b].getContador()));
        }
    }

    public static void marcarMina(int i, int j) {
        ImageView imageView = new ImageView();
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(25);
        casilla[i][j].setGraphic(imageView);
        switch (casilla[i][j].getEstado()) {
            case 0:
                imageView.setImage(new Image("UD09/buscaminas/bandera.png"));
                casilla[i][j].setStyle("-fx-background-color: #faac03;");
                casilla[i][j].cambiarEstado();
                break;
            case 1:
                imageView.setImage(new Image("UD09/buscaminas/interrogacion.png"));
                casilla[i][j].setStyle("-fx-background-color: #a017c7;");
                casilla[i][j].cambiarEstado();
                break;
            case 2:
                casilla[i][j].setGraphic(null);
                casilla[i][j].setStyle("");
                casilla[i][j].cambiarEstado();
                break;
        }
    }

    public static void contarAlrededor(int columna, int fila) {
        /* ORIGINAL
        casilla[columna][fila].setContador(0);
        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                if ((i == columna || i == (columna - 1) || i == (columna + 1))
                        && (j == fila || j == (fila - 1) || j == (fila + 1))) {
                    if (casilla[i][j].isEsMina()) {
                        casilla[columna][fila].setContador(casilla[columna][fila].getContador() + 1);
                    }
                }
            }
        }*/
 /* SOLO ALREDEDOR
        casilla[columna][fila].setContador(0);
        for (int i = Math.max(0, columna-1); i <= Math.min(columnas-1, columna+1); i++) {
            for (int j = Math.max(0,fila-1); j <= Math.min(filas-1, fila +1); j++) {
                if ((i == columna || i == (columna - 1) || i == (columna + 1))
                        && (j == fila || j == (fila - 1) || j == (fila + 1))) {
                    if (casilla[i][j].isEsMina()) {
                        casilla[columna][fila].setContador(casilla[columna][fila].getContador() + 1);
                    }
                }
            }
        }*/
    }

    public static void actualizarContadores() {
        for (int columna = 0; columna < columnas; columna++) {
            for (int fila = 0; fila < filas; fila++) {
                casilla[columna][fila].setContador(0);
                for (int i = Math.max(0, columna - 1); i <= Math.min(columnas - 1, columna + 1); i++) {
                    for (int j = Math.max(0, fila - 1); j <= Math.min(filas - 1, fila + 1); j++) {
                        if ((i == columna || i == (columna - 1) || i == (columna + 1))
                                && (j == fila || j == (fila - 1) || j == (fila + 1))) {
                            if (casilla[i][j].isEsMina()) {
                                casilla[columna][fila].setContador(casilla[columna][fila].getContador() + 1);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void calcularResultado() {
        int contador = 0;
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                if (casilla[i][j].isCasillaVisible()) {
                    contador++;
                }
            }
        }
        if ((columnas * filas - contador - numeroMinas) == 0) {
            finPartida("Has conseguido evitar todas las minas. ¡¡ENHORABUENA!!");
        }
    }

    public static void mostrarError(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    public static void solicitudDatos() {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Inicio de partida Buscaminas");
        alert.setHeaderText("Elige tu dificultad: \nFácil (5x5 y 3 minas)\nMedio (10x10 y 12 minas)\nDifícil (10x10 y 20 minas).");
        alert.setContentText("Elige el nivel deseado.");

        ButtonType facil = new ButtonType("Fácil");
        ButtonType medio = new ButtonType("Medio");
        ButtonType dificil = new ButtonType("Difícil");
//    ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(facil, medio, dificil);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == facil) {
            filas = 5;
            columnas = 5;
            numeroMinas = 3;
            casilla = new Mina[columnas][filas];
        } else if (result.get() == medio) {
            filas = 10;
            columnas = 10;
            numeroMinas = 12;
            casilla = new Mina[columnas][filas];
        } else if (result.get() == dificil) {
            filas = 10;
            columnas = 10;
            numeroMinas = 20;
            casilla = new Mina[columnas][filas];
        } else {
            System.exit(0);
        }
        root.getChildren().clear();
        root.autosize();

    }

    private static void finPartida(String mensaje) {
        List<String> choices = new ArrayList<>();
        choices.add("Nueva partida");
        choices.add("Cerrar el juego");

        ChoiceDialog<String> dialog = new ChoiceDialog<>("Nueva partida", choices);
        dialog.setTitle("Fin de la partida");
        dialog.setHeaderText(mensaje);
        dialog.setContentText("¿Qué desea hacer?");

        // Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            if (result.get().compareTo("Nueva partida") == 0) {
                repetirPartida(escenarioGuardado);
            } else {
                System.exit(0);
            }
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
