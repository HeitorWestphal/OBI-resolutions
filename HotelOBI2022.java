package hotel;

import java.util.Scanner;


public class Hotel {

 
    public static void main(String[] args) {
        
     Scanner entrada = new java.util.Scanner(System.in);
     
     int D = entrada.nextInt(); //O valor da diária no dia 1
     int A = entrada.nextInt(); //O aumento da diaria a cada dia a partir do dia 2 até o dia 15
     int N = entrada.nextInt(); //O dia de chegada no hotel 
     int chegada = N;//O valor da chegada é igual o valor de chegada inserido na variável N 
     
     if (chegada > 15)//Se chegada for maior que 15 
         chegada = 15;//O valor de chegada vai ser 15  
     
     int diaria = D + (chegada-1)*A;//Diaria = valor da diaria no dia 1 + (chegada-1)*aumento da diaria
     System.out.println(""+(31 - N + 1)* diaria);//O valor final apresentado será de (31 - dia de chegada + 1)*diaria
        
    }
    
}