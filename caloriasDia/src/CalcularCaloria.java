import java.text.BreakIterator;
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
       
       final float sedentario = 1.2f;
       final float exercicioLeve = 1.375f;
       final float exercicioModerado = 1.55f;
       final float exercicioIntensos = 1.725f;
       final float atleta = 1.9f;
       float resultado = 0f;    
                   
       System.out.print("Quem é você? Digite 1 para Mulher ou 2 para Homem: ");
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

            resultado = (10f * peso) + (6.25f * altura) - (5f * idade ) + 5;
            
            System.out.println("\nSua taxa diária de calorias diarias é de: " + resultado  + " cal \n");        

        }else if(resposta == 2){
            System.out.print("\nInforme seu peso em Kg: ");
            byte peso = input.nextByte();

            System.out.print("\nInforme sua altura em cm: ");
            int altura = input.nextInt();

            System.out.print("\nInforme sua sua idade em anos: ");
            byte idade = input.nextByte();

             resultado = (10f * peso) + (6.25f * altura) - (5f * idade ) - 161;
           
            System.out.println("\nSua taxa diária de calorias basal é de: " + resultado + " cal \n");
        }
        System.out.println("\nVocê quer complementar o resultado com fator de atividade?");
        System.out.println("\nDigite: 1 para sim. ou 2 para não.\n");
        byte complemento = input.nextByte();

            if(complemento != 1 && complemento != 2){
                System.out.print("Informação inválida, digite 1 ou 2.\n");           
                       
              }else if(complemento == 2 ){
                  System.out.println("Obrigado, seja feliz e leve uma vida saudável =)");
              }else{
                System.out.println(
 "Digite o número do seu fator de atividade. \n1. Sedentário \n2. Exercícios Leves 1 a 3 vezes/senama \n3. Exercícios Moderados 3 a 5 vezes/senama \n4. Exercício Intensos 6 a 7 vezes/seman \n5. Atleta \n");
                     byte fator = input.nextByte();

                     switch(fator){
                        case 1: System.out.println( resultado * sedentario); break;
                        case 2: System.out.println( resultado * exercicioLeve); break;
                        case 3: System.out.println( resultado * exercicioModerado); break;
                        case 4: System.out.println( resultado * exercicioIntensos);break;
                        case 5: System.out.println( resultado * atleta);break;
                        default: System.out.println("\nObrigado, seja feliz e leve uma vida saudável =)\n");
                    }                       
            input.close();
        }
    }
}