package Program;

import Students.PrintablePerson;
import Students.Undergrad;
import Students.Year;
import academics.Course;

public class CollegePeople {
	public void run() {
		Course c = new Course();
		c.addStudent(new Undergrad());
		c.addStudent(new Undergrad());
		c.getNextStudent().addGrade(100);
		Undergrad u = new Undergrad();
		u.setYear(Year.JUNIOR);
		System.out.println(u.getYear());
	}
	
	public static void main(String[] args) {
		CollegePeople cp = new CollegePeople();
		cp.run();
		System.exit(0);
	}
	
	protected void print(PrintablePerson pp) {
		System.out.println(pp.printable());
	}
}
