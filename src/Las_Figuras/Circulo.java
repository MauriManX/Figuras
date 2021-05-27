/*

 */
package Las_Figuras;

import static java.lang.Math.PI;

/**
 *
 * @author Mauricio
 */
public class Circulo extends Figura {
    
    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    // Pi*2*radio
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
    public double calcularArea(){
        return Math.PI*(radio*radio);
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
