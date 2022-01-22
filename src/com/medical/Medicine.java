package com.medical;

public abstract class Medicine {

	enum MedicineType {
		AYURVADIC, ALLOPATHIK, HOMEOPATHIK;
	}
	
	String name;
	String brandName;
	MedicineType type;
	double price;

	@Override
	public String toString() {
		return "Medicine [brandName=" + brandName + ", type=" + type + ", price=" + price + "]";
	}
}
