package kodlamaIoWeb.business;
import java.lang.System.Logger;

import kodlamaIoWeb.dataAccess.CourseDao;
import kodlamaIoWeb.entities.Course;

public class CourseManager {
	private Course[] courses;
	private CourseDao courseDaoaccess;
	private Logger[] loggers;
	
	
	 public CourseManager(Course[] courses, CourseDao courseDaoaccess, Logger[] loggers) { // CourseManager newlenirse CourseDao ver
		this.courses = courses;
		this.courseDaoaccess = courseDaoaccess;
		this.loggers = loggers;
	}
	

	public void add(Course course) throws Exception { // iş kuralları
		if(course.getUnitPrice()<0) 
			throw new Exception ("Ürün fiyatı sıfırdan küçük olamaz");
			for(Course crs : courses) {
			if(course.getCourseName().equals(crs.getCourseName())) 
					throw new Exception ("Kurs ismi aynı olamaz");
				if(course.getType().equals(crs.getType())) 
					throw new Exception ("Kategori türü aynı olamaz");
				}
			courseDaoaccess.add(course);; // Bir katman başka katmanın classını kullanacaksa bunu interface ile yapmalı
			 for (Logger lgs : loggers ) {
				lgs.log(course.getCourseName());
			 }
		}
	}
     