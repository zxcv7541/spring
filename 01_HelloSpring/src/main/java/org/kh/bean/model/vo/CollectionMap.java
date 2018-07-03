package org.kh.bean.model.vo;

import java.util.Map;

public class CollectionMap {
	private Map<String,String> addressMap;
	

	public CollectionMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CollectionMap(Map<String, String> addressMap) {
		super();
		this.addressMap = addressMap;
	}

	public Map<String, String> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}
	
}
