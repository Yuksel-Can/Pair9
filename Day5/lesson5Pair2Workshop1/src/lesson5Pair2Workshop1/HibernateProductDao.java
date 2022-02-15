package lesson5Pair2Workshop1;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("�r�n Hibernate ile eklendi: " + product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("�r�n Hibernate ile g�ncellendi: " + product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("�r�n Hibernate ile silindi: " + product.getName());
		
	}

}
