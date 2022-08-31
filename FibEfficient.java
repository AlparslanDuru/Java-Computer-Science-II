import java.util.Scanner;

public class FibEfficient {
// WRITE YOUR CODE HERE

static long fibNumbers[];

public static long fib(int n)
{
    if (n<2)
        return n;

    if (fibNumbers == null)
    {
        fibNumbers = new long [2];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;
    }

    if (fibNumbers.length > n)
        return fibNumbers[n];

    long temp[] = new long[n+1];

    System.arraycopy(fibNumbers, 0, temp, 0, fibNumbers.length);

    for (int i=fibNumbers.length; i<n+1; i++ )
    {
        temp[i] = temp[i-1] + temp[i-2];
    }

    fibNumbers = temp;
    return fibNumbers[n];

}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int inputCount = input.nextInt();
    for (int i = 0; i < inputCount; i++) {
        int n = input.nextInt();
        System.out.println(fib(n));
    }
}

}
