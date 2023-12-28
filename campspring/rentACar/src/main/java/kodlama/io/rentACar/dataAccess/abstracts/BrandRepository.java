package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.entities.concretes.Brand;
//Data Access >> Veri erişim kodları yazılır
public interface BrandRepository {
	List<Brand> getAll(); // getAll'u çağıran birisi markaları listeler.
}
