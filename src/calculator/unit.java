package calculator;

public class unit {
	
	int unitSpecifier;
	String unitName;
	private String metricMultiplier = "1";
	int resultUS;
	
	String[] unitList = {"-- no unit selected --",
			"meter", "kilometer", "feet",
			"seconds", "minutes", "hours", 
			"grams", "pounds", "kilograms",
			"mps", "kmph",
			"mps2", "kmph2",
			"Newton", "Dyne",
			"m3kg-1s-2",
			"m2","km2","feet2",
			"kg.m.s-1", "g.cm.s-1"," "
			};
	
	public unit() {
		unitSpecifier = 0;
		unitName = unitList[0];
	}
	
	public unit (int unitSpecifier) {
		this.unitSpecifier = unitSpecifier;
		this.unitName = unitList[unitSpecifier];
	}
	
	/* *
	 * Setters and getters
	 * */
	int getUnitSpecifier() {
		return this.unitSpecifier;
	}
	
	String getUnit() {
		return unitList[unitSpecifier];
	}
	
	void setUnitSpecifier(int newUnitSpecifier) {
		this.unitSpecifier = newUnitSpecifier;
	}
	
	/* * 
	 * setters
	 * */
	public String getMetricMultiplier() {
		return this.metricMultiplier;
	}
	
	/* *
	 * toString()
	 * */
	public String toString() {
		return unitName;
	}
	
