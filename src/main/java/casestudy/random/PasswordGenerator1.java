package casestudy.random;

import java.util.Random;

public class PasswordGenerator1 {
    private final Random random = new Random();

    /**
     * パスワードを生成する。
     * @param numberOfChar 文字数
     * @return 生成されたパスワード
     */
    String generate(int numberOfChar) {
        StringBuilder password = new StringBuilder(numberOfChar);
        for (int i = 0; i < numberOfChar; i++) {
            int rand;
            do {
                rand = random.nextInt();
            } while (rand <= 0x20 || rand >= 0x7F);
            password.append((char) rand);
        }
        return password.toString();
    }
}
