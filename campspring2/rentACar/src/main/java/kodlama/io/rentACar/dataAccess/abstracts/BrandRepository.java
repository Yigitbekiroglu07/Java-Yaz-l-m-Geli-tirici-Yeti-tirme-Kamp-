package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;
//Data Access >> Veri erişim kodları yazılır
public interface BrandRepository extends JpaRepository<Brand, Integer> { //Bir interface başka interface'i extends eder.
	// Repository'yi jpa'dan implamente ettik.
	// List<Brand> getAll(); // getAll'u çağıran birisi markaları listeler.
	
}
