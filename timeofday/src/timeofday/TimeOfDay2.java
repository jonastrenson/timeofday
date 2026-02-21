package timeofday;

/**
 * Elke instantie van deze klasse slaat een tijdstip met
 * een geheel aantal minuten sinds middernacht tussen 0 en 1440 op.
 * 
 * @invar De uren moeten een integer tussen 0 en 23 zijn.
 * 	| 0 <= getHours() && getHours() <= 23
 * 
 * @invar De minuten moeten een integer tussen 0 en 59 zijn.
 * 	| 0 <= getMinutes() && getMinutes() <= 59
 */
public class TimeOfDay2 {
	/**
	 * @invar | 0 <= minutesSinceMidnight && minutesSinceMidnight <= 1439
	 */
	private int minutesSinceMidnight;
	
	public int getHours() {
		return minutesSinceMidnight/60;
	}
	
	public int getMinutes() {
		return minutesSinceMidnight%60;
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
	public TimeOfDay2(int hours, int minutes) {
		if (hours < 0 || hours > 23)
			throw new IllegalArgumentException("`hours` ligt niet tussen 0 en 23");
		if (minutes < 0 || minutes > 59)
			throw new IllegalArgumentException("`minutes` ligt niet tussen 0 en 59");
		this.minutesSinceMidnight = hours*60 + minutes;
	}
	
	/**
	 * Stelt de uren van het object in op de gegeven waarde.
	 * @throws IllegalArgumentException
	 * 	| hours < 0 || hours > 23
	 * @mutates | this
	 * @post | getHours() == hours
	 */
	public void setHours(int hours) {
		if (hours < 0 || hours > 23)
			throw new IllegalArgumentException("`hours` ligt niet tussen 0 en 23");
		minutesSinceMidnight = hours*60 + this.getMinutes();
	}
	
	/**
	 * Stelt de minuten van het object in op de gegeven waarde.
	 * @throws IllegalArgumentException
	 * 	| minutes < 0 || minutes > 59
	 * @mutates | this
	 * @post | getMinutes() == minutes
	 */
	public void setMinutes(int minutes) {
		if (minutes < 0 || minutes > 59)
			throw new IllegalArgumentException("`minutes` ligt niet tussen 0 en 59");
		minutesSinceMidnight = this.getHours()*60 + minutes;
	}

}
