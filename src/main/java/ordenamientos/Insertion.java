/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

public class Insertion {
    public void insertionSort(int[] array, boolean b){
        int n = array.length;
        int conI = 0;
        int conC = 0;
        int conCom = 0;
        
        System.out.println("=== Insersion ===");
        System.out.println("Arreglo original");
        System.out.println(imprimirArray(array));
        
        for(int i = 1; i < n; i++){
            
            boolean cambio = false;
            conI++;
            
            int valorActual = array[i];
            int j = i - 1;
            
            while (j >= 0){
                conCom++;
                
                if (b ? array[j] > valorActual : array[j] < valorActual){
                    
                    System.out.println(
                        "i" + i +
                        "    array=" + imprimirArray(array) +
                        "    a=" + j +
                        "    b=" + (j+1) +
                        "    array[a]=" + array[j] +
                        "    array[b]=" + valorActual +
                        "    cambio=si"
                    );
                    
                    array[j+1] = array[j];
                    conC++;
                    j--;
                    cambio = true;
                } else {
                    break;
                }
            }

            array[j+1] = valorActual;
            conC++;

            if(!cambio){
                System.out.println(
                    "i" + i +
                    "    array=" + imprimirArray(array) +
                    "    a=" + j +
                    "    b=" + (j+1) +
                    "    array[a]=" + array[j] +
                    "    array[b]=" + valorActual +
                    "    cambio=no"
                );
            }
        }

        System.out.println("ARREGLO FINAL: " + imprimirArray(array));
        System.out.println("------------------------------------------");
        System.out.println("Comparaciones: " + conCom);
        System.out.println("Cambios: " + conC);
        System.out.println("Iteraciones: " + conI);
    }
    
    public String imprimirArray(int[] array){
        String m= "[";
        for(int i=0;i<array.length;i++){
            m += array[i];
            if(i < array.length-1){
                m += " , ";
            }
        }
        m += "]";
        return m;
    }
}