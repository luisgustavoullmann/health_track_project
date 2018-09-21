package br.com.health.pressaoarterial;

import java.util.*;


/*Classe que abstrai dados ao auferir press�o arterial
 * @author Luis Gustavo Ullmann
 * @version 1.7 
 * */

public class PresArterial {
	//Atributo
	private int cdUsuario;
	private double dado; // tipo da press�o que foi auferida;
	private Calendar data;
	private double padraoPres; //padr�o da sua press�o 12/8 por exemplo
	
	public PresArterial(int code, double dado2, Calendar dataPres, double padrao) {
		// TODO Auto-generated constructor stub
	}


	/*Input dados da Pressao do Usuario*/
	public void dadoPres() {
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Quanto de press�o foi auferida?");
		this.setDado(dado.nextDouble());

		
		System.out.println("Data de auferimento: ");
		this.setData(data);
		
		
		System.out.println("Qual o padr�o da sua press�o?");
		this.setPadraoPres(dado.nextDouble());
		
		/*Fecha o objeto*/
		dado.close();
	}
	
	
	/*Retorna a Pressao do Usuario*/
	public void infoPres() {
		if (this.getDado() == this.getPadraoPres()) {
			System.out.println("Hoje � " + this.getData() + ", e sua press�o est� em " + this.getDado() + " e est� dentro do padr�o.");
		} else if (this.getDado() != this.getPadraoPres()) {
			System.out.println("Seu padr�o � " + this.getPadraoPres() + "e voc� est� com " + this.getDado());
		} else {
			System.out.println("N�o conseguimos auferir os dados da sua press�o.");
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

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public double getPadraoPres() {
		return padraoPres;
	}

	public void setPadraoPres(double padraoPres) {
		this.padraoPres = padraoPres;
	}
}
