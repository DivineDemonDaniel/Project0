package Model;

public class Client {

	private int id;
	private String name;
	private double worth;
	
	public Client() { // no argument constructor
		super();
	}

	public Client(int id, String name, double worth) { // full argument constructor
		super();
		this.id = id;
		this.name = name;
		this.worth = worth;
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

	public double getWorth() {
		return worth;
	}

	public void setWorth(double worth) {
		this.worth = worth;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", worth=" + worth + "]";
	}

	
	
	
}
