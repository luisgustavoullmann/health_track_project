package br.com.healthtrack.peso;

import java.util.*;

/* Classe que abstrai o cadastro de peso de um Usuario
 * @author Luis Gustavo Ullmann
 * @version 1.0
 * */


public class Peso {
	int cdPeso;
	float peso;
	float altura;
	Calendar data;
	
	public Peso(int cdPeso, float ps, float altura, Calendar dataPeso) {
		super();
		this.cdPeso = cdPeso;
		this.peso = ps;
		this.altura = altura;
		this.data = dataPeso;
	}
	
	public Peso() {}


	public void peso() {
		Scanner ps = new Scanner(System.in);
		
		/*
		 * @param O peso do usuario
		 */
		System.out.println("Qual o seu peso?");
		this.setPeso(ps.nextFloat());
		
		/*
		 * @param O peso do usuario
		 */
		System.out.println("Qual a sua altura?");
		this.setAltura(ps.nextFloat());
		
		/*
		 * @param A data da pesagem
		 */
		System.out.println("Data da pesagem?");
		this.setData(getData());
		
		
		ps.close();
	}
	
	
	public void imcPeso() {
		double imc = this.getPeso() / (this.getAltura() * this.getAltura());
		if(imc < 18.5) {
			System.out.println("Seu IMC é de " + imc + ", indicando magreza.");			
		} else if (imc >= 18.6 && imc <= 24.9) {
			System.out.println("Seu IMC é de " + imc + ", indicando peso normal.");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Seu IMC é de " + imc + ", indicando sobrepeso.");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Seu IMC é de " + imc + ", indicando obesidade de grau 1.");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Seu IMC é de " + imc + ", indicando obesidade de grau 2.");
		} else if (imc > 40) {
			System.out.println("Seu IMC é de " + imc + ", indicando obesidade de grau 3.");
		} else {
			System.out.println("Algo de errado na sua informação, tente novamente!");
		}
	}
	
	
	//Getters and Setters
	public int getCdPeso() {
		return cdPeso;
	}
	public void setCdPeso(int cdPeso) {
		this.cdPeso = cdPeso;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
