

import controllers.SortPersonaMethods;
import models.Persona;
import models.Resultado;
import utils.Benchmarking;

public class App {

    public static void main(String[] args) {
        SortPersonaMethods sorter = new SortPersonaMethods();
        int[] tamanios = {10000, 50000, 100000};

        System.out.println("=== INICIO DE MEDICIONES DE BENCHMARKING ===");
        System.out.println("Formato: Escenario | Algoritmo | Muestra | Tiempo obtenido");
        System.out.println("----------------------------------------------------------------");

        for (int size : tamanios) {
            
            Persona[] baseDesordenado = generarPersonas(size);
            
            Persona[] copiaInsercionE1 = baseDesordenado.clone();
            Persona[] copiaQuickSortE1 = baseDesordenado.clone();

           
            Resultado resInsercionE1 = Benchmarking.medirTiempo(
                () -> { sorter.insertionSort(copiaInsercionE1); return null; },
                "Inserción", "Desordenado", size
            );
            System.out.println(resInsercionE1);

            
            Resultado resQuickSortE1 = Benchmarking.medirTiempo(
                () -> { sorter.quickSort(copiaQuickSortE1, 0, copiaQuickSortE1.length - 1); return null; },
                "QuickSort", "Desordenado", size
            );
            System.out.println(resQuickSortE1);

            
            sorter.quickSort(baseDesordenado, 0, baseDesordenado.length - 1);

            
            Persona[] casiOrdenado = new Persona[size + 1];
            System.arraycopy(baseDesordenado, 0, casiOrdenado, 0, size);
            
            
            casiOrdenado[size] = new Persona("Persona Nueva", (int) (Math.random() * 101));

           
            Persona[] copiaInsercionE2 = casiOrdenado.clone();
            Persona[] copiaQuickSortE2 = casiOrdenado.clone();

            int nuevoTamanyo = size + 1;

            
            Resultado resInsercionE2 = Benchmarking.medirTiempo(
                () -> { sorter.insertionSort(copiaInsercionE2); return null; },
                "Inserción", "Casi ordenado + 1 persona", nuevoTamanyo
            );
            System.out.println(resInsercionE2);

           
            Resultado resQuickSortE2 = Benchmarking.medirTiempo(
                () -> { sorter.quickSort(copiaQuickSortE2, 0, copiaQuickSortE2.length - 1); return null; },
                "QuickSort", "Casi ordenado + 1 persona", nuevoTamanyo
            );
            System.out.println(resQuickSortE2);
            System.out.println("----------------------------------------------------------------");
        }
    }

    
    public static Persona[] generarPersonas(int cantidad) {
        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona " + (i + 1);
            int edad = (int) (Math.random() * 101);
            personas[i] = new Persona(nombre, edad);
        }

        return personas;
    }
}