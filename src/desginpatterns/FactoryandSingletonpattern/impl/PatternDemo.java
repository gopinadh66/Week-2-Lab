package desginpatterns.FactoryandSingletonpattern.impl;

public class PatternDemo {
	public static void main(String[] args) {


		SingleTonP object = SingleTonP.getInstance();


		object.dispalymsg();
		ClosetType object2 = new ClosetType();


		Closet v1 = object2.getType("linen");



		v1.construct();

		Closet v2 = object2.getType("utility");


		
		v2.construct();
	}
}
