package br.com.healthtrack.exercicio.outdoor;

import java.util.*;

import br.com.healthtrack.exercicio.Exercicio;

public class ExercicioOutdoor extends Exercicio {
	protected double km;
	protected double padraoKm;
	
	@Override
	public void dadoExercicio() {
		Scanner ex = new Scanner(System.in);
		System.out.println("Quantos km: ");
		this.setKm(ex.nextDouble());
		
		System.out.println("Qual o seu padrão de km percorrido: ");
		this.setPadraoKm(padraoKm);
		
		ex.close();
	}
	
	@Override
	public void infoEx() {
		
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

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
}
