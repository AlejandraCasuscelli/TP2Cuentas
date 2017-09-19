package ar.edu.unlam.pb2;

public class CuentaCorriente extends Cuenta{
	private Double giroEnDescubierto;
	public CuentaCorriente(){
		super();
		this.giroEnDescubierto=150.0; //Limite del giro en descubierto
	}
	
	@Override
	public Double extraer(Double saldo){
		if (getSaldo()+this.giroEnDescubierto>=saldo) {
			Double saldoActual=getSaldo()-saldo;
			if(saldoActual>=0){
				setSaldo(saldoActual);
			}else{
				setSaldo(saldoActual+(saldoActual*5)/100);
				//Se entiende que la comisión del banco es 5%
			}
		} else {
			System.out.println("Error, se sobrepasa el limite de saldo posible a retirar.");
		}
		return getSaldo();
	}
}