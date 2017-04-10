//: io/DirList3.java
//: Building the anonymous inner class "in-place"
// {Args: "D.*\.java"}

package com.io18;

import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList3 {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		File path = new File(".");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		} else {
			list = path.list(new FilenameFilter() {
				private Pattern pattern = Pattern.compile(args[0]);
				public boolean accept(File dir, String name) {
					return pattern.matcher(name).matches();
				}
			});
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String itemList: list) {
			System.out.println(itemList);
		}
	}
}
