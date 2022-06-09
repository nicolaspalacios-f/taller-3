package co.edu.escuelaing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * clase que lee un archivo
 *
 */
public class lector {

    public static int contadorLineas(String metodo, File archivo) throws FileNotFoundException {
        int contador = 0;
        Scanner scanne = new Scanner(archivo);
        if (metodo.equals("media")) {
            LinkedList<Float> lista = new LinkedList<Float>();
            while (scanne.hasNextLine()) {
                lista.add(Float.valueOf(scanne.nextLine()));
                media(lista);
            }
        } else if (metodo.equals("desviacion"))
            while (scanne.hasNextLine()) {
                LinkedList<Float> lista = new LinkedList<Float>();
                while (scanne.hasNextLine()) {
                    lista.add(Float.valueOf(scanne.nextLine()));
                    Desviacion(lista);
                }
            }
        // System.out.println("La cantidad de lineas de tipo " + args[0] + " es de " +
        // contador);
        return contador;

    }

    public static LinkedList<Float> lector_archivos(String metodo, String folder) throws FileNotFoundException {
        File carpeta = new File(folder);
        File[] listOfFiles = carpeta.listFiles();
        int contador = 0;

        for (File file : listOfFiles) {
            if (file.isFile()) {
                contador = contadorLineas(metodo, file);
            }
        }
        System.out.println(contador);
        return (contador);
    }

    public static float media(LinkedList<Float> lista) {
        int suma = 0;
        for (float i : lista) {
            suma += i;
        }
        return (suma / lista.size());
    }

    public static float Desviacion(LinkedList<Float> lista) {

        return 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello World!");
        System.out.println("Media: " + lector_archivos(args[0], args[1]));
        System.out.println("Desviacion: " + lector_archivos(args[0], args[1]));

    }
}
