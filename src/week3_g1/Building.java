/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_g1;

/**
 *
 * @author INT105
 */
public class Building {
    private String name;
    private Room[] room;
    
    public Building() {
        room = new Room[10];
    }
   
    public Building(String name) {
        this.name = name;
        this.room = new Room[10];
    }
    
    public Building(int numOfRoom) {
        room = new Room[numOfRoom];
    }
    
    public Building(String name,int numOfRoom) {
        this.name = name;
        room = new Room[numOfRoom];
    }
    
    public void buildRoom(double area) {
        for (int i = 0; i < room.length; i++) {
            room[i] = new Room("SIT - " + (i + 1), area);
        }
    }

    public String getName() {
        return name;
    }

    public Room[] getRoom() {
        return room;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String display = "";
        boolean isFirst = true;
        for (Room temp : room) {
            if(isFirst) {
                display += "\n";
                isFirst = false;
            }
            display += temp + "\n";
        }
        return "Building{" + "name=" + name + ", room=" + display + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Building && obj != null) {
            Building temp = (Building)obj;
            if(!this.name.equals(temp.name)) return false;
            if(this.room.length != temp.room.length) return false;
            for (int i = 0; i < this.room.length; i++) {
                if(!this.room[i].equals(temp.room[i])) return false;
            }
            return true;
        }
        return false;
    }
    
    
}
