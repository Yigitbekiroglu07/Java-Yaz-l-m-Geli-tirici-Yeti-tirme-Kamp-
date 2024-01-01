package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.entities.concretes.Brand;
// Abstract yani soyut olduğu için interface ile yaptıldı.
public interface BrandService { // İş kurallarını yazacağımız yapıyı tasarlarız
	List<GetAllBrandsResponse> getAll(); //Response
	void add(CreateBrandRequest createBrandRequest);
}
