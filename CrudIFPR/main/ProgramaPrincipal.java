package main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import cliente.Cliente;
import cliente.GerenciarCliente;
import console.Console;

public class ProgramaPrincipal {

	private Console lerTeclado;
	private GerenciarCliente gerCliente;
	private final int CADASTRAR = 1;
	private final int ALTERAR = 2;
	private final int LISTAR = 3;
	private final int REMOVER = 4;
	private final int SAIR = 9;
	private SimpleDateFormat sdf;

	public ProgramaPrincipal() {
		lerTeclado = new Console();
		gerCliente = new GerenciarCliente();
		sdf = new SimpleDateFormat("dd/MM/yyyy");
	}

	public static void main(String[] args) {
		new ProgramaPrincipal().executar();
	}

	public void executar() {
		int opcao = 0;
		for (;;) {
			System.out.println("--- SUPER SISTEMA DE CADASATRO ---");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Alterar");
			System.out.println("3 - Listar");
			System.out.println("4 - Remover");
			System.out.println("9 - Sair");

			opcao = lerTeclado.readInt("Digite uma opcao:");

			if (opcao == CADASTRAR) {
				System.out.println("\nCadastro de cliente, informe os dados\n");

				String nome = lerTeclado.readLine("Digite o nome:");
				String cpf = lerTeclado.readLine("Digite o CPF:");
				Date dataNascimento = lerTeclado.readDate("Data de nascimento:");

				Cliente cliente = new Cliente();
				cliente.setNome(nome);
				cliente.setCpf(cpf);
				cliente.setDataNascimento(dataNascimento);

				gerCliente.cadastrar(cliente);

				System.out.println("Cadastro realizado com sucesso\n");
			} else if (opcao == ALTERAR) {
				System.out.println("\nAlterar cliente, informe os dados\n");

				int id = lerTeclado.readInt("Digite o id:");
				String nome = lerTeclado.readLine("Digite o nome:");
				String cpf = lerTeclado.readLine("Digite o CPF:");
				Date dataNascimento = lerTeclado.readDate("Data de nascimento:");

				Cliente cliente = gerCliente.findById(id);
				cliente.setNome(nome);
				cliente.setCpf(cpf);
				cliente.setDataNascimento(dataNascimento);

				gerCliente.atualizar(cliente);

				System.out.println("Dados alterados com sucesso\n");
			} else if (opcao == LISTAR) {
				List<Cliente> clientesCadastrados = gerCliente.listar();
				for (int i = 0; i < clientesCadastrados.size(); i++) {
					System.out.println("\n------Dados do cliente");
					Cliente cliente = clientesCadastrados.get(i);
					System.out.println("ID: " + cliente.getId());
					System.out.println("Nome: " + cliente.getNome());
					System.out.println("CPF: " + cliente.getCpf());
					System.out.println("Data de Nascimento: " + sdf.format(cliente.getDataNascimento()));
				}
			} else if (opcao == REMOVER) {
				int id = lerTeclado.readInt("Digite o id para remover:");
				gerCliente.remover(id);
			} else if (opcao == SAIR) {
				break;
			} else {
				System.out.println("Opçao Inválida");
			}
		}

	}

}
