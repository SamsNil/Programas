
package Pila;

/**
 *
 * @author Samuel
 */
import java.util.Scanner;
public class ConversionPP {
public static void main(String[] args){
Scanner in= new Scanner(System.in);
 
    System.out.println("Introduzca operacion infija");
String infija=in.nextLine();
String postfija= Convertidor.convertirApostfija(infija);

    System.out.println("La operacion infija es: "+infija+
         "\nExpresion en notacion postfija: "+postfija);
}
}
 