package neumont.csc110.finalgame;

public enum Weapons {
	KnifeVirus("V"),
	CandleStickAdware("A"),
	Wrenchflaw("F"),
	Ropeworm("O"),
	RevolverRansomware("R"),
	LeadPipetrojan("T");
	
	public int room;
	public int x;
	public int y;
	public final String WeaponSymbol;
	
	private Weapons(String WeaponSymbol){
		this.WeaponSymbol = WeaponSymbol;
	}

}
