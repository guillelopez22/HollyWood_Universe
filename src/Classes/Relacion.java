/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Memo
 */
public class Relacion {
    private int num_relacion;

    public Relacion(int num_relacion) {
        this.num_relacion = num_relacion;
    }
    
    public String Relationship(){
       String relacion;
        if (num_relacion == 1) {
           relacion = "Amistad";
        }else if (num_relacion == 2) {
            relacion = "Familia";
        }else if (num_relacion == 3) {
            relacion = "Noviazgo";
        }else if(num_relacion == 4){
            relacion = "Matrimonio";
        }else{
            relacion= "Undefined";
        }
        return relacion;
    }
}
