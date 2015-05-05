package CastawayRPG;
import java.util.Scanner;
//Intel. Strength. Agility. Charisma. Perception
public class Select {
public String charname;
public static Scanner in= new Scanner(System.in);
public static int stat[]=new int[5];

	Select(){
	System.out.println("Select your player.");
	System.out.println("1. Jack\n2. Jess\n3. Cory\n4. Rob\n5. Trish");

    int choice;
	choice=in.nextInt();

	switch (choice){
	case 1: charname="Jack";
			break;
	case 2: charname="Jess";
			break;
	case 3: charname="Cory";
			break;
	case 4: charname="Rob";
			break;
	case 5: charname="Trish";
			break;
	default:charname="Invalid Character";

		}
	}
	void confirm(){
		System.out.println("You have chosen: "+charname);
		System.out.print("Is this correct? (y/n):");
		String conf;
		conf=in.next();
		if(conf.equals("y")){
			System.out.println("Confirmed!");
			
		}
		else if(conf.equals("n")){
			System.out.println("Please try again");
			
		}
		if(charname.equals("Jack")){
		stat[0]=5;
		stat[1]=7;
		stat[2]=4;
		stat[3]=7;
		stat[4]=4;
		}
		//Jess
		else if(charname.equals("Jess")){
		stat[0]=5;
		stat[1]=4;
		stat[2]=4;
		stat[3]=6;
		stat[4]=6;
		}
		//Cory
		else if(charname.equals("Cory")){
		stat[0]=8;
		stat[1]=4;
		stat[2]=4;
		stat[3]=5;
		stat[4]=6;
		}
		//Rob
		else if(charname.equals("Rob")){
		stat[0]=5;
		stat[1]=6;
		stat[2]=6;
		stat[3]=4;
		stat[4]=4;
		}
		//Trish
		else if(charname.equals("Trish")){
		stat[0]=4;
		stat[1]=6;
		stat[2]=8;
		stat[3]=7;
		stat[4]=4;
		}
		}
}

