/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmodeseleccion;

/**
 *
 * @author Dante dip
 */
public class seleccion {
    public static void seleccion(int arr[]){
        for(int i= 0; i < arr.length; i++){
            int m = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[m]){
                    m=j;
                }
                int aux = arr[i];//guarda la primera variable en un auxiliar para que no se pierda
                arr[i] = arr[m];//intercambia las variables
                arr[m] = aux;//utiliza la variable guardada en aux para terminar la rotacion
            }
            
        }
        System.out.println ("");    
        for(int a= 0; a < arr.length; a++){// hace la impresion del arreglo ordenado
            System.out.print ("[" + arr[a] + "]");
        }
    }
}