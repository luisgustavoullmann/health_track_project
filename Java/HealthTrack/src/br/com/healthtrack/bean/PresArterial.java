package br.com.healthtrack.bean;

import java.util.*;


/*Classe que abstrai dados ao auferir press�o arterial
 * @author Luis Gustavo Ullmann
 * @version 1.8 
 * */

public class PresArterial {
	//Atributo
	private int cdUsuario;
	private double dadoMax;
	private double dadoMin;
	private Calendar data;
	private double padraoMaxPres;
	private double padraoMinPres;
	
	public PresArterial(int code, double dadoMax, double dadoMin, Calendar dataPres, double padraoMaxPres, double padraoMinPres) {
		super();
		this.cdUsuario = code;
		this.dadoMax = dadoMax;
		this.dadoMin = dadoMin;
		this.data = dataPres;
		this.padraoMaxPres = padraoMaxPres;
		this.padraoMaxPres = padraoMaxPres;
	}
	
	public PresArterial() {
		super();
	}


	/*Input dados da Pressao do Usuario
	public void dadoPres() {
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Quanto de press�o foi auferida?");
		this.setDado(dado.nextDouble());

		
		System.out.println("Data de auferimento: ");
		this.setData(data);
		
		
		System.out.println("Qual o padr�o da sua press�o?");
		this.setPadraoPres(dado.nextDouble());
		
		
		dado.close();
	}*/
	
	
	/*Retorna a Pressao do Usuario
	public void infoPres() {
		if (this.getDado() == this.getPadraoPres()) {
			System.out.println("Hoje � " + this.getData() + ", e sua press�o est� em " + this.getDado() + " e est� dentro do padr�o.");
		} else if (this.getDado() != this.getPadraoPres()) {
			System.out.println("Seu padr�o � " + this.getPadraoPres() + "e voc� est� com " + this.getDado());
		} else {
			System.out.println("N�o conseguimos auferir os dados da sua press�o.");
		}
	}*/

	
	//Getters and Setters
	public int getCdUsuario() {
		return cdUsuario;
	}


	public void setCdUsuario(int cdUsuario) {
		this.cdUsuario = cdUsuario;
	}	
	

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public double getDadoMax() {
		return dadoMax;
	}

	public void setDadoMax(double dadoMax) {
		this.dadoMax = dadoMax;
	}

	public double getDadoMin() {
		return dadoMin;
	}

	public void setDadoMin(double dadoMin) {
		this.dadoMin = dadoMin;
	}

	public double getPadraoMaxPres() {
		return padraoMaxPres;
	}

	public void setPadraoMaxPres(double padraoMaxPres) {
		this.padraoMaxPres = padraoMaxPres;
	}

	public double getPadraoMinPres() {
		return padraoMinPres;
	}

	public void setPadraoMinPres(double padraoMinPres) {
		this.padraoMinPres = padraoMinPres;
	}

	
	
	
}
