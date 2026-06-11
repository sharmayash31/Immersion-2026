public class RemoveVowels{
    public static void main(String[] args){
        String name = "YASH";
        String result = name.replaceAll("[AEIOUaeiou]", "");
        System.out.println(result);
    }
}