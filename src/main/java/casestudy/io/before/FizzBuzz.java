package casestudy.io.before;

public class FizzBuzz {

    /**
     * mainメソッド。
     * @param args 第1引数: FizzBuzz実行上限値
     */
    public static void main(String... args) {
        for (int i = 1; i <= 16; i++) {
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
