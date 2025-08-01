package com.raj.covid;

class User 
{
    private String name;
    private VaccineEligibility eligibility;
    private DoseBooking doseBooking;

    public User(String name, int age, boolean hasHealthCondition) 
    {
        this.name = name;
        this.eligibility = new VaccineEligibility(age, hasHealthCondition);
        this.doseBooking = new DoseBooking();
    }

    public boolean isEligible()
    {
    	return eligibility.isEligible();
    }

    public void bookDose()
    {
        if (!isEligible()) 
        {
            throw new RuntimeException(name + " is not eligible for the vaccine.");
        }
        doseBooking.bookDose();
        System.out.println("Dose booked successfully for " + name);
    }

    public boolean isDoseBooked() 
    {
        return doseBooking.isDoseBooked();
    }
}
