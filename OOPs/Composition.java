package OOPs;

import java.util.*;
class Room{
    String name;
    Room(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Room:"+name);
    }
}
class House{
    List<Room> rooms;
    House(){
        rooms=new ArrayList<>();
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
    }
    void showRooms(){
        for(Room r:rooms){
            r.display();
        }
    }
}
public class Composition {
    public static void main(String[] args) {
        House h=new House();
        h.showRooms();
    }   
}
