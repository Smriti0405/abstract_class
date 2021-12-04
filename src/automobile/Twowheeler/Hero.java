package automobile.Twowheeler;

import automobile.Vehicle;

import java.util.Scanner;

public class Hero extends Vehicle {
    int speed;
    String ownerName;
    String modelName;
    String registrationNumber;

    Scanner s = new Scanner(System.in);

    Hero(String ownerName, String modelName, String registrationNumber, int speed){
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
        this.modelName = modelName;
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void radio(){
        System.out.println("Press 0 to OFF and 1 to ON the radio");
        int on = 1;
        int r = s.nextInt();
        if(on == r)
            System.out.println("ON");
        else
            System.out.println("OFF");
    }
    public void cdplayer(){
        System.out.println("Press 0 to OFF and 1 to ON the cdplayer");
        int on = 1;
        int k = s.nextInt();
        if(on == k)
            System.out.println("ON");
        else
            System.out.println("OFF");
    }

    @Override
    public String getModelName() {
    return (modelName);
    }

    @Override
    public String getRegistrationNumber() {
        return (registrationNumber);
    }

    @Override
    public String getOwnerName() {
        return (ownerName);
    }
}
class Test {
    public static void main(String[] args) {
        Hero obj = new Hero("aaa", "Splendor", "UP648157", 85);
        obj.cdplayer();
        obj.radio();
        System.out.println(obj.getModelName());
        System.out.println(obj.getOwnerName());
        System.out.println(obj.getSpeed());

    }
}

