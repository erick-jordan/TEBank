
public class ContaCorrente {
	double saldo;

	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if(this.saldo == 0) {
			this.saldo = 0;
		}else {
		this.saldo = saldo - valor;
		}
	};
	public void depositar(double valor) {
		this.saldo = saldo + valor;
	};
	
	public double showSaldo() {
		return this.saldo;
		
	}
}