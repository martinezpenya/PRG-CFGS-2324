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
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 */
public class E07_RadioButton extends Application {

    private Parent createContent() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Creamos el botón vacio
        RadioButton rButton1 = new RadioButton();
        //añadimos texto una vez creado
        rButton1.setText("Coche");
        //añadimos el RadioButton a la columna 0 fila 0 con colspan 3 y rowspan 1
        grid.add(rButton1, 0, 0);

        //Creamos los RadioButton con texto
        RadioButton rButton2 = new RadioButton("Moto");
        grid.add(rButton2, 0, 1);
        //Creamos un RadioButton con imágen
        RadioButton rButton3 = new RadioButton("A pie");
        grid.add(rButton3, 0, 2);

        //Añadimos las imágenes a los Radio Button
        //ImageView imageCoche = new ImageView("UD09/coche.png");
        //rButton1.setGraphic(imageCoche);
        //Creamos el grupo de alternancia
        final ToggleGroup grupo = new ToggleGroup();
        rButton1.setToggleGroup(grupo);
        //rButton1.setSelected(true); //si queremos que la primera opción este marcada por defecto
        rButton2.setToggleGroup(grupo);
        rButton3.setToggleGroup(grupo);

        //Añadimos un valor personalizado a cada control con el nombre de la imágen correspondiente
        rButton1.setUserData("coche");
        rButton2.setUserData("moto");
        rButton3.setUserData("pie");

        //Añadimos una imágen que cambiara al cambiar la selección
        ImageView image = new ImageView();
        grid.add(image, 1, 0, 1, 3);

        //añadimos el listener al grupo para que capture el evento cuando se cambie la selección
        grupo.selectedToggleProperty().addListener(
                (ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                    if (grupo.getSelectedToggle() != null) {
                        image.setImage(new Image("UD09/_01_EjemplosBasicos/" + grupo.getSelectedToggle().getUserData().toString() + ".png"));
                    }
                });
                      
        return grid;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(createContent(), 300, 200);
        stage.setScene(scene);

        stage.setTitle("Ejemplo RadioButton");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
