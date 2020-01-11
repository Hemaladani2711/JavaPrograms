package parkinglot;

/**
 * This ParkingLot Supports following functions.
 * 1. Gets number of available Spaces
 * 2. Gets number of Total Spaces
 * 3.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingLot {
    ParkingSpot[] parkingSpotList;
    int size;
    int i;

    public ParkingLot(int numberOfSpots) {
        parkingSpotList = new ParkingSpot[numberOfSpots];
        size = numberOfSpots;
    }

    public boolean addCar(String id) {
        if (i < size) {
            for (int j = 0; j < size; j++) {
                if(parkingSpotList[j] == null){
                    parkingSpotList[j]=new ParkingSpot(id);
                    break;
                }
            }
            i++;
            return true;
        } else {
            return false;
        }
    }

    public int getTotalSpaces() {
        return parkingSpotList.length;
    }

    public int getAvailableSpaces() {
        return getTotalSpaces() - i;
    }
    public boolean removeCar(String id){
        for(int j=0;j<=i;j++){
            if(parkingSpotList[j].id==id) {
                parkingSpotList[j] = null;
                i--;
                return true;
            }
        }
        return false;
    }

    public void string() {
        System.out.println(Arrays.toString(parkingSpotList));
    }

}
