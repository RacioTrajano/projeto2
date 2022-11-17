package br.ufrn.imd.dominio;



public class ItemAcervo {
	
	public ItemAcervo () {
		disponivel = true;
	}
	
	private int id;
	protected int qtdCopias;
	protected int qtdPaginas;
	protected int ano;
	protected int edicao;
	protected String editora;
	protected String autor;
	protected Endereco endereco;
	protected boolean exclusivo = false;
	private boolean disponivel = false;
	protected String titulo;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public boolean isExclusivo() {
		return exclusivo;
	}
	public void setExclusivo(boolean exclusivo) {
		this.exclusivo = exclusivo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQtdCopias() {
		return qtdCopias;
	}
	public void setQtdCopias(int qtdCopias) {
		this.qtdCopias = qtdCopias;
	}
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		
		return "Titulo: " + titulo + " Editora: " + editora;
	}
	
    
    //rentAcervo
    //devAcervo
    
    
}
