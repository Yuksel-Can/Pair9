package praticeProject;

import java.util.ArrayList;

public class Instructor extends User{
	
	private String image;

	private ArrayList<Course> taughtCourses;
	
	public Instructor() {
		super();
	}
	
	public Instructor(int id, String firstName, String lastName, String email, String image, ArrayList<Course> taughtCourses) {
		super(id, firstName, lastName, email);
		this.image = image;
		this.taughtCourses = taughtCourses;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	@Override
	public String toString() {

		System.out.print("E�itmen �d: " + this.getId() + ", E�itmen Ad�: " + this.getFirstName() + " " + this.getLastName() + " ��renci Mail: " + this.getEmail() + " E�itmen Resmi: " + this.getImage());
		this.getInstructorInformation();
		return "\n";
	}
	
	public void getInstructorInformation() {

		System.out.print(" , Kurslar: ");
		for(Course course : this.getTaughtCourses()) {
			System.out.print(course.getName() + ", ");
		}
	}

	public ArrayList<Course> getTaughtCourses() {
		return taughtCourses;
	}

	public void setTaughtCourses(Course course) {
		this.taughtCourses.add(course);				//onemli
	}

}
