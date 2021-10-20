/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeibm;

import java.util.Scanner;

/**
 *
 * @author kadichari
 */
public class AtividadeIBM {

    /**
     * @param args the command line arguments
     */
    int numero;
    void escreverNome(){
        int i = 0;
        while (i < 5){
            System.out.println("Academia IBM");
            ++i;
        }
    }
    
    void tabuada2 (){   
        int multiplicador = 0;
        int total = 0;
        for(int i=0; i < 10; i++){
            System.out.println(numero + "X" + multiplicador + "=" + total);
            total = numero * ++multiplicador;
            
        }
    }
    
    void imprimeTabuada(){
     
        for (int i = 1; i < 10; i++){
            for(int x = 1; x < 10; x++){
            System.out.println(i+"X"+x+"="+i*x);
            }
        }
            
        
    }
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        AtividadeIBM a = new AtividadeIBM();
        a.escreverNome();
        a.numero = 2;
        a.tabuada2();
          
        a.imprimeTabuada();
        
        
        
        
    }
    
}
