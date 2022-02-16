package DataAccess.concretes;

import DataAccess.abstracts.CreditDao;
import entities.Credit;

public class HibernateCreditDao implements CreditDao{

	@Override
	public void save(Credit credit) {
		System.out.println("Kredi Hibarnate ile ba�ar�yla kaydedildi: " + credit.getName());
	}

	@Override
	public void update(Credit credit) {
		System.out.println("Kredi Hibarnate ile ba�ar�yla g�ncellendi: " + credit.getName());
		
	}

	@Override
	public void delete(Credit credit) {
		System.out.println("Kredi Hibarnate ile ba�ar�yla silindi: " + credit.getName());
		
	}

}
