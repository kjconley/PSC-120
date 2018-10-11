package Program;

import Students.Graduate;
import Students.Person;
import Students.PrintablePerson;
import Students.Student;
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
		Graduate g = new Graduate();
		g.setName("Matt");
		g.setAge(50);
		g.setStudentID(123456789);
		g.setYear(6);
		Person a = new Person();
		a.setName("Dr. Schank");
		g.setAdviser(a);
		
		Person p1 = g;
		Student s1 = g;
		Person p2 = new Person();
		Student s2 = new Student();
		p2.setName("Sydney");
		p2.setAge(123);
		s2.setName("Jay");
		s2.setAge(63);
		s2.setStudentID(987654321);
		
		print(g);
		print(p1);
		print(s1);
		print(p2);
		print(s2);

		return;
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
