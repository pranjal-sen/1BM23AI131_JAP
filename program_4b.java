import java.util.Scanner;
class Student{
    int marks;
}
public class program_4b {
    public static void main(String args[]){
        final int NUM_STUDENTS=5;
        Student  obj[] = new Student[NUM_STUDENTS];\
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter exam scores:");
        for (int i=0;i<NUM_STUDENTS;i++){
            obj[i]= new Student();
            System.out.println("Enter scores of student "+(i+1)+":");
            obj[i].marks=sc.nextInt();
            System.out.println("student "+(i+1)+" marks is : "+ obj[i].marks);
        }
        int sum=0;
        int highest=obj[0].marks;
        for(int i=0;i<NUM_STUDENTS;i++){
            sum+=obj[i].marks;
            if (obj[i].marks>highest) {
                highest = obj[i].marks;
            }
        }
        double average=sum/NUM_STUDENTS;
        System.out.println("Sum of scores : "+sum);
        System.out.println("Average of scores : "+average);
        System.out.println("Highest score : "+highest);
    }
}
