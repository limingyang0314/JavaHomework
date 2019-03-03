package Singleton;
public class Singleton {
	private static Singleton INSTANCE = new Singleton();
	
	private Singleton() {
		
	}
	
	public Singleton getInstance() {
		return Singleton.INSTANCE;
	}

}
