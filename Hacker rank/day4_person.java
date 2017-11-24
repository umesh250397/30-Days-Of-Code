import java.io.*;
import java.util.*;


public class day4_person {
    private int age;

	public day4_person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if(initialAge>0){
            age = initialAge;
        }
        else{
            System.out.println("Age is not valid, setting age to 0.");
        }
	}

	public void amIOld() {
  		// Write code determining if this day4_person's age is old and print the correct statement:
        String s;
        if(age<13){
            s = "You are young.";
        }
        else if(age>12 && age<18){
            s = "You are a teenager.";
        }
        else{
            s = "You are old.";
        }
        System.out.println(s);
	}

	public void yearPasses() {
  		// Increment this day4_person's age.
        age+=1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			day4_person p = new day4_person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}