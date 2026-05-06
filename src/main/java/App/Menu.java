/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package App;

import ordenamientos.Insertion;
import ordenamientos.Shell;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int op=0;
        int op2=0,op3=0;
        Scanner sc = new Scanner(System.in);
        Insertion in = new Insertion();
        Shell sh = new Shell();
        
        int[] array= {12,-7,25,0,-15,33,19,-22,5,48,-3};
        
        do{
            System.out.println("=== PROGRAMA DE ORDENAMIENTO ===");
            System.out.println("1. Ejecutar Ordenamientos");
            System.out.println("2.Salir");
            System.out.print("Opcion: ");
            try{
                op=sc.nextInt();
                sc.nextLine();
                switch(op){
                    case 1:
                        do{
                            System.out.println("=== Escoja el metodo===");
                            System.out.println("1. Insertion");
                            System.out.println("2.Shell");
                            System.out.println("3. Salir");
                            System.out.print("Opcion: ");
                            try{
                                op2=sc.nextInt();sc.nextLine();
                                switch(op2){
                                    case 1:
                                        System.out.println("=== ELIJA EL SENTIDO DEL INSERTION===");
                                        System.out.println("¿Ascendente?(true/false):");
                                        String eleccion = sc.nextLine();
                                        if(eleccion.equals("true")){
                                            in.insertionSort(array, true);break;
                                        }
                                        if(eleccion.equals("false")){
                                            in.insertionSort(array, false);break;
                                        }else{
                                            System.out.println("Entrada invalida...");
                                        }break;
                                    case 2:
                                        System.out.println("=== ELIJA EL SENTIDO DEL SHELL===");
                                        System.out.println("¿Ascendente?(true/false):");
                                        String eleccion2 = sc.nextLine();
                                        if(eleccion2.equals("true")){
                                            sh.shellSort(array, true);break;
                                        }
                                        if(eleccion2.equals("false")){
                                            sh.shellSort(array, false);break;
                                        }else{
                                            System.out.println("Entrada invalida");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Saliendo...");break;
                                    default:
                                        System.out.println("numero invalido...");break;
                                }
                            }catch(Exception e){
                                System.out.println("entrada invalida...");
                            }
                        }while(op2!=3);
                    case 2:
                        System.out.println("Regresando al menu principal...");break;
                    default:
                        System.out.println("numero invalido...");break;
                }
            }catch(Exception e){
                System.out.println("entrada invalida...");break;
            }
            op=sc.nextInt();
        }while(op!=2);
    }
}
