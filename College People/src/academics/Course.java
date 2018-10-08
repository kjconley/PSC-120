package academics;

import Students.Undergrad;

public class Course {
	private Undergrad[] seats = new Undergrad[40];
	private int currentGet = -1;
	private int currentAdd = 0;
	
	public Undergrad getNextStudent() {
		return seats[++currentGet];
	}
	
	public void addStudent(Undergrad student) {
		seats[currentAdd++] = student;
		return;
	}
}
