/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacon_facebook;

/**
 *
 * @author Memo
 */
public class Pelicula {
    private String titulo;
    private int año_exhibicion;
    private String studio;

    public Pelicula(String titulo, int año_exhibicion, String studio) {
        this.titulo = titulo;
        this.año_exhibicion = año_exhibicion;
        this.studio = studio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño_exhibicion() {
        return año_exhibicion;
    }

    public void setAño_exhibicion(int año_exhibicion) {
        this.año_exhibicion = año_exhibicion;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo ;
    }
    
    
    
}
