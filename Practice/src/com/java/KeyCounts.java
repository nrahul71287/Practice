package com.java;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Rahul Nakkanwar 
 * This class is used for counting the number of strings
 * on each line
 */
public class KeyCounts {
	
	
	/**
	 * Logger to log errors
	 */
	Logger log = Logger.getLogger("KeyCounts");

	/**
	 * Function to count number of keys for each name
	 * @param filePath
	 * 			- takes file path as input for checking names and their counts
	*/
	public Boolean countKeys(String filePath) {
		String keyName;
		Integer keyCount;
		HashMap<String, Integer> keyCountMap = new HashMap<String, Integer>();
		try {
			for (String line : Files.readAllLines(Paths.get(filePath),
					Charset.defaultCharset())) {
				List<String> keyCountList = Arrays.asList(line.split(","));
				if (keyCountList.size() != 2) {
					System.out.println("Incorrect File contents");
					return false;
				} else {
					keyName = keyCountList.get(0);
					//remove starting and trailing spaces before parsing
					keyCount = Integer.parseInt(keyCountList.get(1).trim());
					//check if key already exists in map
					if (keyCountMap.containsKey(keyName)) {
						keyCountMap.put(keyName, keyCountMap.get(keyName)
								+ keyCount);
					} else {
						keyCountMap.put(keyName, keyCount);
					}
				}
			}
			//write to output file
			writeMapToFile(keyCountMap);
			return true;
		}catch(NumberFormatException nf){
			log.log(Level.SEVERE, "Please check if second value is number");
		}
		catch (IOException io) {
			log.log(Level.SEVERE, "Error while reading given file");
		}
		return false;
	}


	/**
	 * Function to write name and their respective counts on console as well as output file
	 * @param keyValueMap
	 * 			- HashMap containing all values and their counts
	 */
	private void writeMapToFile(HashMap<String, Integer> keyValueMap) {
		try {
			System.out.println("Below are the keys and the number of their counts : \n");
			FileWriter writer = new FileWriter("src/resources/Output.txt");
			for (Map.Entry<String, Integer> entry : keyValueMap.entrySet()) {
				System.out.println(entry.getKey() + "," + entry.getValue());
				writer.write(entry.getKey() + "," + entry.getValue() + "\n");
			}
			writer.close();
		} catch (IOException io) {
			log.log(Level.SEVERE, io.getMessage());
			System.out.println("Error while writing data to file");
		}
		
	}
	
	
	/**
	 * Main method to test count keys functionality
	 * @param args - String arguments
	 */
	public static void main(String[] args) {
		KeyCounts count = new KeyCounts();
		count.countKeys("src/resources/Input.txt");
	}
}
