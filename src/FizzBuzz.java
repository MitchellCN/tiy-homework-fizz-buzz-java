/**
 * Created by cmitchell on 3/9/17.
 */
public class FizzBuzz {
    public void doIt(int start, int end) {
        String fizz = "Fizz";
        String buzz = "Buzz";

        for (int i = start; i <= end; i++) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.println(fizz + buzz);

            } else if ((i % 5) == 0) {
                System.out.println(buzz);

            } else if ((i % 3) == 0) {
                System.out.println(fizz);

            } else {
                System.out.println(i);

            }
        }

    }
}

