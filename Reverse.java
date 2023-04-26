public class Reverse{
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        System.out.println("Reversed string: " + reversedString);
    }
}
