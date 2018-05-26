import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args){
		
	//ask user for flavor of popcorn
	String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	//ask user for number of minutes to cook it	
	String minutes = JOptionPane.showInputDialog("How many minutes do you want the popcorn to cook for in the microwave?");
	int m = Integer.parseInt(minutes);
	//create a bag of popcorn
	Popcorn popcorn = new Popcorn(flavor);
	//put it in the microwave
	Microwave microwave = new Microwave();
	microwave.putInMicrowave(popcorn);
	//cook it in microwave
	microwave.setTime(m);
	microwave.startMicrowave();
}
}