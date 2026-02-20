package timeofday;

/**
 * Elke instantie van deze klasse slaat een tijdstip met
 * een geheel aantal uren tussen 0 en 23 en een geheel aantal minuten tussen 0 en 59 voor.
 * 
 * @invar De uren moeten een integer tussen 0 en 23 zijn.
 * 	| 0 <= getHours() && getHours() <= 23
 * 
 * @invar De minuten moeten een integer tussen 0 en 59 zijn.
 * 	| 0 <= getMinutes() && getMinutes() <= 59
 */
public class TimeOfDay {
	/**
	 * @invar | 0 <= hours && hours <= 23
	 * @invar | 0 <= minutes && minutes <= 59
	 */
	private int hours;
	private int minutes;
	
	
	public int getHours() {
		return this.hours;
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	/**
	 * Initialiseert het object met de gegeven uren en minuten.
	 * @throws IllegalArgumentException
	 * 	| hours < 0 || hours > 23
	 * @throws IllegalArgumentException
	 * 	| minutes < 0 || minutes > 59
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	TimeOfDay(int hours, int minutes) {
		if (hours < 0 || hours > 23)
			throw new IllegalArgumentException("`hours` ligt niet tussen 0 en 23");
		if (minutes < 0 || minutes > 59)
			throw new IllegalArgumentException("`minutes` ligt niet tussen 0 en 59");
		this.hours = hours;
		this.minutes = minutes;
	}
	
	/**
	 * Stelt de uren van het object in op de gegeven waarde.
	 * @mutates | this
	 * @post | getHours() == hours
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	/**
	 * Stelt de minuten van het object in op de gegeven waarde.
	 * @mutates | this
	 * @post | getMinutes() == minutes
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
