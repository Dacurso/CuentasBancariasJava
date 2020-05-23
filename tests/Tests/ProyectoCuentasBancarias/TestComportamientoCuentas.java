package Tests.ProyectoCuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

import Clases.ProyectoCuentasBancarias.Cliente;
import Clases.ProyectoCuentasBancarias.CuentaCorriente;
import Clases.ProyectoCuentasBancarias.CuentaSueldo;

public class TestComportamientoCuentas {

	@Test
	public void testDepositarEnCuentaSueldo() {
		
		//Preparacion
		Cliente cliente1 = new Cliente(40012, "emiliano", "dacurso");
		CuentaSueldo cs1 = new CuentaSueldo(100.00, 12345, cliente1);
		Double montoDepositado = 100.00;
		
		//Ejecucion
		Double actual = montoDepositado + cs1.getSaldo();
		cs1.depositar(montoDepositado);
		Double esperado = cs1.getSaldo();
		
		//Verificacion
		assertEquals(esperado, actual);
		
	}
	
	@Test
	public void testDepositarEnCuentaCorriente() {
		
		//Preparacion
		Cliente cliente1 = new Cliente(40012, "emiliano", "dacurso");
		CuentaCorriente cc1 = new CuentaCorriente(100.00, 12345, cliente1, 50.0);
		Double montoDepositado = 100.00;
		
		//Ejecucion
		Double actual = montoDepositado + cc1.getSaldo();
		cc1.depositar(montoDepositado);
		Double esperado = cc1.getSaldo();
		
		//Verificacion
		assertEquals(esperado, actual);
		
	}
	
	
	

}
