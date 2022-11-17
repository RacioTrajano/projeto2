package br.ufrn.imd.dominio;

public class Endereco {
	private int numCorredor;
	private int numPrateleira;
	private String estante;
	
	public int getNumCorredor() {
		return numCorredor;
	}
	public void setNumCorredor(int numCorredor) {
		this.numCorredor = numCorredor;
	}
	public int getNumPrateleira() {
		return numPrateleira;
	}
	public void setNumPrateleira(int numPrateleira) {
		this.numPrateleira = numPrateleira;
	}
	public String getEstante() {
		return estante;
	}
	public void setEstante(String estante) {
		this.estante = estante;
	}
	
}
