package com.medical;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

	Scanner scanner = new Scanner(System.in);

	public void print(ArrayList<?> medicinestore) {
		for (Object medicine : medicinestore) {
			System.out.println(medicine);
		}
	}

	public int showMainMenu() {
		System.out.println("Select Your Choice\n 1.Add Medicine\n 2.Remove Medicine\n "
				+ "3.Print Medicine\n 4.Update Medicine\n 5.Exit");
		int choice = scanner.nextInt();

		return choice;
	}
	
	public String selectMedicine() {
		System.out.println("Enter the medicine name which you want to delete..");
		String userSelection = scanner.next();
		
		return userSelection;
		
	}
}
