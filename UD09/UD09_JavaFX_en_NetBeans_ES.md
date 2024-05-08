---
title: JavaFX en NetBeans
language: ES
author: David Martínez [www.martinezpenya.es]
subject: Programación
keywords: [PRG, 2023, Programacion, Java]
IES: IES Eduardo Primo (Carlet) [www.ieseduardoprimo.es]
header: ${title} - ${subject} (ver. ${today}) 
footer:${currentFileName}.pdf - ${author} - ${IES} - ${pageNo}/${pageCount}
typora-root-url:${filename}/../
typora-copy-images-to:${filename}/../assets
---
[toc]

# Introducción

Vamos a ver cómo crear una aplicación `JavaFX` en NetBeans. Necesitamos:

- Apache Netbeans 16 o posterior
- OpenJDK 17 (seguramente funcionará con una posterior)

# Proyectos JavaFX con el IDE NetBeans

Sigue estos pasos para crear un proyecto `JavaFX` utilizando las herramientas IDE para compilarlo y ejecutarlo.

- Descargar el SDK (versión 19) de `JavaFX` <https://gluonhq.com/products/javafx/> apropiado para tu sistema operativo.
- Descomprímelo en la ubicación deseada, por ejemplo, `/Users/your-user/Downloads/javafx-sdk-19`. Es **IMPORTANTÍSIMO** que recuerdes la ruta (`path`) hasta esta librería.

## Cree una nueva  biblioteca global

- En `Tools` -> `Library` -> `New Library` (abajo a la izquierda)
- Nómbrala `JavaFX19` (por ejemplo) que incluya los archivos jar en la carpeta lib de JavaFX 19.

<img src="/assets/NB01.png" alt="Libreria JavaFX19" style="zoom:50%;" />

> **Nota importante**: asegúrate de no añadir excepción al ejecutar el proyecto.

## Crea un proyecto de Java

Proporciona un nombre para el proyecto, como `HolaFX`, y una ubicación. Se abrirá un proyecto predeterminado. 

![Nuevo Proyecto](/assets/NB02.png)

> **Advertencia**: no intente crear un proyecto `JavaFX`. Las tareas `JavaFX` `Ant` de la versión actual de Apache NetBeans aún no están listas para `JavaFX` 19, a menos que tenga un JDK personalizado que incluya `JavaFX`.

## Establecer JDK

Asegúrate de que su proyecto esté configurado para ejecutarse con JDK 19 o posterior. Abrimos las propiedades del proyecto (botón derecho sobre el nombre del proyecto) y `Properties` -> `Libraries` -> (campo) `Java Platform` y configúralo en tu JDK preferido.

![Seleccionar JDK](/assets/NB03.png)

## Configurar el proyecto.

Añadir la biblioteca:

Iremos a `Properties` -> `Libraries` -> Selecciona `Classpath` -> + -> `Add Library` y añadimos la biblioteca `JavaFX`.

![JavaFX19 como libreria](/assets/NB04.png)

Ir a `Propiedades` -> `Generar` -> `Compilar` y asegúrese de anular la selección de la opción `Compilar al guardar`.

![Desactivar Compile on Save](/assets/NB05.png)

> **Advertencia**: si NetBeans se compila cada vez que se guarda, también agregará las clases a la ruta del módulo, evitando cualquier cambio adicional en la ruta del módulo. Se recomienda agregar la libreria al Modulepath accediendo a `Properties` -> `Library` -> `Run` -> `Modulepath`.
>
> <img src="/assets/NB05b.png" alt="Modulepath" style="zoom:67%;" />

Una vez que se establece el `classpath`, el IDE reconocerá las clases `JavaFX`.

Por ejemplo, vamos comenzar:

1. heredando la clase principal de la clase `Application`.
2. tendremos que importar las clases de la librería.
3. implementar el método abstracto, añadir el `lauch()` al `main()` y añadir los imports necesarios.

```java
package holafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HolaFX extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML HolaFX.fxml"));
        stage.setTitle("Hola Mundo");
        stage.setScene(new Scene(root));
        stage.show();
    }
    
}
```

##  Agregar clases `JavaFX`

Cuando queramos trabajar con el modelo MVC (en los primeros ejemplos no lo haremos), podremos añadir un archivo FXML con su controlador y una hoja de estilo.

Botón derecho sobre el Package -> `new` - > `Other` -> `JavaFX` -> `Empty FXML`

| New -> Other...                                              | Empty FXML                                       |
| ------------------------------------------------------------ | ------------------------------------------------ |
| <img src="/assets/NB06.png" alt="image-20230415115340403"  /> | <img src="/assets/NB07.png" alt="empty FXML"  /> |

> Nota: Si no aparece new `Empty FXML` file, accede a `Tools` -> `Options` -> `Java` -> `JavaFX` o prueba a cambiar la versión de tu JDK.

Indicamos el nombre de la Vista:

<img src="/assets/NB08.png" alt="Nombre de la vista FXML" style="zoom:50%;" />

Elegimos crear un nuevo Controlador y también CSS:

| Controlador                                                  | CSS                                             |
| ------------------------------------------------------------ | ----------------------------------------------- |
| <img src="/assets/NB09.png" alt="Screenshot_20230415_122118"  /> | ![Screenshot_20230415_122308](/assets/NB10.png) |

> Advertencia: si ejecuta ahora el proyecto, se compilará pero obtendrá este error: `Error: JavaFX runtime components are missing, and are required to run this application.`
>
> Este error se muestra porque Java 19 verifica si la clase principal extiende de `javafx.application.Application`. Si ese es el caso, es necesario tener el módulo `javafx.graphics` en la ruta del módulo.

## Añadir opciones a la VM

Para resolver el problema, Ir a `Properties` -> `Run` del proyecto y añadir estas opciones en el campo VM:

- Para Linux y Mac: 

  ```sh
  --module-path /path/to/javafx-sdk-19/lib --add-modules javafx.controls,javafx.fxml
  ```

- Para Windows:

  ```sh
  --module-path "\path\to\javafx-sdk-19\lib" --add-modules javafx.controls,javafx.fxml
  ```

Donde /path/to debes sustituirlo por tu ruta a la librería, por ejemplo: 

```sh
--module-path /media/DADES/PRG_2223/javafx-sdk-19.0.2.1/lib/ --add-modules javafx.controls,javafx.fxml
```

> **IMPORTANTE**: un espacio en blanco detrás de la coma hará que el error continúe.

## Prueba final de la aplicación

Si hemos seguido todos los pasos correctamente, podremos ejecutar nuestra aplicación y ver la ventana titulada "Hola Mundo":

<img src="/assets/NB11.png" alt="Hola Mundo" style="zoom:50%;" />

# Píldoras informáticas relacionadas

- https://www.youtube.com/playlist?list=PLNjWMbvTJAIjLRW2qyuc4DEgFVW5YFRSR
- https://www.youtube.com/playlist?list=PLaxZkGlLWHGUWZxuadN3J7KKaICRlhz5-

# Fuentes de información

- Apuntes de Jose Antonio Diaz-Alejo
- https://github.com/openjfx/openjfx-docsopen
- https://github.com/openjfx/samples
- [FXDocs](https://github.com/FXDocs/docs)
- https://openjfx.io/openjfx-docs/
- https://docs.oracle.com/javase/8/javafx/user-interface-tutorial
- https://github.com/JonathanGiles/scenic-view
