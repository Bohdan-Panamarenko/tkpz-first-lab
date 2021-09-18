public class EleventhTask {
    public static void main(String []args) {
        if (args.length < 1) {
            System.out.println("Not enough arguments");
            return;
        }

        int initialNum = Integer.parseInt(args[0]);
        if (initialNum < 0) {
            System.out.println("Wrong argument. Can't be less than 0");
            return;
        }
        else if (initialNum > 25) {
            System.out.println("Wrong argument. Can't be more than 25");
            return;
        }
        long result = 1;


        for (int num = initialNum; num > 0; num--) {
            result *= num;
        }

        System.out.println("Given: " + initialNum);
        System.out.println("Result: " + result);
    }
}
