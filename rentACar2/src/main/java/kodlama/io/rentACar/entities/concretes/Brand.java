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
@Table(name = "brands")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)// Veritabanına data geldikçe id otomatik artar.
		@Column(name= "id")
		private int id;
		@Column(name= "name")
		private String name;
		
}
