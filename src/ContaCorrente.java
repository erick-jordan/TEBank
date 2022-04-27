
public class ContaCorrente {
	double saldo;

	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		saldo = saldo - valor;
	};
	public void depositar(double valor) {
		saldo = saldo + valor;
	};
	
	public double showSaldo() {
		return saldo;
		
	}
}