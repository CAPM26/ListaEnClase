/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reproductor;

/**
 *
 * @author Usuario
 */
public class NodoMusic {
    Cancion dato;
    NodoMusic enlace;
    
    public NodoMusic(Cancion cn){
        this.dato = cn;
        this.enlace = null;
    }
    
    public NodoMusic(Cancion cn, NodoMusic n){
        this.dato = cn;
        this.enlace = n;
    }

    public Cancion getDato() {
        return dato;
    }

    public void setDato(Cancion dato) {
        this.dato = dato;
    }

    public NodoMusic getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoMusic enlace) {
        this.enlace = enlace;
    }
    
    
    
    
}
