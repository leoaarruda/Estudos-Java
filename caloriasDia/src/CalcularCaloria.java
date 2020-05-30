import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class CalcularCaloria {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       // Taxa metabólica Basal baseada na equação de Harris-Benedict, revisada em 1990
       // Homens TMB = (10 × peso em kg) + (6,25 x altura em cm) - (5 × idade em anos) + 5
       // Mulheres TMB = (10 × peso em kg) + (6,25 x altura e cm) - (5 × idade em anos) - 161
       
       // Calssificação do fator de atividade
       // Sedentário: 1,2
       // Exercícios Leves 1 a 3 vezes/senama: 1,375
       // Exercícios Moderados 3 a 5 vezes/senama: 1,55
       // Exercício Internos 6 a 7 vezes/semana 1,725
       // Atleta: 1,9 
       
       final float exercicioLeve = 1.2f;
       final float exercicioModerado = 1.375f;
       final float exercicioIntensos = 1.55f;
       final float atleta = 1.9f;
      
       
            
       System.out.print("Quem é você? Se mulher digite 1, homem digite 2: ");
       byte resposta = input.nextByte();
        
        if(resposta != 1 && resposta != 2 ){

            System.out.println("Digito inválido! Digite 1 ou 2.");

        }else if(resposta == 1){
            System.out.print("\nInforme seu peso em Kg: ");
            byte peso = input.nextByte();

            System.out.print("\nInforme sua altura em cm: ");
            int altura = input.nextInt();

            System.out.print("\nInforme sua sua idade em anos: ");
            byte idade = input.nextByte();          

            float resultado = (10f * peso) + (6.25f * altura) - (5 * idade ) + 5;
            
            System.out.println("Sua taxa diária de calorias diarias é de: " + resultado  + " cal");
        

        }else if(resposta == 2){
            System.out.print("\nInforme seu peso em Kg: ");
            byte peso = input.nextByte();

            System.out.print("\nInforme sua altura em cm: ");
            int altura = input.nextInt();

            System.out.print("\nInforme sua sua idade em anos: ");
            byte idade = input.nextByte();

            float resultado = (10f * peso) + (6.25f * altura) - (5 * idade ) - 161;
           
            System.out.println("Sua taxa diária de calorias diarias é de: " + resultado + " cal");
        }

       input.close();
    }
}
