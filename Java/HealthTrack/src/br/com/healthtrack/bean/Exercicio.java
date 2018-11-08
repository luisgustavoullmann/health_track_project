package br.com.healthtrack.bean;

import java.util.*;

/*Classe que abstrai dados de exercícios físicos
 * @author Luis Gustavo Ullmann
 * @version 1.8
 * */

public class Exercicio {
	//Atributos
	private int cdExercicio;
	private String modalidade;
	private Calendar data;
	private double km;
	private double padraoKm;
	private Calendar tempo;//qtd_tempo
	private Calendar padraoTempo;
	
		
	
	public Exercicio(int code, String mod, Calendar dataExercicio, double km2, double padKm,
			Calendar dataTempo, Calendar dataPaTempo) {
		this.cdExercicio = code;
		this.modalidade = mod;
		this.data = dataExercicio;
		this.km = km2;
		this.padraoKm = padKm;
		this.tempo = dataTempo;
		this.padraoTempo = dataPaTempo;
	}


	
	public void infoEx() {
		if(!(this.getTempo().equals(this.getPadraoTempo())) && (this.getKm() < this.getPadraoKm())) {
			System.out.println("O seu tempo e Km na " + this.getModalidade() + ", estão abaixo do padrão.");
		} else if((this.getTempo().equals(this.getPadraoTempo())) && (this.getKm() < this.getPadraoKm())) {
			System.out.println("Os kms da " + this.getModalidade() + " estão fora do padrão.");
		} else if(!(this.getTempo().equals(this.getPadraoTempo())) && (this.getKm() == this.getPadraoKm())) {
			System.out.println("O seu tempo da " + this.getModalidade() + " está fora do padrão.");
		} else if((this.getTempo().equals(this.getPadraoTempo())) && (this.getKm() >= this.getPadraoKm())) {
			System.out.println("O seu tempo e km dentro da "+ this.getModalidade() +" estão dentro do padrão mínimo.");
		} else {
			System.out.println("Há algo de errado com os dados da "+ this.getModalidade() +".");
		}
	}

	
	
	//Getters and Setters
	public int getCdExercicio() {
		return cdExercicio;
	}


	public void setCdExercicio(int cdExercicio) {
		this.cdExercicio = cdExercicio;
	}


	public String getModalidade() {
		return modalidade;
	}


	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}


	public Calendar getData() {
		return data;
	}


	public void setData(Calendar data) {
		this.data = data;
	}


	public Calendar getTempo() {
		return tempo;
	}


	public void setTempo(Calendar tempo) {
		this.tempo = tempo;
	}


	public Calendar getPadraoTempo() {
		return padraoTempo;
	}


	public void setPadraoTempo(Calendar padraoTempo) {
		this.padraoTempo = padraoTempo;
	}


	public double getKm() {
		return km;
	}


	public void setKm(double km) {
		this.km = km;
	}


	public double getPadraoKm() {
		return padraoKm;
	}


	public void setPadraoKm(double padraoKm) {
		this.padraoKm = padraoKm;
	}
	
}//

	
	
