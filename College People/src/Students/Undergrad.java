package Students;

public class Undergrad extends Student {
	private int[] grade;
	private int nGrades;
	protected Year year;

	public int getYear() {
		return year.ordinal() + 1;
	}
	
	public void setYear(Year year) {
		this.year = year;
	}
	
	public Undergrad() {
		grade = new int[5];
		nGrades = 0;
	}
	
	public int getGradeAve( ) {
		int sum = grade[0] + grade[1] +grade[2] + grade[3] + grade[4];
		return sum/nGrades;
	}

	public int addGrade(int g) {
		grade[nGrades++] = g;
		return getGradeAve();
	}
	
	public String printable() {
		String retval = super.printable();
		retval += "Year: " + year + "\n";
		retval += "Average: " + getGradeAve() + "\n";
		return retval;
	}
}
