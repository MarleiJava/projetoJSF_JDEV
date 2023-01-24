package br.com.cursojsf;

import javax.faces.bean.ManagedBean;


@ManagedBean(name = "pessoaBean")
public class PessoaBean {

	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	
	
	public String mostrarNome() {
		nomeCompleto = nome +" " +sobrenome;
		System.out.println("foi chamado");
		return "";
	}
	
	public void texte() {
		System.out.println("chamou teste");
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		System.out.println("salvo");
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	
}
