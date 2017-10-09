/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw21752927
 *
 */
public abstract class Laptop extends DeviceImpl {

	/**
	 * @param brand
	 * @param model
	 * @param speed
	 */
	public Laptop(String brand, String model, int speed) {
		super(brand, model, speed);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOn()
	 */
	@Override
	public void turnOn() {
		System.out.println("turning on device");
	}
	
}
