package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.request.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
// Abstract yani soyut olduğu için interface ile yaptıldı.
public interface BrandService { // 	Business'ta iş kurallarını yazacağımız yapıyı tasarlarız. Araba modeli tekrar edemez gibi.
	List<GetAllBrandsResponse> getAll(); //id ve name'i olan bir liste döndür.
	GetByIdBrandResponse getById(int id);
	void add(CreateBrandRequest createBrandRequest); //Ekleme yaparken Brand yerine BrandRequest'i alınır.
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);
}
