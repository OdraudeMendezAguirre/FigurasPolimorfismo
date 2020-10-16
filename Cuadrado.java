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
public class Cuadrado extends Figuras {
    public Cuadrado(float base, float altura){
        super(base,altura);
    }

    @Override
    public float getArea() {
        area=base*altura;
        return(area);
    }
}
