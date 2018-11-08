/* Classe que abstrai o cadastro de um Usuario e seu Endereço
 * @author Luis Gustavo Ullmann
 * @version 1.3
 * */

package br.com.healthtrack.bean;


public class Endereco{
	private int cdEndereco;
	private String cidade;
	private String logradouro;
	private String cep;
	private String pais; 
	private String bairro;
	private String estado;
	private int numEnd;
	
	
	public Endereco(int codigo, String nmLogradouro, String cep, String bairro, String cidade, String estado, String pais, int numero) {
		super();
		this.cdEndereco = codigo;
		this.logradouro = nmLogradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.numEnd = numero;
	}
	
	public Endereco() {}

	
	//Getters and Setters
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	public String getLogradouro() {
		return logradouro;
	}
		
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getNumEnd() {
		return numEnd;
	}
	public void setNumEnd(int numEnd) {
		this.numEnd = numEnd;
	}


	public int getCdEndereco() {
		return cdEndereco;
	}


	public void setCdEndereco(int cdEndereco) {
		this.cdEndereco = cdEndereco;
	}
	
	
}
