import java.util.Scanner;
public class program_4a {
    public enum DayOfWeek{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        FRIDAY,
        SATURDAY;

        public boolean isWorkday(){
            return (this!=SATURDAY&&this!=SUNDAY);
        }
    }
    public static void main(String args[]){
        System.out.println("Is Monday a workday? "+DayOfWeek.MONDAY.isWorkday());
    }
}