/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

/**
 *
 * @author patricia
 */
public class Droid {

    int batteryLevel;
    String name;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I’m the droid:" + name;
    }

    public void performTask(String task) {
        System.out.println(name + "is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public void energyReport() {
        System.out.println(batteryLevel);
        batteryLevel = batteryLevel + 2;
    }

    public void energyTransfer() {
        batteryLevel = batteryLevel / 2;
    }

    public static void main(String[] args) {
        Droid name1 = new Droid("Codey");
        System.out.println(name1);
        name1.performTask("dancing");

    }
}
