/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw21752927
 *
 */
public abstract class DeviceImpl implements Device {
	
	private String brand;
	private String model;
	protected int speed;
	
	/**
	 * @param brand
	 * @param model
	 * @param speed
	 */
	public DeviceImpl(String brand, String model, int speed) {
		this.brand = brand;
		this.model = model;
		this.speed = speed;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#overclock()
	 */
	@Override
	public int overclock() throws Exception {
		return (int)(speed * 1.5);
	} 

	
	//************************ Getters & Setters *******************************

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}


	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}


	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}


	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}


	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("DeviceImpl [brand=%s, model=%s, speed=%s]", brand, model, speed);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + speed;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DeviceImpl)) {
			return false;
		}
		DeviceImpl other = (DeviceImpl) obj;
		if (brand == null) {
			if (other.brand != null) {
				return false;
			}
		} else if (!brand.equals(other.brand)) {
			return false;
		}
		if (model == null) {
			if (other.model != null) {
				return false;
			}
		} else if (!model.equals(other.model)) {
			return false;
		}
		if (speed != other.speed) {
			return false;
		}
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	//Hace lo mismo que el metodo clone() de la clase Object
	
}
