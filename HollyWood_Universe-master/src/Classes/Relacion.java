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
    Actor actor, actor2;

    public Relacion(int num_relacion, Actor actor, Actor actor2) {
        this.num_relacion = num_relacion;
        this.actor = actor;
        this.actor2 = actor2;
    }

    public Actor getActor() {
        return actor;
    }

    public Actor getActor2() {
        return actor2;
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

    @Override
    public String toString() {
        return Relationship();
    }

}
