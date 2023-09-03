package mygame;
import java.util.Random;
import java.util.Scanner;
public class Numbergame
{
	public static void main(String[] args)
	{
		Random RN= new Random();
	    int computer_guess=RN.nextInt(100);//Generate a Ramdom Number
	    int t=0;
	    
	    System.out.println();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("	-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("	|                        NUMBER GAME                        |");
        System.out.println("	-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println();
	    System.out.println("	 Guess a number between 1 to 100, You will have 10 turns!" );
	    System.out.println("	 best of luck!");

	    
	    int Userguess_num;
	    int i=0;
	    boolean win=false;
	    while(!win)
	    {
	    	System.out.print("	 Please!Enter Your Guess Number:-");
	    	Userguess_num=sc.nextInt();//User Guess
	    	t++;
	    
	    	if(Userguess_num==computer_guess)//If user input match to Computer guess user win  the Game
	    	{
	    		win=true;
	    	}
	    	else if(i>8)//Set a limit less than 8  out of 10 Turns 
	    	{
	    		System.out.println();
	    		System.out.println("	-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	    		System.out.println("        |	You loose!! the Computer answer was: "+computer_guess+"             |");
	    		System.out.println("        |			Try Again......                     |");
	    		System.out.println("	-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	    		return;
	    	}
	    	else if(Userguess_num<computer_guess)
	    	{
	    		i++;
	    		System.out.println("	 Your Guess is lower than the Computer guess! Turns left: "+(10-i));
	      
	      
	      
	    	}
	    	else if(Userguess_num>computer_guess) 
	    	{
	    		i++;
	    		System.out.println("	 Your Guess Is Higher Than The Computer Guess! Turns left: "+(10-i));
	      
	    	}
	    
	    
	    }
	    System.out.println();
		System.out.println("	-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	    System.out.println("        |                       Congratulation!!                    |");
	    System.out.println("        |                    Hurray!!!!!!....You win!               |");
	    System.out.println("        |                                                           |");
	    System.out.println("	|  Computer Guess number was "+computer_guess+"                             |");
	    System.out.println("	|  You used "+t+" turns to guess the right number               |");
	    System.out.println("	|  Now Your score is "+((11-t)*10)+"% out of 100                         |");
	    System.out.println("	-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

	  

	}

}
