package casestudy.random;

import java.util.Random;

/** {@link Random}インスタンスを外部から渡せるようにする */
public class PasswordGenerator3 {

    private final Random random;

    public PasswordGenerator3() {
        this(new Random());
    }

    PasswordGenerator3(Random random) {
        this.random = random;
    }

    /**
     * パスワードを生成する。
     *
     * @param numberOfChar
     *            文字数
     * @return 生成されたパスワード
     */
    public String generate(int numberOfChar) {
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
