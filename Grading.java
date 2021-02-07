import java.util.Scanner;
public class Grading {
	public static void main(String [] args ) {
		Scanner console =new Scanner( System.in);
		double examGrade1;
		double examGrade2;
		double examGrade3;
		
		System.out.print("First midterm grade: ");
		examGrade1 = console.nextDouble();
		if(100<examGrade1 || examGrade1 <0) {
			System.out.print("The number is wrong");
			examGrade1=console.nextDouble();
		                                    }
		
		System.out.print("Second midterm grade: ");
		
			examGrade2 = console.nextDouble();
        if(100<examGrade2 || examGrade2 <0) {
        	System.out.print("The number is wrong");
		      examGrade2=console.nextDouble();
                                            }
		
		
        
		
		System.out.print("Final grade: ");
		examGrade3 = console.nextDouble();
		if(100< examGrade3 || examGrade3 <0) {
			System.out.print("The number is wrong");
		    examGrade3 = console.nextDouble();
		
		                                     
        }
		
		double average= (examGrade1 + examGrade2 + examGrade3)/3;
		
		
		if(60>average || average <0) {
			System.out.println("Average: " + average );
		   System.out.println("Letter grade: F");
		
		} else if(70 > average || average >= 60 ) {
			System.out.println("Average: " + average );
			System.out.println("Letter grade: D");
		
		}else if (80 > average ||  average >= 70) {
			System.out.println("Average: " + average );
			System.out.println("Letter grade: C");
		
		}else if (90 > average || average >=80) {
			System.out.println("Average: " + average );
			System.out.println("Letter grade: B");
			
		
		}else  if (100>=average || average >= 90) {
			
			System.out.println("Letter grade: A");
		                                          }
	                                           }
		                                    }
	                                     
                                       
	


