public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int ovenTime) {
        return expectedMinutesInOven() - ovenTime;
    }

    public int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }

    public int totalTimeInMinutes(int layers, int ovenTime) {
        return ovenTime + preparationTimeInMinutes(layers);
    }
}
