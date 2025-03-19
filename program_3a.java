public class string_functions {
    public static boolean compareStrings(String str1,String str2){
        return str1.equals(str2);
    }
    public static String copyString(String original){
        return new String(original);
    }
    public static String concatenateStrings(String str1, String str2){
        return str1+str2;
    }
    public static void main(String args[]){
        String str1="hello";
        String str2="hello";
        String original="original string";
        System.out.println("String 1 :"+str1);
        System.out.println("String 2 :"+str2);
        System.out.println("original String :"+original+"\n");
        System.out.println("comparison of given Strings 1 and String 2: ");
        System.out.println(compareStrings(str1,str2)+"\n");
        System.out.println("copy of original String: ");
        System.out.println(copyString(original)+"\n");
        System.out.println("concatenation of Strings");
        System.out.println(concatenateStrings(str1,str2));
    }
}
