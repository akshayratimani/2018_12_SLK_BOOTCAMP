package com.slk.training.service;

public class SpanishHelloService implements HelloService {

	@Override
	public void greet() {
		System.out.println("Hola amigo - " + from);
	}

}
