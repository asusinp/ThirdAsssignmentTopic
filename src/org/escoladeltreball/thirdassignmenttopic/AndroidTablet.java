/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw21752927
 *
 */
public final class AndroidTablet extends Tablet {

	/**
	 * @param brand
	 * @param model
	 * @param speed
	 */
	public AndroidTablet(String brand, String model, int speed) {
		super(brand, model, speed);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param brand
	 * @param model
	 */
	public AndroidTablet(String brand, String model) {
		this(brand, model, 500);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("Very carefully, touch the power button");
	}

}
