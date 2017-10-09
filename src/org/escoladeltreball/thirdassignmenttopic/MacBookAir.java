/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw21752927
 *
 */
public final class MacBookAir extends Laptop {

	/**
	 * @param brand
	 * @param model
	 * @param speed
	 */
	public MacBookAir(String brand, String model, int speed) {
		super(brand, model, speed, LaptopType.ULTRALIGHT);
	}
	
	public MacBookAir(String brand, String model) {
		this(brand, model, 367);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("closing mac smoothly");
	}

}
