package bee.ris.rushhour.data;

/**
 * This enumeration provides the constants used to refer various elements of a
 * clock.
 * <p>
 * For example, to refer to the hour at 1pm in a 12-hour clock format, the
 * constant, <code>HOUR12_1_PM</code>, should be used.
 * </p>
 * <p>
 * To refer the same hour in a 24-hour clock format, the constant,
 * <code>HOUR24_1</code> should be used.
 * 
 * @author Rishabh Rao
 * @since 0.0.4
 */
public enum EClockConstants {
	MIDNIGHT(0),
	AM_1(1),
	AM_2(2),
	AM_3(3),
	AM_4(4),
	AM_5(5),
	AM_6(6),
	AM_7(7),
	AM_8(8),
	AM_9(9),
	AM_10(10),
	AM_11(11),
	NOON(12),
	PM_1(13),
	PM_2(14),
	PM_3(15),
	PM_4(16),
	PM_5(17),
	PM_6(18),
	PM_7(19),
	PM_8(20),
	PM_9(21),
	PM_10(22),
	PM_11(23);
	/**
	 * The time constant for the hour.
	 * 
	 * @author Rishabh Rao
	 * @since 0.0.4
	 */
	private int value;

	/**
	 * A private construct that sets the enum's value.
	 * 
	 * @param value
	 *            The time constant for the hour.
	 */
	private EClockConstants(int value) {
		this.setValue(value);
	}

	/**
	 * @return The time constant for the hour.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 *            The time constant for the hour.
	 */
	private void setValue(int value) {
		this.value = value;
	}
}
