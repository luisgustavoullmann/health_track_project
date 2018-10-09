package br.com.healthtrack.exercicio;

import java.util.*;

/*Classe que abstrai dados de exerc�cios f�sicos
 * @author Luis Gustavo Ullmann
 * @version 1.8
 * */

public class Exercicio {
	//Atributos
	private int cdExercicio;
	private String modalidade; //Indoor ou Outdoor
	private String tipo; //nata��o, corrida, caminhada..
	private Calendar data;
	private double km;
	private double padraoKm;
	private Calendar tempo;//qtd_tempo
	private Calendar padraoTempo;
	
		
	
	public Exercicio(int code, String mod, String type, Calendar dataExercicio, double km2, double padKm,
			Calendar dataTempo, Calendar dataPaTempo) {
		this.cdExercicio = code;
		this.modalidade = mod;
		this.tipo = type;
		this.data = dataExercicio;
		this.km = km2;
		this.padraoKm = padKm;
		this.tempo = dataTempo;
		this.padraoTempo = dataPaTempo;
	}


	/*Input dados do exercicio*/
	public void dadoExercicio() {
		Scanner ex = new Scanner(System.in);
		System.out.println("Data do exerc�cio? ");
		this.setData(data);
		
		System.out.println("Tempo de excecu��o do exerc�cio?");
		this.setTempo(tempo);
		
		System.out.println("Qual o seu padr�o de tempo: ");
		this.setPadraoTempo(padraoTempo);
		
		/*Fecha o objeto*/
		ex.close();
				
	}
	
	
	public void infoEx() {
		if(!(this.getTempo().equals(this.getPadraoTempo())) && (this.getKm() < this.getPadraoKm())) {
			System.out.println("O seu tempo e Km na " + this.getTipo() + ", est�o abaixo do padr�o.");
		} else if((this.getTempo().equals(this.getPadraoTempo())) && (this.getKm() < this.getPadraoKm())) {
			System.out.println("Os kms da " + this.getTipo() + " est�o fora do padr�o.");
		} else if(!(this.getTempo().equals(this.getPadraoTempo())) && (this.getKm() == this.getPadraoKm())) {
			System.out.println("O seu tempo da " + this.getTipo() + " est� fora do padr�o.");
		} else if((this.getTempo().equals(this.getPadraoTempo())) && (this.getKm() >= this.getPadraoKm())) {
			System.out.println("O seu tempo e km dentro da "+ this.getTipo() +" est�o dentro do padr�o m�nimo.");
		} else {
			System.out.println("H� algo de errado com os dados da "+ this.getTipo() +".");
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


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	
	
