package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
@Repository // Bu sınıf bir data access nesnesidir.
// Data Access >> Veri erişim kodları yazılır
public class InMemoryBrandRepository implements BrandRepository {
	
	List<Brand> brands; // List<Brand> türünde bir şey döndüreceğimiz için yaptık. Buraya yazmamızın nedeni
						// hem bu satırın hem de 26.satırın 10.satıra bağlı olması, yani birbirlerini gören
						// kodlar
	
	public InMemoryBrandRepository() { // Boş bir contstructor oluşturuldu, InMemoryBrandRepository'yi newleyen birisi burayı çalıştıracak
		brands = new ArrayList<Brand>(); // boş array oluşturuldu.
		brands.add(new Brand(1, "BMW")); // Veritabanına gitmek yerine kendimiz oluşturduk.
		brands.add(new Brand(2, "Mercedes"));
		brands.add(new Brand(3, "Audi"));
		brands.add(new Brand(4, "Fiat"));
		brands.add(new Brand(5, "Renault"));
		
	}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

}
