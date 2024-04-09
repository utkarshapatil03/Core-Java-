package Assign4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PlayerManagement {
	    ArrayList<Player> createobject(){
		ArrayList<Player> list = new ArrayList<>();
		Player p1 = new Player("Dhoni",100,10,200,"India",20,"A");
		Player p2 = new Player("Virat",50,20,200,"India",8,"A");
		Player p3 = new Player("Rohit",300,30,200,"India",12,"A");
		Player p4 = new Player("Sachin",40,40,200,"India",15,"B");
		Player p5 = new Player("Shubhaman",500,50,200,"India",9,"B");

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		System.out.println(list);
	    return list;
	} 	
	
	//Display the player details who has scored maximum no of runs 
	public static void DispMaxruns(ArrayList<Player> list) {
		Player maxrun = Collections.max(list,Comparator.comparing(Player ->Player.totalrun));
		
		System.out.println("player with maximumrun" + maxrun);
	}
	
	//Sort the players by name 
	public static void sortByname(ArrayList<Player> list) {
		Collections.sort(list,Comparator.comparing(Player ->Player.name));
    	System.out.println("players name sorted");
    	System.out.println(list);
    	//for (Player ele: list ) {
    	//System.out.println(ele);
    	//} 
	} 
	
    public static void removeplayers(ArrayList<Player>list) {
    	list.removeIf(Player ->Player.totalrun<100);
    	System.out.println("players after removing players who have scored less than 100 runs");
    	
    	for(Player ele: list) {
    		System.out.println(ele);
    	}	
    }
    
    public static void Update(ArrayList<Player>list) {
    	
    	for(Player ele: list) {
    		if(ele.noofcentury>=10) {
    			ele.category="A";
    		}else {
    		ele.category="B";
    		}
    	}
    	System.out.println("after updating");
    	for(Player ele: list) {
    		System.out.println(ele);
    		
    	}
    }
	
			
}
	
		
	

