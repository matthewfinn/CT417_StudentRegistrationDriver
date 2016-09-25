package ie.nuigalway.mfinn.StudentRegistrationDriver;

import ie.nuigalway.mfinn.StudentRegistration.Course;
import ie.nuigalway.mfinn.StudentRegistration.Module;
import ie.nuigalway.mfinn.StudentRegistration.Student;

public class StudentRegistrationDriver {
	public static void main(String[] args) {

		Course c1 = new Course("CS & IT", null, null, null, null);
		Student s1 = new Student("Matthew", "Finn", "22/09/1994", 22, "13480362", null);
		Student s2 = new Student("Matthew", "Finn", "22/09/1994", 22, "13480362", null);
		Student s3 = new Student("Matthew", "Finn", "22/09/1994", 22, "13480362", null);
		Module m1 = new Module(null, null, null);

		System.out.println(s1.toString());
		/*
		 * m1.addStudent(s1); m1.addStudent(s2); m1.addStudent(s3);
		 * c1.addModule(m1);
		 *
		 * c1.addStudent(s1); c1.addStudent(s2); c1.addStudent(s3);
		 */
		/*
		 * ArrayList<Student> students = c1.getStudents(); Iterator<Student> it
		 * = students.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next().toString()); }
		 */
	}

}
