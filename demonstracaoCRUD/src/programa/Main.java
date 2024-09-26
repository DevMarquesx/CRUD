package programa;
import java.util.Scanner;
import entidade.PessoaCrud;

public class Main {
    public static void main(String[] args) {
        PessoaCrud crud = new PessoaCrud();
        Scanner scn = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Adicionar Pessoa");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Atualizar Pessoa");
            System.out.println("4. Deletar Pessoa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scn.nextInt();
            scn.nextLine(); // Consome a quebra de linha pendente

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scn.nextLine();
                    crud.adicionarPessoa(nome);
                    break;
                case 2:
                    crud.listarPessoas();
                    break;
                case 3:
                    System.out.print("Nome da pessoa para atualizar: ");
                    String nomeAntigo = scn.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scn.nextLine();
                    crud.atualizarPessoa(nomeAntigo, novoNome);
                    break;
                case 4:
                    System.out.print("Nome da pessoa para deletar: ");
                    String nomeDeletar = scn.nextLine();
                    crud.deletarPessoa(nomeDeletar);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);

        scn.close();
    }
}

