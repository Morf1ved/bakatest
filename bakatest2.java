public class bakatest2 {

    public static void main(String[] args) throws Exception {
        System.out.println("Bakatest 0.2 not all rights unreserved");
        var greeting = IO.readln("Hello userchan, what's your name?");
        System.out.println("Welcome to your own schizophrenic fantasions" + greeting);
        var answer = IO.readln("are you a baka(y/n)?");
        
        if (answer.equalsIgnoreCase("n")) {
            System.out.println("congatilations!" + answer);
        } else if (answer.equalsIgnoreCase("y")) {
            System.out.println("i always knew");
        } else {
            System.out.println("that wasn't y or n, baka");
        }
    }
}
