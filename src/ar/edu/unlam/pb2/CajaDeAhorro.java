package ar.edu.unlam.pb2;

public class CajaDeAhorro extends Cuenta{
	private Integer contador;
	public CajaDeAhorro(){
		super();
		this.contador=0;
	}
	
	@Override
	public Double extraer(Double saldo){
		if(getSaldo()>saldo && this.contador<5){
			setSaldo(getSaldo()-saldo);
			this.contador++;
		}else if(getSaldo()>saldo && this.contador>=5){
			setSaldo(getSaldo()-saldo-6);
		}else{
			System.out.println("Error, se sobrepasa el limite de saldo posible a retirar.");
		}
		return getSaldo();
	}
	

}
