
package Pila;

/**
 *
 * @author Samuel
 */
import java.util.Scanner;
 import javax.swing.JOptionPane;
public class ConversionPP {
public static void main(String[] args){
Scanner in= new Scanner(System.in);
 
String infija=JOptionPane.showInputDialog(null,"Introduzca operacion infija");
String postfija= Convertidor.convertirApostfija(infija);

JOptionPane.showMessageDialog(null,"La operacion infija es: "+infija+
         "\nExpresion en notacion postfija: "+postfija);
}
}
 