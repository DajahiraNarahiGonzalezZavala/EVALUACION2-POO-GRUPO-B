/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_metodos_abstractos;

/**
 *
 * @author Narahi Zavala
 */
public class EVA2_10_METODOS_ABSTRACTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
 class ImplementaAbstracto extends ClaseAbstracta {

        @Override
        public void meotdoAbstracto() {
           
        }
     
 }   
}

abstract class ClaseAbstracta{
    public void metodoImplementado(){
        System.out.println("Metodo implmentacion");
    }
    public abstract void meotdoAbstracto ();
}