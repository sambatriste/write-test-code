package casestudy.random;

import java.util.Random;

/** 数値の生成を抽象化する */
public class PasswordGenerator4 {

    /** 数値ジェネレータ */
    interface NumberGenerator {
        int next();
    }

    /** 数値を生成するクラス */
    private final NumberGenerator generator;

    public PasswordGenerator4() {
        this(new RandomIntegerIterator());
    }

    PasswordGenerator4(NumberGenerator integerIterator) {
        this.generator = integerIterator;
    }

    public String generate(int numberOfChar) {
        StringBuilder password = new StringBuilder(numberOfChar);
        for (int i = 0; i < numberOfChar; i++) {
            int rand;
            do {
                rand = generator.next();
            } while (rand <= 0x20 || rand >= 0x7F);
            char c = (char) rand;
            password.append(c);
        }
        return password.toString();
    }

    /** 乱数を使用した数値ジェネレータ */
    static class RandomIntegerIterator implements NumberGenerator {

        private final Random random = new Random();

        @Override
        public int next() {
            return random.nextInt();
        }
    }
}
