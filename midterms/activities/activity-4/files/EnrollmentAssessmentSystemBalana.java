package midterm;

import java.util.Scanner;

public class EnrollmentAssessmentSystemBalana {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Get student details
		System.out.print("Student Name: ");
		String name = sc.nextLine();
		
		System.out.print("Senior High School Strand (STEM, ABM, HUMSS, TVL, Others): ");
		String strand = sc.nextLine();
		
		System.out.print("Entrance Exam Score (0-100): ");
		float entrance_exam_score = sc.nextFloat();
		sc.nextLine(); 
		
		System.out.print("Interview Score (0-100): ");
		float interview_score = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("First Screening Result (Pass/Fail): ");
		String screening = sc.nextLine();
		
		// Compute final score (60% exam, 40% interview)
		float final_score = entrance_exam_score * 0.60f + interview_score * 0.40f;
		
		// Display assessment result
		System.out.println("");
		System.out.println("===== ENROLLMENT ASSESSMENT RESULT =====");
		System.out.println("");
		System.out.println("Student Name: " + name);
		System.out.println("SHS Strand: " + strand.toUpperCase());
		System.out.println("Final Evaluation Score: " + String.format("%.2f", final_score));
		
		// Determine admission result based on screening and final score
		if (screening.equalsIgnoreCase("Pass")) {
		    if (final_score >= 85) {
		        System.out.println("Admission Result: Admitted with Scholarship");
		    } else if (final_score >= 75) {
		        System.out.println("Admission Result: Admitted");
		    } else if (final_score >= 65) {
		        System.out.println("Admission Result: Waitlisted");
		    } else {
		        System.out.println("Admission Result: Not Qualified");
		    }
		} else if (screening.equalsIgnoreCase("Fail")) {
		    System.out.println("Admission Result: Not Qualified");
		} else {
		    System.out.println("Invalid Input.");
		}
		
		
		// Determine recommended program based on strand
		switch (strand.toUpperCase()) {
		case "STEM":
			System.out.println("Recommended Program: BSIT / BSCS");
			break;
		case "ABM":
			System.out.println("Recommended Program: BSBA");
			break;
		case "HUMSS":
			System.out.println("Recommended Program: BSED / AB Communication");
			break;
		case "TVL":
			System.out.println("Recommended Program: BSIT");
			break;
		case "OTHERS":
			System.out.println("Recommended Program: General Program");
			break;
		}
		
		sc.close(); // Closing to avoid memory leak

	}

}