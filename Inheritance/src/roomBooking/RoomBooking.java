package roomBooking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import customer.Customer;

public class RoomBooking {
	Customer customers=new Customer();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 protected int persons;
	 protected int totalDays;
	 protected double tariff;
	 protected String roomType;
	public RoomBooking() throws NumberFormatException, IOException
	{
		System.out.println("Booking:");
		System.out.println("\nEnter the number of persons");
	 persons=Integer.parseInt(br.readLine());
		System.out.println("\nEnter number of days");
	 totalDays=Integer.parseInt(br.readLine());
		System.out.println("\nEnter the roomtype");
		 roomType=br.readLine();
		System.out.println("\nEnter the tariff for single person");
		 tariff=Integer.parseInt(br.readLine());
		customers.setPersons(persons);
		customers.setTotalDays(totalDays);
		customers.setRoomType(roomType);
		customers.setTariff(tariff);
		
	}
	protected double roomBooking(int persons, int totalDays, double tariff, String roomType)
	{
		double totalTariff=customers.getPersons()*customers.getTotalDays()*customers.getTariff();
		
		return totalTariff;
		
	}
}
