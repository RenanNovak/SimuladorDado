import java.util.Scanner;

public class Main {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Vai ter simbolos? Y/N: ");
		char opcao = 'Y';
		try {
		opcao = scan.next().charAt(0);
		}catch(Exception e1) {
			System.err.println(e1);
			opcao = scan.next().charAt(0);
		}
		System.out.print("Quantidade de dados:");
		try {
			int qtd_dados = scan.nextInt();
			Dado D = new Dado();
			D.dado(qtd_dados,opcao);
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}
