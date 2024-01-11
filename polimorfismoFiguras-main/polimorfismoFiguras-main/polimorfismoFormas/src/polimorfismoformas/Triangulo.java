package polimorfismoformas;
/**
* @author Tabatha Valeria Rivero Rodriguez 
 * 10/01/24
 * sayo melocojon
 */
public class Triangulo extends Forma {
    private double base, altura;
    public Triangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return 0.5 * base * altura;
    }
}
