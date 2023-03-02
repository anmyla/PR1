package typeConversion;

public class Switch {
    public static void main(String[] args) {
        System.out.println(grades(1));
        System.out.println(grades(2));
        System.out.println(grades(3));
        System.out.println(grades(4));
        System.out.println(grades(5));

    }

    private static String grades(int grade) {
        return switch (grade) {
            case 1 -> "Outstanding";
            case 2 -> "Excellent";
            case 3 -> "Acceptable";
            case 4 -> "Passing";
            default -> "Fail";
        };
    }
}
