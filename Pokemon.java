package mainpackage;

public class Pokemon {
	private String Pokemon;
    private String Type;
    private int HP;
    private int ATK;
    private int AGI; //between 0-10
    private int ACC; //between 0-100
    
	public Pokemon(String n, String t, int H, int AT, int AG, int AC){
	    Pokemon = n;
	    Type = t;
	    HP = H;
	    ATK = AT;
	    AGI= AG;
	    ACC = AC;
	}
	
	public Pokemon() {
		Pokemon = "NoNameNormal";
		Type = "Normal";
		HP = 100;
		ATK = 25;
		AGI = 5;
		ACC = 85;
	}
	 public String getName(){
	     return Pokemon;
	 }
	 public String getType(){
	     return Type;
	 }
	 public int getHP(){
	     return HP;
	 }
	 public int getATK(){
	     return ATK;   
	 }
	 public int getAGI(){
	     return AGI;
	 }
	 public int getACC(){
	     return ACC;   
	 }
	 public void setHP(int newHP) {
		 HP = newHP;
	 }
}
