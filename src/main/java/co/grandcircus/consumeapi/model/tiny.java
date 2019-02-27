package co.grandcircus.consumeapi.model;

public class tiny implements Comparable<tiny> {
	
	private String name;
	private String invention;
	private Integer year;
	
	public tiny() {}

	public tiny(String name, String invention, Integer year) {
		super();
		this.name = name;
		this.invention = invention;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInvention() {
		return invention;
	}

	public void setInvention(String invention) {
		this.invention = invention;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public int compareTo(tiny o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
