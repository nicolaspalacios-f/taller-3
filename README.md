# Taller 3 ARSW  
## Nicolas Palacios  
## 09/06/2022 
### En que consiste el proyecto?
El proyecto consiste en la creacion de un programa el cual permita obtener la media y la desviacion estandar de un archivo especificado mediante el uso de linked list, este proyecto fue realizado en 3 horas con un total de 224 lineas.

*LOC/H = 74.67*  

 Este programa solo admite 1 argumento, indicando la direccion del archivo a utilizar.

 Comando utilizado: java -cp "target/classes" co.edu.escuelaing.Lector src\main\java\co\edu\escuelaing\prueba\prueba.txt
### Diagrama de Clases
<img src="imagen\imagen.png">  
 
 En el diagrama de clases vemos la clase Lector, en esta estan los metodos Lector_archivos, contadorLineas y el main.  

ContadorLineas Cuenta todas las lineas del archivo y devuelve este numero, Lector_archivos es el metodo que recorre todos los archivos de un folder y suma lo que devuelve contadorLineas y main es el metodo que invoca a lector_archivos.

### Tests
Se realizan test por los 2 metodos principales, en el de contador lineas se testean ambos metodos de conteo de lineas.
<img src="imagen\tests.png">  

### Documentacion
Para ver la documentacion, se debe realizar el comando mvn javadoc:javadoc, luego en target/../index.html se visualizara esta.

### Estructura de archivos

|____pom.xml
|____src
| |____main
| | |____java
| | | |____edu
| | | | |____escuelaing
| | | | | |____app
| | | | | | |App.java
| |____test
| | |____java
| | | |____edu
| | | | |____escuelaing
| | | | | |____app
| | | | | | |____AppTest.java