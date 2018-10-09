package Students;

public class Student extends Person {
	protected int studentID;

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String printable() {
		String retval = super.printable();
		retval += "Student ID: " + studentID + "\n";
		return retval;
	}
}
