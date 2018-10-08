package Program;

import Students.Undergrad;
import academics.Course;

public class CollegePeople {
	public void run() {
		Course c = new Course();
		c.addStudent(new Undergrad());
		c.addStudent(new Undergrad());
		c.getNextStudent().addGrade(100);
	}
	
	public static void main(String[] args) {
		CollegePeople cp = new CollegePeople();
		cp.run();
		System.exit(0);
	}
}
