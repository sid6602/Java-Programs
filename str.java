 public class str{
 public static void main(String[] args) {
 String txt = "          Hello myself vaishnavi.I am a engineering student.";
 System.out.println(txt.indexOf("myself"));
 System.out.println(txt.toUpperCase());
 System.out.println(txt.toLowerCase());
 System.out.println(txt.trim());

 int code = txt.codePointAt(0);
 
 System.out.println(code);

 String mess = "I like to code";
   
System.out.println(txt.concat(mess));
System.out.println(txt.endsWith("t")); 
System.out.println(txt.hashCode()); 
System.out.println(txt.startsWith("h"));   
System.out.println(txt.isEmpty());
}
}







