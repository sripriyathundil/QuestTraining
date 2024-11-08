package com.quest.practice_vars;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World!";
        String str2 = "hello world!";
        //length()
        int length = str.length();
        System.out.println("Length of string is: " + length);
        //charAt()
        char ch = str.charAt(5);//find character at particular position
        System.out.println("Character of string at 5th position: " + ch);
        //.equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase(str2));//ignore all cases and compare strings
        //index()
        int index = str.indexOf("Hello");
        System.out.println("Index of 'hello': " + index);//replace a text with other text
        //replace()
        String modifiedText = str.replace("World!", "Folks!");
        System.out.println("Modified text is: " + modifiedText);
        //substring()
        String subString = str.substring(1, 8);//substring begins at index 1 and ends at index 8
        System.out.println("SubString of string is: " + subString);
        //toUpperCase() and toLowerCase()
        String str3 = str.toUpperCase();
        System.out.println("New string is: " + str3);
        String str4 = str.toLowerCase();
        System.out.println("New string is: " + str4);
        //trim()
        String input = "  Java Programming  ";
        System.out.println("Input is: " + input);
        String trimmedText = input.trim(); //removes leading and trailing white spaces from the string
        System.out.println("Trimmed text is: " + trimmedText);
        //contains()
        boolean contains = str.contains("World");
        System.out.println("Contains string is: " + contains);//to check if particular sequence of character is present in the string
        //startsWith() and endsWith()
        boolean startsWith = str.startsWith("Hello");
        boolean endsWith = str.endsWith("!");
        System.out.println("StartsWith 'Hello': " + startsWith);//check if string starts with hello
        System.out.println("EndsWith !: " + endsWith);// check if string ends with !
        //getBytes()
        byte[] byteArray = str.getBytes();//encodes the string into a sequence of bytes using the platform's default charset and returns the resulting byte array.
        System.out.println("Byte array is: " + byteArray);
        //getChars()
        char[] charArray = new char[str.length()];
        str.getChars(0, str.length(), charArray, 0);//copies characters from the string into an array of characters.
        System.out.println("Char array is: " + charArray);
        //isEmpty()
        String s1 = "";
        boolean isEmpty = str.isEmpty(); // check if the string is empty or not and return boolean value
        System.out.println("Is the string empty?: " + isEmpty);
        boolean isEmpty2 = s1.isEmpty();
        System.out.println("Is the string empty?: " + isEmpty2);
        //join()
        String words[] = {"Java","Programming","Language"};
        String joinedString = String.join(" ", words); // joins the elements of an iterable using the specified delimiter.
        System.out.println("Joined string is: " + joinedString);
        //format()
        String formattedString = String.format("Hello %s!", joinedString);//formats a string using the specified format string and arguments.
        System.out.println("Formatted string is: " + formattedString);
        //subSequence()
        CharSequence subSequence = joinedString.subSequence(2, 7); //returns a new character sequence that is a subsequence of this sequence.
        System.out.println("SubSequence is: " + subSequence);
        //hashCode()
        int hashCode = joinedString.hashCode(); //provide with the hashed code of the particular string
        System.out.println("HashCode is: " + hashCode);
        //value() and toString()
        int num = 123;
        String newString = String.valueOf(num);//convert to string :toString() is used to convert a string to new string ,
        // valueOf() method converts different types of data, such as int, char, boolean, etc., to strings.
        System.out.println("New string is: " + newString);
        int len = newString.length();
        System.out.println("New string is: " + len);
        //concat()
        String concatenatedString = str.concat("Welcome"); // concatenate welcome to string str
        System.out.println("Concatenated string is: " + concatenatedString);
    }
}
//Different datatypes
//Primitive datatypes                                               Non Primitive datatypes
//Boolean : bool                                                        Array
//Character : char                                                      Class
//Integer : byte , short , int , long                                   Interfaces
//Float : float , double                                                String
//                                                                      Enum