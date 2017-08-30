package com.libertymutual.goforcode.romanNumerals.services;

public class HinduToRomanNumeralConverter {
	public static String convert(int input) {
		
		String rom = "";
	    
		while (input >= 1000) {
	        rom = rom + "M";
	        input = input - 1000;
	        }
		
	    while (input >= 900) {
	    	rom = rom + "CM";
	    	input = input - 900;
	    }
	    
	    while (input >= 500) {
	    	rom = rom + "D";
	    	input = input - 500;
	    }
	    
	    while (input >= 400) {
	    	rom = rom + "CD";
	    	input = input - 400;
	    }

		while (input >= 100) {
			rom = rom + "C";
			input = input - 100;
		}

		while (input >= 90) {
			rom = rom + "XC";
			input = input - 90;
		}

		while (input >= 50) {
			rom = rom + "L";
			input = input - 50;
		}

		while (input >= 40) {
			rom = rom + "XL";
			input = input - 40;
			}

	    while (input >= 10) {
	    	rom = rom + "X";
	        input = input - 10;
	    	}

	    while (input >= 9) {
	    	rom = rom + "IX";
	        input -= 9;
	    }
	    
	    while (input >= 5) {
	    	rom = rom + "V";
	        input -= 5;
	    }
	    
		while (input >= 4) {
			rom = rom + "IV";
			input = input - 4;
		}

		while (input >= 1) {
			rom = rom + "I";
			input = input - 1;
		}
		return rom;
	}
}
