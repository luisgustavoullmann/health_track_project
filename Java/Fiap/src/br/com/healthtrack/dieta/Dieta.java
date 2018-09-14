package br.com.healthtrack.dieta;

import java.util.Scanner;

/*Classe que abstrai dados de uma dieta
 * @author Luis Gustavo Ullmann
 * @version 1.7 
 * */

public class Dieta {
	//Atributos
	private int cdDieta;
	private Date data;
	private String nomeAlimento;
	private double caloria;
	private String tipo; //almoço, café, janta e etc..
	private double padraoCaloria; //ds_caloria: quantas calorias consumidas era o ideal por refeição?

	//Métodos
	
	public void dadoDieta() {
		/*Instancia class Dieta
		 * @param O Nome do alimento consumido
		 */
		Scanner alimento = new Scanner(System.in);
		System.out.println("O que você comeu ontem?");
		this.setNomeAlimento(alimento.nextLine());
		
		/*Instancia class Dieta
		 * @param Adiciona uma quantidade de calorias por refeição
		 */
		Scanner caloria = new Scanner(System.in);
		System.out.println("Quantas calorias foram consumidas?");
		this.addCaloria(caloria.nextDouble());
		
		/*Instancia class Dieta
		 * @param O tipo da refeição
		 */
		Scanner refeicao = new Scanner(System.in);
		System.out.println("Qual refeição do dia?");
		this.setTipo(refeicao.nextLine());
		
		/*Instancia class Dieta
		 * @param Se a quantidade consumida de calorias é maior, igual ou menor que o padrao para a refeição
		 */
		Scanner padrao = new Scanner(System.in);
		System.out.println("Qual padrão de calorias que deseja consumir por dia?");
		this.setPadraoCaloria(padrao.nextDouble());
		
		/*Fecha o objeto*/
		alimento.close();
		caloria.close();
		refeicao.close();
		padrao.close();
	}
	
	/*Retorna informações da Dieta*/
	public void infoDieta() {
		if (this.getCaloria() < this.getPadraoCaloria()) {
			System.out.println("Você ingeriu " + this.getCaloria() + ", que foi menos que o ideal menos calorias que o ideal!");
		} else if (this.getCaloria() > this.getPadraoCaloria()) {
			System.out.println("Você já ingeriu " + this.getCaloria() + ", mais do que o ideal.");
		} else {
			System.out.println("Você atingiu o seu padrão.");
		}
	}
	
	
	/*
	 *Acrescenta calorias que foram cosumidas
	 *@param caloria que será adicionada
	 * */
	public void addCaloria(double caloria) {
		this.setCaloria(this.getCaloria() + caloria);
	}
	
	/*
	 *Retira calorias que foram cosumidas
	 *@param caloria que será adicionada
	 * */
	public void retirarCaloria(double caloria) {
		this.setCaloria(this.getCaloria() - caloria);
	}
	
	
	
	//Getters and setters
	public int getCdDieta() {
		return cdDieta;
	}

	public void setCdDieta(int cdDieta) {
		this.cdDieta = cdDieta;
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public String getNomeAlimento() {
		return nomeAlimento;
	}

	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}

	public double getCaloria() {
		return caloria;
	}


	public void setCaloria(double caloria) {
		this.caloria = caloria;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getPadraoCaloria() {
		return padraoCaloria;
	}
	
	public void setPadraoCaloria(double padraoCaloria) {
		this.padraoCaloria = padraoCaloria;
	}

}
	
