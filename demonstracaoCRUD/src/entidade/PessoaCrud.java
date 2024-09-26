package entidade;

import java.util.ArrayList;
import java.util.List;


public class PessoaCrud {
	private List<Pessoa> pessoas = new ArrayList<>();
	 // CREATE
    public void adicionarPessoa(String nome) {
        Pessoa pessoa = new Pessoa(nome);
        pessoas.add(pessoa);
        System.out.println("Pessoa adicionada: " + pessoa);
    }
    // READ
    public void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            pessoas.forEach(System.out::println);
        }
    }
    
    // UPDATE
    public void atualizarPessoa(String nomeAntigo, String novoNome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomeAntigo)) {
                pessoa.setNome(novoNome);
                System.out.println("Pessoa atualizada: " + pessoa);
                return;  
            }
        }
        System.out.println("Pessoa com nome " + nomeAntigo + " não encontrada.");
    }
    
    // DELETE
    public void deletarPessoa(String nome) {
        boolean removido = pessoas.removeIf(pessoa -> pessoa.getNome().equalsIgnoreCase(nome));
        if (removido) {
            System.out.println("Pessoa com nome " + nome + " foi removida.");
        } else {
            System.out.println("Pessoa com nome " + nome + "não encontrada.");
        }
    }
}
