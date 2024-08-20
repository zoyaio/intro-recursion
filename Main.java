import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(recurs(5));

        Doll zoyaDoll = new Doll(10);
        Doll babyDoll = Doll.unbox(zoyaDoll);
        System.out.println(babyDoll.size);

    }

    /**
     * Function to recursively add numbers n through 10. Does not permit values of n > 10.
     * @param n initial number to add
     * @return the result of addition, the number 10.
     */
    public static int recurs(int n) {
        // base case
        if (n >= 10) {
            return n;
        }
        // recursive function call: changing/incrementing the input
        return recurs(n + 1);
    }
}



