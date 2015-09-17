/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacon_facebook;

import java.util.ArrayList;

/**
 *
 * @author Memo
 */
public class Actor {
    private String nombre_completo;
    private int edad;
    private String nacionalidad;
    private ArrayList<Pelicula> peliculas = new ArrayList();

    public Actor(String nombre_completo, int edad, String nacionalidad) {
        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Pelicula getPelicula(int i) {
        return peliculas.get(i);
    }

    public void setPeliculas(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    @Override
    public String toString() {
        return nombre_completo;
    }
    
}
