package core;

public class DatabaseLogger implements BaseLogger{

	@Override
	public void log(String message) {
		System.out.println("Veritaban�na Loglama i�lemi ba�ar�l�, Log: " + message);
		
	}

}
