/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author odraude
 */
public abstract class Figuras {
    protected float base,altura,area;
    public Figuras(float base, float altura){
        this.base=base;
        this.altura=altura;
        
    }
   
    public abstract float getArea();
    
    private float setArea(){
        return(area);
    }
}
