/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

public class Shell {

    public void shellSort(int[] array, boolean ascendente) {

        int j;
        int gap = array.length / 2;

        while (gap > 0) {

            for (int i = gap; i < array.length; i++) {

                int aux = array[i];
                j = i;
                boolean cambio = false;

                int a = j - gap; // posición comparada
                int b = j;       // posición actual

                if (ascendente) {
                    while (j >= gap) {

                        if (aux < array[j - gap]) {
                            array[j] = array[j - gap];
                            j -= gap;
                            cambio = true;
                        } else {
                            break;
                        }
                    }
                } else {
                    while (j >= gap) {

                        if (aux > array[j - gap]) {
                            array[j] = array[j - gap];
                            j -= gap;
                            cambio = true;
                        } else {
                            break;
                        }
                    }
                }

                array[j] = aux;

                System.out.println(
    "    i=" + i +
    "    array=[" + arrayToString(array) + "]" +
    "    gap=   " + gap +
    "    a=" + (a >= 0 ? a : "-") +
    "    b=" + b +
    "    array[a]=" + (a >= 0 ? array[a] : "-") +
    "    array[b]=" + array[b] +
    "    cambio=" + (cambio ? "si" : "no")
);
            }

            gap /= 2;
        }
    }

    public static String arrayToString(int[] array) {
        String resultado = "";
        for (int valor : array) {
            resultado += valor + " , ";
        }
        return resultado;
    }
}
