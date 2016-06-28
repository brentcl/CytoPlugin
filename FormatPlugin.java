import java.util.*;
import java.io.*;

public class FormatPlugin {

    int numCols;
    string delim;
    
    public static void format(String fileName) {
	String newFile = "Formatted_" + fileName;
	System.out.println("Formatting...");
	File fileRead = new File(fileName);
	FileReader fileReader = new FileReader(fileRead);
	File fileWrite = new File(newFile);
	if (!fileWrite.exists()) {
	    fileWrite.createNewFile();
	}//if
	
	FileWriter fw = new FileWriter(fileWrite.getAbsoluteFile());
	BufferedWriter bw = new BufferedWriter(fw);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	String line;
	bufferedReader.readLine();
	while ((line = bufferedReader.readLine()) != null) {

	}//while
	
	
    }//format
    






}//FormatPlugin
