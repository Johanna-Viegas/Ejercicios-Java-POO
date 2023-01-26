/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Fecha;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioFecha {
    
    public Fecha crearFecha(){
        Fecha f = new Fecha(1, 1, 1900);
        Scanner leer = new Scanner(System.in);
        return f;
        
    }
    
    /*
    Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
    */
    
    public void check(Fecha f){
        System.out.println("Ingresar dia-mes-año");
        Scanner leer = new Scanner(System.in);
        f.setDia(leer.nextInt());
        f.setMes(leer.nextInt());
        f.setAno(leer.nextInt());
        while (f.getAno() > 2021 && f.getAno()<1900 ){
            System.out.println(" Año incorrecto, ingresar un año valido.");
            f.setAno(leer.nextInt());
        }
    }
    
    /*
    Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
    */
    
    public void diasMes(Fecha f){
        
        switch (f.getMes()){
            case 1:
            case 3:
            case 5:
            case 7: 
            case 8:
            case 10:
            case 12:   
                System.out.println("El mes ingresado tiene 31 dias");
                break;
            case 2:
                System.out.println("El mes ingresado tiene 28 dias");
                break;    
            case 4:
            case 6:
            case 9: 
            case 11:   
                System.out.println("El mes ingresado tiene 30 dias");
                break;    
        }
    }
    
    /*
    ● Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de
cada mes)
Profe. Adri Bestilleiro
    */
    
    public void diaAnterior(Fecha f){
        int dia= 0;
        int mes = 0;
        int ano = 0;
        if (f.getDia() == 1){
            if(f.getMes() == 1){
                mes = 12;
                dia = 31;
                ano = f.getAno() -1;
                System.out.println("El dia anterior es: " + dia + "/"+ mes + "/" + ano);
            } else if (f.getMes()== 3 || f.getMes() == 5 || f.getMes() == 7  || f.getMes() == 10 || f.getMes() == 12){
            mes = f.getMes()-1;
            dia = 30;
            ano = f.getAno();
            System.out.println("El dia anterior es: " + dia + "/"+ mes + "/" + ano);
        } else if (f.getMes() == 2 || f.getMes()== 4 || f.getMes() == 6 || f.getMes() == 8  || f.getMes() == 9 || f.getMes() == 11){
            mes = f.getMes()-1;
            dia = 31;
            ano = f.getAno();
            System.out.println("El dia anterior es: " + dia + "/"+ mes + "/" + ano);
        }
        } else {
            dia = f.getDia() - 1;
            mes = f.getMes();
            ano = f.getAno();
            System.out.println("El dia anterior es: " + dia + "/"+ mes + "/" + ano);
        }
    }
    
    /*
    ● Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
    */
        public void diaPosterior(Fecha f){
        int dia= 0;
        int mes = 0;
        int ano = 0;
        if (f.getDia() == 31){
            if(f.getMes() == 12){
                mes = 1;
                dia = 1;
                ano = f.getAno() +1;
                System.out.println("El dia posterior es: " + dia + "/"+ mes + "/" + ano);
            } 
        }
            
        if (f.getMes()== 1 ||f.getMes()== 3 || f.getMes() == 5 || f.getMes() == 7 || f.getMes() == 8  || f.getMes() == 10 && f.getDia() ==31){
            mes = f.getMes()+1;
            dia = 1;
            ano = f.getAno();
            System.out.println("El dia posterior es: " + dia + "/"+ mes + "/" + ano);
        } else if ( f.getMes()== 4 || f.getMes() == 6  || f.getMes() == 9 || f.getMes() == 11 && f.getDia() ==30){
            mes = f.getMes()-1;
            dia = 1;
            ano = f.getAno();
            System.out.println("El dia posterior es: " + dia + "/"+ mes + "/" + ano);
        }
        else if (f.getMes() != 12){
            dia = f.getDia() + 1;
            mes = f.getMes();
            ano = f.getAno();
            System.out.println("El dia posterior es: " + dia + "/"+ mes + "/" + ano);
        }
    }
    /*
    ● Crear un método para verificar si el año ingresado es bisiesto
    */
        
      public void anoBiciesto(Fecha f){
          if (f.getAno()%4 == 0 && f.getAno()%100 != 0 || f.getAno()%400 == 0){
              System.out.println("El año ingresado es biciesto");
          } else {
             System.out.println("El año ingresado NO es biciesto"); 
          }
      }  
}