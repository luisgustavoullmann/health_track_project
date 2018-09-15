package br.com.healthtrack.exercicio;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*Classe que abstrai dados de exercícios físicos
 * @author Luis Gustavo Ullmann
 * @version 1.7
 * */

public abstract class Exercicio {
	//Atributos
	protected String tipo; //natação, corrida, caminhada..
	protected double km;
	protected Time tempo;//Alterar para calendar
	protected double padraoKm;
	protected Time padraoTempo;//alterar para calendar
	protected Calendar data;
		
	
	/*Input dados do exercicio*/
	public void dadoExercicio() {
		Scanner ex = new Scanner(System.in);
		System.out.println("Data do exercício: ");
		this.setData(data);
		
		Scanner km = new Scanner(System.in);
		System.out.println("Quantos km: ");
		this.setKm(km.nextDouble());
		
		Scanner time = new Scanner(System.in);
		System.out.println("Quanto tempo: ");
		this.setTempo(time.next()); /*Como fazer para tempo?*/
		
		Scanner padkm = new ScannSer(System.in);
		System.out.println("Qual o seu padrão de km percorrido: ");
		this.setPadraoKm(padkm.nextDouble());
		
		Scanner padtempo = new Scanner(System.in);
		System.out.println("Qual o seu padrão de tempo: ");
		this.setPadraoTempo(padtempo.next()); /*Como fazer?*/
		
		/*Fecha o objeto*/
		ex.close();
		km.close();
		time.close();
		padkm.close();
		padtempo.close();
		
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

	public Time getTempo() {
		return tempo;
	}

	public void setTempo(Time tempo) {
		this.tempo = tempo;
	}

	public double getPadraoKm() {
		return padraoKm;
	}

	public void setPadraoKm(double padraoKm) {
		this.padraoKm = padraoKm;
	}

	public Time getPadraoTempo() {
		return padraoTempo;
	}

	public void setPadraoTempo(Time padraoTempo) {
		this.padraoTempo = padraoTempo;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
	
	
	
}
