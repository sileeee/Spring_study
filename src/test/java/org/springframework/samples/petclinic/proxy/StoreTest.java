package org.springframework.samples.petclinic.proxy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

	@Test
	public void testPay(){
		Payment cashPerf = new CashPerf(); //Cash()가 아닌 CashPerf()를 사용하므로 성능측정 가능
		Store store = new Store(cashPerf);
		store.buySomething(100);
	}

}
