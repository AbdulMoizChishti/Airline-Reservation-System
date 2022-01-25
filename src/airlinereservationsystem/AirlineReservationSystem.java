/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package airlinereservationsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author dell
 */

public class AirlineReservationSystem {

	public static void main(String[] args) {
		// Initialize database
		Database prodDB = new Database();
		prodDB.bootstrap();
		 //Initialize console
		boolean always = true;
		String passengerName = null;
		int flightNumber = 0;
		int seatNumber = 0;
		LocalDate departureDate = LocalDate.now();
		//reading input from screen;
		BufferedReader screenInput = new BufferedReader(new InputStreamReader(System.in));
		
		while(always)
		{
			// ask for passenger name and add
			System.out.println("Enter Passenger Name : ");
			
			try {
				passengerName = screenInput.readLine();
			} catch (IOException e) {
				System.out.println("Sorry, i dont understand.");
			}
			// checking whether an existing passenger or new one
			boolean result = prodDB.addPassenger(passengerName);
			
			// welcoming existing passenger or new one

			if(result)
			{
				System.out.println("Welcome back: " +  passengerName);
			}
			else{
				System.out.println("Welcome: " +  passengerName);
			}
			// show flights and ask for flights
			System.out.println("\nHere are available flights: ");
			for(Flight item: prodDB.getFlight()){
				System.out.println(item);
			}
			System.out.println("\nEnter the flight no to book :");
			try{
			flightNumber = Integer.parseInt(screenInput.readLine());
			} catch (IOException e) {
				System.out.println("\nPlease enter flight no :");
		}
			catch (NumberFormatException e) {
				System.out.println("That was not a number");
			}
			
			// Show available seats and asks
			
			System.out.println("\nAssuming you are flying today ,");
			System.out.println("Here are available seats on that flight: ");
			ArrayList<Seat> openSeats = prodDB.getOpenSeats(departureDate, flightNumber);
			for(Seat item: openSeats){
				System.out.print(item.getSeatNo() + ",");
			}
			System.out.println("\nEnter the seat you want: ");
			try{
				seatNumber = Integer.parseInt(screenInput.readLine());
				
			}
			catch (IOException e) {
				System.out.println("Please enter a seat no :");
		}
			String ticketInfo = prodDB.addTicket(departureDate, passengerName, flightNumber, seatNumber);
			System.out.println("\nReservations Successful!! Here are your ticket details");
			System.out.println(ticketInfo + "\n");
		}
		
		

	}

}
