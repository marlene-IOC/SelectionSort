package ioc.xtec.cat.selectionsort;

/**
 * @author Marlene Cela
 * @version 1.0
 * date 28/11/2024
 */

public class SelectionSort {

    /**
     * Ordena un array d'enters utilitzant Selection Sort.
     * @param arr l'array d'enters a ordenar
     * @throws IllegalArgumentException si l'array es nul
     */
    public void sort(int[] arr) {
        if (arr == null) { // Comprova si l'array es nul abans d'ordenar-lo
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        int n = arr.length; // Longitud de l'array

        // Recorre l'array per trobar el minim a cada iteracio
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Index del valor minim inicialitzat
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { // Comprova si hi ha un valor mes petit
                    minIndex = j; // Actualitza l'index del minim
                }
            }
            // Intercanvia el valor minim trobat amb el primer element del subarray
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Comprova si un valor esta present a l'array.
     * 
     * @param arr l'array d'enters
     * @param value el valor a buscar
     * @return true si troba el valor, false en cas contrari
     * @throws IllegalArgumentException si l'array es nul
     */
    public boolean contains(int[] arr, int value) {
        if (arr == null) { // Comprova si l'array es nul, si ho es, torna missatge d'error
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        // Recorre l'array per buscar el valor indicat
        for (int num : arr) {
            if (num == value) { // Retorna true si el valor es troba a l'array
                return true;
            }
        }
        return false; // Retorna false si el valor no es troba
    }
}
