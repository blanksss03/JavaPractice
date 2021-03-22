import javax.swing.JOptionPane;
import java.util.Date;
import  java.text.SimpleDateFormat;

/*
 *	Week3Program2 Sample Program : Displaying the Monogram & Date
 *	2020-03-22
 *	Implemented by Sangjin sim
 */
public class Week3Program2 {

	public static void main(String[] args) {
		String name;
		String first, middle, last;
		String space= " ";
		String monogram;
		
		// UI to get iser's full name
		name = JOptionPane.showInputDialog(null, "Enter your full name (first, middle, last):");
		
		// Extract first, middle, and last names, respectively
		first = name.substring(0, name.indexOf(space));
		name = name.substring(name.indexOf(space) + 1, name.length());
		middle = name.substring(0, name.indexOf(space));
		last = name.substring(name.indexOf(space), name.length());
		
		// Compute the monogram
		monogram = first.substring(0, 1) + middle.substring(0,1) + last.substring(0,1);
	
		//Get date
		Date today = new Date();
		SimpleDateFormat dataForm = new SimpleDateFormat("MM/dd/yy");
		
		JOptionPane.showMessageDialog(null, "Your monogram is " + monogram + "\n"
				+ "Today is " + dataForm.format(today));
	}
}
