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
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 */
public class E08_CheckBox extends Application {

    private Parent createContent() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Creamos el CheckBox vacio
        CheckBox check1 = new CheckBox();
        //Añadimos texto una vez creado
        check1.setText("Coche");
        //Añadimos el CheckBox a la columna 0 fila 0
        grid.add(check1, 0, 0);

        //Creamos los CheckBox con texto
        CheckBox check2 = new CheckBox("Moto");
        grid.add(check2, 0, 1);
        //Hademos aparezca marcado por defecto
        CheckBox check3 = new CheckBox("A pie");
        check3.setSelected(true);
        grid.add(check3, 0, 2);

        //Ahora crearemos los 3 checkboxes en un bucle y tendran 3 estados
        final String[] nombres = new String[]{"Coche3", "Moto3", "Pie3"};
        final CheckBox[] checkBox = new CheckBox[nombres.length];
        
        for (int i = 0; i < nombres.length; i++) {
            final CheckBox cb = checkBox[i] = new CheckBox(nombres[i]);
            cb.setAllowIndeterminate(true);
            grid.add(cb, 1, i);
        }

        return grid;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(createContent(), 300, 200);
        stage.setScene(scene);

        stage.setTitle("Ejemplo CheckBox");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
