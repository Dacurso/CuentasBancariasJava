package Tests.ProyectoCuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

import Clases.ProyectoCuentasBancarias.Banco;
import Clases.ProyectoCuentasBancarias.Cliente;
import Clases.ProyectoCuentasBancarias.CuentaCorriente;
import Clases.ProyectoCuentasBancarias.CuentaSueldo;

public class TestComportamientoBanco {

	@Test
	public void testAgregarCuentaCorriente() {
		
		//Preparacion de datos
		Banco miBanco = new Banco("BancoCiudad");
		Cliente cliente1 = new Cliente(40012254, "emiliano", "dacurso");
		CuentaCorriente cc1 = new CuentaCorriente(5000.00, 12345, cliente1, 500.00);
		
		//Ejecucion de comportamientos
		Boolean check = miBanco.agregarCuentaCorriente(cc1);
		
		//Verificacion de funcionamiento
		assertTrue(check);
		
		
	}
	
	@Test
	public void testAgregarCuentaSueldo() {
		
		//Preparacion de datos
		Banco miBanco = new Banco("BancoCiudad");
		Cliente cliente1 = new Cliente(40012254, "emiliano", "dacurso");
		CuentaSueldo cs1 = new CuentaSueldo(5000.00, 12345, cliente1);
		
		//Ejecucion de comportamientos
		Boolean check = miBanco.agregarCuentaSueldo(cs1);
		
		//Verificacion de funcionamiento
		assertTrue(check);
		
		
	}
	
	

}
