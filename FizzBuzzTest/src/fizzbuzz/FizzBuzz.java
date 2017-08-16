package fizzbuzz;

public class FizzBuzz {

    private static final int START_VALUE = 1;
    private static final int END_VALUE = 100;

    public static String fizzBuzzResult(int input) {
        boolean multipleOfThree = ((input % 3) == 0);
        boolean multipleOfFive = ((input % 5) == 0);

        if (multipleOfThree && multipleOfFive) {
            return "FizzBuzz";
        }
        else if (multipleOfThree) {
            return "Fizz";
        }
        else if (multipleOfFive) {
            return "Buzz";
        }
        return String.valueOf(input);
    }

    public static String fizzBuzzOutput() {
        StringBuilder output = new StringBuilder();

        for (int i = START_VALUE; i <= END_VALUE; i++) {
            output.append(fizzBuzzResult(i));

            if (i < END_VALUE) {
                output.append(", ");
            }
        }

        return output.toString();
    }

    public static final void main(String[] args) {
        System.out.println(fizzBuzzOutput());
    }
}
