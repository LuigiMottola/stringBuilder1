public class Main {
    public static void main(String[] args) {
        String test1 = "Hello";
        String test2 = "World";

        stringComparer(test1, test2);

    }
    public static void stringComparer(String string1, String string2){
        StringBuilder stringResult = new StringBuilder("The two strings are ");
        int comparisonIndex = string1.compareTo(string2);
        if (comparisonIndex == 0){
            stringResult.append("equals");
        } else {
            stringResult.append("not equals");
        }
        System.out.println(stringResult);
    }
}
