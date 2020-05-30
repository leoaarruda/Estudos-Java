import java.util.Scanner;

public class Ipi {
  
            public static void main(String[] args) {
        
                Scanner input = new Scanner(System.in);
        
                // A porcentagem do IPI a ser acrescido no valor das peças - o código da peça 1
                // Valor unitário da peça 1, quantidade de peças 1
                // O código da peça 2, valor unitário da peça 2, quantidade de peças 2
                // O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
                // Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
        
                int peca = 0;
                int quantidade = 0;
                float valor1 = 0f;
                float valor2 = 0f;
                final float buzina = 15.20f;
                final float limpador = 20.35f;
                final float retrovisor = 30.70f;
                float resultado = 0f;
                
                try {
                    System.out.println("Escolha uma peça.");
                    System.out.print(
                            "\nBuzina/R$ 15.20 = cod. 1 \n\nLimpador/R$ 20.35 = cod. 2 \n\nRetrovisor/R$ 30.70 = cod. 3\n*********************************\n");
        
                    System.out.print("\nInforme o código do produto: ");
                    peca = input.nextInt();
                
                    if ((peca < 1) || (peca > 3)) {
                        System.out.println("\nCódigo inexistente!");
        
                    } else {
        
                        System.out.print("\nInforme a quantidade de peças: ");
                        quantidade = input.nextInt();
        
                        if (peca == 1) {
                            System.out.println("\nR$ " + buzina * quantidade + "\n*********************************\n");
                            valor1 = (buzina * quantidade);
        
                        } else if (peca == 2) {
                            System.out.println("\nR$ " + limpador * quantidade + "\n*********************************\n");
                            valor1 = (limpador * quantidade);
        
                        } else if (peca == 3) {
                            System.out.println("\nR$ " + retrovisor * quantidade + "\n**********************************\n");
                            valor1 = (retrovisor * quantidade);
                        }
                        System.out.print("Informe o código da segunda peça: ");
                        peca = input.nextInt();
        
                        if ((peca < 1) || (peca > 3)) {
                            System.out.println("\nCódigo inexistente!");
        
                        } else {
        
                            System.out.print("\nInforme a quantidade de peças: ");
                            quantidade = input.nextInt();
        
                            if (peca == 1) {
                                System.out.println("\nR$ " + buzina * quantidade);
                                valor2 = (buzina * quantidade);
        
                            } else if (peca == 2) {
                                System.out.println("\nR$ " + limpador * quantidade);
                                valor2 = (limpador * quantidade);
        
                            } else if (peca == 3) {
                                System.out.println("\nR$ " + retrovisor * quantidade + "\n");
                                valor2 = (retrovisor * quantidade);
                            }
        
                            System.out.println("A soma dos pedidos fica: R$ " + (valor1 + valor2));
                            resultado = ((valor1 + valor2) * 1.10f);
                            System.out.println(
                                    "\nValor total + impostos/IPI(10%): R$ " + resultado + "\n********************************************");
        
                            input.close();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("\nValor de entrada inválido!\n" + e);
                }
            }
        }
