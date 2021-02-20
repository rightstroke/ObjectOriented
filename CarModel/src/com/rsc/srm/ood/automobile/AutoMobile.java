package com.rsc.srm.ood.automobile;

import com.rsc.srm.ood.automobile.manuf.Manufacturer;

public abstract class AutoMobile {
	private Manufacturer manuf;

	public Manufacturer getManuf() {
		return manuf;
	}

	public void setManuf(Manufacturer manuf) {
		this.manuf = manuf;
	}
	
	
}
