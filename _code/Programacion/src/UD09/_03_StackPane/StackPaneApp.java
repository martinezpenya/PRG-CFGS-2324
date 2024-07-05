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
package UD09._03_StackPane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 */
public class StackPaneApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane = new StackPane(
                new Rectangle(200, 100, Color.BLACK),
                new Circle(40, Color.RED),
                new Button("Hello StackPane")
        );

        pane.setAlignment(Pos.BOTTOM_LEFT);
        
        stage.setScene(new Scene(pane, 300, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
