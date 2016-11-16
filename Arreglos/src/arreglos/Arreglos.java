/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Privado
 */
public class Arreglos {
static int[] arregloEnteros=new int[] {3,4,5,6,7};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total=0;
        int total2=0;
        // TODO code application logic here
        total=imprimeArreglo();
        total2=imprimeArreglo();
        System.out.println("La suma ascendente del arreglo es: " + total);
        System.out.println("La suma descendente del arreglo es: " + total2);
    }
    private static int imprimeArreglo(){
        int suma= 0;
        for (int i=0; i<arregloEnteros.length; i++)
        {
            suma+=arregloEnteros[i];
           
        }   
        return suma;
    }
     private static int imprimeArreglo2(){
        int suma= 0;
        for (int i=arregloEnteros.length; i<=0; i--)
        {
            suma+=arregloEnteros[i];
           
        }   
        return suma;
    }
}
