/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid
Sample Input

07:05:45PM
Sample Output

19:05:45


*/


package hackerrank;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	public static void main(String[] args) throws IOException {

		System.out.println(timeConversion("07:05:45PM"));

	}

	private static String timeConversion(String s) {

		String s1 = s.substring(8, 10);
		String s2 = s.substring(2, 8);
		String s3 = s.substring(0, 2);
		
		if (s1.equals("PM")) {
			return ((s3.equals("12") ? "12" : (Integer.parseInt(s3) + 12)) + s2);
		} else {
			return ((s3.equals("12") ? "00" : s3) + s2);
		}
	}

	//7 test cases failed
	private static String timeConversion2(String s) {

		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");

		DateFormat format = new SimpleDateFormat("hh:mm:ss");

		Date time = null;

		String output = "";

		try {
			time = dateFormat.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		output = format.format(time);

		return output;
	}

}
