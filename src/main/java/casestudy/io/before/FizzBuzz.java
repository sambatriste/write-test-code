package casestudy.io.before;

/**
 * Created by tie301686 on 2017/03/10.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        int num = args.length == 0 ? 15 : Integer.parseInt(args[0]);
        for (int i = 1; i <= num; i++) {
            String out;
            if (i % 3 == 0) {
                out = "Fizz";
            } else if (i % 5 == 0) {
                out = "Buzz";
            } else if (i % 15 == 0) {
                out = "FizzBuzz";
            } else {
                out = String.valueOf(i);
            }
            System.out.println(out);
        }
    }
}
