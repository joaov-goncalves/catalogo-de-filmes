package br.com.monkeyfilms.catalogofilmes.modelos;

public class Filme {
	private int id;
	private String nome;
	private String descricao;
	private String imagem;
	private Double nota;
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	public String getImagem() {
		return imagem;
	}
	public void getNota(Double nota) {
		this.nota = nota;
	}
	public Double setNota() {
		return nota;
	}
}
