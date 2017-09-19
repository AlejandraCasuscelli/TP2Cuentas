package ar.edu.unlam.pb2;

public class Cuenta {
	private Double saldo;
	
	public Cuenta(){
		this.saldo=0.0;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double depositar(Double saldo){
		this.saldo=saldo;
		return this.saldo;
	}
	
	public Double extraer(Double saldo){
		if (this.saldo>saldo) {
			this.saldo=this.saldo-saldo;}
		return this.saldo;
	}	
}
