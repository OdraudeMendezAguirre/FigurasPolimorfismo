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
public  class Triangulo extends Figuras{
    public Triangulo(float base, float altura){
        super(base,altura);
        
    }
    @Override
     public float getArea(){
        area=(base*altura)/2;
        return(area);
    }
}
