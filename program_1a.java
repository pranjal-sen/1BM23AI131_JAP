import java.util.Scanner;

public class Main {
    public static void display(String name, int age, Boolean isActive, int months, double fee) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership Status: " + isActive);
        System.out.println("Duration: " + months);
        System.out.println("Fee: " + fee);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        Double fee;
        int duration;
        boolean isActive;
        System.out.print("Enter name :");
        name = in.nextLine();
        System.out.print("Enter age :");
        age = in.nextInt();
        System.out.print("Enter Activation state :");
        isActive = in.nextBoolean();
        System.out.print("Enter duration in months :");
        duration = in.nextInt();
        fee = duration * 50.0;
        display(name, age, isActive, duration, fee);
    }
}
