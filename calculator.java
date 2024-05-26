import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        System.out.println("STUDENT GRADE CALCULATOR");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of subjects:");
        int numSub=sc.nextInt();
        int total=0;
        int maxMarks=100;
        for(int i=1;i<=numSub;i++)
        {

            System.out.println("enter marks obtained in subject "+i+" out of 100:");
            int marks=sc.nextInt();
            if(marks==0||maxMarks<marks){
                System.out.println("Please enter valid marks");
                i--;
            }else{
                total+=marks;

            }
        }
        int avg=total/numSub;
        System.out.println("total marks obtained = "+total);
        System.out.println("Average of marks=  "+avg);
        char grade;
        if(avg>=90){
            System.out.println("Grade='O'");
        } else if (avg>=75) {
            System.out.println("Grade='A'");
        } else if (avg>=65) {
            System.out.println("Grade='B'");
        } else if (avg>=50) {
            System.out.println("Grade='C'");

        }else {
            System.out.println("Grade='F'");
        }
    }

}
