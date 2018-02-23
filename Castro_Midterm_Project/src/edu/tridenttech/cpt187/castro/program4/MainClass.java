/*FILE: MainClass.java
 *PROG: Tammy Castro
 *PURP: Class to simulate loading and unloading of subway train 
 *with multiple stops
 */
package edu.tridenttech.cpt187.castro.program4;
import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int stationcount = 30;
		int awayStation = 0;
		int numAtStationOne = 0;
		int numAtStationX = 0;
		
		
		SubwayTrain downtownExpress = new SubwayTrain(stationcount, 100, 1, awayStation, numAtStationOne, numAtStationX);
		//Input three values from user
		System.out.println("Enter destination station number ");
		awayStation = input.nextInt();
		System.out.println("Enter number of people waiting at Station 1.");
		numAtStationOne = input.nextInt();
		System.out.println("Enter number of people waiting to board train at destination station.");
		numAtStationX = input.nextInt();
		downtownExpress.setDestStation(awayStation);
		downtownExpress.setNumStationOne(numAtStationOne);
		downtownExpress.setNumStationX(numAtStationX);
		
	//while number of passengers at Station 1 or StationX is greater than 0
	while((downtownExpress.getNumAtStationOne() > 0) ||(downtownExpress.getNumAtStationX() > 0))
	{
		downtownExpress.loadToCapacity();
		//if current station is station 1 
		if(downtownExpress.getCurntStation() == 1){
			downtownExpress.moveToStation(awayStation);
			downtownExpress.unloadAll();
		}
		//if current station is not = to station 1
		else
		{
			downtownExpress.moveToStation(1);
			downtownExpress.unloadAll();
		}
		
	}
	//Returns the train back to station 1
	if(downtownExpress.getCurntStation()!= 1)
	{
		downtownExpress.moveToStation(1);
	}
		
	}
}