package com.mycompany.practicaburbuja;

public class PracticaBurbuja {
    public static void ordenamientoBurbuja(int[] arreglo) {

        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = 0; j < arreglo.length - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {

                    int auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;

                }
            }
        }
    }
    public static void ordenamientoBurbujaMejorado(int[] arreglo){
        for (int i = 0; i < arreglo.length - 1; i++) {

        boolean huboIntercambio = false;

        for (int j = 0; j < arreglo.length - 1; j++) {

            if (arreglo[j] > arreglo[j + 1]) {

                int auxiliar = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = auxiliar;

                huboIntercambio = true;
            }
        }

        if (huboIntercambio == false) {
            break;
        }
    }
    }

    public static void main(String[] args) {

        int[] numeros1 = {5, 2, 4, 1};
        int[] numeros2 = {5, 2, 4, 5};

        ordenamientoBurbuja(numeros1);
        ordenamientoBurbujaMejorado(numeros2);

        System.out.println(
            java.util.Arrays.toString(numeros1)
        );
        System.out.println(
            java.util.Arrays.toString(numeros2)
        );
    }
}
