package kodlama.io.rentACar.webApi.controllers;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.request.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
//Projeyi dış dünyaya açmak için  controllers paketi kullanılır.
@RestController //annotation >> bilgilendirme
@RequestMapping("api/brands")
@AllArgsConstructor
public class BrandsController {
		private BrandService brandService;

		/*public BrandsController(BrandService brandService) {
			this.brandService = brandService;
		} */
		@GetMapping()
		public List<GetAllBrandsResponse> getAll(){ // Business, Data Access'i çağırdı. Api ise Business'ı çağıracak.
			return brandService.getAll();
		}
		@GetMapping("/{id}")
		public GetByIdBrandResponse getById(@PathVariable int id){ // Business, Data Access'i çağırdı. Api ise Business'ı çağıracak.
			return brandService.getById(id);
		}
		@PostMapping()
		@ResponseStatus(code=HttpStatus.CREATED)
		public void add(@RequestBody CreateBrandRequest createBrandRequest) {
			this.brandService.add(createBrandRequest);
		}
		@PutMapping // Güncelleme için
		public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
			this.brandService.update(updateBrandRequest);
		}
		@DeleteMapping("/{id}")
		public void delete(@PathVariable int id) {
			this.brandService.delete(id);
		}
	
}