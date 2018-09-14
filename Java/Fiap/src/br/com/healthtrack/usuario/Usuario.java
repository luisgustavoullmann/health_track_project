package br.com.healthtrack.usuario;

import java.util.Calendar;
import java.util.Scanner;

import br.com.health.pressaoarterial.PresArterial;
import br.com.healthtrack.dieta.Dieta;
import br.com.healthtrack.endereco.Endereco;
import br.com.healthtrack.exercicio.Caminhada;
import br.com.healthtrack.exercicio.Corrida;
import br.com.healthtrack.exercicio.Natacao;

/* Classe que abstrai o cadastro de um Usuario e seu Endereço
 * @author Luis Gustavo Ullmann
 * @version 1.7
 * */

public class Usuario {
	//Atributos
	private int cdUsuario;
	private String nome;
	private String email;
	private int idade;
	private float peso;
	private float altura;
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
		Scanner name = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		this.setNome(name.nextLine());
		
		/*Instancia class Usuario
		 * @param A idade do usuario
		 */
		Scanner id = new Scanner(System.in);
		System.out.print("Digite a sua idade: ");
		this.setIdade(id.nextInt());
		
		/*Instancia class Usuario
		 * @param O peso para calculo do IMC
		 */
		Scanner ps = new Scanner(System.in);
		System.out.print("Digite o seu peso: ");
		this.setPeso(ps.nextFloat());
		
		/*Instancia class Usuario
		 * @param O altura para calculo do IMC
		 */
		Scanner alt = new Scanner(System.in);
		System.out.print("Digite a sua altura: ");
		this.setAltura(alt.nextFloat());
		
		/*Instancia class Usuario
		 * @param O telefone para contato
		 */
		Scanner tel = new Scanner(System.in);
		System.out.print("Digite o seu telefone: ");
		this.setTelefone(tel.nextInt());
		
		/*Instancia class Usuario
		 * @param O CPF do usuario
		 */
		Scanner cp = new Scanner(System.in);
		System.out.print("Digite o seu CPF: ");
		this.setCpf(cp.nextInt());
		
		/*Instancia class Usuario
		 * @param O opção sexual
		 */
		Scanner sex = new Scanner(System.in);
		System.out.print("Digite o seu sexo [M/F]: ");
		this.setSexo(sex.nextLine());
		
				
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
			System.out.println("Qual exercício você realizou?");
			System.out.println("1. Natação");
			System.out.println("2. Corrida");
			System.out.println("3. Caminhada");
			Scanner exercicio = new Scanner(System.in);
			if(exercicio.equals(1) || exercicio.equals("Natação") || exercicio.equals("natação") || exercicio.equals("natacao")) {
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
				System.out.println("Escolha uma das opções anteriores.");
			}
			exercicio.close();
		}
				
		
		/*Metodo com retorno dos dados*/
		endereco.retornoEndereco();
		dieta.infoDieta();
		pressao.infoPres();
		
				
		/*Fecha o objeto*/
				name.close();
				id.close();
				ps.close();
				alt.close();
				tel.close();
				cp.close();
				sex.close();
	}
	
	
	
	//Método que cálcula o IMC e imprime o seu resultado
	public void imc() {
		
		System.out.println("Seu nome é: " + this.getNome() + ", é do sexo " + this.getSexo() + "." );
		System.out.println("Você tem " + this.getIdade() + " anos.");
		System.out.println("Com um peso de " + this.getPeso() + " e com " + this.getAltura() + "m de altura.");
		
		
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

	public double getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
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
