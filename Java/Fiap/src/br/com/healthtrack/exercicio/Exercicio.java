package br.com.healthtrack.exercicio;

import java.util.*;

/*Classe que abstrai dados de exerc�cios f�sicos
 * @author Luis Gustavo Ullmann
 * @version 1.8
 * */

public abstract class Exercicio {
	//Atributos
	protected int cdExercicio;
	protected String tipo; //nata��o, corrida, caminhada..
	protected Calendar data;
	protected Calendar tempo;//qtd_tempo
	protected Calendar padraoTempo;
	
		
	
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
		//Fazer @Override nas subclasses
	}
	

	//Getters and Setters
	public int getCdExercicio() {
		return cdExercicio;
	}


	public void setCdExercicio(int cdExercicio) {
		this.cdExercicio = cdExercicio;
	}


	public abstract String getTipo();
	

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
	
	
}
