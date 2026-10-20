public class ReverseArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Нет аргументов");
            return;
        }
        for (int a = args.length - 1; a >= 0; a--) {
            String str = args[a];
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}