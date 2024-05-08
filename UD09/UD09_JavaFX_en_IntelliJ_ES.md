---
title: JavaFX en IntelliJ
language: ES
author: David Martínez [www.martinezpenya.es]
subject: Programación
keywords: [PRG, 2024, Programacion, Java]
IES: IES Eduardo Primo (Carlet) [www.ieseduardoprimo.es]
header: ${title} - ${subject} (ver. ${today}) 
footer:${currentFileName}.pdf - ${author} - ${IES} - ${pageNo}/${pageCount}
typora-root-url:${filename}/../
typora-copy-images-to:${filename}/../assets
---
[toc]

# Introducción

Vamos a ver cómo crear una aplicación `JavaFX` en IntelliJ. Necesitamos:

- IntelliJ Ultimate Edition (seguramente con el Comunity Edition funcione igualmente)
- OpenJDK 17 (seguramente funcionará con una posterior)

# Proyectos JavaFX con el IDE IntelliJ

Sigue estos pasos para crear un proyecto `JavaFX` utilizando las herramientas IDE para compilarlo y ejecutarlo.

## Descargar el SDK

Descargar el SDK (versión 21 LTS) de `JavaFX` <https://gluonhq.com/products/javafx/> apropiado para tu sistema operativo. Este es mi caso:

<img src="/assets/DescargaSDKJavaFX.png" alt="Descargar SDK de JavaFx" style="zoom:50%;" />

Descomprímelo en la ubicación deseada, por ejemplo, `/Users/your-user/Downloads/javafx-sdk-19`. Es **IMPORTANTÍSIMO** que recuerdes la ruta (`path`) hasta esta librería.

## Añadir la libreria de JavaFX a un proyecto IntelliJ

En `File` -> `Project Structure` -> `Libraries`

<img src="/assets/AddLibrary.png" alt="Añadir Library" style="zoom:50%;" />

A continuación busca la carpeta que descargaste en el punto anterior y selecciona todos los archivos con extensión `*.jar` que incluye.

<img src="/assets/AddJars.png" alt="Añadir *.jar" style="zoom:50%;" />

Deberias terminar con algo similar a esto:

<img src="/assets/javafx-swt.png" alt="JavaFx-swt" style="zoom:50%;" />

## Crea un proyecto de JavaFx (Opción no recomendada)

Cuando creas un proyecto en Intellij, el mismo IDE ofrece un tipo de proyecto JavaFx: 

![Proyecto JavaFX](/assets/JavaFXProject.png)

> ### No recomiendo esta opción para empezar porque "oculta/facilita" alguna de las cosas que necesitas entender.

## Primer proyecto `JavaFX`

Una vez creado el proyecto Java, o configurado tal y como hemos visto en los puntos anteriores, comprobaremos que el IDE reconoce las clases de `JavaFX`, para ello vamos a crear nuestra primera clase con interfaz gráfica con el siguiente código:

Comenzaremos por:

1. Heredar la clase principal de la clase `Application`.
2. Importar las clases de la librería.
3. implementar el método abstracto, añadir el `lauch()` al `main()` y añadir los imports necesarios.

```java
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class HolaFx extends Application {

    private Parent createContent() {
        return new StackPane(new Text("Hola Mundo"));
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent(), 400, 400));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

Si ejecutamos ahora mismo el código, aunque no tiene ningún error de compilación, obtendremos el siguiente error de ejecución:

```sh
/usr/lib/jvm/java-1.19.0-openjdk-amd64/bin/java -javaagent:/opt/idea-IU-232.9921.47/lib/idea_rt.jar=33389:/opt/idea-IU-232.9921.47/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /media/DADES/NextCloud/DOCENCIA/PRG-2324/JavaFXTest/out/production/JavaFXTest:/media/DADES/NextCloud/DOCENCIA/PRG-2324/javafx-sdk-21.0.3/lib/javafx-swt.jar:/media/DADES/NextCloud/DOCENCIA/PRG-2324/javafx-sdk-21.0.3/lib/javafx.base.jar:/media/DADES/NextCloud/DOCENCIA/PRG-2324/javafx-sdk-21.0.3/lib/javafx.controls.jar:/media/DADES/NextCloud/DOCENCIA/PRG-2324/javafx-sdk-21.0.3/lib/javafx.fxml.jar:/media/DADES/NextCloud/DOCENCIA/PRG-2324/javafx-sdk-21.0.3/lib/javafx.graphics.jar:/media/DADES/NextCloud/DOCENCIA/PRG-2324/javafx-sdk-21.0.3/lib/javafx.media.jar:/media/DADES/NextCloud/DOCENCIA/PRG-2324/javafx-sdk-21.0.3/lib/javafx.swing.jar:/media/DADES/NextCloud/DOCENCIA/PRG-2324/javafx-sdk-21.0.3/lib/javafx.web.jar HolaFx
Error: JavaFX runtime components are missing, and are required to run this application

Process finished with exit code 1
```

Para resolver este error, debemos editar los parámetros de ejecución del proyecto:

1. Elegimos la opción `Run with Parameters...`

   <img src="/assets/RunWithParameters.png" alt="Run with Parameters" style="zoom:50%;" />

2. Ahora desplegamos el menú Modify options, y añadimos las opciones de VM (máquina virtual):

   <img src="/assets/AddVMOptions.png" alt="Add VM options" style="zoom:50%;" />

3. Dentro de esta opción que aparece ahora:

   <img src="/assets/VMOptions.png" alt="VM options" style="zoom:50%;" />

   Añadiremos los siguientes parámetros:

   ```sh
   --module-path /media/DADES/NextCloud/DOCENCIA/PRG-2324/javafx-sdk-21.0.3/lib/ --add-modules=javafx.controls
   ##OJO! la ruta detrás de --module-path debe ser la ruta que apunte a donde tienes tu libreria de JavaFX
   ```
   
   Ahora, si volvemos a ejecutar el mismo proyecto veremos algo similar a esto:
   
   <img src="/assets/HolaMundoJavaFx.png" alt="HolaMundoJavaFX" style="zoom:50%;" />

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
