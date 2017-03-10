package casestudy.io.after;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Created by tie301686 on 2017/03/10.
 */
public class FizzBuzz {

    public static void main(String[] args) throws IOException {
        int num = args.length == 0 ? 15 : Integer.parseInt(args[0]);
        OutputStreamWriter out = new OutputStreamWriter(System.out);
        FizzBuzz fizzBuzz = new FizzBuzz(out);
        fizzBuzz.print(num);
    }


    private final BufferedWriter out;

    public FizzBuzz(Writer out) {
        this.out = new BufferedWriter(out);
    }

    public void print(int until) throws IOException {
        for (int i = 1; i <= until; i++) {
            String val = evaluate(i);
            out.write(val);
            out.newLine();
        }
        out.flush();
    }

    String evaluate(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 15 == 0) {
            return "FizzBuzz";
        } else {
            return String.valueOf(number);
        }
    }
}
