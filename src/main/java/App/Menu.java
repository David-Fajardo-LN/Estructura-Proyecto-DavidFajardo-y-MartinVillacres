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
        
        do{
            System.out.println("=== PROGRAMA DE ORDENAMIENTO ===");
            System.out.println("1. Ejecutar Ordenamientos");
            System.out.println("2.Salir");
            System.out.print("Opcion: ");
            try{
                op=sc.nextInt();
                switch(op){
                    case 1:
                        do{
                            System.out.println("=== Escoja el metodo===");
                            System.out.println("1. Insertion");
                            System.out.println("2.Shell");
                            System.out.print("Opcion: ");
                            try{
                                op2=sc.nextInt();
                                switch(op2){
                                    case 1:
                                        System.out.println("¿Ascendente?(true/false):");
                                        String eleccion = sc.nextLine();
                                        if(eleccion.equals("true")){
                                            METODO DE INSERCION ASCENDENTE
                                        }
                                        if(eleccion.equals("false")){
                                            METODO DE INSERCION DESCENDENTE
                                        }else{
                                            System.out.println("Entrada invalida");break;
                                        }    
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
