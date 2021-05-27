/*
Hereda de clase abstracta figura
 */
package Las_Figuras;

/**
 *
 * @author Mauricio
 */
public class Rectangulo extends Figura {
    //Declaración de variables
    private double base, altura;
    //Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //Metodo para calcular perimetro
    public double calcularPerimetro(){
        //La suma de los dos lados contiguos por 2
        return (base*2+altura*2);
    }
    //Metodo para calcular area
    public double calcularArea(){
        return base*altura;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
