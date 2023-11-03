/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_mariapadilla;

import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Lab4P1_MariaPadilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("1. Inversion especial ");
        System.out.println("2. Balanza de cadenas ");
        System.out.println("3. Cifrado de mensajes ");
        System.out.println("4. Salir ");
        System.out.println(" Ingrese una opcion: ");
        int opcion = leer.nextInt();
        while (opcion > 0 && opcion < 4) {
            switch (opcion) {
                case 1:
                    String cadena;
                    System.out.println("  Ingrese la cadena: ");
                    leer.nextLine();
                    cadena = leer.nextLine();
                    String vacio = "";
                    char caracter;
                    while (cadena.length() <= 5) {
                        System.out.println("  Ingrese la cadena: ");
//                        leer.nextLine();
                        cadena = leer.nextLine();
                    }
                    String acum="";
                    for (int i = 0; i <= cadena.length()-1; i++) {
                        caracter = cadena.charAt(i);
                        vacio += caracter;
                        if(cadena.charAt(i)==' ' || i==cadena.length()-1){
                            if(i==cadena.length()-1){
                                acum+=" ";
                            }
                            for (int j = vacio.length()-1; j >=0; j--) {
                                acum+=vacio.charAt(j);
                            } 
                            
                            vacio="";
                        }
                        
                    }
                    System.out.println(" Cadena invertida: "+acum);

                    break;
                case 2:
                    System.out.println(" Ingrese cadena 1: ");
                    leer.nextLine();
                    String cadena1=leer.nextLine();
                    int acum1=0;
                    for (int i=0;i< cadena1.length(); i++){
                         char car=cadena1.charAt(i);
                        int num1= car;
                        acum1+=num1;
                    }
                    System.out.println(" Ingrese cadena 2: ");
                    String cadena2=leer.nextLine();
                    int acum2=0;
                    for (int j=0;j< cadena2.length(); j++){
                         char car2=cadena2.charAt(j);
                        int num2= car2;
                        acum2+=num2;
                    }
                    System.out.println(" Ingrese cadena 3: ");
                    String cadena3=leer.nextLine();
                    int acum3=0;
                    for (int k=0;k< cadena3.length(); k++){
                         char car3=cadena3.charAt(k);
                        int num3=car3;
                        acum3+=num3;
                    }
                    System.out.println(" Peso cadena 1 " + acum1);
                    System.out.println(" Peso cadena 2 " + acum2);
                    System.out.println(" Peso cadena 3 " + acum3);
                    if (acum1>acum2 && acum1>acum3){
                        System.out.println(" La cadena 1 es mas pesada ");
                    }else 
                        if(acum2>acum1 && acum2>acum3){
                            System.out.println(" La cadena 2 es mas pesada ");
                        } else 
                            System.out.println(" La cadena 3  es mas pesada ");
                    break;
                case 3:
                    System.out.println(" Ingrese el mensaje que desea cifrar: ");
                    leer.nextLine();
                    String palabra=leer.nextLine();
                    String acumulador="";
                     for (int i=0;i< palabra.length(); i++){
                        char car=palabra.charAt(i);
                        int num=car+2;
                        char letra=(char)num;
                        acumulador+=letra;
                        
                    }
                     System.out.println(acumulador);
                   
                    break;

            }
            System.out.println("1. Inversion especial ");
            System.out.println("2. Balanza de cadenas ");
            System.out.println("3. Cifrado de mensajes ");
            System.out.println("4. Salir ");
            System.out.println(" Ingrese una opcion: ");
            opcion = leer.nextInt();
        }

    }

}
