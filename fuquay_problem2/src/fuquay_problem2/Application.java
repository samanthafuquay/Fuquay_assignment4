package fuquay_problem2;

public class Application {

	public static void main(String[] args) {
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		String dataFile = "problem2.txt";
		String outputFile = "unique_word_counts.txt";
		duplicateCounter.count(dataFile);
		duplicateCounter.write(outputFile);
		System.out.println("Did we make it to the end!!!");

	}

}
//contians a main method which illustrates the use of DuplicateCounter
//by calling both the remove and write methods
//your input file must be called problem2.txt 
//your output file must be called unique_word_counts.txt 
//Your input file should be located within your project
//must handle any exceptions that iwll be thrown with in the method 