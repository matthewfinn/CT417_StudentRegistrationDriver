package ie.nuigalway.mfinn.StudentRegistrationDriver;

import java.util.ArrayList;

import org.joda.time.DateTime;

import ie.nuigalway.mfinn.StudentRegistration.Course;
import ie.nuigalway.mfinn.StudentRegistration.Module;
import ie.nuigalway.mfinn.StudentRegistration.Student;

public class StudentRegistrationDriver {
	public static void main(String[] args) {

		//Declaration of objects to be used to test
		Course c1 = new Course("CS & IT", new DateTime(2013, 9, 1, 9, 0), new DateTime(2017, 5, 30, 18, 0), 4);

		Module m1 = new Module("Software Engineering 3", "CT417");
		Module m2 = new Module("Advanced Professional Skills", "CT436");
		Module m3 = new Module("System Modelling & Simulation", "CT561");
		Module m4 = new Module("Machine Learning & Data Mining", "CT475");
		Module m5 = new Module("Graphics & Image Processing", "CT404");

		Student s1 = new Student("Matthew", "Finn", "22/09/1994", 22, "13480362", c1);
		Student s2 = new Student("Mark", "Jones", "13/07/1995", 21, "13343567", c1);
		Student s3 = new Student("Mary", "O'Donovan", "23/11/1986", 29, "13962237", c1);
		Student s4 = new Student("Sean", "Mullins", "14/12/1994", 21, "13452337", c1);
		Student s5 = new Student("David", "Kelly", "1/3/1996", 21, "12834473", c1);
		Student s6 = new Student("Shane", "Reilly", "28/5/1992", 24, "13852343", c1);
		Student s7 = new Student("Nicole", "Corcoran", "11/4/1995", 21, "13723943", c1);
		Student s8 = new Student("Daragh", "Kenny", "1/3/1996", 31, "13923477", c1);
		Student s9 = new Student("Paul", "Rooney", "8/2/1988", 28, "13182637", c1);
		Student s10 = new Student("Patrick", "Walsh", "20/3/1996", 20, "13495677", c1);


		//adds all declared students to each of the modules
		m1.addStudent(s1);m1.addStudent(s2);m1.addStudent(s3);m1.addStudent(s4);m1.addStudent(s5);
		m1.addStudent(s6);m1.addStudent(s7);m1.addStudent(s8);m1.addStudent(s9);m1.addStudent(s10);
		m2.addStudent(s1);m2.addStudent(s2);m2.addStudent(s3);m2.addStudent(s4);m2.addStudent(s5);
		m2.addStudent(s6);m2.addStudent(s7);m2.addStudent(s8);m2.addStudent(s9);m2.addStudent(s10);
		m3.addStudent(s1);m3.addStudent(s2);m3.addStudent(s3);m3.addStudent(s4);m3.addStudent(s5);
		m3.addStudent(s6);m3.addStudent(s7);m3.addStudent(s8);m3.addStudent(s9);m3.addStudent(s10);
		m4.addStudent(s1);m4.addStudent(s2);m4.addStudent(s3);m4.addStudent(s4);m4.addStudent(s5);
		m4.addStudent(s6);m4.addStudent(s7);m4.addStudent(s8);m4.addStudent(s9);m4.addStudent(s10);
		m5.addStudent(s1);m5.addStudent(s2);m5.addStudent(s3);m5.addStudent(s4);m5.addStudent(s5);
		m5.addStudent(s6);m5.addStudent(s7);m5.addStudent(s8);m5.addStudent(s9);m5.addStudent(s10);

		//adding modules to course
		c1.addModule(m1);c1.addModule(m2);c1.addModule(m3);c1.addModule(m4);c1.addModule(m5);

		ArrayList<Student> s = c1.getStudents();
		for(Student stu: s){
			int i = 1;
			System.out.println("Student: " + stu.toString()+"\n");
			System.out.println("Course: " + stu.getCourse().getName()+"\n");
			ArrayList<Module> m= stu.getModules();
			System.out.println("Modules:");
			for(Module mod : m){

				System.out.println(i++ +". "+ mod.getName());

			}
			System.out.println("------------------------------------------ \n");


		}


	}

}
