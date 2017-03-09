package casestudy.random;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by tie301686 on 2017/03/09.
 */
public class PasswordGenerator3 {
    private final Iterator<Integer> integerIterator;

    public PasswordGenerator3() {
        this(new RandomIntegerIterator());
    }

    PasswordGenerator3(Iterator<Integer> integerIterator) {
        this.integerIterator = integerIterator;
    }

    String generate(int numberOfChar) {
        StringBuilder generated = new StringBuilder(numberOfChar);
        for (int i = 0; i < numberOfChar; i++) {
            int rand;
            do {
                rand = integerIterator.next();
            } while (rand <= 0x20 || rand >= 0x7F);
            char c = (char) rand;
            generated.append(c);
        }
        return generated.toString();
    }

    static class RandomIntegerIterator implements Iterator<Integer> {

        private final Random random = new Random();

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt();
        }
    }
}
