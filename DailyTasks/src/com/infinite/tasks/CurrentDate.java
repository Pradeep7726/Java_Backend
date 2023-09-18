package com.infinite.tasks; //Display currentdate using java program
import java.time.LocalDate; //Display current day,day in week and current month using date class.
//import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentDate {

	public static void main(String[] args) {
		// Create a localdate instance for the current date
		LocalDate currentDate = LocalDate.now();
		//LocalTime currentTime = LocalTime.now();
		// display the current day,day of the week, and month
		System.out.println("Current Day: " +currentDate.getDayOfMonth());
		System.out.println("Day of the Week: " + currentDate.getDayOfWeek());
		System.out.println("Current Month: " +currentDate.getMonth());
		//Display the current date in dd/MM/yyyy
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Current Date(dd/MM/yyyy):" + currentDate.format(dateFormat));	
		//Display the current time in HH:mm:ss format
		//DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		//System.out.println("Current Time (HH:mm:ss): " + currentTime.format(timeFormat));	
		}

}