package day5;

import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Logger;

public class StringClassPractice {
    public static void main(String[] args) {
//        String name = "ABC";
//        Logger.getGlobal().info(name.toLowerCase());

        //String Methods
//        String greetings = "Hello";
//        String substring = greetings.substring(1);
//        Logger.getGlobal().info(substring);
//
//        //greetings.substring()
//        String substring1 = greetings.substring(1,4);
//        Logger.getGlobal().info(substring1);
//        Logger.getGlobal().info(greetings.substring(1, 3));

        //greeting.length()
//        Logger.getGlobal().info(String.valueOf(greetings.length()));

        // greeting.charAt(2) --> it return character at a given index position
        // Logger.getGlobal().info(String.valueOf(greetings.charAt(2)));

        // compareTo() --> compare two strings -- based on ASCI value
        /*
        ASCI values to remember
        - A-Z -> 65-90
        - a-z -> 97-122
        - 0-9 -> 48-57
         */

//        int compareOutput = "Hello".compareTo("Hello");
//        Logger.getGlobal().info(String.valueOf(compareOutput));
//
//        int compareOutput1 = "Hello".compareTo("hello");
//        Logger.getGlobal().info(String.valueOf(compareOutput1));
//
//        int compareOutput2 = "A".compareTo("B");
//        Logger.getGlobal().info(String.valueOf(compareOutput2));

//        int compareOutPut = "a".compareTo("A");
//        Logger.getGlobal().info(String.valueOf(compareOutPut));
//
//        int compareOutputIgnoreCasing = "a".compareToIgnoreCase ("A");
//        Logger.getGlobal().info(String.valueOf(compareOutputIgnoreCasing));
//
        //greetings.toLowerCase() --> it returns  a new string which has all the lowercase characters form the sting provided.
//        String greet = "Hello".toLowerCase();
//        Logger.getGlobal().info(String.valueOf(greet));

        //greetings.toUpperCase() --> returns a new string which has all the upper case character
//        Logger.getGlobal().info(String.valueOf(greetings.toUpperCase()));

        //.concat() --> concatenating string
//        String concatenatedString = "Hello " + "Java Student";
//        Logger.getGlobal().info(String.valueOf(concatenatedString));
//
//        String concatenatedString1 = "Hello ".concat("Java Student");
//        Logger.getGlobal().info(String.valueOf(concatenatedString1));

        //.contains
//        String str = "Java student from Nepal";
//        Logger.getGlobal().info(String.valueOf(str.contains("java")));
//        Logger.getGlobal().info(String.valueOf(str.contains("Java")));

        //.equals --> return true if the given string is equal to the provided string false otherwise(case sensitive)
//        String address = "Texas";
//        Logger.getGlobal().info(String.valueOf(address.equals("Texas")));
//        Logger.getGlobal().info(String.valueOf(address.equals("texas")));

        //.equalsIgnoreCase --> Returns true if two strings are equal ignoring the case of character
//        String address = "Texas";
//        Logger.getGlobal().info(String.valueOf(address.equalsIgnoreCase("texas")));
//        Logger.getGlobal().info(String.valueOf(address.equalsIgnoreCase("Alabama")));

        //.format
//        String formattedString = String.format("Hello %s, Welcome to this class", "Subina");
//        Logger.getGlobal().info(String.valueOf(formattedString));
//        Logger.getGlobal().info(String.valueOf(String.format("Hello %s, Welcome to this class", "Subina")));

        //isBlank and isEmpty
        String empty = "  ";
//        Logger.getGlobal().info(String.valueOf(empty.length()));
//        Logger.getGlobal().info(String.valueOf(empty.isBlank())); //it ignores white space, so it throws true if there is no character or other value
//        Logger.getGlobal().info(String.valueOf(empty.isEmpty())); // this look at the length and if it is not 0 then it throws false use blank

        // .trim --> returns a new string after removing all the leading and trailing spaces from the original String
//        String message = "              This is a wonderful day!";
//        Logger.getGlobal().info(String.valueOf(message.trim()));
//        Logger.getGlobal().info(message);

        // .split()
        String splitPractice = "Hello Java Students";
        String[] splitedString = splitPractice.split(" ");
        String[] splitedString1 = splitPractice.split(",");
        for (String s:splitedString){
            System.out.println(s);
        }
        Logger.getGlobal().info(String.valueOf(splitedString.length));
        Logger.getGlobal().info(String.valueOf(splitedString1.length));  //consider 1 while splitting by comma

        //.startsWith() --> returns true if name starts with string "..."
//        String exercise = "Everyday";
//        Logger.getGlobal().info(String.valueOf(exercise.startsWith("S")));
//        Logger.getGlobal().info(String.valueOf(exercise.startsWith("Eve")));
//        Logger.getGlobal().info(String.valueOf(exercise.startsWith("EVe")));

        //.endsWith() --> returns true if name ends with string "..."
//        String exercise = "Everyday";
//        Logger.getGlobal().info(String.valueOf(exercise.endsWith("day")));
//        Logger.getGlobal().info(String.valueOf(exercise.endsWith("daY")));
//        Logger.getGlobal().info(String.valueOf(exercise.endsWith("y")));

        //.replace("r", "p") --> return a new string after replacing r with p.
//        String exercise = "Everyday";
//        Logger.getGlobal().info(String.valueOf(exercise.replace("E", "Q")));
//        Logger.getGlobal().info(String.valueOf(exercise.replace("Every", "All")));

        //.indexOf(r) --> return the index of given String
//        String exercise = "Everyday";
//        Logger.getGlobal().info(String.valueOf(exercise.indexOf("e")));
//        Logger.getGlobal().info(String.valueOf(exercise.lastIndexOf("y")));
//        Logger.getGlobal().info(String.valueOf(exercise.lastIndexOf("y",2)));

        String joinExample = String.join("/", "S", "L", "XL", "XXL");
        Logger.getGlobal().info(joinExample);

        // changing upperCase to lowerCase and vice versa
        String s1 = "United States of America";
        String s = "";
        for (int i =0; i<s1.length(); i++){
            char c = s1.charAt(i);
            int ic = (int) c;

            if (ic>=65 && ic<=90)
                s+= (char) (ic+32);
            else if (ic>=97 && ic<=122)
                s+= (char)(ic-32);
            else
                s+=c;
        }
        System.out.println(s);

        // String to char Array
        char[] c = s1.toCharArray();
        for (char ch : c){
            System.out.print(ch + " ");
        }
        System.out.println("\n");
        // to reverse the string
        int l = c.length;
        int n = Math.floorDiv(l, 2);
        char temp;

        for (int i=0; i<n; i++){
            temp = c[i];
            c[i] = c[l-1-i];
            c[l-1-i]  = temp;
        }
        for (char ch : c){
            System.out.print(ch + " ");
        }
        System.out.println("\n");

        //StringTokenizer
        String s2 = "United States of America and United States of Arab";
        StringTokenizer st = new StringTokenizer(s2, " ");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        // another example of StringTokenizer
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTime());

        StringTokenizer st1 = new StringTokenizer(c1.getTime().toString()," :");
        int size = st1.countTokens();
        String[] sarr = new String[size];
        int i =0;
        while (st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
            i++;
        }
        for (String token : sarr){
            System.out.println(token);
        }

        // String multiline input
        /*InputStreamReader isr = new InputStreamReader(System.in);
        System.out.println("Enter some line of data");
        try{
            int x = isr.read();
            String s5 = "";
            while (x!= -1){
                s5 += (char)x;
                x = isr.read();
            }
            System.out.println("You have enter following input: \n" + s.toUpperCase());

        }catch (Exception e){
            e.printStackTrace();
        }

         */
        // should learn File readline from the folder from Eclipse folder
    }
}
