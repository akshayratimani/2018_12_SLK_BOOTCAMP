package com.slk.training.programs;

import com.slk.training.service.EnglishHelloService;
import com.slk.training.service.HelloService;
import com.slk.training.service.KannadaHelloService;
import com.slk.training.service.SpanishHelloService;

public class P01_TestingHelloService {

	public static void main(String[] args) {
		
		HelloService service;
		
		// service = new HelloService(); 
		// error; interface is like abstract class, and cannot be instantiated
		// You may realize an object of an interface via some class that implements the interface
		
		service = new EnglishHelloService();
		service.greet();
		
		service = new SpanishHelloService();
		service.greet();
		
		service = new KannadaHelloService();
		service.greet();
		
		
		// Lines 19, 22 and 25 are identical for the compiler
		// but produce different outputs based on which object
		// the reference points to.
		
		
	}
}










