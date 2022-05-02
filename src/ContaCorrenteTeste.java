import static org.junit.Assert.*;

import org.junit.Test;

public class ContaCorrenteTeste {

	@Test
	public void test() {
		
		ContaCorrente c1 = new ContaCorrente(1000);
		c1.depositar(200);
		assertEquals(1200,c1.saldo,0);
		c1.sacar(300);
		assertEquals(900,c1.saldo,0);
		ContaCorrente c2 = new ContaCorrente(0);
		c2.sacar(300);
		assertEquals(0,c2.saldo,0);
	}

}
