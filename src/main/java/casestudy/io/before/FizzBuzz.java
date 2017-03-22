package casestudy.io.before;

public class FizzBuzz {

    /**
     * mainメソッド。
     * @param args 第1引数: FizzBuzz実行上限値
     */
    public static void main(String... args) {
        int num = args.length == 0 ? 15 : Integer.parseInt(args[0]);
        for (int i = 1; i <= num; i++) {
            String result;
            if (i % 15 == 0) {
                result = "FizzBuzz";
            } else if (i % 3 == 0) {
                result = "Fizz";
            } else if (i % 5 == 0) {
                result = "Buzz";
            } else {
                result = String.valueOf(i);
            }
            System.out.println(result);
        }
    }
}
