package com.slk.training.programs;

import com.slk.training.entity.Circle;
import com.slk.training.entity.Shape;
import com.slk.training.entity.Square;
import com.slk.training.entity.Triangle;

public class P02_TestingShapeObjects {
	
	public static void main(String[] args) {
		
		Shape [] objects = {
			new Circle(12.34),
			new Triangle(12.0, 34.0),
			new Triangle(22.0, 12.5),
			new Square(22.34),
			new Circle(23.56),
			new Circle(13.45)
		};

		for(Shape s: objects) {
			s.printArea();
		}
		
	}
}