	/* *
	 * check if valid gives a boolean telling the units can be operated directly or not
	 * */
	boolean checkIfValidForAddition(unit that) {
		//System.out.println(this.unitSpecifier+" "+that.unitSpecifier);
		if(this.unitSpecifier==0 && that.unitSpecifier==0)
		{
			return true;
		}
		switch(this.unitSpecifier) {
		case 1:
			switch(that.unitSpecifier) {
			case 1: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 1; return true;
			case 2: this.metricMultiplier = "1.0"; that.metricMultiplier = "1000.0"; resultUS = 1; return true;
			case 3: this.metricMultiplier = "3.28084"; that.metricMultiplier = "1.0"; resultUS = 3; return true;
			default: return false;
			}
		case 2:
			switch(that.unitSpecifier) {
			case 1: this.metricMultiplier = "1000.0"; that.metricMultiplier = "1.0"; resultUS = 1; return true;
			case 2: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 2; return true;
			case 3: this.metricMultiplier = "3280.84"; that.metricMultiplier = "1.0"; resultUS = 3; return true;
			default: return false;
			}
		case 3:
			switch(that.unitSpecifier) {
			case 1: this.metricMultiplier = "1.0"; that.metricMultiplier = "3.2804"; resultUS = 3; return true;
			case 2: this.metricMultiplier = "1.0"; that.metricMultiplier = "3280.84"; resultUS = 3; return true;
			case 3: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 3; return true;
			default: return false;
			}
		case 4:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 4; return true;
			case 5: this.metricMultiplier = "1.0"; that.metricMultiplier = "60.0"; resultUS = 4; return true;
			case 6: this.metricMultiplier = "1.0"; that.metricMultiplier = "3600.0"; resultUS = 4; return true;
			default: return false;
			}
		case 5:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "60.0"; that.metricMultiplier = "1.0"; resultUS = 4; return true;
			case 5: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 5; return true;
			case 6: this.metricMultiplier = "1.0"; that.metricMultiplier = "60.0"; resultUS = 5; return true;
			default: return false;
			}
		case 6:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "3600.0"; that.metricMultiplier = "1.0"; resultUS = 4; return true;
			case 5: this.metricMultiplier = "60.0"; that.metricMultiplier = "1.0"; resultUS = 5; return true;
			case 6: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 6; return true;
			default: return false;
			}
		case 7:
			switch(that.unitSpecifier) {
			case 7: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 7; return true;
			case 8: this.metricMultiplier = "1.0"; that.metricMultiplier = "453.592"; resultUS = 7; return true;
			case 9: this.metricMultiplier = "1.0"; that.metricMultiplier = "1000.0"; resultUS = 7; return true;
			default: return false;
			}
		case 8:
			switch(that.unitSpecifier) {
			case 7: this.metricMultiplier = "453.592"; that.metricMultiplier = "1.0"; resultUS = 7; return true;
			case 8: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 8; return true;
			case 9: this.metricMultiplier = "1.0"; that.metricMultiplier = "2.20462"; resultUS = 8; return true;
			default: return false;
			}
		case 9:
			switch(that.unitSpecifier) {
			case 7: this.metricMultiplier = "1000.0"; that.metricMultiplier = "1.0"; resultUS = 7; return true;
			case 8: this.metricMultiplier = "2.20462"; that.metricMultiplier = "1.0"; resultUS = 8; return true;
			case 9: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 9; return true;
			default: return false;
			}
		case 10:
			switch(that.unitSpecifier) {
			case 10: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 10; return true;
			case 11: this.metricMultiplier = "1.0"; that.metricMultiplier = "0.27777777777"; resultUS = 10; return true;
			default: return false;
			}
		case 11:
			switch(that.unitSpecifier) {
			case 10: this.metricMultiplier = "0.27777777777"; that.metricMultiplier = "1.0"; resultUS=10; return true;
			case 11: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 11; return true;
			default: return false;
			}
		case 12:
			switch(that.unitSpecifier) {
			case 12: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 12; return true;
			case 13: this.metricMultiplier = "1.0"; that.metricMultiplier = "0.00007716049"; resultUS = 12; return true;
			default: return false;
			}
		case 13:
			switch(that.unitSpecifier) {
			case 12: this.metricMultiplier = "0.00007716049"; that.metricMultiplier = "1.0"; resultUS=12; return true;
			case 13: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 13; return true;
			default: return false;
			}
		case 14:
			switch(that.unitSpecifier) {
			case 14: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 14; return true;
			case 15: this.metricMultiplier = "100000"; that.metricMultiplier = "1.0"; resultUS = 15; return true;
			default: return false;
			}
		case 15:
			switch(that.unitSpecifier) {
			case 14: this.metricMultiplier = "1.0"; that.metricMultiplier = "100000"; resultUS=15; return true;
			case 15: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 15; return true;
			default: return false;
			}
		case 16:
			switch(that.unitSpecifier) {
			case 16: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 16;return true;
			default: return false;
			}
		default: return false;
		}
	}
	
	boolean checkIfValidForSubtraction(unit that) {
		return checkIfValidForAddition(that);
	}
	
	boolean checkIfValidForMultiplication(unit that) {
		if(this.unitSpecifier==0 && that.unitSpecifier==0)
		{
			return true;
		}
		switch(this.unitSpecifier) {
		case 1:
			switch(that.unitSpecifier) {
			case 1: this.metricMultiplier = "1.0" ; that.metricMultiplier = "1.0"; resultUS = 17; return true;
			case 2: this.metricMultiplier = "1.0"; that.metricMultiplier = "1000.0"; resultUS = 17; return true;
			case 3: this.metricMultiplier = "3.28084"; that.metricMultiplier = "1.0"; resultUS = 19; return true;
			default: return false;
			}
		case 2:
			switch(that.unitSpecifier) {
			case 1: this.metricMultiplier = "1000.0" ; that.metricMultiplier = "1.0"; resultUS = 17; return true;
			case 2: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 18; return true;
			case 3: this.metricMultiplier = "3280.84"; that.metricMultiplier = "1.0"; resultUS = 19; return true;
			default: return false;
			}
		case 3:
			switch(that.unitSpecifier) {
			case 1: this.metricMultiplier = "1.0" ; that.metricMultiplier = "3.28084"; resultUS = 19; return true;
			case 2: this.metricMultiplier = "1.0"; that.metricMultiplier = "3280.84"; resultUS = 19; return true;
			case 3: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 19; return true;
			default: return false;
			}
		case 4:
			switch(that.unitSpecifier) {
			case 10: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 1; return true;
			case 11: this.metricMultiplier = "0.00027777777"; that.metricMultiplier = "1.0"; resultUS = 2; return true;
			case 12: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 10; return true;
			case 13: this.metricMultiplier = "0.00027777777"; that.metricMultiplier = "1.0"; resultUS = 11; return true;
			case 14: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 20; return true;
			case 15: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 21; return true;
			default: return false;
			}
		case 5:
			switch(that.unitSpecifier) {
			case 10: this.metricMultiplier = "60.0"; that.metricMultiplier = "1.0"; resultUS = 1; return true;
			case 11: this.metricMultiplier = "0.01666666666"; that.metricMultiplier = "1.0"; resultUS = 2; return true;
			case 12: this.metricMultiplier = "60.0"; that.metricMultiplier = "1.0"; resultUS = 10; return true;
			case 13: this.metricMultiplier = "0.01666666666"; that.metricMultiplier = "1.0"; resultUS = 11; return true;
			case 14: this.metricMultiplier = "60.0"; that.metricMultiplier = "1.0"; resultUS = 20; return true;
			case 15: this.metricMultiplier = "60.0"; that.metricMultiplier = "1.0"; resultUS = 21; return true;
			default: return false;
			}
		case 6:
			switch(that.unitSpecifier) {
			case 10: this.metricMultiplier = "3600.0"; that.metricMultiplier = "1.0"; resultUS = 1; return true;
			case 11: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 2; return true;
			case 12: this.metricMultiplier = "3600.0"; that.metricMultiplier = "1.0"; resultUS = 10; return true;
			case 13: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 11; return true;
			case 14: this.metricMultiplier = "3600.0"; that.metricMultiplier = "1.0"; resultUS = 20; return true;
			case 15: this.metricMultiplier = "3600.0"; that.metricMultiplier = "1.0"; resultUS = 21; return true;
			default: return false;
			}
		case 10:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 1; return true;
			case 5: this.metricMultiplier = "1.0"; that.metricMultiplier = "60.0"; resultUS = 1; return true;
			case 6: this.metricMultiplier = "1.0"; that.metricMultiplier = "3600.0"; resultUS = 1; return true;
			default: return false;
			}
		case 11:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "1.0"; that.metricMultiplier = "0.00027777777"; resultUS = 2; return true;
			case 5: this.metricMultiplier = "1.0"; that.metricMultiplier = "0.01666666666"; resultUS = 2; return true;
			case 6: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 2; return true;
			default: return false;
			}
		case 12:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 10; return true;
			case 5: this.metricMultiplier = "1.0"; that.metricMultiplier = "60.0"; resultUS = 10; return true;
			case 6: this.metricMultiplier = "1.0"; that.metricMultiplier = "3600.0"; resultUS = 10; return true;
			default: return false;
			}
		case 13:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "1.0"; that.metricMultiplier = "0.00027777777"; resultUS = 11; return true;
			case 5: this.metricMultiplier = "1.0"; that.metricMultiplier = "0.01666666666"; resultUS = 11; return true;
			case 6: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 11; return true;
			default: return false;
			}
		case 14:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 20; return true;
			case 5: this.metricMultiplier = "1.0"; that.metricMultiplier = "60.0"; resultUS = 20; return true;
			case 6: this.metricMultiplier = "1.0"; that.metricMultiplier = "3600.0"; resultUS = 20; return true;
			default: return false;
			}
		case 15:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 21; return true;
			case 5: this.metricMultiplier = "1.0"; that.metricMultiplier = "60.0"; resultUS = 21; return true;
			case 6: this.metricMultiplier = "1.0"; that.metricMultiplier = "3600.0"; resultUS = 21; return true;
			default: return false;
			}
		default: return false;
		}
	}
	
	boolean checkIfValidForDivision(unit that) {
		if(this.unitSpecifier==0 && that.unitSpecifier==0)
		{
			return true;
		}
		if(this.unitSpecifier== that.unitSpecifier)
		{
			resultUS =22;
			return true;
		}
		switch(this.unitSpecifier) {
		case 1:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 10; return true;
			case 5: this.metricMultiplier = "1.0"; that.metricMultiplier = "60.0"; resultUS = 10; return true;
			case 6: this.metricMultiplier = "0.001"; that.metricMultiplier = "1.0"; resultUS = 11; return true;
			default: return false;
			}
		case 2:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "1000.0"; that.metricMultiplier = "1.0"; resultUS = 10; return true;
			case 5: this.metricMultiplier = "1.0"; that.metricMultiplier = "0.01666666666"; resultUS = 11; return true;
			case 6: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 11; return true;
			default: return false;
			}
		case 3:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "0.3048"; that.metricMultiplier = "1.0"; resultUS = 10; return true;
			case 5: this.metricMultiplier = "0.3048"; that.metricMultiplier = "60.0"; resultUS = 10; return true;
			case 6: this.metricMultiplier = "0.3048"; that.metricMultiplier = "3600.0"; resultUS = 10; return true;
			default: return false;
			}
		case 10:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 12; return true;
			case 5: this.metricMultiplier = "1.0"; that.metricMultiplier = "60.0"; resultUS = 12; return true;
			case 6: this.metricMultiplier = "1.0"; that.metricMultiplier = "3600.0"; resultUS = 12; return true;
			default: return false;
			}
		case 11:
			switch(that.unitSpecifier) {
			case 4: this.metricMultiplier = "1.0"; that.metricMultiplier = "0.00027777777"; resultUS = 13; return true;
			case 5: this.metricMultiplier = "1.0"; that.metricMultiplier = "0.01666666666"; resultUS = 13; return true;
			case 6: this.metricMultiplier = "1.0"; that.metricMultiplier = "1.0"; resultUS = 13; return true;
			default: return false;
			}
		
		default: return false;
		}
	}
	
	/* *
	 * get result unit returns resultant unit after performing the operation
	 * */
	unit getResultantUnitAfterAddition(unit that) {
		return new unit(resultUS);
	}
	
	unit getResultantUnitAfterSubtraction(unit that) {
		return new unit(resultUS);
	}
	
	unit getResultantUnitAfterMultiplication(unit that) {
		return new unit(resultUS);
	}
	
	unit getResultantUnitAfterDivision(unit that) {
		return new unit(resultUS);
	}
}