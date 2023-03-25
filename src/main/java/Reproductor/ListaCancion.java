/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reproductor;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ListaCancion {
    public NodoMusic primero;
    Scanner teclado = new Scanner(System.in);
    
    public ListaCancion(){
        primero = null;
    }
    
    
    private Cancion leerCancion(){
        System.out.println("Ingrese ubicación de Cancion. Cuando termine escriba Listo para terminar");
        String ub = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Ingrese nombre de Cancion: ");
        String nCan = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Ingrese nombre de Archivo: ");
        String nArchivo = teclado.nextLine();
        teclado.nextLine();
        Cancion cancioncita = new Cancion(ub, nCan, nArchivo);
        return cancioncita;
    }
    
    public ListaCancion crearListaCancion(){
        Cancion x;
        NodoMusic nc = new NodoMusic();
        primero = null;
        do{
            
            x = leerCancion();
            
            if (x != -1){
                primero = new Nodo(x, primero);
            }
            
        }while(x != -1);
        return this;
    }
}
