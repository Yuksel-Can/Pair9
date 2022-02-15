package lesson5Pair2Workshop1;

public class JdbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("�r�n JDBC ile eklendi: " + product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("�r�n JDBC ile g�ncellendi: " + product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("�r�n JDBC ile silindi: " + product.getName());
		
	}

}
