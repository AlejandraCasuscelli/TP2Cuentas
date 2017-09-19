package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testCuentaSueldoQuePruebaDeposito() {
		CuentaSueldo miCuenta = new CuentaSueldo();
		miCuenta.depositar(4000.0);
		assertEquals(4000.0, miCuenta.getSaldo(), 0.1);
	}
	
	@Test
	public void testCuentaSueldoQuePruebaExtraer() {
		CuentaSueldo miCuenta = new CuentaSueldo();
		miCuenta.depositar(4000.0);
		assertEquals(3500.0, miCuenta.extraer(500.0), 0.1);
	}
	
	@Test
	public void testCajaDeAhorroQuePruebaExtraer(){
		CajaDeAhorro miCuenta = new CajaDeAhorro();
		miCuenta.depositar(4000.0);
		assertEquals(3500.0, miCuenta.extraer(500.0), 0.1);
	}

	@Test
	public void testCajaDeAhorroQuePruebaMasDeCincoExtracciones(){
		CajaDeAhorro miCuenta = new CajaDeAhorro();
		miCuenta.depositar(4000.0);
		miCuenta.extraer(500.0); //La primera extracción es la nro 0
		miCuenta.extraer(500.0);
		miCuenta.extraer(500.0);
		miCuenta.extraer(500.0);
		miCuenta.extraer(500.0);
		miCuenta.extraer(500.0);
		assertEquals(994.0,miCuenta.getSaldo(), 0.1);
		//A partir de la 5ta extracción empieza a restar 6 de comisión.
	}
	
	@Test
	public void testCuentaCorrienteQuePruebaExtraxion(){
		CuentaCorriente miCuenta = new CuentaCorriente();
		miCuenta.depositar(4000.0);
		assertEquals(-105.0, miCuenta.extraer(4100.0), 0.1);
	}
}
