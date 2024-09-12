//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {}
        public class Rational {
            private long[] r = new long[2]; // Array to store numerator and denominator

            // Constructor to initialize the Rational number
            public Rational(long numerator, long denominator) {
                if (denominator == 0) {
                    throw new IllegalArgumentException("Denominator cannot be zero.");
                }
                r[0] = numerator;
                r[1] = denominator;
                reduce(); // Simplify the fraction upon creation
            }

            // Method to get the numerator
            public long getNumerator() {
                return r[0];
            }

            // Method to get the denominator
            public long getDenominator() {
                return r[1];
            }

            // Method to add another Rational number
            public Rational add(Rational other) {
                long num1 = r[0];
                long den1 = r[1];
                long num2 = other.getNumerator();
                long den2 = other.getDenominator();

                long newNumerator = num1 * den2 + num2 * den1;
                long newDenominator = den1 * den2;

                return new Rational(newNumerator, newDenominator);
            }

            // Method to subtract another Rational number
            public Rational subtract(Rational other) {
                long num1 = r[0];
                long den1 = r[1];
                long num2 = other.getNumerator();
                long den2 = other.getDenominator();

                long newNumerator = num1 * den2 - num2 * den1;
                long newDenominator = den1 * den2;

                return new Rational(newNumerator, newDenominator);
            }

            // Method to multiply by another Rational number
            public Rational multiply(Rational other) {
                long num1 = r[0];
                long den1 = r[1];
                long num2 = other.getNumerator();
                long den2 = other.getDenominator();

                long newNumerator = num1 * num2;
                long newDenominator = den1 * den2;

                return new Rational(newNumerator, newDenominator);
            }

            // Method to divide by another Rational number
            public Rational divide(Rational other) {
                long num1 = r[0];
                long den1 = r[1];
                long num2 = other.getNumerator();
                long den2 = other.getDenominator();

                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }

                long newNumerator = num1 * den2;
                long newDenominator = den1 * num2;

                return new Rational(newNumerator, newDenominator);
            }

            // Method to reduce the Rational number to its simplest form
            private void reduce() {
                long gcd = gcd(r[0], r[1]);
                r[0] /= gcd;
                r[1] /= gcd;
                if (r[1] < 0) {
                    r[0] = -r[0];
                    r[1] = -r[1];
                }
            }

            // Method to compute the greatest common divisor
            private long gcd(long a, long b) {
                while (b != 0) {
                    long temp = b;
                    b = a % b;
                    a = temp;
                }
                return Math.abs(a);
            }

            @Override
            public String toString() {
                return r[0] + "/" + r[1];
            }
        }

    }
