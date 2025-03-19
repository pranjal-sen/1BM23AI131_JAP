import java.util.Scanner;
public class program_3b {
    public static void main(String args[]){
        StringBuffer sb1=new StringBuffer();
        System.out.println("Capacity of StringBuffer object s1: "+sb1.capacity());

        StringBuffer sb2=new StringBuffer("Hello");
        System.out.println("Capacity of StringBuffer object s2: "+sb2.capacity());

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string: ");
        String s3=sc.nextLine();

        StringBuffer reverseBuffer=new StringBuffer(s3);
        reverseBuffer=reverseBuffer.reverse();
        String s4=reverseBuffer.toString().toUpperCase();
        System.out.println("reversed string in upper case: "+s4);

        System.out.println("enter a string to append: ");
        String s5=sc.nextLine();
        reverseBuffer.append(s5);
        System.out.println("String after appending: "+reverseBuffer);


    }
}
