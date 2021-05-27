/*
Se corre desde main principal Botones
 */
package Las_Figuras;

/**
 *
 * @author Mauricio
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea primer objeto para la clase rectangulo
        Rectangulo r1 = new Rectangulo(2,4);
        System.out.println("--RECTANGULOS--");
        
        System.out.println("Perimetros: ");
        System.out.println("El perimetro del rectangulo 1: "
                + "\nBase: "+r1.getBase()+" Altura: "+r1.getAltura()
                + "\n"+r1.getBase()+"x"+r1.getAltura()+"="+r1.calcularPerimetro());
        
        System.out.println("Areas:");
        System.out.println("El Area del rectangulo 1: "
                + "\nBase: "+r1.getBase()+" Altura: "+r1.getAltura()
                + "\n2x("+r1.getBase()+")+2x("+r1.getAltura()+")="+r1.calcularArea()+"\n");
        
        //Se crea objeto circulo
        Circulo c1= new Circulo(2);
        System.out.println("--CIRCULOS--");
        
        System.out.println("Perimetros: ");
        System.out.println("El perimetro del circulo 1: "
                + "\nRadio: "+c1.getRadio()
                + "\n2xPIx"+c1.getRadio()+"="+c1.calcularPerimetro());
        
        System.out.println("Areas: ");
        System.out.println("El Area del circulo 1: "
                + "\nRadio: "+c1.getRadio()
                + "\nPIx("+c1.getRadio()+"x"+c1.getRadio()+")="+c1.calcularArea()+"\n");
    }
    
}
