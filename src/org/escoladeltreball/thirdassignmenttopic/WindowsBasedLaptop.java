/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw21752927
 *
 */
public final class WindowsBasedLaptop extends Laptop {

	/**
	 * @param brand
	 * @param model
	 * @param speed
	 */
	public WindowsBasedLaptop(String brand, String model, int speed) {
		super(brand, model, speed);
		// TODO Auto-generated constructor stub
	}
	
	public WindowsBasedLaptop(String brand, String model) {
		this(brand, model, 399);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("clicking inicio to turn off");
	}

}
