public class Transit implements TravelMode{
    @Override
    public int estimateArrivalTime() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
