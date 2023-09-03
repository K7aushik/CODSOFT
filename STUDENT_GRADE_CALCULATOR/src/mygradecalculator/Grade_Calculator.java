package mygradecalculator;
import java.util.Scanner;
public class Grade_Calculator
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//Enter All Details of Student
		System.out.println();
		System.out.println();
		System.out.print("Enter Student Name:");
		String name=sc.nextLine();
		System.out.print("Enter Student Roll No:");
		int rollno=sc.nextInt();
		System.out.print("Enter Student Regitation No:");
		int reg=sc.nextInt();
		System.out.print("Enter Class:");
		String cl=sc.next();
		System.out.print("Enter Scetion:");
		String sec=sc.next();
		//Enter All Marks of Student
		System.out.print("Enter Marks of Bengali:");
		int beng=sc.nextInt();
		System.out.print("Enter Marks of English:");
		int eng=sc.nextInt();
		System.out.print("Enter Marks of Chemistry:");
		int che=sc.nextInt();
		System.out.print("Enter Marks Physics:");
		int phy=sc.nextInt();
		System.out.print("Enter Marks of Mathematics:");
		int math=sc.nextInt();
		//Chooes your optional Subject
		System.out.println();
		System.out.print("Enter Chooes 'B' for Biology or 'S' for Computer Science:");
		char ch=sc.next().charAt(0);
		int optional = 0;
		switch(ch)
		{
		  case 'B':System.out.print("Enter Marks of Biology:");
		  		   optional=sc.nextInt();
		  		   break;
		  case 'S':System.out.print("Enter Marks of Computer Science:");
		           optional=sc.nextInt();
		           break;
		}
		//Calculate Total,Average,Average_percentage
		int total=beng+eng+che+phy+math+optional;
		float avg=total/6;
		int avg_percentange=(int) ((avg)/100*100);
		System.out.println();
		System.out.println();
		System.out.println("Student's Name : "+name);
		System.out.println("Student's Roll No : "+rollno);
		System.out.println("Student's Registration : "+reg);
		System.out.println("Student's class : "+cl);
		System.out.println("Student's Section : "+sec);
		System.out.println();
		System.out.println("Total Marks : "+total);
		System.out.println("Average : "+avg);
		System.out.println("Average Percentage : "+avg_percentange);
		
		if(avg_percentange >= 90)
		{
			System.out.println("Excellent: Grade A");
		}
		else if(avg_percentange < 90 && avg_percentange >= 80)
		{
			System.out.println("Very Good: Grade B");
		}
		else if(avg_percentange < 80 && avg_percentange >= 70)
		{
			System.out.println("Good: Grade C");
		}
		else if(avg_percentange < 70 && avg_percentange >= 60)
		{
			System.out.println("Satisfactory: Grade D");
		}
		else if(avg_percentange < 60 && avg_percentange >= 50)
		{
			System.out.println("Work Hard: Grade E");
		}
		else if(avg_percentange < 50 && avg_percentange >= 40)
		{
			System.out.println("Just Passed: Grade F");
		}
		else
		{
			System.out.println("Failed!");
		}
	
	}

}
