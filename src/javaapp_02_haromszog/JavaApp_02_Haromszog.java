package javaapp_02_haromszog;

import java.util.Scanner;

public class JavaApp_02_Haromszog {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a háromszög (a) oldalát: ");
        double haromszogOldalA = sc.nextDouble();
        System.out.println("Kérem adja meg a háromszög (b) oldalát: ");
        double haromszogOldalB = sc.nextDouble();
        System.out.println("Kérem adja meg a háromszög (c) oldalát: ");
        double haromszogOldalC = sc.nextDouble();
        
        if((haromszogOldalA + haromszogOldalB)< haromszogOldalC || (haromszogOldalB + haromszogOldalC) < haromszogOldalA || (haromszogOldalC + haromszogOldalA) < haromszogOldalB){
            System.out.println("A háromszög nem szerkeszthető!");
        }else{
            System.out.println("A háromszög kerülete: " + (haromszogOldalA+haromszogOldalB+haromszogOldalC));
        }
        
        
        
    }
    
}
