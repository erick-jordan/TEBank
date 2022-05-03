
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente c1 = new ContaCorrente(1000);
		System.out.println(c1.showSaldo());
		c1.depositar(200);
		System.out.println(c1.showSaldo());
		c1.sacar(300);
		System.out.println(c1.showSaldo());
		

		
	}

}
