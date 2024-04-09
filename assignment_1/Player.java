package Scanner;

public class Player {
	String name;
	int age;
	String countryname;
	int totalrun;

	public Player(String name, int age, String countryname, int totalrun) {
		this.name = name;
		this.age = age;
		this.countryname = countryname;
		this.totalrun = totalrun;
	}
	
	public void display() {
		System.out.println(name+ "name") ;
		System.out.println(age+ "age");
		System.out.println(countryname+ "countryame");
		System.out.println(totalrun+ "totalrun");
	}
	
   public static void main(String[] args) {
		Player p1 = new Player("dhoni", 40, "india", 7000);
		Player p2 = new Player("sachin",46, "india", 8000);
		Player p3 = new Player("virat", 35, "india", 5000);
		Player p4 = new Player("shubhman", 30, "india", 4000);
		Player p5 = new Player("jadeja", 37, "india", 4500);
 
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
		
	System.out.println("Players having more than 5000 runs :");
	for(Player player : new Player[] {p1,p2,p3,p4,p5}) {
		if(player.totalrun > 5000) {
			player.display();
		}
	}
	}

}
