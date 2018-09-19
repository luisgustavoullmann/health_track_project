package br.com.healthtrack.dieta;

import java.util.*;

/*Classe que abstrai dados de uma dieta
 * @author Luis Gustavo Ullmann
 * @version 1.8 
 * */

public class Dieta {
	//Atributos
	private int cdDieta;
	private Calendar data;
	private String nomeAlimento;
	private double caloria;
	private String tipo; //almo�o, caf�, janta e etc..
	private double padraoCaloria; //ds_caloria: quantas calorias consumidas era o ideal por refei��o?

	//M�todos
	
	public Dieta(int code, String name, double caloria1, String type, double padcaloria, Calendar dataDieta) {
		// TODO Auto-generated constructor stub
	}

	public void dadoDieta() {
		Scanner alimento = new Scanner(System.in);
		/*Instancia class Dieta
		 * @param O Nome do alimento consumido
		 */
		System.out.println("O que voc� comeu ontem?");
		this.setNomeAlimento(alimento.nextLine());
		
		/*Instancia class Dieta
		 * @param Adiciona uma quantidade de calorias por refei��o
		 */
		System.out.println("Quantas calorias foram consumidas?");
		this.addCaloria(alimento.nextDouble());
		
		/*Instancia class Dieta
		 * @param O tipo da refei��o
		 */
		System.out.println("Qual refei��o do dia?");
		this.setTipo(alimento.nextLine());
		
		/*Instancia class Dieta
		 * @param Se a quantidade consumida de calorias � maior, igual ou menor que o padrao para a refei��o
		 */
		System.out.println("Qual padr�o de calorias que deseja consumir por dia?");
		this.setPadraoCaloria(alimento.nextDouble());
		
		/*Fecha o objeto*/
		alimento.close();
	}
	
	/*Retorna informa��es da Dieta*/
	public void infoDieta() {
		if (this.getCaloria() < this.getPadraoCaloria()) {
			System.out.println("Voc� ingeriu " + this.getCaloria() + ", que foi menos que o ideal menos calorias que o ideal!");
		} else if (this.getCaloria() > this.getPadraoCaloria()) {
			System.out.println("Voc� j� ingeriu " + this.getCaloria() + ", mais do que o ideal.");
		} else {
			System.out.println("Voc� atingiu o seu padr�o.");
		}
	}
	
	
	/*
	 *Acrescenta calorias que foram cosumidas
	 *@param caloria que ser� adicionada
	 * */
	public void addCaloria(double caloria) {
		this.setCaloria(this.getCaloria() + caloria);
	}
	
	/*
	 *Retira calorias que foram cosumidas
	 *@param caloria que ser� adicionada
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

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
	
	

}
	
