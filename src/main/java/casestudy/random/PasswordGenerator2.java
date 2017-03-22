package casestudy.random;

import java.util.Random;

/** {@link Random}使用箇所をオーバーライドできるようにする。 */
public class PasswordGenerator2 {

    private final Random random = new Random();

    /**
     * パスワードを生成する。
     *
     * @param numberOfChar 文字数
     * @return 生成されたパスワード
     */
    public String generate(int numberOfChar) {
        StringBuilder password = new StringBuilder(numberOfChar);
        for (int i = 0; i < numberOfChar; i++) {
            int rand;
            do {
                rand = generateInt();  // メソッド抽出
            } while (rand <= 0x20 || rand >= 0x7F);
            password.append((char) rand);
        }
        return password.toString();
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
