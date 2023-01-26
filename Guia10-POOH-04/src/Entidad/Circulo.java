/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Windows 10
 */
public class Circulo implements calculoForma {
    
    private Integer diametro;
    private Integer radio;

    public Circulo() {
    }

    public Circulo(Integer diametro, Integer radio) {
        this.diametro = diametro;
        this.radio = radio;
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }
    
    //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    
    @Override
    public void area(){
        Double area = PI* (radio*radio);
        System.out.println("El area del circulo es " + area);
    }
    
    @Override
    public void perimetro(){
        Double perimetro = PI* diametro;
        System.out.println("El perimetro del circulo es " + perimetro);
    }
}
