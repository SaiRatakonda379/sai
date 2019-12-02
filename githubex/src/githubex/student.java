package githubex;

public class student {
	private int id;
	private String name;
	private String pass;
	private String firstname;
	private String middlename;
	private String lastname;

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPass() {
		return pass;
	}
}
