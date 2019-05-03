package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Scanner sc = new Scanner(System.in);
        System.out.println("premier terme : ");
        int x = sc.nextInt();
        System.out.println("deuxieme terme : ");
        int y = sc.nextInt();
        Calculatrice c = new Calculatrice();
        int somme = c.addition(x, y);
        int produit = c.multiplication(x, y);
        int retenu = c.soustraction(x, y);
        int quotien = c.division(x, y);
        int reste = c.modulo(x, y);
        System.out.println(somme);
        System.out.println(quotien);
        System.out.println(reste);
        System.out.println(retenu);
        System.out.println(produit);
        sc.close();
    }
}