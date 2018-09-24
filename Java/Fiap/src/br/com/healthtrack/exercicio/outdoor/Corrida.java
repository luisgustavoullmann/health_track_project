package br.com.healthtrack.exercicio.outdoor;

import br.com.healthtrack.exercicio.outdoor.ExercicioOutdoor;

public final class Corrida extends ExercicioOutdoor {
	/*Atribui��o
	 * @param tipo como String corrida
	 * @version 1.7
	 */
	@Override
	public String getTipo() {
		return "corrida";
	}
	
	/*Retorna info do exercicio*/
	@Override
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
}
