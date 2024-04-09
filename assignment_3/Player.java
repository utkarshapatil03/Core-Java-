package Assign4;

public class Player {
	String name;
	int totalrun;
	int noofwicket;
	int noofmatch;
	String country;
	int noofcentury;
	String category;
	
	public Player(String name, int totalrun, int noofwicket, int noofmatch, String country, int noofcentury, String category) {
		this.name = name;
		this.totalrun = totalrun;
		this.noofwicket = noofwicket;
		this.noofmatch = noofmatch;
		this.country = country;
		this.noofcentury = noofcentury;
		this.category = category;
	}
	
	 public String toString() {
		 return (name + totalrun + noofwicket + noofmatch + country + noofcentury + category);
	 }
}
