package HashMap;

public class Mobile{

	private String brand;
	private double price;
	private int ram;
	
	public Mobile(String brand, double price, int ram) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
//	@Override
//	public int compareTo(Mobile o) {
//		return this.ram-o.ram;
//	}
	
	
}
