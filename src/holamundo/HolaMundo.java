/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;
/**
 *
 * @author chiki
 */
public class HolaMundo {
 
public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    int option;
    
    System.out.println("Ingrese la opción del programa que desea seleccionar: ");
    System.out.println(" 1. Volumen del solido cono con circunferencia\n"
            +" 2. Área lateral de un vagón (dos ruedas un rectángulo)\n "
            +"3. Área lateral segundo vagón(dos ruedas diferentes, dos rectágulos)\n"
            +" 4. Carne animales\n"
            +" 5. Vueltas mandado\n"
            +" 6. Préstamo\n"
            +" 7. Cuadrado de un número\n"
            +" 8. Suma de dos números \n"
            +" 9. Área de un rectángulo");    
    option = sc.nextInt();
                
    
    switch(option){
    
        case 1:
            System.out.println("Ingrese el radio de la circunferencia: ");
            float radio = sc.nextFloat();
            System.out.println("Ingrese la altura del cono");
            float altura = sc.nextFloat();
            System.out.println("Ingrese la altura del radio");
            float radio2 = sc.nextFloat();
            
            volumen(radio, altura, radio2);
            break;
            
        case 2:
            System.out.println("Ingrese el valor del radio de las ruedas: ");
            float radioVagon = sc.nextFloat();
            System.out.println("Ingrese la altura del rectángulo: ");
            float alturaRectangulo = sc.nextFloat();
            System.out.println("Ingrese la base del rectángulo");
            float baseRectangulo = sc.nextFloat();
            
            areaLateral(radioVagon, baseRectangulo, alturaRectangulo);
            
        case 3:
            System.out.println("Ingrese el radio de la rueda 1: ");
            float radio3 = sc.nextFloat();
            System.out.println("Ingrese el radio de la rueda 2: ");
            float radio4 = sc.nextFloat();
            System.out.println("Ingrese la altura del primer ractángulo: ");
            float altura2 = sc.nextFloat();
            System.out.println("Ingrese la base del primer rectángulo: ");
            float base2 = sc.nextFloat();
            System.out.println("Ingrese la altura del segundo rectángulo: ");
            float altura3 = sc.nextFloat();
            System.out.println("Ingrese la base del segundo rectángulo: ");
            float base3 = sc.nextFloat();
            
            areaLateral2(radio3, radio4, base2, altura2, base3, altura3);              
            
        case 4:
            
            System.out.println("Ingrese la cantidad de gallinas: ");
            int gallinas = sc.nextInt();
            System.out.println("Ingrese la cantidad de gallos: ");
            int gallos = sc.nextInt();
            System.out.println("Ingrese la cantidad de pollos: ");
            int pollos = sc.nextInt();
            
            carne(gallinas, gallos, pollos);
            
        case 5:
            
            System.out.println("Ingrese la cantidad de panes a comprar: ");
            int panes =  sc.nextInt();
            System.out.println("Ingrese la cantidad de bolsas de leche a comprar: ");
            int leche = sc.nextInt();
            System.out.println("Ingrese la cantidad de huevos comprar: ");
            int huevos = sc.nextInt();
            System.out.println("Ingrese el billete con el que pagará: ");
            int billete = sc.nextInt();
            
            mandado(panes, leche, huevos, billete);
            
        case 6:
            
            System.out.println("Ingrese la cantidad del préstamo que va a tomar");
            int prestamo = sc.nextInt();
            
            prestamo(prestamo);
            
        case 7:
            
            System.out.println("Ingrese el número del cual quiere saber el cuadrado");
            int numeroCua = sc.nextInt();
            
            cuadrado(numeroCua);           
            
        case 8:
            
            System.out.println("Ingrese el primer número a sumar: ");
            int num1 = sc.nextInt();
            System.out.println("Ingrese el segundo número a sumar: ");
            int num2 = sc.nextInt();
            
            suma(num1, num2);
            
        case 9:
            
            System.out.println("Ingrese la base del rectángulo");
            float baseRec = sc.nextFloat();
            System.out.println("Ingrese la altura del rectángulo");
            float alturaRec = sc.nextFloat();
         
            areaRectangulo(baseRec, alturaRec);            
            
    }
    
    }
        
         

public static void prestamo(int prestamo){
        double pago = prestamo * 1.03;
        System.out.println("El pago debe con intereses debe ser: " + pago);
}

public static void mandado(int panes, int leche, int huevos, int billete){
    int valor = panes * 300 + leche * 3300 + huevos * 350;
    int vueltas = billete - valor;
    System.out.println("Sus vueltas son: " + vueltas);
}
    
public static void carne(int gallinas, int gallos, int pollos){
    double total = gallinas*6 + gallos * 7 + pollos;
    System.out.println("El total de carne es " + total + " kilos");
}

public static void cuadrado(double x){
        double cuadrado = Math.pow(x, 2); 
    System.out.println("El cuadrado del número ingreado es: "+ cuadrado);
}

public static void suma(int x, int y){
    int suma = x + y;
    System.out.println("La suma de los números enviados es: "+ suma);
}
        
public static void areaRectangulo(float base, float altura){
    float area = base * altura;
    System.out.println("El área del rectángulo es: "+ area);
}

public static void volumen(double radio, double altura, double radio2){
       double volumenCircu = 4/3*Math.PI * Math.pow(radio2, 3);
       double volumenCono = Math.PI * Math.pow(radio,2) * altura;
       double volumenTotal = volumenCircu + volumenCono;
       
       System.out.println("El volumen del solido es: "+volumenTotal);
}

public static void areaLateral(float radio, float base, float altura){
     double volumenRuedas = Math.PI * (Math.pow(radio, 2)) * 2;
     float volumenRecta = base * altura;
     double volumen = volumenRecta + volumenRuedas;
     System.out.println("El volumen del vagón es: " + volumen);
}

public static void areaLateral2(float r,float r2, float b, float a, float b2, float a2){
     double volumenRueda1 = Math.PI * Math.pow(r, 2);
     double volumenRueda2 = Math.PI * Math.pow(r2, 2);
     float volumenRecta1 = b * a;
     float volumenRecta2 = b2 * a2;
     double volumen = volumenRecta1 + volumenRueda1 + volumenRueda2 + volumenRecta2;
     System.out.println("El volumen del vagón de diferentes piezas es: " + volumen);
}

}


