package Students;

public class Graduate extends Student implements PrintablePerson {
	protected int year;
	protected Person adviser;
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public Person getAdviser() {
		return adviser;
	}
	
	public void setAdviser(Person adviser) {
		this.adviser = adviser;
	}
	
	public String printable() {
		String retval = super.printable();
		retval += "Year: " + year + "\n";
		retval += "Adviser: " + adviser.getName() + "\n";
		return retval;
	}
	
}
