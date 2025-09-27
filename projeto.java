
import java.util.Scanner;

public class projeto {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);
        int numero = (int)(Math.random() * 100) + 1; // número aleatório entre 1 e 100
        int palpite = 0, tentativas = 0;
        System.out.print("\n Tente adivinhar o número de 1 a 100!");

    while(palpite != numero){
        System.out.print("\nDigite seu palpite: ");
        palpite = teclado.nextInt();
        tentativas++;
        if(palpite < numero){
            System.out.println("Quase lá, ta quente!");
        }else if(palpite > numero){
            System.out.println("Passou do número!");
        } else{
            System.out.println("Isso aí! Você acertou em " + tentativas + " tentativas.");
        }
    }




   

    }
}
