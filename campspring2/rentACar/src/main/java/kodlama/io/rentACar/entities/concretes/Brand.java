package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; //Veriyi kaydetmek için
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//entities >> Veri tabanı nesneleri
@Table(name = "brands") //SQL'de Brands tablosuna ata.
@Getter
@Setter
@Data
@AllArgsConstructor // parametreli constructor
@NoArgsConstructor // parametresiz constructor
@Entity
public class Brand {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)// Veritabanına data geldikçe id otomatik artar.
		
		@Column(name= "id") // Brands tablosundaki id kolonuna karşılık gelir.
		private int id;
		
		@Column(name= "name") // Brands tablosundaki name kolonuna karşılık gelir
		private String name;
		
}
// Brands >>> id, name
// GetAllBrandService >>> id, name

//Brands >> GetAllBrandService atama işlemi yapılır. Buna mapping denir.