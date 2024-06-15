import java.util.Scanner;
/**
 * StudentGradeCalculator
 */
public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking input for the number of subjects
        System.out.println("Enter the umber of subjects:");
        int n=sc.nextInt();
        //taking input the marks of each subject
        int totalMarks=0;
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter marks for subject "+(i+1)+": ");
            arr[i]=sc.nextInt();
            totalMarks+=arr[i];
        }
        //calculating average percentage
        double AveragePercentage=(double)(totalMarks/n);
        //calculating grade
        String grade;
        if(AveragePercentage>=90){
            grade="A";
        }
        else if(AveragePercentage>=80){
            grade="B";
        }
        else if(AveragePercentage>=70){
            grade="C";
        }
        else if(AveragePercentage>=60){
            grade="D";
        }
        else if(AveragePercentage>=50){
            grade="E";
        }
        else{
            grade="F";
        }
        //Display results
        System.out.println("The total marks is: "+totalMarks);
        System.out.println("Average Percentage is: "+AveragePercentage);
        System.out.println("Grade got : "+grade);
     }
}
