/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import Entidad.Sala;
import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class ServicioSala {
    
    //(8 filas por 6 columnas).
    /*
    private String[][] posiciones;
    private Pelicula pelicula;
    private ArrayList<Espectador> espectadores;
    
    */
    ArrayList<Sala> salas = new ArrayList<>();
    ServicioPelicula servPel = new ServicioPelicula();
    ArrayList<Espectador> espectadores = new ArrayList<>();

    
    public ArrayList<Sala> crearSalas(ArrayList<Pelicula> peliculas){
        
        for (int i = 0; i < peliculas.size(); i++) {
            String[][] posiciones = new String[8][6];
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 6; k++) {
                    posiciones[j][k] = "[ ]";
                    
                }
            }
            Sala s = new Sala(posiciones, servPel.asignarSala(peliculas));
     
            salas.add(s);
        }
        return salas;
    }
    
    public void llenarSala( Cine cine){
        ServicioEspectador servEsp = new ServicioEspectador();
        espectadores = servEsp.crearEspectadores();
        int peliAzar;
        int posF;
        int posC;
        String let;
        boolean posicion;
        String matrizSala[][] = new String[8][6];
        
        for (Espectador espectador : cine.getEspectadores()) {
            System.out.println("--------------------- ESPECTADOR SIGUIENTE ---------------------");
            System.out.println(espectador);
            System.out.println("");
            
            peliAzar = (int) (Math.random()*cine.getPeliculas().size()+0);
            System.out.println("Hola, quisiera ver la pelicula " + cine.getSalas().get(peliAzar).getPelicula().getTitulo());
               matrizSala = cine.getSalas().get(peliAzar).getPosiciones();
               

            if(!checkPrecio(espectador, cine)){
                System.out.println("Disculpa, no te alcanza el efectivo para comprar la entrada :/");
                continue;
            }
            if (!checkEdad(espectador, peliAzar, cine)){
                System.out.println("Disculpa, no tenes edad para ver esta peli :/");
                continue;
            }
            do{
            posF = (int) (Math.random()*8+0);
            posC = (int) (Math.random()*6+0);
            System.out.println("Quisiera hubicarme en la posicion " + (posF + 1) + letra(posC));
            posicion = !checkPosicion(posF, posC, peliAzar, cine);
            if(posicion){
            System.out.println("-Perdon, ya tenemos ocupado ese lugar!");
        } 
            } while (posicion);
            matrizSala[posF][posC]="[X]";
            
            cine.getSalas().get(peliAzar).setPosiciones(matrizSala);
            //cine.getSalas().get(peliAzar).setPosiciones("[x]")[posF][posC];


        }
    }
    
    public String letra(int posC){
        String let ="";
        switch(posC){
                case 0:
                    let = "A";
                    break;
                case 1:
                    let = "B";
                    break;
                case 2:
                    let = "C";
                    break;
                case 3:
                    let = "D";
                    break;
                case 4:
                    let = "E";
                    break;
                case 5:
                    let = "F";
                    break;
            }
        return let;
    }
    
    public boolean checkPosicion(int posF, int posC, int peliAzar, Cine cine){
           
        return cine.getSalas().get(peliAzar).getPosiciones()[posF][posC] == "[ ]";

    }
    
    public boolean checkPrecio(Espectador espectador, Cine cine){
        if (espectador.getEdad()>10 && espectador.getEdad()<65){
        
            return espectador.getEfectivoDisp() >= cine.getPrecioGral();
        } else if (espectador.getEdad()<11 ){
            
            return espectador.getEfectivoDisp() >= cine.getPrecioMenor();   
        } else {
            
            return espectador.getEfectivoDisp()>= cine.getPrecioJubilado();
        }
        
    }
    
    public boolean checkEdad(Espectador espectador, int peliAzar, Cine cine){
        
            return espectador.getEdad()>= cine.getPeliculas().get(peliAzar).getEdadMin();

        
    }
    
    public void mostrarSalas(Cine cine){
        for (Sala sala : cine.getSalas()) {
            System.out.println("-----------------" + sala.getPelicula().getTitulo() + "-----------------");
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 6; k++) {
                    System.out.print(sala.getPosiciones()[j][k]);
                    
                }
                System.out.println("");
            }
        }
    }
}
