package br.gov.ba.pm.escolar.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public abstract class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private Integer cpf;
	
	@Column
	private String nome;
	
	@Column
	private Calendar dataNascimento;
	
	@Column
	private Integer rg;
	
	@Column
	private String tipoSanguineo;
	
	@Column
	private String fatorRH;
	
	@OneToOne
	private EstadoCivil estadoCivil;
	
	@Column
	@Enumerated(EnumType.STRING)
	private TipoServidor tipoServidor;
	
	@Column
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@OneToOne
	private Estado estadoEmissorRG;	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Integer getRg() {
		return rg;
	}
	public void setRg(Integer rg) {
		this.rg = rg;
	}
	public Estado getEstadoEmissorRG() {
		return estadoEmissorRG;
	}
	public void setEstadoEmissorRG(Estado estadoEmissorRG) {
		this.estadoEmissorRG = estadoEmissorRG;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public String getFatorRH() {
		return fatorRH;
	}
	public void setFatorRH(String fatorRH) {
		this.fatorRH = fatorRH;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public TipoServidor getTipoServidor() {
		return tipoServidor;
	}
	public void setTipoServidor(TipoServidor tipoServidor) {
		this.tipoServidor = tipoServidor;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
}