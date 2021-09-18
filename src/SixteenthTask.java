public class SixteenthTask {
    public static void main(String []args) {
        if (args.length < 2) {
            System.out.println("Not enough arguments");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a < 0 || b < 0) {
            System.out.println("Wrong argument. Can't be less than 0");
            return;
        }
        double diag = Math.sqrt(a * a + b * b);
        int perim = 2 * a + 2 * b;

        System.out.println("Sides: " + a + " " + b);
        System.out.println("Diagonal: " + diag);
        System.out.println("Perimeter: " + perim);
    }
}
