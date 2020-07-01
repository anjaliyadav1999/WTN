package com.wipro.exception;
import java.util.*;
public class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		super();
		System.out.println("Invalid age");
	}
}
