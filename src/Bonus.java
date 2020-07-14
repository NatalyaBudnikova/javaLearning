public class Bonus {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 0;
        int actual = service.calculate(999.99F);
        System.out.println(expected == actual);

        expected = 0;
        actual = service.calculate(1000F);
        System.out.println(expected == actual);

        expected = 10;
        actual = service.calculate(1000.01F);
        System.out.println(expected == actual);

        expected = 11;
        actual = service.calculate(1100F);
        System.out.println(expected == actual);

        expected = 0;
        actual = service.calculate(-2000F);
        System.out.println(expected == actual);
    }
}
