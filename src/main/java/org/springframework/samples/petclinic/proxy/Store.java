package org.springframework.samples.petclinic.proxy;

public class Store {

	Payment payment;

	public Store(Payment payment){ //DI로 주입할 수 있다고 가정하고 만든 생성자
		this.payment = payment;
	}

	public void buySomething(){
		payment.pay(100);
	}

}
