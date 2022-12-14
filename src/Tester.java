public class Tester {
    public static void main(String[] args) {
        String string = "x3z ? xYz ! R1 && __";
        string = string.replaceAll("[a-z]|[0-9]", "*");
        System.out.println("result  : " + string);

        //System.out.println("correct : *** ? *Y* ! R* && __");
        //System.out.println("initial : x3z ? xYz ! R1 && __");
    }
}
