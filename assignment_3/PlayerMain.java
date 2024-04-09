package Assign4;

import java.util.ArrayList;

public class PlayerMain {

	public static void main(String[] args) {
		PlayerManagement pm = new PlayerManagement();
		ArrayList<Player> a = pm.createobject();
		PlayerManagement.DispMaxruns(a);
		PlayerManagement.sortByname(a);
		PlayerManagement.removeplayers(a);
		PlayerManagement.Update(a);
	}

}
