package main;

public class Cliente {

	private String nome;
	private long cnh;
	private long rg;
	
	public Cliente(){}
	
	public Cliente(String n, long c, long r){
		this.nome= n;
		this.cnh= c;
		this.rg= r;
		
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome; 
	}
	public long getCnh(){
		return cnh;
	}
	public void setCnh(long cnh){
		this.cnh = cnh;
	}
	public long getRg(){
		return rg;
	}
	public void setRg(long rg){
		this.rg = rg;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cnh=" + cnh
				+ ", rg=" + rg + "]";
	
	}
}
