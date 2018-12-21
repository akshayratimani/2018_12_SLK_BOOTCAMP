package com.slk.training.service;

public class EnglishHelloService implements HelloService {
	// If a class implements an interface, it inherits all the
	// members from the interface, which typically include
	// abstract functions. This means that the class must be
	// declared as abstract (and hence cannot be instantiated), or
	// must override/implement body for all the abstract functions
	// inherited via the interface.

	@Override
	public void greet() {
		System.out.println("Hello friend! - " + from);
	}


}
