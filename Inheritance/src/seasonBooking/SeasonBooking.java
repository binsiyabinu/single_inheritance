package seasonBooking;

import java.io.IOException;

import roomBooking.RoomBooking;

public class SeasonBooking extends RoomBooking {

	public SeasonBooking() throws NumberFormatException, IOException {
		 double totalTariff = super.roomBooking(persons,totalDays, tariff, roomType);
		 
		System.out.println("Total tariff:"+totalTariff);
	}

}
