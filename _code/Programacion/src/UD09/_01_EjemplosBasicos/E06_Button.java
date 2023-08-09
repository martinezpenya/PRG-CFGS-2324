/*
 * Copyright (C) 2023 David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package UD09._01_EjemplosBasicos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 */
public class E06_Button extends Application {

    private Parent createContent() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Creamos el botón vacio
        Button button1 = new Button();
        //añadimos texto una vez creado
        button1.setText("Botón CSS");
        //establecemos la clase correspondiente del css
        button1.getStyleClass().add("button1");
        //añadimos el botón a la columna 0 fila 0 con colspan 3 y rowspan 1
        grid.add(button1, 0, 0, 3, 1);

        //Creamos el botón con texto
        Button button2 = new Button("Sí");
        grid.add(button2, 0, 1);
        Button button3 = new Button("No");
        grid.add(button3, 1, 1);
        //Añadimos el label que cambiará segun el botón presionado
        Label label = new Label("Aceptado");
        grid.add(label, 2, 1);

        //Creamos el botón con texto e imágen
        Image image = new Image("UD09/_01_EjemplosBasicos/ok.png");
        Button button4 = new Button("Aceptar", new ImageView(image));
        grid.add(button4, 0, 2, 2, 1);

        //métodos para cambiar el label segun el botón pulsado
        button2.setOnAction((ActionEvent e) -> {
            label.setText("Aceptado");
        });

        button3.setOnAction((ActionEvent e) -> {
            label.setText("Denegado");
        });

        //Creamos el estilo de sombra
        DropShadow shadow = new DropShadow();
        //Añadimos la sombra cuando pasamos sobre el botón
        button4.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
            button4.setEffect(shadow);
        });

        //Eliminamos la sombra al salir del botón
        button4.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            button4.setEffect(null);
        });

        return grid;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(createContent(), 300, 200);
        scene.getStylesheets().add("UD09/_01_EjemplosBasicos/style.css");
        stage.setScene(scene);

        stage.setTitle("Ejemplo con Button");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
