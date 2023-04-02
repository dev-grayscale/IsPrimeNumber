/**
 * By definition, every number greater than 1 that has no other divisors than 1 and itself is considered prime.
 * 1 is considered neither prime nor composite.
 */
public class Main {

  /**
   * The first approach checks every number >= 1 and <= input and increments the factors value when input is divisible by a number of the sequence without remainder.
   * If the factors count is exactly 2 at the end, the input number is prime, otherwise not.
   *
   * Time Complexity O(n)
   * Space Complexity O(1)
   */
  public static boolean isPrimeV1(int input) {
    int factors = 0;

    for (int i = 1; i <= input; i++) {
      if (input % i == 0) {
        factors++;
      }
    }

    return factors == 2;
  }

  /**
   * Considering the fact that each number bigger than 1 is divisible by 1 and itself without remainder,
   * it's not necessary to include those numbers in the primality checks at all.
   * The check against factors == 2 at the end is now useless as well. Instead, if we encounter only 1 factor - the number is composite, otherwise not.
   *
   * <ol>
   *   <li>The case when input is 0 or 1 should be handled accordingly</li>
   * </ol>
   *
   * Time Complexity O(n)
   * Space Complexity O(1)
   */
  public static boolean isPrimeV2(int input) {
    if (input < 2) {
      return false;
    }

    for (int i = 2; i < input; i++) {
      if (input % i == 0) {
        return false;
      }
    }

    return true;
  }

  /**
   * This version optimizes the primality check by verifying only numbers less than the square root of the input number.
   * The approach will hold because when all possible divisors up to n/2 are tested, some factors will be discovered twice. A conclusion could be drawn so that
   * all unique divisors of n are numbers less than or equal to the square root of the input number.
   *
   * All even numbers > 2 can also be eliminated. If an even number > 2 can divide the input without remainder, so can 2, which significantly reduces the
   * numbers in the primality check in case the input is odd.
   */
  public static boolean isPrimeV3(int input) {
    if (input < 2) {
      return false;
    }

    if (input > 2 && input % 2 == 0) {
      return false;
    }

    for (int i = 3; i <= Math.sqrt(input); i+=2) {
      if (input % i == 0) {
        return false;
      }
    }

    return true;
  }

  /**
   * Here is a ~3x faster algorithm compared to the one above. Considering the fact that all integers could be expressed as (6k + i) where i = -1,0,1,2,3,4
   * and that 2 divides (6k + 0),(6k + 2),(6k + 4) and 3 divides (6k + 3).. All the numbers divisible by 2 and 3 without remainder are eliminated, and we only need to check
   * (6k - 1),(6k + 1) sequences up until square root of the input number (inclusive), as long as they are positive.
   *
   * The first number we need to check is 5 (6k - 1 => 6x1 - 1 => 5), followed by (6k + 1 => 6x1 + 1 => 7) and by doing the same operations for the next few numbers
   * we arrive at the following pattern: 5,7 -> 11,13 -> 17,19, etc...
   *
   * Two rules can be inferred out of the pattern.
   *
   * <ol>
   *   <li>A check for primality for the 1st index and the 2nd (which is always +2 bigger than the 1st one), if possible</li>
   *   <li>After the 2 indexes from the previous point, the index is incremented with 6 to reach the next sequence of interest</li>
   * </ol>
   *
   * All we need to do then is initialize the loop index at 5 and at each cycle get the current and the next number (which will be i + 2), check if the next number
   * does not exceed the sqrt and if any of them is a factor of the input - it's composite, otherwise we increment the i with 6 to jump to the next sequence we are interested in
   * and repeat the steps until a result is returned.
   */
  public static boolean isPrimeV4(int input) {
    if (input < 2) {
      return false;
    } else if (input == 2 || input == 3) {
      return true;
    }

    if (input % 2 == 0 || input % 3 == 0) {
      return false;
    }

    int sqrt = (int) Math.sqrt(input);
    int next;

    for (int i = 5; i <= sqrt; i += 6) {
      next = i + 2;
      if (input % i == 0 || (next < sqrt && input % next == 0)) {
        return false;
      }
    }

    return true;
  }
}
