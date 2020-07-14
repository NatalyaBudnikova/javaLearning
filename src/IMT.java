public class IMT {
    public static void main(String[] args) {
        IMTService service = new IMTService();

        String expected = "Lack of weight";
        String actual = service.calculate(41.5F, 1.55F);
        System.out.println(expected.equals(actual));

        expected = "Extreme weight loss";
        actual = service.calculate(-41.5F, -1.55F);
        System.out.println(expected.equals(actual));

        expected = "Obesity (Class III)";
        actual = service.calculate(181.5F, 1.55F);
        System.out.println(expected.equals(actual));

    }
}
