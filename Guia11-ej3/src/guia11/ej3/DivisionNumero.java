/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner 
para leer dos números en forma de cadena. A continuación, utilice el método 
parseInt() de la clase Integer, para convertir las cadenas al tipo int y 
guardarlas en dos variables de tipo int. Por ultimo realizar una división con 
los dos numeros y mostrar el resultado.

4. Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package guia11.ej3;

/**
 *
 * @author Windows 10
 */
public class DivisionNumero {
    
    private int num1;
    private int num2;

    public DivisionNumero() {
    }

    public DivisionNumero(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
}
