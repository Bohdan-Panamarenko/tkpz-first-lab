public class SixthTask {
    public static void main(String []args) {
        if (args.length < 3) {
            System.out.println("Not enough arguments");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int angle = Integer.parseInt(args[2]);

        double area = a * b * Math.sin(Math.toRadians(angle)) / 2;
        System.out.println("First side: " + a);
        System.out.println("Second side: " + b);
        System.out.println("Angle: " + angle + "deg");
        System.out.println("--------------------");
        
        System.out.println("Area: " + area);
    }
}