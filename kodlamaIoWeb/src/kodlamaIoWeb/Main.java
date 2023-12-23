// Kodlama.io web sitesini katmanlı mimaride yapma
package kodlamaIoWeb;
import kodlamaIoWeb.*;
import kodlamaIoWeb.business.CourseManager;
import kodlamaIoWeb.core.logging.DatabaseLogger;
import kodlamaIoWeb.core.logging.Logger;
import kodlamaIoWeb.core.logging.MailLogger;
import kodlamaIoWeb.dataAccess.HibernateCourseDao;
import kodlamaIoWeb.dataAccess.JdbcCourseDao;
import kodlamaIoWeb.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception { //Arayüz
		Course course1 = new Course("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", "Java", "Engin Demiroğ",1000);
		Course course2 = new Course("(2023) Yazılım Geliştirici Yetiştirme Kampı (Python & Selenium)", "Python", "Halit Enes Kalaycı",500);
		Course course3 = new Course("C# Yazılım Geliştirici Yetiştirme Kampı", "C#", "Engin Demiroğ", 1500);
		
		Course[] courses = {course1, course2, course3};
		
		Logger[] loggers = {new MailLogger(), new FileLogger(), new DatabaseLogger()};
		
		CourseManager courseManager = new CourseManager(courses, new JdbcCourseDao(), loggers); // Arayüz iş birimiyle iletişim kurar.
		courseManager.add(course3);
	}

}
