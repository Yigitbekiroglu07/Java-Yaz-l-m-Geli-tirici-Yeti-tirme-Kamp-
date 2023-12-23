package kodlamaIoWeb.dataAccess;

import kodlamaIoWeb.entities.Course;

public class HibernateCourseDao implements CourseDao {
	public void add(Course course) {  // Veritabanına kurs eklemek için
		System.out.println("Hibernate ile veriitabanına eklendi.");
	
		
	}

	
}
