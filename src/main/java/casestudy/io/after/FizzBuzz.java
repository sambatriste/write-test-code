package casestudy.io.after;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FizzBuzz {

    /**
     * mainメソッド。
     * @param args 第1引数: FizzBuzz実行上限値
     */
    public static void main(String[] args) throws IOException {
        OutputStreamWriter out = new OutputStreamWriter(System.out);
        FizzBuzz fizzBuzz = new FizzBuzz(out);
        fizzBuzz.print(16);
    }

    /** 結果出力先 */
    private final BufferedWriter out;

    /**
     * コンストラクタ
     * @param out 結果出力先
     */
    public FizzBuzz(Writer out) {
        this.out = new BufferedWriter(out);
    }

    /**
     * 指定された値までFizzBuzz結果を表示する。
     *
     * @param until FizzBuzzを実行する上限値
     * @throws IOException 予期しない入出力エラー
     */
    public void print(int until) throws IOException {
        for (int i = 1; i <= until; i++) {
            String val = evaluate(i);
            out.write(val);
            out.write('\n');
        }
        out.flush();
    }

    /**
     * 与えられた数値をFizzBuzz評価する。
     * @param number 評価対象の数値
     * @return 評価結果
     */
    static String evaluate(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
