public class DirectionService {

    private TravelMode travelMode;

    public Object getDirection(){
        return travelMode.getDirection();
    }
    public Object getEta(){
        return travelMode.estimateArrivalTime();
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
