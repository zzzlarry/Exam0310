
public class Staff {

	private String id, name;
	private float high;
	private char gender;

	public Staff(String name1, String id1) {
		name = name1;
		id = id1;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return id;
	}

	public void setGender(char gender1) {
		gender = gender1;
	}

	public char getGender() {
		return gender;
	}

	public void setHigh(float high1) {
		high = high1;
	}

	public float getHigh() {
		return high;
	}
}
