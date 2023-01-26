/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11.ej3;

import java.util.InputMismatchException;

/**
 *
 * @author Windows 10
 */
public class ServicioDivNum {
    
    public DivisionNumero crear(String n1, String n2) throws NumberFormatException, InputMismatchException{
        DivisionNumero d = new DivisionNumero();

        d.setNum1(Integer.parseInt(n1));
        d.setNum2(Integer.parseInt(n2));
        return d;
        
    }
    
    public int division(DivisionNumero d) throws ArithmeticException{
        int div = d.getNum1()/d.getNum2();
        return div;
    }
}
