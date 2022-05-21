
package eva2_16_figuras;

public class Circulo extends Figura {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
     public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }
    @Override
    public double Calculararea(){
        return(Math.PI *Math.pow(radio , 2));
    }
    
}
