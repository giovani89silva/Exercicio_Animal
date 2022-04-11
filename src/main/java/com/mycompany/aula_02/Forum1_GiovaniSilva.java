package com.mycompany.aula_02;

import java.util.Scanner;

public class Forum1_GiovaniSilva 
{
     public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            //recebe os dois numeros  inteiros
            System.out.println("Digite dois numeros inteiros:\n" );
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            //soma dos inteiros
            int soma = num1 + num2;
            //imprime soma dos inteiros
            System.out.println("A Soma dos inteiros fica:\n" + soma); 
            
            //recebe dois numeros tipo float
            System.out.println("Digite dois numeros:\n");
            float num3 = sc.nextFloat();
            float num4 = sc.nextFloat();
            float sub = num3 - num4;
            
            //imprime o resultado
            System.out.println("A Subtracao fica: \n "  + sub ); 
            
            //multiplicação inteiros
            System.out.println("Digite dois numeros inteiros:\n ");
            int num5 = sc.nextInt();
            int num6 = sc.nextInt();  
            int multiplicacao = num5 * num6;
            
            //imprime o resultado
            System.out.println("A Multiplicação fica:\n " + multiplicacao);
            
            //divisão de inteiros
            System.out.println("Digite dois numeros inteiros:\n ");
            int num7 = sc.nextInt();
            int num8 = sc.nextInt();  
            int divisao = num7 / num8;
            
            //imprime o resultado
            
            System.out.println("A Divisão fica:\n " + divisao);
            
            //incremento de numeros inteiros
            System.out.println("Incremento de números Inteiros:\n");
            int numeroinc = 1;
            System.out.println(++numeroinc);
            //decremento de numeros inteiros
            System.out.println("Decremento de números Inteiros:\n");
            int numerodec = 2;
            System.out.println(--numerodec);
                                                           
        }
}
