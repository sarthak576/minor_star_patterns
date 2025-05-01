package Java_GAME;
// ? Code Warriors: A Cybercrime Adventure (15 Java & SQL Levels)

import java.lang.foreign.SymbolLookup;
/*
 * Level 1: The Phantom Packet
A hospital’s network is under siege. 
Suspicious packets dart through the system, and vital signs flicker.
 Alex loads an array of packet sizes from the 
 logs. He knows the largest packet size likely holds the key to 
 tracing the intrusion. 
 
 ?  Challenge: Write a Java function that takes an integer array of
 ?  packet sizes and returns the maximum value in that array. 
 
 * Hint: Loop through the array, tracking the largest element. 
* Remember, in Java an array is a container of a fixed number of 
* values of one type​
docs.oracle.com
 – you can use its length to iterate through it.
 */
import java.util.Scanner;
public class challege1 {
    public static void main(String[] args) {
     System.out.println("Enter Size of array");
    Scanner input = new Scanner(System.in);
    int  size = input.nextInt();
    
    System.out.println("Enter the "+size+" of the array");
     int [] array = new int[size];

     for(int i=0;i<size;i++){
        array[i]=input.nextInt();
     }
     System.out.println("Entered array elements :");
     for(int j=0;j<array.length;j++){
       System.out.print(array[j]+" "); 
     }


     
  }
    public static int larr(int size){
        // * k ----> array
        // n ------> size    
        int [] k = new int[size];
        // i-----> itratrator variable 
          
        for (int i=1; i<=size;i++){
                   
          }

          for(int j=1;j<=size;j++){
            System.out.println("Array :"+ k[j]);
          }
      
       return 1;

    }
}


/* 
In the neon glow of Byte City, crime doesn’t take a day off. 
Alex, a whiz-kid coder, is hunched over his triple-monitor setup deep in 
the midnight lab. Her eyes reflecting streams of code, Maya, 
his brilliant partner, scans network traffic for anomalies.
 A sudden alert blares: a shadowy figure has unleashed digital havoc. 
 Together they leap into action, their fingers flying over keyboards as 
 they race through the city’s cyber-underworld.​
 */


/*
 * The clock strikes midnight, but Alex and Maya are wide awake. 
 * In this concrete jungle of code, our nerd heroes fight phishing scams,
 *  malware outbreaks, and encrypted ransom files. 
 * No scheme is too complex, no cipher too tough. 
 * With every puzzle they solve, they step closer to unmasking the
 *  mastermind behind the city’s latest hacking spree.​
 */