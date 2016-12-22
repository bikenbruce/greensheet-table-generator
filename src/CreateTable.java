import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateTable {
	public static void main(String[] args) throws FileNotFoundException{
		
		//path to file where each line represents each greensheet formatted how it would appear on the webpage
		File data = new File("/Users/web01/Desktop/Renamed.txt");
		
		//path to output file that will be created
		File newFile = new File("/Users/web01/Desktop/TableOutput.txt");
		
		//path to file where each line represents the corrected filename
		File newFile2 = new File("/Users/web01/Desktop/FileNames.txt");
		
		//URL to file where greensheets are saved in OU Campus
		String url = "http://www.sjsu.edu/dance/current_students/greensheets_syllabi/fall_2016_greensheets/";
		String semester;
		
		
		PrintWriter p = new PrintWriter(newFile);
		Scanner in = new Scanner(data);
		Scanner in2 = new Scanner(newFile2);
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the semester and year (ex. \"Fall 2016\"):");
		semester = userInput.nextLine();

		//print data to new file in html table format
		p.println("<table><tbody><tr><th>Document (pdf)</th><th>Class</th></tr>");
		
		while(in.hasNextLine()){
			//HTML table format with greensheet name and link to page
			p.println("<tr><td><a href=\"" + url + in2.nextLine() + "\" target=\"_blank\">" + in.nextLine()
			+ "</a></td><td>" + semester + "</td></tr>");
		}
		
		p.println("</tbody></table>");
		
		p.close();
	}
}