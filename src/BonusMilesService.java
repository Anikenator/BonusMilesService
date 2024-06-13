public class BonusMilesService {
    public int calculate(int price) {
        int bonusMiles = 1;
        int rubles = 20;
        int result = price * bonusMiles / rubles;

        return result;
    }
}
