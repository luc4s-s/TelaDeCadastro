package TelaDeCadastro.model;

public class Pessoa {
	
	private Long id;
	private String nome;
	private String email;
	private String cargo;
	private String experiencia;
	private int idade;
	private boolean deficiencia;
	private double salario;
	private String rede_social;
	private byte[] curriculo;
	private String nomeFileCurriculo;
	private String tipoFileCurriculo;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isDeficiencia() {
		return deficiencia;
	}
	public void setDeficiencia(boolean deficiencia) {
		this.deficiencia = deficiencia;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getRede_social() {
		return rede_social;
	}
	public void setRede_social(String rede_social) {
		this.rede_social = rede_social;
	}
	public byte[] getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(byte[] curriculo) {
		this.curriculo = curriculo;
	}
	public String getNomeFileCurriculo() {
		return nomeFileCurriculo;
	}
	public void setNomeFileCurriculo(String nomeFileCurriculo) {
		this.nomeFileCurriculo = nomeFileCurriculo;
	}
	public String getTipoFileCurriculo() {
		return tipoFileCurriculo;
	}
	public void setTipoFileCurriculo(String tipoFileCurriculo) {
		this.tipoFileCurriculo = tipoFileCurriculo;
	}
	
	
	

}
