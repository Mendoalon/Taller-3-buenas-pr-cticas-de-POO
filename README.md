# Talleres 3: Buenas practicas de POO - Cantera 2 - Sofka


## Tabla De Contenido.
1. [Información General](#información-general)
2. [Requerimientos](#requerimientos)
3. [Implementación](#implementación)
4. [Instalación](#instalación)
5. [Tecnologías](#tecnologías)
6. [Enlaces](#enlaces)
7. [Autores](#autores)


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

### Información General

Ejercicios prácticos de buenas prácticas de POO
En pareja, diseñar una aplicación que administre una lista de canciones.


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

### Requerimientos

1. Una biblioteca principal con todas las canciones
2. Se debe tener una funcionalidad que permita crear playlist con canciones determinadas
3. Cada canción debe tener el título, identificador, fecha, duración, género, carátula y una descripción corta.
4. Se debe crear comportamientos en donde se permita hacer filtros a la biblioteca principal, los filtros son:
a) Filtrar canciones del mismo género.
b) Filtrar canciones en el mismo año.
5. Se debe crear comportamientos en donde se permita ordenar duración y fecha.


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

### Implementación

En este proyecto Se implementaron 6 clases, las cuales son:

1) Main: Clase principal donde ejecutamos nuestra aplicación la cual tiene un menú de opciones.
2) MainLibraryInteface: Clase Interfaces donde creamos los métodos a usar.
3) MainLibrary: Clase biblioteca principal donde sobreescribimos los métodos de la interface y le creamos funcionalidad.
4) Songs: Clase donde declaramos los atributos de las canciones.
5) CompareByDuration: Clase donde implementamos la interface de java Comparator y sobreescribimos el método compare para ordenar las canciones por duración.
6) CompaByDate: Clase donde implementamos la interface de java Comparator y sobreescribimos el método compare para ordenar las canciones por fecha.


------------------------------------------------------------------------------------------------------------------------

### Instalación

1. Abrir la terminal del sistema.

2. Clonar el repositorio con el comando: git clone https://github.com/Mendoalon/Taller-3-buenas-pr-cticas-de-POO.git

3. Abrir con el ide netbeans.

4. En caso de no tener instalado, el ide netbeans puede ingresar al siguiente enlace para su descarga e instalación: https://netbeans.apache.org/download/index.html

5. Abrir el proyecto clanado de nombre: Taller-3-buenas-practicas-de-POO.

5. Ubicarse en la clase Main la cual es la principal del proyecto.

6. Realizar click derecho y seleccionar run file.

------------------------------------------------------------------------------------------------------------------------
### Tecnologías

El taller fue desarrollado usando.
   - Tecnología: Java.
   - IDE: Netbeans.

------------------------------------------------------------------------------------------------------------------------

### Enlaces  

1. Enlace del funcionamiento de la aplicación subido a YouTube: https://youtu.be/QnXKBc4zVSk

2. Enlace del repositorio GitHub:  https://github.com/Mendoalon/Taller-3-buenas-pr-cticas-de-POO.git


------------------------------------------------------------------------------------------------------------------------

### Autores  
 # Luis Alberto Mendoza Alonso.
 # Jaime Hoyos Madera.
 
