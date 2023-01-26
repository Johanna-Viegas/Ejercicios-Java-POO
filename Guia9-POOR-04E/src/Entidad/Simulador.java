/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enum.Apellidos;
import Enum.Nombres;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Simulador {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList<>();
    
    public void CrearAlumnos(){
        System.out.println("Cuantos alumnos hay en la clase?");
        int q = leer.nextInt();
        String[] nombres = generadorNombres(q);
        Integer[] dnis = generadorDni(q);
        for (int i = 0; i < q; i++) {
            Alumno a = new Alumno(nombres[i],dnis[i]);
            alumnos.add(a);
        }
    }
    
    public String[] generadorNombres(int q){
        String[] posiblesN = new String[20];
        posiblesN[0] = "LucianaCaravetta";
        posiblesN[1] = "MartinaSalles";
        posiblesN[2] = "AdrianViegas";
        posiblesN[3] = "MateoYet";
        posiblesN[4] = "MaríaVinze"; 
        posiblesN[5] = "SofíaViegas"; 
        posiblesN[6] = "PaulaIcardi";
        posiblesN[7] = "DanielaLoretto";
        posiblesN[8] = "ValeriaLinch";
        posiblesN[9] = "AlbaBlanca";
        posiblesN[10] = "JuliaJui";
        posiblesN[11] = "NoaCardu"; 
        posiblesN[12] = "HugoLopez"; 
        posiblesN[13] = "DanielCipriano";
        posiblesN[14] = "MartínZuccarino";
        posiblesN[15] = "PabloMolinari";
        posiblesN[16] = "AlejandroMolina";
        posiblesN[17] = "LucasCrespo";
        posiblesN[18] = "ÁlvaroSores"; 
        posiblesN[19] = "DavidCandis"; 
        posiblesN[20] = "DanielMora";
        
        String[] finales = new String[q];
        
        for (int i = 0; i < q; i++) {
            finales[i]= posiblesN[i];
        }

           return finales;
    }
    
    public Integer[] generadorDni(int q){
             
        Integer[] finales = new Integer[q];
        int check =0;
        
        for (int i = 0; i < q; i++) {
            do{
                finales[i]= (int) (Math.random()*50000000+1000000);
                check =0;
                for (int j = 0; j < i; j++) {
                if(finales[j] == finales[i]){
                    check=1;
                    }
                }
            }while (check==1);
        }

           return finales;
    }
    
    public void mostrarAlumnos(ArrayList<Alumno> alumnos){
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: "+ alumno.getNombreC() + "\n DNI: " + alumno.getDni() );
        }
    }
    
    public void votacion(ArrayList<Alumno> alumnos){
        int[] az = new int[3] ;
        String[] votos = new String[3] ;
        int no = 0;
        for (Alumno alumno : alumnos) {
            for (int i = 0; i < 3; i++) {
                no =0;
                do{
                    az[i] = (int) (Math.random()*alumnos.size()+0);
                    if(alumnos.get(az[i])==alumno || az[0]==az[1] || az[0]==az[2] || az[1]==az[2]){
                        no = 1;
                    }
                } while (no==1);
                votos[i]= alumnos.get(az[i]).getNombreC();
                alumnos.get(az[i]).setqVotos(alumnos.get(az[i]).getqVotos()+1);
            }
        }
    }
    
    public void mostrarVotos(ArrayList<Alumno> alumnos){
        int i =0;
        for (Alumno alumno : alumnos) {
            System.out.println("----------------"+ alumno.getNombreC() + "----------------"  );
            System.out.println("Q de votos: " + alumno.getqVotos());
            System.out.println("votos dados:");
            i=0;
            for (String voto : alumnos.get(i).getVotosR()) {
                System.out.println(voto);
                i +=1;
            }
        }
    }
    
    public void recuentoVotos(ArrayList<Alumno> alumnos){
        int i =0;
        int pos = 0;
        for (Alumno alumno : alumnos) {
            if(alumnos.get(i)>alumno){
                pos +=1;
            }
            
        }
    }
    
}
