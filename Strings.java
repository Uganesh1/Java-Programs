public class Strings{
    public static void main(String[] args){
        // String in java 
        String a = "Uganesh is a Author.";
        String b = "  uganesh       ";
        a=a.trim().toLowerCase();
        b=b.trim().toLowerCase();
        System.out.println(" A : "+a);
        System.out.println(" A : "+b);
        System.out.println(" A HashCode :"+a.hashCode());
        System.out.println(" B HashCode :"+b.hashCode());
        System.out.println(" A Equals to B : "+a.equals(b));
        System.out.println(" A Equals to B : "+a.equalsIgnoreCase(b));
        System.out.println(" Replace :"+a.replace("author", "Author of this program"));
        System.out.println(" Is 'A' Contais  'Uganesh' : "+a.contains("uganesh"));
        System.out.println(" Is 'A' is Emplty : "+a.isEmpty());
        System.out.println(" Is 'A' is Start With 'Uganesh'"+a.startsWith("uganesh"));
        System.out.println(" Is 'A' is Ends with '.' : "+a.endsWith("."));
        System.out.println("SubString of 'A' : "+a.substring(0,7));
        System.out.println(" SubString of 'A' : "+a.substring(13));
        char[] carry = a.toCharArray();
        for( char c : carry){
            System.out.println(c);
        }
    }
}