/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penzvaltas;

import java.util.Scanner;

/**
 *
 * @author miklostoth
 */
public class Penzvaltas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = 0;
        
        while(sc.hasNextInt()){
            a = a + sc.nextInt();
        }
        System.out.println("Osszeg: " +a);
        int b = 0;
        while(a != 0){
            b = a / 20000;
            if(b != 0){
                System.out.println("20000: " + b);
                a = a - b*20000;
            }
            b = a/10000;
            if (b != 0){
                
                System.out.println("10000: "+b);
                a = a - b*10000;
            }
            
                        b = a/5000;
            if (b != 0){
                
                System.out.println("5000: "+b);
                a = a - b*5000;
            }
            
                        b = a/2000;
            if (b != 0){
                
                System.out.println("2000: "+b);
                a = a - b*2000;
            }
            
                        b = a/1000;
            if (b != 0){
                
                System.out.println("1000: "+b);
                a = a - b*1000;
            }
            
                        b = a/500;
            if (b != 0){
                
                System.out.println("500: "+b);
                a = a - b*500;
            }
            
                        b = a/200;
            if (b != 0){
                
                System.out.println("200: "+b);
                a = a - b*200;
            }
            
                        b = a/100;
            if (b != 0){
                
                System.out.println("100: "+b);
                a = a - b*100;
            }
            
                        b = a/50;
            if (b != 0){
                
                System.out.println("50: "+b);
                a = a - b*50;
            }
            
                        b = a/20;
            if (b != 0){
                
                System.out.println("20: "+b);
                a = a - b*20;
            }
            
                        b = a/10;
            if (b != 0){
                
                System.out.println("10: "+b);
                a = a - b*10;
            }
            
                        b = a/5;
            if (b != 0){
                
                System.out.println("5: "+b);
                a = a - b*5;
            }
            if (a < 5){
                System.out.println("Maradek: "+a);
                a = a - a;
            }
            
        }
    }
        
    
}
