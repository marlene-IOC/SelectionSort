package ioc.xtec.cat.selectionsort;

import java.util.Scanner;

/**
 * @author Marlene Cela
 * @version 1.0
 * date 28/11/2024
 */

public class Main {

    /**
     * Punt d'entrada del programa.
     * @param args arguments de la linia de comandaments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicialitza un escaner per a l'entrada de dades

        // Sol·licita la mida de l'array
        System.out.println("Introdueix la mida de l'array: ");
        int size = scanner.nextInt(); // Llegeix la mida de l'array introduida

        int[] array = new int[size]; // Inicialitza l'array amb la mida indicada
        System.out.println("Introdueix els elements de l'array:");
        // Omple l'array amb els valors introduits
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        SelectionSort sorter = new SelectionSort(); // Crea una instancia de SelectionSort
        ArrayValidator validator = new ArrayValidator(); // Crea una instancia de ArrayValidator

        try {
            validator.validateArray(array); // Valida l'array

            // Mostra l'array original
            System.out.print("Array original:");
            printArray(array);

            // Sol·licita un valor a buscar
            System.out.println("Introdueix un valor a buscar a l'array: ");
            int valueToSearch = scanner.nextInt(); // Llegeix el valor introduit

            // Comprova si l'array conte el valor indicat
            boolean contains = sorter.contains(array, valueToSearch);
            if (contains) {
                System.out.println("El valor " + valueToSearch + " existeix a l'array.");
            } else {
                System.out.println("El valor " + valueToSearch + " no existeix a l'array.");
            }

            sorter.sort(array); // Ordena l'array

            // Mostra l'array ordenat
            System.out.print("Array ordenat:");
            printArray(array);

        } catch (IllegalArgumentException e) {
            // Mostra un missatge d'error si es produeix una excepcio
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close(); // Tanca l'escaner
    }

    public static void printArray(int[] arr) {
        for (int num : arr) { // Itera sobre cada element de l'array
            System.out.print(num + " "); // Mostra el numero seguit d'un espai
        }
        System.out.println(); // Salta a la seguent linia
    }
}