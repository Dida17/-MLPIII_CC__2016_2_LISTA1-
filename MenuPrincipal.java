package Locacao_De_Veiculos;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		Veiculo veiculo = new Veiculo();

		veiculo.locacao();
	}
}
