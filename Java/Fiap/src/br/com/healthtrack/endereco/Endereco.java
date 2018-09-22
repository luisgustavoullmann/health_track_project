/* Classe que abstrai o cadastro de um Usuario e seu Endereço
 * @author Luis Gustavo Ullmann
 * @version 1.3
 * */

package br.com.healthtrack.endereco;

import java.util.Scanner;

public class Endereco{
	private int cdEndereco;
	private String cidade;
	private String tipoLogradouro;
	private String logradouro;
	private String cep;
	private String pais; //país: Brasil default
	private String bairro;
	private String estado;
	private int numEnd; //número do seu endereço
	
	
	public Endereco(int codigo, String tipoLogradouro2, String nmLogradouro, String cep2, String bairro2,
			String cidade2, String estado2, String pais2, int numero) {
		super();
		this.cdEndereco = codigo;
		this.tipoLogradouro = tipoLogradouro2;
		this.logradouro = nmLogradouro;
		this.cep = cep2;
		this.bairro = bairro2;
		this.cidade = cidade2;
		this.estado = estado2;
		this.pais = pais2;
		this.numEnd = numero;
	}
	
	public Endereco() {}


	/*Input de dados de Endereco do Usuario*/
	public void dadoEndereco() {
		/*Instancia class Endereco extends Usuario
		 * @param A rua do usuario
		 * */
		Scanner address = new Scanner(System.in);
		System.out.println("Tipo do seu logradouro? [Rua, Avenida...]");
		this.setTipoLogradouro(address.nextLine());
		
		/*Instancia class Endereco extends Usuario
		 * @param O logradouro do usuario
		 * */
		System.out.println("Qual o seu logradouro?");
		this.setLogradouro(address.nextLine());
		
		/*Instancia class Endereco extends Usuario
		 * @param O numero do endereço do usuario
		 * */ 
		System.out.println("Nº do endereço?");
		this.setNumEnd(address.nextInt());
		
		/*Instancia class Endereco extends Usuario
		 * @param O bairro do usuario
		 * */
		System.out.println("Qual o seu bairro?");
		this.setBairro(address.nextLine());
		
		/*Instancia class Endereco extends Usuario
		 * @param A cidade do usuario
		 * */
		System.out.println("Qual a sua cidade?");
		this.setCidade(address.nextLine());
		
		/*Instancia class Endereco extends Usuario
		 * @param O cep do usuario
		 * */
		System.out.println("Qual o seu CEP?");
		this.setCep(address.nextLine());
		
		/*Instancia class Endereco extends Usuario
		 * @param O estado do usuario
		 * */
		System.out.println("Estado aonde mora?");
		this.setEstado(address.nextLine());
		
		/*Instancia class Endereco extends Usuario
		 * @param O país do usuario
		 * */
		System.out.println("Qual o seu país?");
		this.setPais(address.nextLine());
		
		
		/*Fecha o objeto*/
		address.close();
	}
	
	
	/*Retorna o Endereco do Usuario*/
	public void retornoEndereco() {
		System.out.println("Seu endereço: " + this.getLogradouroFormatado() + " nº " + this.getNumEnd() + ", " + this.getBairro() + " - " + this.getCidade() +
							" - CEP: " + this.getCep() + " - " + this.getEstado() + " - " + this.getPais() + ".");
	}
	
	//Getters and Setters
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
		
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
		
	public String getLogradouroFormatado() {
		return formatarLogradouro(tipoLogradouro, logradouro);
	}
	public String formatarLogradouro(String tipoLogradouro, String logradouro) {
		return this.tipoLogradouro + " " + this.logradouro;
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
