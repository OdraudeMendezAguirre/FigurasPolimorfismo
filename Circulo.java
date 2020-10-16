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
public class Circulo extends Figuras{
    public Circulo(float pi, float radio){
        super(pi,radio);
        
    }
    @Override
     public float getArea(){
        area=base*(altura*altura);
        return(area);
    }
}
