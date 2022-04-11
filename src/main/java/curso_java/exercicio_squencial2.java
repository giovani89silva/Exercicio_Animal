package curso_java;

import java.util.Locale;

import java.util.Scanner;

public class exercicio_squencial2 {
    
    public static void main(String[] args) {
       
       Locale.setDefault(Locale.US);   
       Scanner sc = new Scanner(System.in);
       double R;
       double A;
       double pi = 3.14159;
       //System.out.println("Informe o valor do raio do círculo: \n");
       System.out.println("Digite um valor para o raio do círculo: ");
       R = sc.nextDouble();
       
       A = pi * R * R;
       System.out.println("O valor da área deste círculo é: " + A);
       
        sc.close();
        
       }
    
}
