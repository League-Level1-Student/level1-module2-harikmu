import javax.swing.JOptionPane;

public class Vault {
	int secretCode = 34227;
	Vault() {
	}
	boolean tryCode(int num) {
		// TODO Auto-generated method stub
	
		if(num == secretCode) {
			JOptionPane.showMessageDialog(null, "You unlocked the vault!");
			return true;
		}
		else {
			System.out.println("Try again");
			return false;
		}
	}
	}

	

