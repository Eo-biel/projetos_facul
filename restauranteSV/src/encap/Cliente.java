package encap;

public class Cliente extends Pessoas{
	
	private String Numcomanda;

	public String getNumcomanda() {
		return Numcomanda;
	}

	public void setNumcomanda(String numcomanda) {
		if (numcomanda.matches("\\d{3}"))
		Numcomanda = numcomanda;
	
	
	}
	
}

	