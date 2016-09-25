package ie.nuigalway.mfinn.StudentRegistrationDriver;

import ie.nuigalway.mfinn.StudentRegistration.Course;
import ie.nuigalway.mfinn.StudentRegistration.Module;
import ie.nuigalway.mfinn.StudentRegistration.Student;

public class StudentRegistrationDriver {
	public static void main(String[] args) {

		Course c1 = new Course("CS & IT", null, null);
		Student s1 = new Student("Matthew", "Finn", "22/09/1994", 22, "13480362", null);
		Student s2 = new Student("Mark", "Jones", "13/07/1995", 21, "13343567", null);
		Module m1 = new Module("Software Engineering 3", "CT417");

	}

}
