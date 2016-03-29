/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal2;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class Jurnal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka :");

        int n = sc.nextInt();

        for(int a=n; a>=1; a--)
        {
        for(int b=a-1; b>=1; b--){
        System.out.print(" ");
        }
        for(int c=1; c<=((n+1)-a)*2; c++){
        System.out.print("*");
        }
        System.out.println();
        }


        for(int i=n; i>=1; i--)
        {
        for(int k=1; k<=n-i; k++){
        System.out.print(" ");
        }
        for(int j=i*2; j>=1; j--){
        System.out.print("*");
        }
        System.out.println();
        }
    } 
}
