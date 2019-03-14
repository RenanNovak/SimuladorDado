import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dado {

	ArrayList<Integer> dados = new ArrayList<Integer>();
	String[] Letras = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
			"U", "V", "W", "X", "Y", "Z" , "ABAIXO", "ACIMA", "DIREITA", "ESQUERDA"};
	// Char[1 + (int)(Math.random() * ((26 - 1) + 1))]
	// Letras dados
	Scanner ler = new Scanner(System.in);
	Random gerador = new Random();

	public ArrayList<Integer> dado(int qtd_Dados, char opcao) {
		switch (opcao) {
		case 'Y': // Com letra
			for (int i = 0; i < qtd_Dados; i++) {
				System.out.print("Quantidade de lados do dado: ");
				int lados = ler.nextInt();
				int Total = gerador.nextInt(lados) + 1;
				System.out.println("Dado (" + (i + 1) + ")\n" + Letras[1 + (int)(Math.random() * ((29 - 1) + 1))]);  //(Total de caracteres -1) - 1
				dados.add(Total);
			}
			break;
		case 'N': // Sem letra
			for (int i = 0; i < qtd_Dados; i++) {
				System.out.print("Quantidade de lados do dado: ");
				int lados = ler.nextInt();
				int Total = gerador.nextInt(lados) + 1;
				System.out.println("Dado (" + (i + 1) + ")\n" + Total);
				dados.add(Total);
			}
			break;
		}
		return dados;
	}
}