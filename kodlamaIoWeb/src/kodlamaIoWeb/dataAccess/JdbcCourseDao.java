package kodlamaIoWeb.dataAccess;

import kodlamaIoWeb.entities.Course;

public class JdbcCourseDao implements CourseDao { //Veritabanı nesnesi
		public void add(Course course) {  // Veritabanına kurs eklemek için
			System.out.println("JDBC ile veriitabanına eklendi.");
			
	
		}
}
