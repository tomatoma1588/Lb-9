public class IntToBinaryString {

    public static String intToBinaryString(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Число не може бути від’ємним.");
        }
        return Integer.toBinaryString(i);
    }

    public static void main(String[] args) {
        try {
            System.out.println(intToBinaryString(21)); // 10101
            System.out.println(intToBinaryString(0));  // 0
            System.out.println(intToBinaryString(255)); // 11111111
            // Демонстрація помилки
            System.out.println(intToBinaryString(-5));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
