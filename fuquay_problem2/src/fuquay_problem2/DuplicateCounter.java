package fuquay_problem2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
	public static Map<String, Integer> wordcounter;

	public void count(String dataFile) {
		Scanner sc =null;
		try {
			sc = new Scanner(new File(dataFile));
			wordcounter = new HashMap<>();
			while(sc.hasNext()){
				String currentword= sc.next();
				if(wordcounter.containsKey(currentword)) {
					wordcounter.put(currentword, wordcounter.get(currentword)+ 1);
				}
				else {
					wordcounter.put(currentword, 1);
				}
			}
			sc.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("The file is not found");
			System.exit(0);
		}
		
	}
	public void write(String outputFile) {
		try {
			File f = new File(outputFile);
			if(!f.exists()) {
					f.createNewFile();
			}
			PrintWriter pw = new PrintWriter(new FileOutputStream(outputFile,false));
			pw.print(wordcounter);
			pw.close();
			
			} 
			catch (IOException e) {
				System.out.println("An IOException has occured");
					e.printStackTrace();
					System.exit(0);
				}	
		
	}

}
//create an instance method called count that ----
//takes a single parameter called dataFile----
//of type string -----
//and uses a Map of strings to count how many times--
//each word occurs in dataFile--
//The counts should be stored in an instance variable call wordCounter---
//create an instance method called write that takes a single----
//paramater called outputFile---
//and writesthe contents of word counter to the file ---
//should be over written if it already exist of created if it does not ---

