/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupProject.Final;
import java.util.Scanner;
/**
 *
 * @author Michael Lacy (ml4kb) & Andrew Nicholson (amntgb)
 */
public class RunMyMethods
{
    MyMethods MM= new MyMethods(); 
    public static void main(String[] args)
    { 
        RunMyMethods RMM = new RunMyMethods();
        RMM.Menu();    
    }    
        
    public void Menu() {
        Scanner sc= new Scanner(System.in);
        int input;
        do{
        System.out.println("1) Find Product ");
	System.out.println("2) Find 12 ");
	System.out.println("3) Find Minimum, Maximum, and Average");
	System.out.println("4) Assign Exam Scores"); 
        System.out.println("5) Exit");
        System.out.println();
        
        input=sc.nextInt();
        
        System.out.println();
        
        if(input==1)
        {   
        MM.Product();
        }
        else if (input==2)
        {    
        MM.IndexOf12();
        }
        else if (input==3)
        {     
        MM.minMaxAvg();
        }
        else if (input==4)
        {    
        MM.ExamScores();
        }
        else if (input==5)
        {
        System.exit(0);
        }
        else
        { 
        System.out.println("Invalid Input");    
        }
        System.out.println();
        }while(input != 5);
    }
}