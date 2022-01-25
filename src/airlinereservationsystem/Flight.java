/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem;

/**
 *
 * @author dell
 */
public class Flight {

    // Fields
    private String departureCity;
    private String arrivalCity;
    private int flightNo;

    // Constructor
    public Flight() {
        departureCity = "Unknown Departure City";
        arrivalCity = "Unknown Arrival City";
        flightNo = 100;
    }

    public Flight(int flightNo, String departureCity, String arricalCity) {
        setDepartureCity(departureCity);
        setArrivalCity(arricalCity);
        setFlightNo(flightNo);

    }
    //toString

    public String toString() {
        return "Flight: " + this.getFlightNo() + " " + this.getDepartureCity() + " - " + this.getArrivalCity();

    }

    //getters and setters
    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

}
