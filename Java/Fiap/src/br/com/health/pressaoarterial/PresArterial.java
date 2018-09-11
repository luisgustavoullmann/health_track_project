package br.com.health.pressaoarterial;

import java.util.Date;
import java.util.Scanner;

/*Classe que abstrai dados ao auferir pressão arterial
 * @author Luis Gustavo Ullmann
 * @version 1.7 
 * */

public class PresArterial {
	//Atributo
	private int cdUsuario;
	private double dado; // tipo da pressão que foi auferida;
	private Date data;
	private double padraoPres; //padrão da sua pressão 12/8 por exemplo
	
	/*Input dados da Pressao do Usuario*/
	public void dadoPres() {
		Scanner dado = new Scanner(System.in);
		System.out.println("Quanto de pressão foi auferida?");
		this.setDado(dado.nextDouble());

		Scanner data = new Scanner(System.in);
		System.out.println("Data de auferimento: ");
		this.setData(Date); /*Como fazer para data?*/
		
		Scanner pad = new Scanner(System.in);
		System.out.println("Qual o padrão da sua pressão?");
		this.setPadraoPres(pad.nextDouble());
		
		/*Fecha o objeto*/
		dado.close();
		data.close();
		pad.close();
	}
	
	
	/*Retorna a Pressao do Usuario*/
	public void infoPres() {
		if (this.getDado() == this.getPadraoPres()) {
			System.out.println("Hoje é " + this.getData() + ", e sua pressão está em " + this.getDado() + " e está dentro do padrão.");
		} else if (this.getDado() != this.getPadraoPres()) {
			System.out.println("Seu padrão é " + this.getPadraoPres() + "e você está com " + this.getDado());
		} else {
			System.out.println("Não conseguimos auferir os dados da sua pressão.");
		}
	}

	
	//Getters and Setters
	public int getCdUsuario() {
		return cdUsuario;
	}


	public void setCdUsuario(int cdUsuario) {
		this.cdUsuario = cdUsuario;
	}	
	
	public double getDado() {
		return dado;
	}

	public void setDado(double dado) {
		this.dado = dado;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getPadraoPres() {
		return padraoPres;
	}

	public void setPadraoPres(double padraoPres) {
		this.padraoPres = padraoPres;
	}
}
