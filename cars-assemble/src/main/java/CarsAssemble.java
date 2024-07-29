public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int carsPerHour = 221;
        if (speed == 10) {
            return .77 * speed * carsPerHour;
        } else if (speed == 9) {
            return .8 * speed * carsPerHour;
        } else if (speed >= 5 && speed <= 8) {
            return .9 * speed * carsPerHour;
        } else if (speed >= 1 && speed <= 4) {
            return speed * carsPerHour;
        } else {
            return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        int roundedRate = (int)Math.round(productionRatePerHour(speed));
        return roundedRate / 60;
    }
}
