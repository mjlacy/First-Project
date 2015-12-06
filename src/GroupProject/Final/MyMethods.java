/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GroupProject.Final;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Michael Lacy (ml4kb) & Andrew Nicholson (amntgb)
 */
public class MyMethods
{
    
    void Product()
    {
        double product=0, input;
        System.out.println("Enter a series of numbers.");
        System.out.println("Negative values will be ignored,"
                + " hit 0 to stop reading numbers.");
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        
        input = Double.parseDouble(st.nextToken());
            
            if (input >0)
            {
                product = input;
            }
            
            while (st.hasMoreTokens() && input != 0)
            {
                input = Double.parseDouble(st.nextToken());
                
                if (input > 0)
                {
                    if (product == 0)
                    {
                        product = input;
                    }
                    else
                    {
                        product *= input;
                    }
                }
            }
        System.out.println();
        System.out.println("The product of your numbers is: " + product);
    }
    
    void IndexOf12()
    {
        int first=0, last=0, input, count=0;
        
        System.out.println("Enter your numbers ");
        
        Scanner sc= new Scanner(System.in);
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        
        while(st.hasMoreTokens())
        {
            input=Integer.parseInt(st.nextToken());
            count++;
            
            if(first==0)
            {
                if(input==12)
                {
                   first = count;
                }
            }        
            if(input==12)
            {
                last = count;
            }
        }
        
        if (last == 0)
            {
                System.out.println();
                System.out.println("Twelve not found, index number: " + first);
            }
        else
            {
                System.out.println();
                System.out.println("The first 12 is at index number: " + first);
                System.out.println("The last 12 is at index number: " + last);    
            }
    }
    
        public void minMaxAvg()
    {
        Scanner sc = new Scanner(System.in);
        
        int input, min = 0, max = 0, count = 0;
        double avg, sum = 0;
        
        System.out.println("Please enter a string of numbers: ");
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer( line );
        
        while ( st.hasMoreTokens() )
        {
            if (count == 0)
            {
                max = Integer.parseInt( st.nextToken() );
                min = max;
                sum = max;
                count++;
            }
            else
            {
                input = Integer.parseInt( st.nextToken() );
                        
                if (input > max)
                {
                    max = input;
                    sum += input;
                    count++;
                }
                else
                {
                    min = input;
                    sum += input;
                    count++;
                }
            }
        }
        avg = sum / count;
        System.out.println();
        System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg);
    }
        
    void ExamScores()
    {
        int  sumA, sumB, sumC, sumD, sumF;
	sumA=sumB=sumC=sumD=sumF=0;
	
        System.out.println("Enter the exam scores");
	
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        
        System.out.println();
        
        while(st.hasMoreTokens()){
          
            double input=Double.parseDouble(st.nextToken()); 
            
            if(input>=100)
            {
                sumA++;
                System.out.println(input + "     A");
	    }
            else if(input>=90)
            {
                sumA++;
                System.out.println(input + "      A");
	    }
            else if(input >= 70)
            {
                sumB++;
                System.out.println(input + "      B");
            }
            else if(input >= 50)
            {
                sumC++;
                System.out.println(input + "      C");
            }
            else if(input >= 35)
            {
                sumD++;
                System.out.println(input + "      D");
            }
            else if(input >= 10)
            {
                sumF++;
                System.out.println(input + "      F");
            }
            else
            {
                sumF++;
                System.out.println(input + "       F");
            }    
        }
        System.out.println();
        System.out.println("The total number of A's is " + sumA);
        System.out.println("The total number of B's is " + sumB);
        System.out.println("The total number of C's is " + sumC);
        System.out.println("The total number of D's is " + sumD );
        System.out.println("The total number of F's is " + sumF );
    }
}