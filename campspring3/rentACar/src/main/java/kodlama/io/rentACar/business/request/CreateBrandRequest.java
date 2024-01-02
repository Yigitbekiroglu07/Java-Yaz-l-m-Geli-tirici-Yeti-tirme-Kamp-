package kodlama.io.rentACar.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Son kullanıcıdan data almaya denir.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest { //Marka oluşturma isteği
		private String name; //id'yi veritabanı oluşturur. id otomatik artacağından sadece id almak yeterli.
}
