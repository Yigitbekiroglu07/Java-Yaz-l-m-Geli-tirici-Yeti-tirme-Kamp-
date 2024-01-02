package kodlama.io.rentACar.core.utilities.mappers;
import org.modelmapper.ModelMapper;
//ModelMapper, Entity sınıflarını dışarıya açmamak için kullanılır. 
//Bu sayede daha güvenli ve kullanışlı bir dönüşüm yapabiliriz. 
//DTO (Data Transfer Object), genellikle sistemler veya sistem bileşenleri arasında veri aktarımı için kullanılan bir nesnedir.
public interface ModelMapperService { 
	ModelMapper forResponse(); //Response nesneleri için ModelMapper üreten
	ModelMapper forRequest(); //Request nesneleri için MOdelMapper üreten
}
