package core;

public class FileLogger implements BaseLogger{

	@Override
	public void log(String message) {
		System.out.println("Dosyaya Loglama i�lemi ba�ar�l�, Log: " + message);
		
	}

}
