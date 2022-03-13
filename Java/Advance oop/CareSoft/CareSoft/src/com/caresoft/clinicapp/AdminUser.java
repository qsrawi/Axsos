package com.caresoft.clinicapp;

import java.util.Date;
import java.util.ArrayList;

public class AdminUser extends User implements HIPAACompliantUser , HIPAACompliantAdmin  {
    
    // Inside class:
    private Integer employeeID;
    public AdminUser(Integer employeeID, String role) {

		this.employeeID = employeeID;
		this.role = role;

	}
	private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
	@Override
	public boolean assignPin(int pin) {
		
		if (pin > 99999 && pin <999999)	{
			super.pin=pin;
			return true;
		}
		else {
			this.authIncident();
			return false ;
		}
			
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (confirmedAuthID == super.id)	return true;
		else return false;
	}
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		
		return securityIncidents;
	}
    
}
