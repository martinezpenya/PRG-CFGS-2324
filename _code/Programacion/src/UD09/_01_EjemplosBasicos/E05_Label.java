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
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 */
public class E05_Label extends Application {

    private Parent createContent() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Creamos la etiqueta vacia
        Label label1 = new Label();
        //añadimos texto una vez creada
        label1.setText("Texto añadido después de la creación, autoajustable");
        //cambiamos la fuente y tamaño
        label1.setFont(new Font("Ubuntu", 12));
        //establecemos su color
        label1.setTextFill(Color.web("#0076a3"));
        //activamos la propiedad de autoajustable a true
        label1.setWrapText(true);
        //añadimos la etiqueta a la columna 0 fila 0
        grid.add(label1, 0, 0);

        //Creamos la etiqueta con texto
        Label label2 = new Label("Etiqueta2");
        grid.add(label2, 1, 0);
        label2.setFont(Font.font("FreeMono", 32));
        label2.setRotate(270);

        //Creamos la etiqueta con imágen
        Image image = new Image("UD09/_01_EjemplosBasicos/label.png");
        Label label3 = new Label("Search", new ImageView(image));
        label3.setGraphicTextGap(20);
        grid.add(label3, 2, 0);

        label3.setOnMouseEntered((MouseEvent event) -> {
            label3.setScaleX(1.5);
            label3.setScaleY(1.5);
        });

        label3.setOnMouseExited((MouseEvent event) -> {
            label3.setScaleX(1);
            label3.setScaleY(1);
        });

        return grid;
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent(), 500, 200));
        stage.setTitle("Ejemplo con Label");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
