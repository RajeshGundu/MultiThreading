package com.raj.covid;


public class DoseBooking 
{
	private boolean booked;
	
	public void bookDose()
	{
		if(booked==true)
		{
			throw new RuntimeException(" Dose is already booked ");
		}
	}
	public boolean isDoseBooked()
	{
		if(booked==true)
		{
			System.out.println("user booked the Dose");
		}
		else
		{
			System.out.println("user is not booked the Dose");
		}
		return true;
	}
}
