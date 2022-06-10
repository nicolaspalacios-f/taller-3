package co.edu.escuelaing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;

import java.util.Scanner;

public class Lector {

    public static LinkedList<Float> agregarALista(File archivo) throws FileNotFoundException {
        try (Scanner scanne = new Scanner(archivo)) {
            LinkedList<Float> lista = new LinkedList<Float>();
            while (scanne.hasNextLine()) {
                lista.add(Float.valueOf(scanne.nextLine()));
            }
            return (lista);
        } catch (NumberFormatException e) {
            LinkedList<Float> lista = new LinkedList<Float>();
            return (lista);
        }
    }

    public static LinkedList<Float> lector_archivos(String archivo) throws FileNotFoundException {
        File documento = new File(archivo);
        LinkedList<Float> contador = new LinkedList<Float>();
        if (documento.isFile()) {
            contador = agregarALista(documento);
        }
        return (contador);
    }

    public static float media(LinkedList<Float> lista) {
        float suma = 0;
        for (float i : lista) {
            suma += i;
        }
        return (suma / lista.size());
    }

    public static float desviacion(LinkedList<Float> lista) {
        float contador = 0;
        for (float i : lista) {
            contador += Math.pow(i - media(lista), 2);
        }
        contador = (float) Math.sqrt(contador / (lista.size() - 1));
        return contador;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Media: " + media(lector_archivos(args[0])));
        System.out.println("Desviacion: " + desviacion(lector_archivos(args[0])));

    }
}
