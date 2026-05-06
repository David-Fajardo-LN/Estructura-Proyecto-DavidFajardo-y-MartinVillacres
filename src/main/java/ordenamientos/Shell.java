/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

/**
 *
 * @author User
 */
public class Shell {
    public static int[] ordenar(int[] array, boolean ascendente) {

        int j;
        int gap = array.length / 2;
        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;
        
        while (gap > 0) {
            for (int i = gap; i < array.length; i++){
                iteraciones++;
                int aux = array[i];
                j = i;
                if (ascendente == true) {
                    while (j >= gap) {
                        comparaciones++;
                        if (aux < array[j - gap]) {
                            array[j] = array[j - gap];
                            j -= gap;
                            cambios++; 
                        } else {
                            break;
                        }
                    }
                } else {
                    while (j >= gap) {
                        comparaciones++;
                        if (aux > array[j - gap]) {
                            array[j] = array[j - gap];
                            j -= gap;
                            cambios++;
                        } else {
                            break;
                        }
                    }
                }
                array[j] = aux;
            }
            gap /= 2;
        }
        return new int[]{comparaciones, cambios, iteraciones};
    }
    public static void imprimir(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
