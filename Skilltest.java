package CastawayRPG;
import java.util.Random;
public class Skilltest {
	public static int bonus;
	public static int randomInt;
	public static int total;
	public static void anyRandomIntRange(Random rn, int low, int high) {
		randomInt = rn.nextInt(high) + low;
		System.out.println("Roll: " + randomInt);
		
	}
	Skilltest(){
		System.out.println("Which skill would you like to test?");
		System.out.println("1. Intellegence \n2. Strength \n3. Agility\n4. Charisma\n5. Perception");
		int choice = Select.in.nextInt();
		switch (choice){
		case 1: Random rn = new Random();
				for (int i = 0; i < 1; i++) {
					anyRandomIntRange(rn, 1, 10);
					}
				intel(randomInt);
				break;
		case 2: strength();
				break;
		case 3: agility();
				break;
		case 4: charisma();
				break;
		case 5: perception();
				break;

			}
		
	}
	void intel(int randomInt){
		int bonus = Select.stat[0];
			System.out.println("Bonus: " + bonus);
			int total = bonus+randomInt;
			System.out.println(total);
			if(total>10){
				System.out.println("Pass!");
			}
			else{
				System.out.println("Fail!");
			}
			
		}
	void strength(){
		
	}
	void agility(){
		
	}
	void charisma(){
		
	}
	void perception(){
		
	}

}
