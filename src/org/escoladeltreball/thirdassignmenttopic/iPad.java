/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw21752927
 *
 */
public final class iPad extends Tablet {

	/**
	 * @param brand
	 * @param model
	 * @param speed
	 */
	public iPad(String brand, String model, int speed) {
		super(brand, model, speed);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param brand
	 * @param model
	 */
	public iPad(String brand, String model) {
		this(brand, model, 100);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Smashing aggresively on the ground");
	}

}
