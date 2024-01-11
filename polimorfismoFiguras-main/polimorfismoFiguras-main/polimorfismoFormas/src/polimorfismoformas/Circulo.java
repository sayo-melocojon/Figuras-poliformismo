package polimorfismoformas;
/**
* @author Tabatha Valeria Rivero Rodriguez 
 * 10/01/24
 * sayo melocojon
 */
public class Circulo extends Forma {
    private double radio;
    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }
    //No borrar esta linea.
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
}
