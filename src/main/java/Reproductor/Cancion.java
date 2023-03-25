/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reproductor;

/**
 *
 * @author Usuario
 */
public class Cancion {
    private String ubicacion;
    private String nombre;
    private String nombreArchivo;
    
    public Cancion(String ubi, String nomCancion, String nomArchivo){
        this.ubicacion = ubi;
        this.nombre = nomCancion;
        this.nombreArchivo = nomArchivo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
}
