package org.escoladeltreball.thirdassignmenttopic;

public interface Device extends Cloneable {
	
	/**
	 * Turns devices on
	 */
	public abstract void turnOn();
	
	/**
	 * Turns devices off
	 */
	public abstract void turnOff();

	/**
	 * Causes device to overclock
	 * @return
	 * @throws Exception
	 */
	public abstract int overclock() throws Exception;

}
