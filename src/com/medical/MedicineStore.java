package com.medical;

import java.util.ArrayList;

public class MedicineStore {

	ArrayList<Medicine> medicineStore = new ArrayList<Medicine>();

	public void add(Medicine medicine) {
		medicineStore.add(medicine);
	}

	public void remove(Medicine medicine) {
		medicineStore.remove(medicine);
	}

	public ArrayList<Medicine> getMedicinestore() {
		return medicineStore;
		
	}
	
	public Medicine getMedicine(String name) {
		for(Medicine medicine:medicineStore) {
			if(name.equals(medicine.name)) {
				return medicine;
			}
		}	
			return null;
		
	}
}
