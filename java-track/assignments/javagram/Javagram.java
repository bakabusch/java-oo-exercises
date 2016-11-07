package javagram;

import javagram.filters.*;

import java.io.File;
//import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.text.NumberFormat;



public class Javagram {
	
	
	
	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath;
		Picture picture = null;
		Scanner in = new Scanner(System.in);

		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				//String[] relPathParts = relPath.split(File.separator);
				//imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				imagePath = (dir + "\\" + relPath);
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		// TODO - prompt user for filter and validate input
		Filters Filter = null;
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		do{
		int choiceNum;
			System.out.println("Please choose an option to apply filter");
			System.out.println("Press 1 for Blue Filter");
			System.out.println("Press 2 for Turquoise Filter");
			System.out.println("Press 3 for Gray Filter");
			System.out.println("Press 4 for Purple Haze Filter");
			//Scanner  = new Scanner(System.in);
			
		//String choice = keyboard.next();
		
		try{
		choiceNum = in.nextInt();
		Filter = getFilter(choiceNum);
			
		}
		catch(InputMismatchException e){
			System.out.println("That's not a number dude");
		}
	} while(Filter == null);
		// filter and display image
		Picture processed = Filter.process(picture); 
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		char reply;
		char affirm = 0;
		
		do{
			System.out.println("Save image to (relative to " + dir + "?) (type 'y' to overwrite, 'n' to enter new file path or 'e' to exit):");
			reply = in.findWithinHorizon(".", 0).charAt(0);
		}while (reply != 'y' && reply != 'n' && reply != 'e');
			
		if (reply == 'n'){
		System.out.println("enter file name");
		String fileName = in.next();
		String absFileName = dir + File.separator + fileName;
		processed.save(absFileName);
		System.out.println("Image saved to " + absFileName);
		
		
		}else if (reply == 'e'){
			System.out.println("Image not saved");
		
		}else{
				System.out.println("Are you sure you want to do this buddy? (y/n)");
				affirm = in.findWithinHorizon(".", 0).charAt(0);
				}while (affirm != 'y' && affirm != 'n');
					if (affirm == 'y'){
						//String fileName = in.next();
						String absFileName = dir + File.separator;
						processed.save(absFileName);
						System.out.println("Image saved to " + absFileName);
					}else{ 
						System.out.println("enter file name");
						String fileName = in.next();
						String absFileName = dir + File.separator + fileName;
						processed.save(absFileName);
						System.out.println("Image saved to " + absFileName);
			
			
		
		//
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
		//if (fileName.equals("exit")) {
		//	System.out.println("Image not saved");	
		
		// close input scanner
		in.close();}
		}
	

	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter

	
	private static Filters getFilter(int choiceNum) throws InputMismatchException {
		if (choiceNum == 1){
			return new BlueFilter();
		}else if (choiceNum == 2){			
			return new TurquoiseFilter();
		}else if (choiceNum == 3){
			return new GrayFilter();
		}else if (choiceNum == 4){
			return new PurpleHazeFilter();	
		}else{ 	
			throw new InputMismatchException();
		//}else if (choiceNum == 3){			
		}
	}
		
	}

	
		
	
	
	
		// TODO - create some more filters, and add logic to return the appropriate one
		//return new BlueFilter();
		
	

		