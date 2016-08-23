/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmodeseleccion;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Dante dip
 */
public class Algoritmodeseleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        System.out.print ("Dame el tamaño del arreglo");
        System.out.println ("");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//recibe el tamaño del arreglo que el usuario quiera
        int arr[] = new int[n];
        
        for(int i= 0; i < arr.length; i++){
            System.out.print ("Dame un numero ");
            Scanner ss = new Scanner(System.in);
            int prro = ss.nextInt();// recibe los numeros que el usuario quiera ordenar
            arr[i] = prro;
        }
        System.out.print ("Asi quedo tu arreglo");
        System.out.println ("");
        for(int j= 0; j < arr.length; j++){// recorre el arreglo imprimiendolo de forma desordenada
            System.out.print ("[" + arr[j] + "]");
        }
        seleccion.seleccion(arr);
    }
    
}