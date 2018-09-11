/* Classe que abstrai o cadastro de um Usuario e seu Endereço
 * @author Luis Gustavo Ullmann
 * @version 1.3
 * */

package br.com.healthtrack.endereco;

import java.util.Scanner;

public class Endereco{
	private String cidade;
	private String tipoLogradouro;
	private String logradouro;
	private String cep;
	private String pais; //país: Brasil default
	private String bairro;
	private String estado;
	private int numEnd; //número do seu endereço
	
	
	/*Input de dados de Endereco do Usuario*/
	public void dadoEndereco() {
		/*Instancia class Endereco extends Usuario
		 * @param A rua do usuario
		 * */
		Scanner rua = new Scanner(System.in);
		System.out.println("Tipo do seu logradouro? [Rua, Avenida...]");
		this.setTipoLogradouro(rua.nextLine());
		
		/*Instancia class Endereco extends Usuario
		 * @param O logradouro do usuario
		 * */
		Scanner logra = new Scanner(System.in);
		System.out.println("Qual o seu logradouro?");
		this.setLogradouro(logra.nextLine());
		
		/*Instancia class Endereco extends Usuario
		 * @param O numero do endereço do usuario
		 * */
		Scanner numberEndereco = new Scanner(System.in); 
		System.out.println("Nº do endereço?");
		this.setNumEnd(numberEndereco.nextInt());
		
		/*Instancia class Endereco extends Usuario
		 * @param O bairro do usuario
		 * */
		Scanner bairro = new Scanner(System.in);
		System.out.println("Qual o seu bairro?");
		this.setBairro(bairro.nextLine());
		
		/*Instancia class Endereco extends Usuario
		 * @param A cidade do usuario
		 * */
		Scanner cidade = new Scanner(System.in);
		System.out.println("Qual a sua cidade?");
		this.setCidade(cidade.nextLine());
		
		/*Instancia class Endereco extends Usuario
		 * @param O cep do usuario
		 * */
		Scanner cep = new Scanner(System.in);
		System.out.println("Qual o seu CEP?");
		this.setCep(cep.nextLine());
		
		/*Instancia class Endereco extends Usuario
		 * @param O estado do usuario
		 * */
		Scanner estado = new Scanner(System.in);
		System.out.println("Estado aonde mora?");
		this.setEstado(estado.nextLine());
		
		/*Instancia class Endereco extends Usuario
		 * @param O país do usuario
		 * */
		Scanner pais = new Scanner(System.in);
		System.out.println("Qual o seu país?");
		this.setPais(pais.nextLine());
		
		
		/*Fecha o objeto*/
		rua.close();
		logra.close();
		numberEndereco.close();
		bairro.close();
		cidade.close();
		cep.close();
		estado.close();
		pais.close();
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
	
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
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
}
