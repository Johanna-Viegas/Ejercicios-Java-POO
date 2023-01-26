/*
 Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package Entidad;

/**
 *
 * @author Windows 10
 */
public class Rectangulo implements calculoForma {
    
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public void area(){
        Double area = base * altura;
        System.out.println("El area del rectangulo es " + area);  
    }
    
    @Override
    public void perimetro(){
        Double perimetro = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es " + perimetro);
    }
}
