/*FILE: SubwayTrain.java
 *PROG: Tammy Castro
 *PURP: Class to simulate loading and unloading of subway train 
 *with multiple stops
 */
package edu.tridenttech.cpt187.castro.program4;



public class SubwayTrain {
	private int numOnBoard;
	private int maxCapacity;
	private int currentStation; 
	private int numStations;	//# of stations on route
	private int destStation;
	private int awayStation;
	private int numAtStationOne;
	private int numAtStationX;
	
	/**
	 * Class constructor
	 * @param totalStations, maxPersons, startStation
	 */
	public SubwayTrain(int stationcount, int maxPersons, int startStation, int awayStation, int numAtStationOne, int numAtStationX)
	{
		numStations = stationcount;
		maxCapacity = maxPersons;
		currentStation = startStation;
		destStation = currentStation;
		numOnBoard = 0;
		this.awayStation = awayStation;
		this.numAtStationOne = numAtStationOne;
		this.numAtStationX = numAtStationX;
	}//END Constructor
	
	/**
	 * Gets current number of passengers on board
	 * @returns numOnBoard
	 */
	public int getNumOnBoard()
	{
		return numOnBoard;
	}//END getNumOnBoard
	
	/**
	 * Gets the maximum number of passengers allowed on board
	 * @returns maxCapacity
	 */
	public int getMaxCapacity()
	{
		return maxCapacity;
	}//END getMaxCapacity
	
	/**
	 * Gets the current station location number
	 * @return 	current station number
	 */
	public int getCurntStation()
	{
		return currentStation;
	}//END getCurntStation
	
	/**
	 * Gets the number of stations on the route
	 * @return 	total number of stations
	 */
	public int getNumStations()
	{
		return numStations;
	}//END getNumStations

	public int getDestStation()
	{
		return destStation;
	}
	public int getAwayStation()
	{
		return awayStation;
	}
	public int getNumAtStationOne()
	{
		return numAtStationOne;
	}
	public int getNumAtStationX()
	{
		return numAtStationX;
	}

	public void setDestStation(int awayStation)
	{
		this.awayStation = awayStation;
	}//END destStation

	public void setNumStationOne(int numAtStationOne)
	{
		this.numAtStationOne = numAtStationOne;
	}
	public void setNumStationX(int numAtStationX)
	{
		this.numAtStationX = numAtStationX;
	}
//	public void loadSubwayTrain(int loading)
//	{
//		if(numOnBoard + loading <= maxCapacity)
//		{
//			numOnBoard += loading;
//			System.out.println("Loading "+ loading + " passengers.");
//			
//		}//END if
//		else
//		{
//			numOnBoard = maxCapacity;
//			System.out.println("Loading " + loading + " passengers.");
//		}//END else
//		
//	}//END loadSubwayTrain
//	public void unloadSubwayTrain(int unLoading)
//	{
//		if((unLoading >= maxCapacity)||(unLoading > numOnBoard))
//		{
//			unLoading = numOnBoard;
//			//System.out.println("Unloading " + unLoading + " passengers.");
//		}
//			System.out.println("Unloading " + unLoading + " passengers.");
//			numOnBoard -= unLoading;
//	}//END unloadSubwayTrain
	public void loadToCapacity()
	{
		if(getCurntStation() == 1)
		{
			if(numAtStationOne <= maxCapacity)
			{
				numOnBoard = numAtStationOne;
				numAtStationOne = 0;
			}
			else
			{
				numOnBoard = maxCapacity;
				numAtStationOne -= maxCapacity;
			}
		}
		else
		{
			if(numAtStationX <= maxCapacity)
			{
				numOnBoard = numAtStationX;
				numAtStationX = 0;
			}
			else
			{
				numOnBoard = maxCapacity;
				numAtStationX -= maxCapacity;
			}
		}
	}

	public void unloadAll()
	{
			numOnBoard = 0;
	}//END unloadSubwayTrain
	
	/**
	 * Displays number of passengers on board
	 * @param nextStation
	 */
	public void moveToStation(int nextStation)
	{
		
			this.destStation = nextStation;
			System.out.println("Leaving station " + this.currentStation + " for station " + nextStation + " with " + numOnBoard + " passengers aboard.");
			this.currentStation = nextStation;
			System.out.println("Arriving at station " + this.currentStation + " with " + this.numOnBoard + " passengers aboard.");
	}//END moveToStation
	
}//END SubwayTrain
