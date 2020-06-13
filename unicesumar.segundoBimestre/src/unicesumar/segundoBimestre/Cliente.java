package unicesumar.segundoBimestre;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private List<Endereco> endereco = new ArrayList<>();
	private Seguro seguro;

	public Cliente(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
	this.endereco.add(endereco);
		
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	
	public void addmaisEnderecos(Endereco e){ 
		endereco.add(e);
		}
	
	
	
	
	
	
	
	
	
	
}
