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
package UD09._02_VBoxHBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 */
public class VBoxAndHBoxApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();

        HBox controlesArriba = new HBox();
        VBox.setMargin( controlesArriba, new Insets(10.0d) );
        controlesArriba.setAlignment( Pos.BOTTOM_LEFT );

        Button btnActualizar = new Button("Actualizar");

        HBox controlesArribaDerecha = new HBox();
        HBox.setHgrow(controlesArribaDerecha, Priority.ALWAYS );
        controlesArribaDerecha.setAlignment( Pos.BOTTOM_RIGHT );
        Hyperlink lnkCerrarSesion = new Hyperlink("Cerrar sesión");
        controlesArribaDerecha.getChildren().add( lnkCerrarSesion );

        controlesArriba.getChildren().addAll( btnActualizar, controlesArribaDerecha );

        TableView<Cliente> tblClientes = new TableView<>();
        tblClientes.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        VBox.setMargin( tblClientes, new Insets(0.0d, 10.0d, 10.0d, 10.0d) );
        VBox.setVgrow( tblClientes, Priority.ALWAYS );

        TableColumn<Cliente, String> columnaApellidos = new TableColumn<>("Apellidos");
        columnaApellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));

        TableColumn<Cliente, String> columnaNombre = new TableColumn<>("Nombre");
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tblClientes.getColumns().addAll( columnaApellidos, columnaNombre );

        Separator sep = new Separator();

        HBox controlesAbajo = new HBox();
        controlesAbajo.setAlignment(Pos.BOTTOM_RIGHT );
        VBox.setMargin( controlesAbajo, new Insets(10.0d) );

        Button btnCerrar = new Button("Cerrar");

        controlesAbajo.getChildren().add( btnCerrar );

        vbox.getChildren().addAll(
                controlesArriba,
                tblClientes,
                sep,
                controlesAbajo
        );

        Scene scene = new Scene(vbox );

        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Aplicación con VBox y HBox");
        primaryStage.setOnShown( (evt) -> loadTable(tblClientes) );
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void loadTable(TableView<Cliente> tblCustomers) {
        tblCustomers.getItems().add(new Cliente("David", "Martinez"));
        tblCustomers.getItems().add(new Cliente("Ada", "Lovelace"));
        tblCustomers.getItems().add(new Cliente("Alan", "Turing"));
    }
}