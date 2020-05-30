import java.util.Scanner;

public class CalcularCaloria {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       // Taxa metabólica baseada na equação de Harris-Benedict, revisada em 1990
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
       byte idade = 0;
       byte altura = 0;
       byte peso = 0;     

       System.out.println("Quem é você? Se mulher digite 1, homem digite 2");
       byte resposta = input.nextByte();

       input.close();
    }
}
