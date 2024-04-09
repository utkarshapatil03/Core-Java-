package Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Teacher t = new Teacher("aaa", 30);
		PermanentEmployee pm = new PermanentEmployee("bbb", 50);
		ContractEmployee cm = new ContractEmployee("ccc",40);

		t.myProfession();
        pm.myProfession();
        cm.myProfession();
	}

}
