package desginpatterns.FactoryandSingletonpattern.impl;

public class ClosetType {
	 public Closet getType(String getType){
	      if(getType == null){
	         return null;
	      }         
	      if(getType.equalsIgnoreCase("linen")){
	         return new Linen();
	         
	      } else if(getType.equalsIgnoreCase("utility")){
	         return new Utility();
	         
	      } 
	      
	      return null;
	   }
}
