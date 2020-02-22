package vjit;
import java.time.*;
public class ZoneIdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		ZonedDateTime currentTimeInLondon = ZonedDateTime.now(ZoneId.of("Europe/London"));
		ZonedDateTime currentTimeInNewYork = currentTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		ZonedDateTime currentTimeInPacific = currentTime.withZoneSameInstant(ZoneId.of("US/Pacific"));
	    ZonedDateTime currentTimeInCairo = currentTime.withZoneSameInstant(ZoneId.of("Africa/Cairo"));
		ZonedDateTime currentTimeInSydney = currentTime.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
								//ZonedDateTime currentTimeIn				= currentTime.withZoneSameInstant(ZoneId.of(
		System.out.println("Tokyo:"+ currentTime);
		System.out.println("London:"+ currentTimeInLondon);
		System.out.println("New York:"+ currentTimeInNewYork);
		System.out.println("Pacific"+ currentTimeInPacific);
		System.out.println("Paris:"+ currentTimeInCairo);
		System.out.println("Paris:"+ currentTimeInSydney);
		//America/New_York, Europe/London, Asia/Tokyo, US/Pacific, Africa/Cairo, Australia/Sydney etc.)

	}

}
/* 
  
   public int CalculateAge(LocalDate d)
   {
       LocalDate end = LocalDate.now();
		
		Period period = d.until(end);
	    return  period.getYears();
   }
   
   
   
   
   
   
   
   
 */


/*package com.capgemini.lesson5.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		
		ZonedDateTime currentTime = ZonedDateTime.now();
		ZonedDateTime currentTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime currentTimeInNewYork = currentTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("India:"+ currentTime);
		System.out.println("Paris:"+ currentTimeInParis);
		System.out.println("New York:"+ currentTimeInNewYork);
		
		
	}
}
*/