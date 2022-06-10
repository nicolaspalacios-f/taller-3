package co.edu.escuelaing;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.LinkedList;

import javax.print.attribute.standard.Media;

import org.junit.*;

/**
 * Unit test for simple lector.
 */
public class LectorTest {
    @Test
    public void deberiaCrearLinkedList() {
        try {
            File file = new File("src\\main\\java\\co\\edu\\escuelaing\\prueba\\prueba.txt");
            Assert.assertEquals(10, Lector.agregarALista(file).size());
            System.out.println(Lector.agregarALista(file).size());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaLeerArchivos() {
        try {
            String file = "src\\main\\java\\co\\edu\\escuelaing\\prueba\\prueba.txt";
            Assert.assertEquals(10, Lector.lector_archivos(file).size());
            System.out.println(Lector.lector_archivos(file).size());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaSacarMedia() {
        try {
            File file = new File("src\\main\\java\\co\\edu\\escuelaing\\prueba\\prueba.txt");
            Float med = (float) 550.6;
            LinkedList<Float> lista = new LinkedList<Float>();
            lista = Lector.agregarALista(file);
            Assert.assertTrue(med == Lector.media(lista));
            System.out.println(Lector.media(lista));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaSacarDesviacion() {
        try {
            File file = new File("src\\main\\java\\co\\edu\\escuelaing\\prueba\\prueba.txt");
            Float med = (float) 572.02686;
            LinkedList<Float> lista = new LinkedList<Float>();
            lista = Lector.agregarALista(file);
            Assert.assertTrue(med == Lector.desviacion(lista));
            System.out.println(Lector.desviacion(lista));
        } catch (Exception e) {
            fail();
        }
    }

}
