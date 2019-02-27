package co.grandcircus.consumeapi.model;

public class tiny implements Comparable<tiny> {
	
	private String name;
	private String invented;
	private Integer year;
	
	public tiny() {}

	public tiny(String name, String invented, Integer year) {
		super();
		this.name = name;
		this.invented = invented;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInvented() {
		return invented;
	}

	public void setInvented(String invented) {
		this.invented = invented;
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
