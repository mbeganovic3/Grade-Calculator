package a1;
import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Your main program code here.
		int students = scanner.nextInt(); // # of students 
		
		for (int i = 0; i <= students; i++) {
			String firstName = scanner.next(); //Gets first letter of of first name
			String firstLetter = firstName.substring(0,1);
			
			String lastName = scanner.next(); //last name
			
			double assignment = scanner.nextDouble();
			double participation = scanner.nextDouble();
			double midterm = scanner.nextDouble();
			double finals = scanner.nextDouble();
			
			double assignmentGrade = assignment * 0.40;
			double participationGrade = participation * 0.15;
			double midtermGrade = midterm * 0.20;
			double finalGrade = finals * 0.25;
			double average = assignmentGrade + participationGrade + midtermGrade + finalGrade;
			
			String letterGrade = "";
			 
			if(average >= 94) {
				letterGrade = "A";
			} else if(average > 90 && average < 94) {
				letterGrade = "A-";
			} else if(average > 86 && average < 90) {
				letterGrade = "B+";
			} else if(average > 83 && average < 86) {
				letterGrade = "B";
			} else if(average > 80 && average < 83) {
				letterGrade = "B-";
			} else if(average > 76 && average < 80) {
				letterGrade = "C+";
			} else if(average > 73 && average < 76) {
				letterGrade = "C";
			} else if(average > 70 && average < 73) {
				letterGrade = "C-";
			} else if(average > 65 && average < 70) {
				letterGrade = "D+";
			} else if(average > 60 && average < 65) {
				letterGrade = "D";
			} else if(average < 60) {
				letterGrade = "F";
			} 
			
			System.out.println(firstLetter + ". " + lastName + " " + letterGrade);
		}
		
		
		
		
		
	
		
		
	}
	
	// Feel free to define addition methods here.
	// Be sure to declare them as "public static"
	
	
}
