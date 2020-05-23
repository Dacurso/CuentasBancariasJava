package Clases.ProyectoCuentasBancarias;

public class CuentaCorriente extends CuentaBancaria {

	private Double limiteDescubierto;
	private Integer cantExtracciones;

	public CuentaCorriente(Double saldo, Integer cbu, Cliente cliente, Double limiteDescubierto) {
		super(saldo, cbu, cliente);
		this.limiteDescubierto = limiteDescubierto;
		this.cantExtracciones = 0;

	}

	@Override
	public Boolean extraer(Double monto) {

		if (this.saldo >= monto) {

			this.saldo -= monto;
			this.cantExtracciones++;
			return true;

		} else {

			if (this.limiteDescubierto >= monto) {

				double dif = monto - this.saldo;
				this.saldo = 0.0;
				this.limiteDescubierto -= dif;
				this.cantExtracciones++;
				return true;
			}
		}
		return false;

	}

	@Override
	public void depositar(Double monto) {

		this.saldo += monto;

	}

	public Double getLimiteDescubierto() {
		return limiteDescubierto;
	}

	public void setLimiteDescubierto(Double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}

	public Integer getCantExtracciones() {
		return cantExtracciones;
	}

	public void setCantExtracciones(Integer cantExtracciones) {
		this.cantExtracciones = cantExtracciones;
	}

}
