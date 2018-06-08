public class JamesBond {
	JamesBond() {
		
	}

	public void findCode(Vault vault) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000000; i++) {
			
		if(vault.tryCode(i) == true) {
			break;
		}
		}
	
	}
}