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
public class Room {
    private String name;
    private double area;
    private double area51;

    public Room(String name, double area) {
        this.area = area;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Room{" + "name=" + name + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Room) {
            Room temp = (Room)obj;
            return (temp.name.equals(this.name) && (temp.area == this.area));
        }
        return false;
    }
    
    
}
