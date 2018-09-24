package br.com.healthtrack.exercicio.outdoor;

import br.com.healthtrack.exercicio.outdoor.ExercicioOutdoor;

public final class Natacao extends ExercicioOutdoor {
	/*Atribuição
	 * @param tipo como String natação
	 * @version 1.6
	 */
	@Override
	public String getTipo() {
		return "natacação";
	}
	
	/*Retorna info do exercicio*/
	@Override
	public void infoEx() {
		
		if(!(this.getTempo().equals(this.getPadraoTempo())) && (this.getKm() < this.getPadraoKm())) {
			System.out.println("O seu tempo e Km na " + this.getTipo() + ", estão abaixo do padrão.");
		} else if((this.getTempo().equals(this.getPadraoTempo())) && (this.getKm() < this.getPadraoKm())) {
			System.out.println("Os kms da " + this.getTipo() + " estão fora do padrão.");
		} else if(!(this.getTempo().equals(this.getPadraoTempo())) && (this.getKm() == this.getPadraoKm())) {
			System.out.println("O seu tempo da " + this.getTipo() + " está fora do padrão.");
		} else if((this.getTempo().equals(this.getPadraoTempo())) && (this.getKm() >= this.getPadraoKm())) {
			System.out.println("O seu tempo e km dentro da "+ this.getTipo() +" estão dentro do padrão mínimo.");
		} else {
			System.out.println("Há algo de errado com os dados da "+ this.getTipo() +".");
		}
	}
}
