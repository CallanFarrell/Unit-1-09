import java.util.Arrays;
import java.util.Random;
/****************************************************************************
* Created by: Callan Farrell.
* Created on: March 2020
* Created for: ICS4U
* This program randomly generates the marks for 4 students, and their 6
* assignments
****************************************************************************/

public class ClassMarks {
  /****************************************************************************
  * Created by: Callan Farrell.
  ******/ 
  
  public static void main(String[] arg) {
    Random rand = new Random();
    double average;
    double[][] classMarks = new double[4][6];
        
    // Cycles through every student in the class
    for (int students = 0; students < classMarks.length; students++) {
      System.out.printf("Student %s marks  :  ", Integer.toString(students + 1));
            
      // Cycles through each of their assignments
      for (int assignments = 0; assignments < classMarks[students].length; assignments++) {
        classMarks[students][assignments] = rand.nextInt(100) + 1;
        if (assignments < classMarks[students].length - 1) {
          System.out.print(classMarks[students][assignments] + ", ");
        } else {
          System.out.printf("%s%n", classMarks[students][assignments]);
        }
      }
    }

    average = averageMark(classMarks);
    System.out.printf("The class average is %.1f%n",average);
  }

  /****************************************************************************
  * Created by: Callan Farrell.
  */ 
  public static double averageMark(double[][] classMarks) {
    
    double totalSum;
    double totalNumOfElem;
    totalSum = 0.0;
    totalNumOfElem = 0;

    for (int i = 0; i < classMarks.length; i++) {
      for (int j = 0; j < classMarks[0].length; j++) {
        // Adds up the total of all the class marks
        totalSum = totalSum + classMarks[i][j];
        // FInds total length of array
        totalNumOfElem += 1;
      }
    }

    // Finds the average
    double average;
    average = totalSum / totalNumOfElem;
    return average;
  }

}