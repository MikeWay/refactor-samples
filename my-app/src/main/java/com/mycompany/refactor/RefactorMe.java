package com.mycompany.refactor;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class RefactorMe {
	private static final double INTEREST = 0;
	private Order order;
	Object objectReference;
	private double amountOwed;
	private double interestRate;
	private double loanPeriod;

	void printInvoice() {

		List<OrderItem> orderItems = order.getOrderItems();
		double orderTotal = 0;
		System.out.format("Order Summary");
		System.out.format("Amount outstanding");
		for (OrderItem item : orderItems) {
			orderTotal += item.getAmount();
		}
		System.out.format("Total %.2d", orderTotal);
	}

	Object decomposeConditional() {
		Object deliveryCost = null;
		int noProducts = 0;
		int summerCosts = 0;
		int winterCosts = 0;
		if (new GregorianCalendar().compareTo(new GregorianCalendar(2009, Calendar.JUNE, 1)) > 0
				&& new GregorianCalendar().compareTo(new GregorianCalendar(2009, Calendar.SEPTEMBER, 1)) > 0) {

			deliveryCost = noProducts * summerCosts;
		} else {

			deliveryCost = noProducts * winterCosts;
		}
		return deliveryCost;
	}

	public void removeControlFlag() throws MyApplicationException {
		boolean failed = false;

		if (objectReference != null) {
			if (!processed(objectReference)) {
				failed = true;
			}
		} else {
			failed = true;
		}
		if (failed == true) {
			throw new MyApplicationException("error");
		}
	}

	
	public double getAdjustedInterest() {
		double result = 0.0;
		if (amountOwed > 0.0) {
			if (interestRate > 0.0 && loanPeriod > 0.0) {
				result = (amountOwed / loanPeriod) * INTEREST;
			}
		}
		return result;
	}
	
	
	
	private boolean processed(Object objectReference2) {
		// TODO Auto-generated method stub
		return false;
	}

}
