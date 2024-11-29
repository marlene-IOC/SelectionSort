package ioc.xtec.cat.selectionsort;

/**
 * @author Marlene Cela
 * @version 1.0
 * date 28/11/2024
 */

public class ArrayValidator {

    /**
     * Valida un array d'enters.
     * Comprova que l'array no sigui nul i no estigui buit.
     * 
     * @param arr l'array d'enters a validar
     * @throws IllegalArgumentException si l'array és nul o buit
     */
    public void validateArray(int[] arr) {
        // Comprova si l'array es nul, si ho es, torna missatge d'error
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul."); // Llença una excepció si és nul
        }
        // Comprova si l'array esta buit, si ho esta, torna missatge d'error
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit."); // Llença una excepció si està buit
        }
    }
}