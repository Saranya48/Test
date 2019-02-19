package collections;

public class Collections3 {
	private String name;
	private int id;
	private String office;

	public Collections3(String n, int id, String off)

	{
		this.name = n;
		this.id = id;
		this.setOffice(off);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
}
