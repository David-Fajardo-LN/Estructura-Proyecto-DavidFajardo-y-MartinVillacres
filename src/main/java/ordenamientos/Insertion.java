/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

/**
 *
 * @author User
 */
public class Insertion {
    public void insertionSort(int[] array, boolean b){
        int n = array.length;
        int conI= 0;
        int conC=0;
        int conCom=0;
        
        System.out.println("=== Insersion ===");
        System.out.println("Arreglo original");
        
        for(int i=0;i<n;i++){
            
            boolean cambio=false;
            conI++;
            conCom++;
            
            int indiceIncertado = i;
            int valorActual=array[i];
            int j=i-1;
            
            while (j >= 0 && (b ? array[j] > valorActual : array[j] < valorActual)){
                cambio=true;
                conCom +=2;
                array[j+1]=array[j];
                indiceIncertado=j;
                conC +=2;
                j--;
            }
            conC++;
            conCom++;
            array[indiceIncertado] = valorActual;
        }
        System.out.print("ARREGLO FINAL: ");imprimirArray(array);
        System.out.println("------------------------------------------");
        System.out.println("Comparaciones: "+ conCom);
        System.out.println("Cambios: "+conC);
        System.out.println("Iteraciones: "+conI);
        
    }
    
    public static void imprimirArray(int[] array){
        int n = array.length;
        for(int valor:array){
            System.out.print(valor+ " , ");
        }
    }
    public static void imprimirFormato(int[] array, int iteracion, int a,int b, int[] arrayA, int[] arrayB, boolean cambio){
        System.out.println(
        "i=" + i +
        "    array=[" + imprimirArray(array) + "]" +
        "    a=" + a +
        "    b=" + b +
        "    array[a]=" + array[a] +
        "    array[b]=" + array[b] +
        "    cambio=" + cambio
    );
    }
}
