
import java.util.Scanner;

public class ProgamaArrayList {

	public static void main(String[] args) {

		String[] nome = new String[1000];
		String[] RG = new String[1000];
		String[] Nascimento = new String[1000];
		String[] Email = new String[1000];
		String[] endereco = new String[1000];
		String[] telefone = new String[1000];
		String[] logradouro = new String[1000];
		String[] numero = new String[1000];
		String[] Complemento = new String[1000];
		String[] Bairro = new String[1000];
		String[] CEP = new String[1000];
		String[] Cidade = new String[1000];

		for (int i = 0; i < nome.length; i++) {
			nome[i] = "";
			RG[i] = "";
			Nascimento[i] = "";
			Email[i] = "";
			telefone[i] = "";
			endereco[i] = "";
			logradouro[i] = "";
			numero[i] = "";
			Complemento[i] = "";
			Bairro[i] = "";
			CEP[i] = "";
			Cidade[i] = "";

		}

		int opcao = 0, listarPor = 0, posicao = 0, codigoPesquisa = 0;
		String continuar = "", nomeExcluir = "", nomePesquisa = "";

		Scanner entrada = new Scanner(System.in);

		do {

			System.out
					.println("Escolha a opção: 1-Incluir  2-Listar  3-Excluir  4-Sair");
			opcao = entrada.nextInt();
			entrada.nextLine();

			switch (opcao) {
				case 1:
					// Código para Incluir

					if (posicao < nome.length) {
						do {

							System.out.print("Digite o nome: ");
							nome[posicao] = entrada.nextLine();

							System.out.print("Digite o RG: ");
							RG[posicao] = entrada.nextLine();

							System.out.print("Digite a data de Nascimento: ");
							Nascimento[posicao] = entrada.nextLine();

							System.out.print("Digite o email: ");
							Email[posicao] = entrada.nextLine();

							System.out.print("Digite o telefone: ");
							telefone[posicao] = entrada.nextLine();

							System.out.print("Digite o endereço: ");
							endereco[posicao] = entrada.nextLine();

							System.out.print("Digite o logradouro: ");
							logradouro[posicao] = entrada.nextLine();

							System.out.print("Digite o numero da casa: ");
							numero[posicao] = entrada.nextLine();

							System.out.print("Digite o complemento: ");
							Complemento[posicao] = entrada.nextLine();

							System.out.print("Digite o Bairro: ");
							Bairro[posicao] = entrada.nextLine();

							System.out.print("Digite o CEP: ");
							CEP[posicao] = entrada.nextLine();

							System.out.print("Digite a cidade: ");
							Cidade[posicao] = entrada.nextLine();

							System.out.print("Deseja continuar o cadastramento? 1-Sim  2-Não ");
							continuar = entrada.nextLine();

							posicao++;

						} while (continuar.equals("1"));

					} else {

						System.out.println("Sua agenda está cheia.");

					}

					break;

				case 2:
					System.out.println("Como deseja pesquisar? 1-Código  2-Nome  3-Todos");
					listarPor = entrada.nextInt();
					entrada.nextLine();

					switch (listarPor) {
						case 1:
							System.out.println("Digite o código para pesquisa: ");
							codigoPesquisa = entrada.nextInt();
							entrada.nextLine();

							if (codigoPesquisa < nome.length && codigoPesquisa >= 0) {

								System.out.println("Nome: " + nome[codigoPesquisa] +
										"RG: " + RG[codigoPesquisa] +
										"Nascimento: " + Nascimento[codigoPesquisa] +
										"Email: " + Email[codigoPesquisa] +
										"telefone: " + telefone[codigoPesquisa] +
										"Endereço: " + endereco[codigoPesquisa] +
										"logradouro: " + logradouro[codigoPesquisa] +
										"numero: " + numero[codigoPesquisa] +
										"Complemento: " + Complemento[codigoPesquisa] +
										"Bairro: " + Bairro[codigoPesquisa] +
										"CEP: " + CEP[codigoPesquisa] +
										"Cidade: " + Cidade[codigoPesquisa]);

							} else {

								System.out.println("Código Inválido!");

							}

							break;

						case 2:
							System.out.println("Digite o nome para pesquisa: ");
							nomePesquisa = entrada.nextLine();

							for (int i = 0; i < telefone.length; i++) {

								if (nome[i].equalsIgnoreCase(nomePesquisa)) {

									System.out.println("Nome: " + nome[i] +
											"RG: " + RG[i] +
											"Nascimento: " + Nascimento[i] +
											"Email: " + Email[i] +
											"Telefone: " + telefone[i] +
											"Endereço: " + endereco[i] +
											"Telefone: " + telefone[i] +
											"logradouro: " + logradouro[i] +
											"numero: " + numero[i] +
											"Complemento: " + Complemento[i] +
											"Bairro: " + Bairro[i] +
											"CEP: " + CEP[i] +
											"Cidade: " + Cidade[i]);
								}

							}

							break;

						case 3:
							// Código que lista todos os dados.
							for (int i = 0; i < nome.length; i++) {

								if (!nome[i].equals("")) {

									System.out.println("Nome: " + nome[i] + "  RG: " + RG[i] +
											"  Nascimento: " + Nascimento[i] + "  Email: " + Email[i] +
											"  Telefone: " + telefone[i] + "  Endereço: " + endereco[i] +
											"  Logradouro: " + logradouro[i] + "  numero: " + numero[i] +
											"  Complemento: " + Complemento[i] + "  Bairro: " + Bairro[i] +
											"  CEP: " + CEP[i] + "  Cidade: " + Cidade[i]);

								}

							}

							break;

						default:
							System.out.println("Opção inválida! Escolha números de 1 a 3");

							break;
					}

				case 3:
					// Código para Excluir
					System.out.println("Quem deseja excluir? ");
					nomeExcluir = entrada.nextLine();

					for (int i = 0; i < nome.length; i++) {
						if (nome[i].equals(nomeExcluir)) {

							nome[i] = "";
							RG[i] = "";
							Nascimento[i] = "";
							Email[i] = "";
							telefone[i] = "";
							endereco[i] = "";
							logradouro[i] = "";
							numero[i] = "";
							Complemento[i] = "";
							Bairro[i] = "";
							CEP[i] = "";
							Cidade[i] = "";
						}

					}

					break;
				case 4:
					// Código para Sair
					System.out.println("Programa Finalizado.");
					return;

				default:
					// Opção Invalida!
					System.out.println("Opção Inválida! Tente novamente.");
					break;
			}

		} while (opcao != 4);

	}

}
