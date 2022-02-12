package praticeProject;

public class Student extends User{

	private int certificateCount;

	private Course[] registeredCourses;

	public Student() {
		super();
	}

	public Student(int id, String firstName, String lastName, String email, int certificateCount) {
		super(id, firstName, lastName, email);
		this.certificateCount = certificateCount;
	}

	public int getCertificateCount() {
		return certificateCount;
	}

	public void setCertificateCount(int certificateCount) {
		this.certificateCount = certificateCount;
	}

	public Course[] getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(Course[] registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	
	@Override
	public String toString() {

		System.out.print("��renci �d: " + this.getId() + ", ��renci Ad�: " + this.getFirstName() + " " + this.getLastName() + " ��renci Mail: " + this.getEmail() + " Sertifika Say�s�: " + this.certificateCount);
		this.getInstructorInformation();
		return "\n";
	}
	
	public void getInstructorInformation() {

		System.out.print(" , Kurslar: ");
		for(Course course : this.getRegisteredCourses()) {
			System.out.print(course.getName() + ", ");
		}
	}
}
