/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author Usuario
 */
public class Nodo {
    int dato;
    Nodo enlace;
    
    public Nodo(int x){
        this.dato = x;
        this.enlace = null;
    }
    
    public Nodo(int x, Nodo n){
        this.dato = x;
        this.enlace = n;
    }
    
    public int getDato(){
        return dato;
    }
    
    public Nodo getEnlace(){
        return enlace;
    }
    
    public void setEnlace(Nodo n){
        this.enlace = n;
    }
    
    public void setDato(int x){
        this.dato = x;
    }
}
