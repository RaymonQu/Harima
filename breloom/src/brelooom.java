public class brelooom {
    public static void main(String[] args) {
        Car fordFiesta = new Car(10, "best", 1, false);
        Plane boeing787 = new Plane(1, "boeing", 2, true);

        boeing787.perform();
        fordFiesta.perform();
    }
}
