package Clases.ProyectoCuentasBancarias;

public abstract class CuentaBancaria {
	
	//Atributos Privados
	protected Double saldo;
	private Integer cbu;
	private Cliente cliente;
	//------------------------------------
	
	
	//Constructor publico de clase
	public CuentaBancaria (Double saldo, Integer cbu, Cliente cliente) {
		this.saldo=saldo;
		this.cbu=cbu;
		this.cliente=cliente;
	}
	//-------------------------------------
	

	//Comportamientos
	public abstract Boolean extraer (Double monto);
	public abstract void depositar (Double monto);
	//-----------------------------------
	
	//Getters and Setters
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	//--------------------------------------
}
