package cassdemo.domain;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public int id;
    public List<Room> rooms = new ArrayList<>();
    public String city;

    public Hotel(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public Hotel(int id, String city, int numOfRooms1, int numOfRooms2, int numOfRooms3, int numOfRooms4, int numOfRooms5, int numOfRooms6) {
        this.id = id;
        this.city = city;
        int id_base = 0;
        id_base = addRoomsWithCapacity(1, numOfRooms1, id_base);
        id_base = addRoomsWithCapacity(2, numOfRooms2, id_base);
        id_base = addRoomsWithCapacity(3, numOfRooms3, id_base);
        id_base = addRoomsWithCapacity(4, numOfRooms4, id_base);
        id_base = addRoomsWithCapacity(5, numOfRooms5, id_base);
        addRoomsWithCapacity(6, numOfRooms6, id_base);
    }

    private int addRoomsWithCapacity(int capacity, int numOfRooms, int id_base) {
        for (int i = 0; i < numOfRooms; i++) {
            rooms.add(new Room(id_base + i, capacity));
        }
        return id_base + numOfRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", city='" + city + '\'' +
                '}';
    }
}
