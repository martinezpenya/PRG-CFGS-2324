---
title: Instalar NoMachine para el control remoto
language: ES
author: David Martínez Peña [www.martinezpenya.es]
subject: Programación
keywords: [PRG, 2023, Programacion, Java]
IES: IES Eduardo Primo Marqués (Carlet) [www.ieseduardoprimo.es]
header: ${title} - ${subject} (ver. ${today}) 
footer:${currentFileName}.pdf - ${author} - ${IES} - ${pageNo}/${pageCount}
typora-root-url:${filename}/../
typora-copy-images-to:${filename}/../assets
---
[toc]
# ¿Qué es NoMachine?

Conéctese a cualquier computadora de forma remota a la velocidad de la luz. Gracias a nuestra tecnología NX, NoMachine es el escritorio remoto más rápido y de mayor calidad que jamás haya probado. Llegue a su computadora al otro lado del mundo con solo unos pocos clics. Estés donde esté tu escritorio, podrás acceder a él desde cualquier otro dispositivo y compartirlo con quien quieras. NoMachine es tu servidor personal, privado y seguro. Es más, es gratis.

https://www.nomachine.com/

## Descarga e instala la aplicación

Desde la página de descargas:

https://downloads.nomachine.com/

E instala la aplicación en tu PC.

# Permisos al profesor

Debemos conceder permisos para que el profesor se pueda conectar a nuestro PC mientras estemos en el instituto sin necesidad de contraseña. Esto solo será posible cuando estemos conectados a la red del instituto, y el profesor no podrá acceder cuando estemos en casa.

Agrega la clave SSH pública (es un fichero que te proporcionará el profesor) en tu ordenador

- Debes colocarla en la carpeta `<Inicio del usuario>/.nx/config`.
- Cree este directorio si no existe. 
  - En Linux y macOS, ejecute en una terminal:`mkdir $HOME/.nx/config`
  - En Windows, créelo (`C:\Users\username\.nx\config`) usando las herramientas del sistema (Explorador de archivos).

- Si la carpeta de configuración ya existe copia el fichero `authorized.crt` en ella.

- Ten en cuenta que los navegadores pueden cambiar las extensiones de los archivos, es conveniente tener las opciones de "ver extensiones de archivos" y "ver archivos ocultos" en nuestro gestor de archivos habitual

# Sources of Information

- [Wikipedia](https://es.wikipedia.org)
- [Code&Coke (Fernando Valdeón)](http://entornos.codeandcoke.com/doku.php?id=start)
- Apuntes IES El Grao (Mª Isabel Barquilla?)
- [Apuntes IOC (Marcel García)](https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m05_/web/fp_dam_m05_htmlindex/index.html)
- [Apuntes José Luis Comesaña](https://www.sitiolibre.com/)
- [Apuntes IES Luis Vélez de Guevara 17-18 (José Antonio Muñoz Jiménez)](http://jamj2000.github.io/slides/2017/09/05/entornosdesarrollo/)
- https://www.jetbrains.com
- ChatGPT

