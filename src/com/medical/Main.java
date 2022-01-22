package com.medical;

public class Main {

	public void handleUserSelection(int choice) {
		MedicineStore medicineStore = new MedicineStore();
		UserInterface userInterface = new UserInterface();
		switch (choice) {
		case 1: {
			addMedicine(); 
			break;
		}
		case 2:
			System.out.println("Remove");
			break;
		case 3:
			//userInterface.print(medicineStore.getMedicinestore());
			break;
		case 4:
			System.out.println("Update");
			break;
		case 5:
			System.exit(0);
			break;
		default:
		}
	}
	
	public void addMedicine() {
		Chawayanprash chawayanprash = new Chawayanprash();
		 chawayanprash.price = 345;
		  Chrocin chrocin = new Chrocin();
		  chrocin.price = 56; Azithromycin
		  azithromycin = new Azithromycin();
		  azithromycin.price = 98;
		  Vicks vicks = new
		  Vicks(); vicks.price = 124;
	}

	public static void main(String[] args) {

		UserInterface userInterface = new UserInterface();
		Main main = new Main();
		int choice = userInterface.showMainMenu();
		main.handleUserSelection(choice);

		/*
		 * MedicineStore medicalStore = new MedicineStore(); UserInterface userinterface
		 * = new UserInterface();
		 * 
		 * BTrime btrime = new BTrime(); btrime.price = 150;
		 * 
		 * Chawayanprash chawayanprash = new Chawayanprash(); chawayanprash.price = 345;
		 * Chrocin chrocin = new Chrocin(); chrocin.price = 56; Azithromycin
		 * azithromycin = new Azithromycin(); azithromycin.price = 98; Vicks vicks = new
		 * Vicks(); vicks.price = 124;
		 * 
		 * medicalStore.add(vicks); medicalStore.add(btrime);
		 * medicalStore.add(chawayanprash); medicalStore.add(chrocin);
		 * medicalStore.add(azithromycin);
		 * 
		 * userinterface.print(medicalStore.getMedicinestore());
		 * 
		 * medicalStore.remove(btrime);
		 * 
		 * System.out.println("*****************After Deleting***************");
		 * userinterface.print(medicalStore.getMedicinestore());
		 * 
		 * 
		 */
	}
}
