/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem;

/**
 *
 * @author dell
 */
public class Passengers {

    private String name;

//constructors
    public Passengers() {
        name = "Unknown";
    }

    public Passengers(String name) {
        setName(name);
    }
//getters and setters

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
//toString

    public String toString() {
        return "Passenger: " + this.getName();
    }
}
