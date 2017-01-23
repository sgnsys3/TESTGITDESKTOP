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
public class WEEK3_G1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Building lx = new Building("LX Building", 20);
        Building lx2 = new Building("LX Building", 20);
        lx.buildRoom(10);
        lx2.buildRoom(20);
        System.out.println(lx);
        System.out.println(lx.equals(lx2));
    }
    
}
