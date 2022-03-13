package com.caresoft.clinicapp;

import java.util.Date;
import java.util.ArrayList;

public class Physician extends User implements HIPAACompliantUser  {
    private ArrayList<String> patientNotes;
    
	
	
    public Physician(Integer id) {
		super.id=id;
	}

	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
        }
      
	@Override
	public boolean assignPin(int pin) {
		if (pin > 999 && pin <9999)	{
			super.pin=pin;
			return true;
		}
		else return false;
		
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (confirmedAuthID == super.id)	return true;
		else return false;
	}
	
}
