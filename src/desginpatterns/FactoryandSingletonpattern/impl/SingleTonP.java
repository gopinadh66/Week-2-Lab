package desginpatterns.FactoryandSingletonpattern.impl;

public class SingleTonP {
	private static SingleTonP obj = new SingleTonP();

	  
	   private SingleTonP(){}


	   public static SingleTonP getInstance(){
	      return obj;
	   }

	   public void dispalymsg(){                              
	      System.out.println("SingleTon Pattern");    
	   }
}	
