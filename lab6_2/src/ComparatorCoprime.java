public class ComparatorCoprime implements Comparable{
    @Override
    public boolean match(int number1, int number2) {
        if (gcd(number1, number2) == 1) return true;
        else return false;
    }

    int gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
