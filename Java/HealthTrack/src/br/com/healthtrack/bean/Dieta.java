package br.com.healthtrack.bean;

import java.util.*;

/*Classe que abstrai dados de uma dieta
 * @author Luis Gustavo Ullmann
 * @version 1.8 
 * */

public class Dieta {
	//Atributos
	private int cdDieta;
	private Calendar data;
	private Calendar horario;
	private String nomeAlimento;
	private double caloria;
	private String tipo; //almoço, café, janta e etc..
	private double padraoCaloria; //ds_caloria: quantas calorias consumidas era o ideal por refeição?

	//Métodos
	public Dieta(int code, String name, double caloria, String type, double padcaloria, Calendar dataDieta, Calendar horario) {
		super();
		this.cdDieta = code;
		this.nomeAlimento = name;
		this.caloria = caloria;
		this.tipo = type;
		this.padraoCaloria = padcaloria;
		this.data = dataDieta;
		this.horario = horario;
	}
	
	public Dieta() {}

	
	
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

	public Calendar getHorario() {
		return horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
	}
	
}
	
