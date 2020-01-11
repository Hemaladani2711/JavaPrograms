package parkinglot;



public class ParkingSpot {
    String id;

    public ParkingSpot(String id){
        setId(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id='" + id + '\'' +
                '}';
    }
}
