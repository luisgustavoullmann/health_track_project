package br.com.healthtrack.bean;

import java.util.*;

import br.com.healthtrack.util.CriptografiaUtils;


/* Classe que abstrai o cadastro de um Usuario e seu Endereço
 * @author Luis Gustavo Ullmann
 * @version 1.7
 * */

public class Usuario {
	//Atributos
	private int cdUsuario;
	private String nome;
	private String sobrenome;
	private String email;
	private String telefone;
	private String cpf;
	private String sexo;
	private String nascimento;
	private Calendar cadastro;
	private String password;
	private Endereco endereco;
	
	
	public Usuario(int code, String name, String lastname, String email, 
			String telefone, String cpf, String sexo, String dataNasc, Calendar dataCadast, String password) {
		super();
		this.cdUsuario = code;
		this.nome = name;
		this.sobrenome = lastname;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.sexo = sexo;
		this.nascimento = dataNasc;
		this.cadastro = dataCadast;
		this.password = password;
		
	}
	
	public Usuario(String email, String password) {
		super();
		this.email = email;
		setPassword(email);
	}
	
	public Usuario() {}

	
	//Getters and Setters
	public int getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(int cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
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
		try {
			this.password = CriptografiaUtils.criptografar(password);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
