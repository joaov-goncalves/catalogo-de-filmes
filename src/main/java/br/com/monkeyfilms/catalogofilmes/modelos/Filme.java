package br.com.monkeyfilms.catalogofilmes.modelos;

public class Filme {
	private String nome;
	private String descricao;
	private String imagem;
	private int nota;
	
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
	public void getNota(int nota) {
		this.nota = nota;
	}
	public int setNota(int nota) {
		return nota;
	}
}
