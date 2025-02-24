package java.factory;

import java.factory.cheese.Cheese;
import java.factory.cheese.CheeseFactory;
import java.factory.cheese.CheeseType;

public class Main {
	
	public static void main(String[] args) {
//		Gouda g = new Gouda();
		
		Cheese c = CheeseFactory.create(CheeseType.GOUDA);
		System.out.println("I am a "+c.getName()+" and I last until "+c.getBestBeforeDate() +"!");
	}

}
