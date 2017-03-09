package casestudy.random;

import java.util.Random;

/**
 * Created by tie301686 on 2017/03/09.
 */
public class PasswordGenerator2 {

    private final Random random = new Random();

    /**
     * パスワードを生成する。
     *
     * @param numberOfChar
     *            文字数
     * @return 生成されたパスワード
     */
    String generate(int numberOfChar) {
        StringBuilder generated = new StringBuilder(numberOfChar);
        for (int i = 0; i < numberOfChar; i++) {
            int rand;
            do {
                rand = generateInt();
            } while (rand <= 0x20 || rand >= 0x7F);
            generated.append((char) rand);
        }
        return generated.toString();
    }

    /**
     * 数値を生成する。
     *
     * @return 数値
     */
    protected int generateInt() {
        return random.nextInt();
    }
}
