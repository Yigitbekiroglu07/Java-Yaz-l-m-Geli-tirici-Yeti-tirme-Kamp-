package kodlamaIoWeb.entities;
// entities : Veri tabanı nesneleri. Yani müşteri, ürün vb.
public class Course {
	String courseName;
	String type; // Kategori için
	String teacherName;
	int unitPrice; // Kurs fiyatı
	
	public Course() {
			
	}
	
	public Course (String courseName, String type, String teacherName,int unitPrice) {
		
		this.courseName = courseName;
		this.type = type;
		this.teacherName = teacherName;
		this.unitPrice = unitPrice;
	}

	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
