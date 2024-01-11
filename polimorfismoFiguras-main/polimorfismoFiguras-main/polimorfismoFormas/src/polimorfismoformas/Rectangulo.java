package polimorfismoformas;
/**
 * @author Tabatha Valeria Rivero Rodriguez 
 * 10/01/24
 * sayo melocojon
 */
public class Rectangulo extends Forma{
    private double base, altura;
    public Rectangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return base * altura;
    }
}
