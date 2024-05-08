---
title: Scene Builder & ScenicView
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

Scene Builder es una alternativa orientada al diseño que puede ser más productiva. Además es multiplataforma y está disponible para GNU/Linux, Windows y Mac. Scene Builder funciona con el ecosistema JavaFX: controles oficiales, proyectos comunitarios y ofertas de Gluon que incluyen [Gluon Mobile](https://gluonhq.com/products/mobile), [Gluon Desktop](https://gluonhq.com/products /escritorio) y [Gluon CloudLink](https://gluonhq.com/products/cloudlink).

El diseño de la interfaz de usuario *drag&amp;drop* permite una iteración rápida. La separación de los archivos de diseño y lógica permite que los miembros del equipo se concentren rápida y fácilmente en su capa específica de desarrollo de aplicaciones.

Scene Builder es gratuito y de código abierto, pero cuenta con el respaldo de Gluon. Están disponibles [ofertas de soporte comercial](https://gluonhq.com/services), que incluyen [formación](https://gluonhq.com/services/training) y [servicios de consultoría personalizados](https://gluonhq.com /servicios/consultoría).

Descarga e información: https://gluonhq.com/products/scene-builder/

<img src="/assets/SceneBuilder1.png" style="zoom:50%;" />

# Configurar en NetBeans la localización de SceneBuilder

Con el fin de que cuando se abra un archivo `FXML` desde `NetBeans` se muestre directamente con la herramienta `SceneBuider`, se debe indicar en la configuración de NetBeans en qué carpeta se encuentra `SceneBuider`.

En el artículo Using [Scene Builder with NetBeans IDE](https://docs.oracle.com/javase/8/scene-builder-2/work-with-java-ides/sb-with-nb.htm#CHEEHIDG) de la web de Oracle se puede obtener también información sobre los pasos a seguir.

SceneBuilder se encuentra instalada por defecto en la carpeta `C:\Users\TU_USUARIO\AppData\Local\SceneBuilder\SceneBuilder.exe` (en Windows), tambien es posible usar esta aplicación en Mac o Linux. Lo más importante es que conozcas la ubicación del ejecutable.

<img src="/assets/SceneBuilder2.png" style="zoom:50%;" />

Puedes acceder a las opciones de configuración de NetBeans en el menú `Tools` -> `Options`. Ahí accede a la sección `Java` y la pestaña `JavaFX`:

<img src="/assets/Screenshot_20230416_091258.png" alt="Ubiación del SceneBuilder" style="zoom:50%;" />

# ScenicView

Scenic View es una aplicación JavaFX diseñada para simplificar la comprensión del estado actual del gráfico de escena de su aplicación y también para manipular fácilmente las propiedades del gráfico de escena sin tener que seguir editando su código. Esto le permite encontrar errores y hacer que las cosas sean perfectas sin tener que hacer el baile de compilación, verificación y compilación.

<img src="/assets/ScenicView.png" alt="Scenic View" style="zoom:50%;" />

## Descargar e instalar ScenicView

Puedes descargar la versión adecuada para tu sistema operativo desde https://github.com/JonathanGiles/scenic-view

En realidad ScenicView se distribuye como una aplicación portable. Eso quiere decir que no es necesario instalarla, sino directamente ejecutar la aplicación desde la carpeta `bin` según el sistema operativo en el que nos encontremos.

## Usar ScenicView

Para examinar nuestra aplicación `JavaFX` con `ScenicView`, debemos en primer lugar ejecutar la aplicación `ScenicView`:

<img src="/assets/ScenicView2.png" alt="Buscando aplicación JavaFX" style="zoom:50%;" />

Una vez ejecutada la aplicación comienza a buscar aplicaciones que se esten ejecutando y que usen `JavaFX`.

En este punto solo queda que ejecutemos nuestra aplicación `JavaFX` (por ejemplo `HolaFX`) y `ScenicView` detectará la aplicación y nos mostrará toda su información y nos permitirá realizar modificaciones:

<img src="/assets/ScenicView3.png" alt="Screenshot_20230416_104253" style="zoom:50%;" />

# Píldoras informáticas relacionadas

- https://www.youtube.com/playlist?list=PLNjWMbvTJAIjLRW2qyuc4DEgFVW5YFRSR
- https://www.youtube.com/playlist?list=PLaxZkGlLWHGUWZxuadN3J7KKaICRlhz5-

# Fuentes de información

- Apuntes de Jose Antonio Diaz-Alejo
- https://docs.oracle.com/javase/8/scene-builder-2/work-with-java-ides/sb-with-nb.htm#CHEEHIDG
- https://github.com/openjfx/openjfx-docsopen
- https://github.com/openjfx/samples
- [FXDocs](https://github.com/FXDocs/docs)
- https://openjfx.io/openjfx-docs/
- https://docs.oracle.com/javase/8/javafx/user-interface-tutorial
- https://github.com/JonathanGiles/scenic-view
