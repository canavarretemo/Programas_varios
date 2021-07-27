/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package miprimerproyecto;


import java.util.Scanner;
/**
 *
 * @author Diana Lozano
 */
public class MiPrimerProyecto {

    /**
     * @param args the command line arguments
     */
    public static double f(double x) {
        return x * x;
    } 
    
    public static int sum(int x, int y) {
        int respSuma = x + y;
        return respSuma;
    }
    
    public static double valorAbsoluto(double x) {
        double valor;
        if (x >= 0) {
            valor = x;
        } 
        else {
            valor = -x;
        }
        //O podría haberse usado el operador ternario: valor = (x >= 0) ? x : -x;
        return valor;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here #
        
        System.out.println("Hola Mundo");
        
        //DECLARACIONES:
        int unaVariable;
        byte edad;
        /*
        //ASIGNACIONES:
        edad = 5;
        
        // DOS EN UNO(DECLARACION + ASIGNACION):
        long algoGrande = 74512;
        */
        
        //LEER DATOS DE ENTRADA USANDO CLASE SCANNER:
        Scanner sc = new Scanner(System.in);//CREO OBJETO
       /* System.out.println("Ingrese un número:");//ESCRIBO MENSAJE
        int n = sc.nextInt();//LEO ENTRADA
        int m = n * 2;//OPERO ENTRADA
        System.out.println("Resultado: "+m);//ESCRIBO RESULTADO
        */
       
        //OPERADORES
        //ASIGNACIÓN
        unaVariable = 25;//ya debería haber sido declarada
        int unContador = 0;//o se hace de una vez
        int acum = 1;
        
        //ASIGNACION CON SUMA
        acum +=3; // acum = acum + 3
        unContador += 1; // unContador = unContador + 1 
        
        //INCREMENTO
        unContador++; // unContador = unContador + 1
        
        //ASIGNACION CON RESTA
        acum -=4; // acum = acum - 4
        unContador -= 1; // unContador = unContador - 1
        
        //DECREMENTO
        unContador--; // unContador = unContador - 1
        
        //ASIGNACIÓN CON MULTIPLICACION, DIVISION, MODULO:
        unaVariable *= 10; 
        unaVariable /= 2;
        unaVariable %= 5;
        
        //TYPECASTING
        double unReal=2.5, respuestaReal; 
        int unEntero=7, otroEntero = 6, respuestaEntera;
        
        //operar un valor entero con uno entero, genera una salida entera
        respuestaEntera = unEntero / otroEntero;//deberia ser 1.1666 pero da 1
        System.out.println("Entre enteros, respuesta entera: "+ respuestaEntera);
        
        
        //operar un valor entero con uno real, genera una salida real
        respuestaReal = unEntero * unReal;
        System.out.println("Entre entero y real, respuesta real: "+respuestaReal);
        
        
        //perder la parte real: si un valor real es asignado a una variable entera
        int num = (int) unReal;
        System.out.println("Un real con casting a int: "+ num);
        
        //OPERADORES BOOLEANOS BÁSICOS
        boolean unBool = true, otroBool = false;
        
        boolean queSera = !unBool; // NOT
        
        queSera = unBool || otroBool; // OR
        
        queSera = unBool && otroBool; // AND
        
        //forma válida en python pero no en java: queSera = 0 < n < 100;
        int w = 28;
        queSera = 0 < w && w < 100; // mejor con parentesis: (0 < n) && (n < 100)
        
        
        //invocar un método:
        System.out.println(f(2));
        
        
        
        int unaSumaCualquiera = sum(2, 5);
        
        
        
        
        System.out.print("Ingrese un número para el valor absoluto: ");
        double val = sc.nextDouble();
        System.out.println("El valor absoluto de " + val + " es " + valorAbsoluto(val));
    }
    
}
