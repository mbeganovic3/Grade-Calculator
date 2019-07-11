package a1;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Your main program code here.
				double num_of_assingments = scanner.nextDouble(); 
				double maxApoints = 0;
			
				
				for(int count = 0; count < num_of_assingments; count++) {
					maxApoints += scanner.nextDouble();
				}
				
				double maxParticipation = scanner.nextDouble();
				int students = scanner.nextInt();
				
				for (int i = 0; i <= students; i++) {
					double aPointsEarned = 0;
					String firstName = scanner.next(); 
					String firstLetter = firstName.substring(0,1);
					String lastName = scanner.next();
					
					double participation = scanner.nextDouble();
					
					for (int counter = 0; counter < num_of_assingments; counter++) {
					aPointsEarned += scanner.nextDouble();
					}
					
					double midterm = scanner.nextDouble();
					double finalexam = scanner.nextDouble();
					
					double participationGrade = 100 * (participation / (maxParticipation * 0.8));
					if(participationGrade > 100) {
						participationGrade = 100; 
					}
					participationGrade = participationGrade * 0.15;
					
					double aGrade = ((aPointsEarned / maxApoints) * 100) * 0.4;
					
					double midtermGrade = midterm * 0.20;
					double finalGrade = finalexam * 0.25;
					
					double average = participationGrade + aGrade + midtermGrade + finalGrade;
					
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
				scanner.close();
			}
			
			// Feel free to define addition methods here.
			// Be sure to declare them as "public static"

		}