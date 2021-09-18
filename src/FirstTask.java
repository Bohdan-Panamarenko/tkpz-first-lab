public class FirstTask {
    public static void main(String []args) {
        if (args.length < 3) {
            System.out.println("Not enough arguments");
            return;
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double avg = (a + b + c) / 3;
        System.out.println("Average: " + avg);
        System.out.println("Closest integer: " + Math.round(avg));
    }
}