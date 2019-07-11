package a1;
import java.util.Scanner;

public class A1Jedi {

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
			double[] participationA = new double[students];
			double[] assignmentA = new double[students];
			double[] rawMidtermA  = new double[students];
			double[] rawFinalA = new double[students];
			
			for (int i = 0; i <= students; i++) {
				double aPointsEarned = 0;
				String firstName = scanner.next(); 
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
				
				participationA[i] = participationGrade;
				assignmentA[i] = aGrade;
				rawMidtermA[i] = midterm;
				rawFinalA[i] = finalexam;
			}
			double averageMidterm = average(rawMidtermA, students);
			double stdMidterm = std(rawMidtermA, students);
			double averageFinal = average(rawFinalA, students);
			double stdFinal = std(rawFinalA, students);
			
			int A = 0;
			int Aminus = 0;
			int Bplus = 0;
			int B = 0;
			int Bminus = 0;
			int Cplus = 0;
			int C = 0;
			int Cminus = 0;
			int Dplus = 0;
			int D = 0;
			int F = 0;
			
			
			for(int x = 0; x <= students; x++) {
				double normalizedMT = (rawMidtermA[x] - averageMidterm) / stdMidterm; 
				double low_normal = 0; 
				double high_normal = 0;
				double high_curved = 0;
				double low_curved = 0;
				if(normalizedMT >= 2.0) {
					 low_normal = 2.0;
					 high_normal = 2.0;
					 low_curved = 100;
					 high_curved = 100;
				} else if(normalizedMT < 2.0 && 1.0 < normalizedMT) {
					 low_normal = 1.0;
					 high_normal = 2.0;
					 low_curved = 94;
					 high_curved = 100;
				}else if(normalizedMT <= 1.0 && 0 < normalizedMT) {
					 low_normal = 0.0;
					 high_normal = 1.0;
					 low_curved = 85;
					 high_curved = 94;
				}else if(normalizedMT <= 0.0 && -1.0 < normalizedMT) {
					 low_normal = -1.0;
					 high_normal = 0.0;
					 low_curved = 75;
					 high_curved = 85;
				}else if(normalizedMT > -1.5 && -1.0 > normalizedMT) {
					 low_normal = -1.5;
					 high_normal = -1.0;
					 high_curved = 75;
					 low_curved = 65;
				}else if(normalizedMT > -2.0 && -1.5 >= normalizedMT) {
					 low_normal = -2.0;
					 high_normal = -1.5;
					 high_curved = 65;
					 low_curved = 55;
				}else if(normalizedMT > -3.0 && -2.0 >= normalizedMT) {
					 low_normal = -3.0;
					 high_normal = -2.0;
					 high_curved = 55;
					 low_curved = 30;
				}else if(normalizedMT > -4.0 && -3.0 >= normalizedMT) {
					 low_normal = -4.0;
					 high_normal = -3.0;
					 high_curved = 30;
					 low_curved = 0;
				}else if(normalizedMT <= -4.0) {
					 low_normal = -4.0;
					 high_normal = -4.0;
					 high_curved = 0;
					 low_curved = 0;
				}
				double curved_scoreMT = (((normalizedMT - low_normal) /
		                 (high_normal - low_normal)) *
		               (high_curved - low_curved)) + low_curved;
				rawMidtermA[x] = curved_scoreMT * 0.20;
				
				double low_normalF = 0; 
				double high_normalF = 0;
				double high_curvedF = 0;
				double low_curvedF = 0;
				double normalizedF = (rawFinalA[x] - averageFinal) / stdFinal;
				if(normalizedF >= 2.0) {
					 low_normalF = 2.0;
					 high_normalF = 2.0;
					 low_curvedF = 100;
					 high_curvedF = 100;
				} else if(normalizedF < 2.0 && 1.0 <= normalizedF) {
					 low_normalF = 1.0;
					 high_normalF = 2.0;
					 low_curvedF = 94;
					 high_curvedF = 100;
				}else if(normalizedF < 1.0 && 0 <= normalizedF) {
					 low_normalF = 0.0;
					 high_normalF = 1.0;
					 low_curvedF = 85;
					 high_curvedF = 94;
				}else if(normalizedF < 0.0 && -1.0 <= normalizedF) {
					 low_normalF = -1.0;
					 high_normalF = 0.0;
					 low_curvedF = 75;
					 high_curvedF = 85;
				}else if(normalizedF > -1.5 && -1.0 > normalizedF) {
					 low_normalF = -1.5;
					 high_normalF = -1.0;
					 high_curvedF = 75;
					 low_curvedF = 65;
				}else if(normalizedF > -2.0 && -1.5 >= normalizedF) {
					 low_normalF = -2.0;
					 high_normalF = -1.5;
					 high_curvedF = 65;
					 low_curvedF = 55;
				}else if(normalizedF > -3.0 && -2.0 >= normalizedF) {
					 low_normalF = -3.0;
					 high_normalF = -2.0;
					 high_curvedF = 55;
					 low_curvedF = 30;
				}else if(normalizedF > -4.0 && -3.0 >= normalizedF) {
					 low_normalF = -4.0;
					 high_normalF = -3.0;
					 high_curvedF = 30;
					 low_curvedF = 0;
				}else if(normalizedF <= -4.0) {
					 low_normalF = -4.0;
					 high_normalF = -4.0;
					 high_curvedF = 0;
					 low_curvedF = 0;
				}
				
				double curved_scoreF = (((normalizedF - low_normalF) /
		                 (high_normalF - low_normalF)) *
		               (high_curvedF - low_curvedF)) + low_curvedF;
				rawFinalA[x] = curved_scoreF * 0.25;
				
				double average = participationA[x] + assignmentA[x]+ rawMidtermA[x] + rawFinalA[x];
				if(average >= 94) {
					A++;
				} else if(average > 90 && average < 94) {
					Aminus++;
				} else if(average > 86 && average < 90) {
					Bplus++;;
				} else if(average > 83 && average < 86) {
					B++;
				} else if(average > 80 && average < 83) {
					Bminus++;
				} else if(average > 76 && average < 80) {
					Cplus++;
				} else if(average > 73 && average < 76) {
					C++;
				} else if(average > 70 && average < 73) {
					Cminus++;
				} else if(average > 65 && average < 70) {
					Dplus++;
				} else if(average > 60 && average < 65) {
					D++;
				} else if(average < 60) {
					F++;
				} 
				
			}
			System.out.println("A : " + A);
			System.out.println("A : " + Aminus);
			System.out.println("A : " + Bplus);
			System.out.println("A : " + B);
			System.out.println("A : " + Bminus);
			System.out.println("A : " + Cplus);
			System.out.println("A : " + C);
			System.out.println("A : " + Cminus);
			System.out.println("A : " + Dplus);
			System.out.println("A : " + D);
			System.out.println("A : " + F);
			scanner.close();
	}
		
			
			
	// Feel free to define addition methods here.
	// Be sure to declare them as "public static"
	public static double average (double[] grades, int students) {
		int i = 0; 
		double sum = 0;
		while (i < students) {
			sum += grades[i];
			i++;
		}
		double average = sum / students;
		return average;
	}
	
	public static double std (double[] grades, int students) {
		double average = average(grades, students);
		int i = 0;
		double[] newData = new double[students];
		while (i < students) {
			newData[i] = (grades[i] - average) * (grades[i] - average);
			i++;
		}
		double newAverage = average(newData, students);
		newAverage = Math.sqrt(newAverage);
		return newAverage; 
	}
}
 