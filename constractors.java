package constractors;

public class constractors {
	private String Name;
	private int age;
	private double no_of_km;
	private double total;

	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getNo_of_km() {
		return no_of_km;
	}

	public void setNo_of_km(double no_of_km) {
		this.no_of_km = no_of_km;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public constractors(String n,int t,double h) {
		Name = n;
		age = t;
		no_of_km = h;
	}
	
	public void calcu() {
		total = no_of_km * 100;
	}
	public void display() {
		System.out.println("Total price is "+total);
	}

}
