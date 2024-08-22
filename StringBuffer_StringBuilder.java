//Difference between StringBuffer and StringBuilder is StringBuffer is "Thredsafe" but StringBuilder not a "Thred safe".
public class StringBuffer_StringBuilder {
    public static void main(String[] args){
    StringBuffer buffer = new StringBuffer("Uganesh");
    String sample ="Uganesh";
    System.out.println(buffer);
    buffer.append(" is Author of this Program.");
    System.out.println(buffer); // String Buffer is Immutable
    sample.replace("Uganesh"," Uganesh is Author of this Program.");
    System.out.println(sample); // String is Immutable
    }
}