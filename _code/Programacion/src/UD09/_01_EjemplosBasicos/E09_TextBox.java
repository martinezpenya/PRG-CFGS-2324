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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 */
public class E09_TextBox extends Application {

    private Parent createContent() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Creamos el TextkField vacio
        TextField tFNombre = new TextField();
        //Establecemos el número de caracteres que mostrará por defecto
        tFNombre.setPrefColumnCount(10);
        //definimos setPromptText para que indique la información que espera el campo
        tFNombre.setPromptText("Nombre");
        grid.add(tFNombre, 0, 0);

        //Creamos el campo PasswordField que no mostrará por pantalla la información
        PasswordField tFApellidos = new PasswordField();
        tFApellidos.setPrefColumnCount(10);
        tFApellidos.setPromptText("Apellidos");
        grid.add(tFApellidos, 0, 1);

        TextField tFComentario = new TextField();
        //Establecemos el contenido por defecto del campo de texto
        tFComentario.setText("Comentario por defecto");
        //Seria lo mismo que haber creado el TextField de esta manera:
        //TextField tFComentario = new TextField("Comentario por defecto");
        tFComentario.setPrefColumnCount(10);
        tFComentario.setPromptText("Comentario");
        grid.add(tFComentario, 0, 2);

        Button btnMostraTexto = new Button("Mostrar apellidos");
        Label label = new Label();
        btnMostraTexto.setOnAction((ActionEvent e) -> {
            label.setText(tFApellidos.getText());
        });

        grid.add(label, 1, 0);
        grid.add(btnMostraTexto, 1, 1);

        return grid;

    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(createContent(), 500, 200);
        stage.setScene(scene);

        stage.setTitle("Ejemplo TextField y PasswordField");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
