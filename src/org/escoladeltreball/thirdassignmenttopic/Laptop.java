/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw21752927
 *
 */
public abstract class Laptop extends DeviceImpl {

	private LaptopType type;
	
	/**
	 * @param brand
	 * @param model
	 * @param speed
	 */
	public Laptop(String brand, String model, int speed, LaptopType type) {
		super(brand, model, speed);
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOn()
	 */
	@Override
	public void turnOn() {
		System.out.println("turning on device");
	}
	
}
