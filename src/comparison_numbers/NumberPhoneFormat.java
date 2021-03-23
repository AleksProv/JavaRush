package comparison_numbers;

public class NumberPhoneFormat {
    public static void main(String[] args) {
        // +38(050)123-45-67
        int a = 38;
        int b = 501234567;
        String result = String.format("+%d(%2$s)%3$s-%4$s-%5$s", a,
                String.format("%010d", b).substring(0, 3),
                String.format("%010d", b).substring(3, 6),
                String.format("%010d", b).substring(6, 8),
                String.format("%010d", b).substring(8));
        System.out.println(result);
    }
}
