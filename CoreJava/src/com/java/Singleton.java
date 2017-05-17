package com.java;

class Singletone{
	static{System.out.println("in static");}
	
	
	 static private Singletone singletone = new Singletone();
	 private Singletone() {
		System.out.println("in cons");
	}
	 public static Singletone getInstance(){
		 if(singletone != null){
			 return singletone;
		 }else {
			return new Singletone();
		}
	 }
}

public class Singleton {

	public static void main(String[] args) {
		Singletone singletone = Singletone.getInstance();
		Singletone singletone1 = Singletone.getInstance();
		Singletone singletone2 = Singletone.getInstance();
		Singletone singletone3 = Singletone.getInstance();

	}

}
