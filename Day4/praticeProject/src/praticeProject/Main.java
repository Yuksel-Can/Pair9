package praticeProject;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		//pratic for lesson4Pair2Workshop1 
		
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2,  "G�venlik");
		Category category3 = new Category(3,  "Gizlilik");

		Instructor instructor1 = new Instructor(1, "Engin", "Demiro�", "engin.demirog@gmail.com", "image1.jgp", new ArrayList<Course>());
		Instructor instructor2 = new Instructor(2, "Mustafa Murat", "Co�kun", "mustafa.murat@gmail.com", "image1.jpg", new ArrayList<Course>());
		Instructor instructor3 = new Instructor(3, "Sad�k", "Turan", "sadik.turan@gmail.com", "image1.jpg", new ArrayList<Course>());

		Student student1 = new Student(1, "Y�ksel Can", "�ZDEM�R", "can.yuksel@gmail.com", 5, new ArrayList<Course>());
		Student student2 = new Student(2, "Yasin", "Hakl�", "hakli.yasin@gmail.com", 3, new ArrayList<Course>());
		Student student3 = new Student(3, "G�nate�i", "Tutulmaz", "tutulmaz.gunatesi@gmail.com", 1, new ArrayList<Course>());
		
		Course course1 = new Course(1, "Java", "Java e�itimidir", "image_j.jpg", category1);
		Course course2 = new Course(2, "C#", "C# e�itimidir", "image_c.jpg", category2);
		Course course3 = new Course(3, "JavaScript", "JavaScript e�itimidir", "image_js.jpg", category3);
				
		/*-*/
		
		CourseManager courseManager = new CourseManager();
		courseManager.registerInstructor(course1, new Instructor[] {instructor1});
		courseManager.registerInstructor(course2, new Instructor[] {instructor1, instructor2});
		courseManager.registerInstructor(course3, new Instructor[] {instructor1, instructor3});

		courseManager.registerStudent(course1, new Student[] {student1});
		courseManager.registerStudent(course2, new Student[] {student1, student2});
		courseManager.registerStudent(course3, new Student[] {student1, student3});
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.registerCourse(category1, new Course[] {course1});
		categoryManager.registerCourse(category2, new Course[] {course2});
		categoryManager.registerCourse(category3, new Course[] {course3});

		/*-*/

		System.out.println("/**************KURSLAR******************/");
		
		System.out.println(course1);
		System.out.println(course2);
		System.out.println(course3);
		System.out.println("/**///");
		System.out.println("/**************KATEGOR�LER******************/");
		
		System.out.print(category1);
		System.out.print(category2);
		System.out.print(category3);

		System.out.println("/**************EG�TMENLER******************/");
		
		System.out.print(instructor1);
		System.out.print(instructor2);
		System.out.print(instructor3);

		System.out.println("/**************OGRENC�LER******************/");
		
		System.out.print(student1);
		System.out.print(student2);
		System.out.print(student3);
	}

}
