package br.com.healthtrack.usuario;

import java.util.*;

import br.com.health.pressaoarterial.PresArterial;
import br.com.healthtrack.dieta.Dieta;
import br.com.healthtrack.endereco.Endereco;
import br.com.healthtrack.exercicio.Caminhada;
import br.com.healthtrack.exercicio.Corrida;
import br.com.healthtrack.exercicio.Natacao;
import br.com.healthtrack.peso.Peso;

/* Classe que abstrai o cadastro de um Usuario e seu Endere�o
 * @author Luis Gustavo Ullmann
 * @version 1.7
 * */

public class Usuario {
	//Atributos
	private int cdUsuario;
	private String nome;
	private String email;
	private int idade;
	private int telefone;
	private int cpf;
	private String sexo;
	private Calendar nascimento;
	private Calendar cadastro;
	private String password;
	
	
	
	public void dadoUser() {
		/*Instancia class Usuario
		 * @param A nome do usuario
		 */
		Scanner us = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		this.setNome(us.nextLine());
		
		/*Instancia class Usuario
		 * @param A idade do usuario
		 */
		System.out.print("Digite a sua idade: ");
		this.setIdade(us.nextInt());
		
		
		/*Instancia class Usuario
		 * @param O telefone para contato
		 */
		System.out.print("Digite o seu telefone: ");
		this.setTelefone(us.nextInt());
		
		/*Instancia class Usuario
		 * @param O CPF do usuario
		 */
		System.out.print("Digite o seu CPF: ");
		this.setCpf(us.nextInt());
		
		/*Instancia class Usuario
		 * @param O op��o sexual
		 */
		System.out.print("Digite o seu sexo [M/F]: ");
		this.setSexo(us.nextLine());
		
				
		/*=========== INICIA O ENDERECO ==========*/
		/*Objeto de Endereco para Usuario
		 * @param dados do Endereco do Usuario
		*/
		Endereco endereco = new Endereco();
		endereco.dadoEndereco();
		
		
		/*=========== INICIA A DIETA ==========*/
		/*Objeto de Endereco para Usuario
		 * @param dados do Dieta do Usuario
		*/
		Dieta dieta = new Dieta();
		dieta.dadoDieta();
		
		
		/*=========== INICIA A PRESSAO ARTERIAL ==========*/
		/*Objeto de Endereco para Usuario
		 * @param dados da Pressao Arterial do Usuario
		*/
		PresArterial pressao = new PresArterial();
		pressao.dadoPres();

		
		/*=========== INICIA OS EXERCICIOS - poderia ter feito apenas uma classe exercicio, mas queria testar meus conhecimentos ==========*/
				
		/*Como fazer o max.length?*/
		for(int i = 0; i < 2; i++) {
			System.out.println("Qual exerc�cio voc� realizou?");
			System.out.println("1. Nata��o");
			System.out.println("2. Corrida");
			System.out.println("3. Caminhada");
			Scanner exercicio = new Scanner(System.in);
			if(exercicio.equals(1) || exercicio.equals("Nata��o") || exercicio.equals("nata��o") || exercicio.equals("natacao")) {
				Natacao natacao = new Natacao();
				natacao.dadoExercicio();
				natacao.infoEx();
			} else if(exercicio.equals(2) || exercicio.equals("Corrida") || exercicio.equals("corrida") || exercicio.equals("corida")) {
				Corrida corrida = new Corrida();
				corrida.dadoExercicio();
				corrida.infoEx();
			} else if(exercicio.equals(3) || exercicio.equals("Caminhada") || exercicio.equals("caminha")) {
				Caminhada caminhada = new Caminhada();
				caminhada.dadoExercicio();
				caminhada.infoEx();
			} else {
				System.out.println("Escolha uma das op��es anteriores.");
			}
			exercicio.close();
		}
				
		
		/*Metodo com retorno dos dados*/
		endereco.retornoEndereco();
		dieta.infoDieta();
		pressao.infoPres();
		
				
		/*Fecha o objeto*/
				us.close();
	}
		
	
	//M�todo que c�lcula o IMC e imprime o seu resultado
	public void imc() {
		
		/*=========== INICIA A PESO ==========
		/*Objeto de PESO para Usuario
		 * @param dados do Peso do Usuario
		*/
		Peso peso = new Peso();
		peso.peso();
		
		System.out.println("Seu nome �: " + this.getNome() + ", � do sexo " + this.getSexo() + "." );
		System.out.println("Voc� tem " + this.getIdade() + " anos.");
		System.out.println("Com um peso de " + peso.getPeso() + " e com " + peso.getAltura() + "m de altura.");
		
		/*
		 * @param Call method imcPeso()
		 * */
		peso.imcPeso();
	}
	
	//Getters and Setters
	public int getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(int cdUsuario) {
		this.cdUsuario = cdUsuario;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if(sexo.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else if (sexo.equalsIgnoreCase("f")){
			System.out.println("Feminino");
		}
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public Calendar getCadastro() {
		return cadastro;
	}

	public void setCadastro(Calendar cadastro) {
		this.cadastro = cadastro;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
