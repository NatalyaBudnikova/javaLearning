public class BonusService {
    public int calculate(float amount) {
        int result = 0;

        if (amount > 1000) {
            result = (int) amount / 100;
        }
        return result;
    }
}
