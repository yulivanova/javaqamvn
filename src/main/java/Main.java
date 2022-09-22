public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1000, true);
        System.out.println(expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(1_000_000, true);
        System.out.println(expected + " == ? == " + actual);
    }
}