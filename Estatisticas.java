import java.util.Scanner;

public class Estatisticas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int maior50 = 0;
        int qtd1020 = 0;
        double somaAlturas = 0;
        int pesoMenor40 = 0;
        int maisVelho = 0;
        int maisNovo = 200; // idade inicial alta só pra comparar;
        double mediaAlturas = 0;
        double porcentagemPeso = 0;

        for (int i = 1; i <= 25; i++) { 
        	
            System.out.println("\nPessoa " + i + ":");
            
            System.out.print("Idade: ");
            int idade = ler.nextInt();
            
            System.out.print("Altura: ");
            double altura = ler.nextDouble();
            
            System.out.print("Peso: ");
            double peso = ler.nextDouble();


            if (idade > 50) {
                maior50++;
            }

            else if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                qtd1020++;
            }

            if (peso < 40) {
                pesoMenor40++;
            }

            if (idade > maisVelho) {
                maisVelho = idade;
            }
            
            if (idade < maisNovo) {
                maisNovo = idade;
            }
            
        }


        if (qtd1020 > 0) {
            mediaAlturas = somaAlturas / qtd1020;
        }
        
        porcentagemPeso = (pesoMenor40 * 100) / 25;

        System.out.println("RESULTADOS: ");
        System.out.println("Quantidade de pessoas com idade maior que 50: " + maior50);
        System.out.println("Média alturas de 10 a 20 anos: " + mediaAlturas);
        System.out.println("Porcentagem de pessoas com o peso menor que 40: " + porcentagemPeso + "%");
        System.out.println("Mais velho: " + maisVelho);
        System.out.println("Mais novo: " + maisNovo);
    }
}
