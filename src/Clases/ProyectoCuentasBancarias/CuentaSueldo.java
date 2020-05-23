package Clases.ProyectoCuentasBancarias;

public class CuentaSueldo extends CuentaBancaria {

	public CuentaSueldo(Double saldo, Integer cbu, Cliente cliente) {
		super(saldo, cbu, cliente);
	}

	@Override
	public Boolean extraer(Double monto) {

		if (this.saldo >= monto) {
			this.saldo -= monto;
			return true;
		}
		return false;
	}

	@Override
	public void depositar(Double monto) {

		this.saldo += monto;

	}

}
