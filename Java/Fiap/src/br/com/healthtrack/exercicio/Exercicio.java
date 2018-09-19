package br.com.healthtrack.exercicio;

import java.util.*;

/*Classe que abstrai dados de exercícios físicos
 * @author Luis Gustavo Ullmann
 * @version 1.8
 * */

public abstract class Exercicio {
	//Atributos
	protected int cdExercicio;
	protected String tipo; //natação, corrida, caminhada..
	protected double km;
	protected Calendar tempo;//qtd_tempo
	protected double padraoKm;
	protected Calendar padraoTempo;
	protected Calendar data;
		
	
	/*Input dados do exercicio*/
	public void dadoExercicio() {
		Scanner ex = new Scanner(System.in);
		System.out.println("Data do exercício: ");
		this.setData(data);
		
		System.out.println("Quantos km: ");
		this.setKm(ex.nextDouble());
		
		System.out.println("Quanto tempo: ");
		this.setTempo(padraoTempo);
		
		System.out.println("Qual o seu padrão de km percorrido: ");
		this.setPadraoKm(padraoKm);
		
		System.out.println("Qual o seu padrão de tempo: ");
		this.setPadraoTempo(padraoTempo);
		
		/*Fecha o objeto*/
		ex.close();
		
		
	}
	
	
	public void infoEx() {
		/*Fiz um override apenas para aprendizado. Poderia ter feito tudo numa mesma classe*/
	}
	
	/*Adicina km a soma de km percorridos
	 * @param Input de km pelo usuário
	 */
	public void addKm(double km) {
		this.setKm(this.getKm() + km);
	}
	/*Retira km a soma de km percorridos
	 * @param Input de km pelo usuário
	 */
	public void retiraKm(double km) {
		this.setKm(this.getKm() - km);
	}

	//Getters and Setters
	public int getCdExercicio() {
		return cdExercicio;
	}

	public void setCdExercicio(int cdExercicio) {
		this.cdExercicio = cdExercicio;
	}
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public Calendar getTempo() {
		return tempo;
	}

	public void setTempo(Calendar tempo) {
		this.tempo = tempo;
	}

	public double getPadraoKm() {
		return padraoKm;
	}

	public void setPadraoKm(double padraoKm) {
		this.padraoKm = padraoKm;
	}

	public Calendar getPadraoTempo() {
		return padraoTempo;
	}

	public void setPadraoTempo(Calendar padraoTempo) {
		this.padraoTempo = padraoTempo;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
	
	
	
}
