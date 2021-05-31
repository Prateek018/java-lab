import java.util.*; 
public class prateek
{ public static void main(String args[]) { 
String s="Technology"; 
String s1="goodmorning"; 
String s2=s.concat(s1); //concat method 
String s3="GOODMORNING"; 
String s4=" yes "; 
String s5=""; 
System.out.println(s.toUpperCase()); //upperCase method 
System.out.println(s.toLowerCase()); //lowerCase method 
System.out.println(s2); 
System.out.println(s.length()); //length of string 
char ch=s.charAt(4); //charactered at index method 
System.out.println(ch); 
System.out.println(s.equals(s1)); //equals method 
System.out.println(s5.isEmpty()); //empty method 
System.out.println(s.indexOf('c')); //indexOf method 
System.out.println(s1.replace('o','r')); //replace method 
System.out.println(s4.trim()); 
System.out.println(s1.equalsIgnoreCase(s3)); //equal ignore case method 
} 
} 
