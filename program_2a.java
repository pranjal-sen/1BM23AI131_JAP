import java.lang.Integer;
import java.lang.Character;
import java.lang.Byte;
import java.lang.Float;
import java.lang.Double;
import java.lang.Boolean;
import java.lang.Short;
import java.lang.Long;

public class program_2a {


    public static void main(String[] args) {

        int i =  10;
        char c = 'a';
        byte b = 127;
        float f = 3.14f;
        double d = 1.23456789;
        boolean bool = true;
        short s = 127;
        long l = 10000L;

        //Autoboxing
        Integer j =  i;
        Character ch = c;
        Byte by = b;
        Float g = f;
        Double dd = d;
        Boolean boo = bool;
        Short sh = s;
        Long lon = l;

        //Unboxing
        int j1 = j;
        char ch1 = ch;
        Byte by1 = by;
        Float f1 = g;
        Double dd1 = dd;
        Boolean bool1 = boo;
        Short sh1 = sh;
        Long lon1 = lon;

        //Displaying Items
        System.out.println("Autoboxed Values:");
        System.out.println("Integer: " + j);
        System.out.println("Byte: " + by);
        System.out.println("Float: " + g);
        System.out.println("Character: " + ch);
        System.out.println("Short: " + sh);
        System.out.println("Long: " + lon);
        System.out.println("Boolean: " + boo);
        System.out.println("Double: " + dd);

        System.out.println("\nUnboxed Values:");
        System.out.println("int: " + j1);
        System.out.println("byte: " + by1);
        System.out.println("float: " + f1);
        System.out.println("char: " + ch1);
        System.out.println("short: " + sh1);
        System.out.println("long: " + lon1);
        System.out.println("boolean: " + bool1);
        System.out.println("double: " + dd1);

    }

}

/*
Autoboxed Values:
Integer: 10
Byte: 127
Float: 3.14
Character: a
Short: 127
Long: 10000
Boolean: true
Double: 1.23456789

Unboxed Values:
int: 10
byte: 127
float: 3.14
char: a
short: 127
long: 10000
boolean: true
double: 1.23456789
 */