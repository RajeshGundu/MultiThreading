package com.raj.covid;

public class VaccineEligibility 
{
	private int age;
	private boolean hasHealthCondition;
	
	public VaccineEligibility(int age, boolean hasHealthCondition) 
	{
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	public boolean isEligible()
	{
		
		return (age >= 18) && (age < 60 || hasHealthCondition);
	}
	@Override
	public String toString() 
	{
		return "VaccineEligibility [age=" + age + ", hasHealthCondition=" + hasHealthCondition + "]";
	}
}
