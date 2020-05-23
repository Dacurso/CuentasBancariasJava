package Clases.ProyectoCuentasBancarias;

import java.util.ArrayList;

public class Banco {

	private String nombre;
	private ArrayList <CuentaSueldo> listaCuentasSueldos;
	private ArrayList <CuentaCorriente> listaCuentasCorrientes;
	
	public Banco (String nombre) {
		this.nombre=nombre;
		listaCuentasSueldos = new ArrayList<CuentaSueldo>();
		listaCuentasCorrientes = new ArrayList<CuentaCorriente>();
	}
	
	//Comportamientos
	
	public Boolean agregarCuentaCorriente (CuentaCorriente cc) {
		
		return listaCuentasCorrientes.add(cc);
		
	}
	
	
	public Boolean agregarCuentaSueldo (CuentaSueldo cs) {
		
		return listaCuentasSueldos.add(cs);
	
	}
	
	
	
	
	
	
	
	
	//--------------
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<CuentaSueldo> getListaCuentasSueldos() {
		return listaCuentasSueldos;
	}

	public void setListaCuentasSueldos(ArrayList<CuentaSueldo> listaCuentasSueldos) {
		this.listaCuentasSueldos = listaCuentasSueldos;
	}

	public ArrayList<CuentaCorriente> getListaCuentasCorrientes() {
		return listaCuentasCorrientes;
	}

	public void setListaCuentasCorrientes(ArrayList<CuentaCorriente> listaCuentasCorrientes) {
		this.listaCuentasCorrientes = listaCuentasCorrientes;
	}
	
	
}
