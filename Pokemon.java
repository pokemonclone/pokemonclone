package mainpackage;

import java.util.ArrayList;

public class Pokemon {
	private int POT; //amount of potions left in the player's inventory
	private ArrayList<String> Attacks; /* attacks the pokemon can use, with the method
	names stored as individual Strings in the String ArrayList */
	private String Pokemon;
    private String Type;
    private int HP;
    private int ATK;
    private int AGI; //between 0-10
    private int ACC; //between 0-100
    
	public Pokemon(String n, String t){
	    Pokemon = n;
	    Type = t;
	    /*
	    Instead of having the player initialize their Pokemon's stats,
	    stats are automatically intialized by type.
	    
	    HP = H;
	    ATK = AT;
	    AGI= AG;
	    ACC = AC;
	    
	    */
	    if(t.equals("Fire")) {
	    	HP = 90;
			ATK = 30;
			AGI = 5;
			ACC = 80;
			POT = 1;
	    	Attacks.add("Growl");
			Attacks.add("NormalAttack");
			Attacks.add("Leer");
			Attacks.add("BuffATK");
			Attacks.add("Potion");
			Attacks.add("SandAttack");
			Attacks.add("FireAttack");
	    }
	    else if(t.equals("Water")) {
	    	HP = 120;
			ATK = 25;
			AGI = 15;
			ACC = 90;
			POT = 2;
	    	Attacks.add("Growl");
			Attacks.add("NormalAttack");
			Attacks.add("Leer");
			Attacks.add("BuffATK");
			Attacks.add("Potion");
			Attacks.add("SandAttack");
			Attacks.add("WaterAttack");
	    }
	    else if(t.equals("Grass")) {
	    	HP = 110;
			ATK = 20;
			AGI = 10;
			ACC = 95;
			POT = 2;
	    	Attacks.add("Growl");
			Attacks.add("NormalAttack");
			Attacks.add("Leer");
			Attacks.add("BuffATK");
			Attacks.add("Potion");
			Attacks.add("SandAttack");
			Attacks.add("Grass");
	    }
	    else {
	    	HP = 100;
			ATK = 25;
			AGI = 10;
			ACC = 85;
			POT = 3;
			Attacks.add("Growl");
			Attacks.add("NormalAttack");
			Attacks.add("Leer");
			Attacks.add("BuffATK");
			Attacks.add("SandAttack");
			Attacks.add("Potion");
	    }
	}
	
	public Pokemon() {
		Pokemon = "NoNameNormal";
		Type = "Normal";
		HP = 100;
		ATK = 25;
		AGI = 10;
		ACC = 85;
		POT = 3;
		Attacks.add("Growl");
		Attacks.add("NormalAttack");
		Attacks.add("Leer");
		Attacks.add("BuffATK");
		Attacks.add("Potion");
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
	 public void subtractHP(int damage) {
		 HP -= damage;
	 }
	 public void subtractAGI(int damage) {
		 AGI -= damage;
	 }
	 public void subtractATK(int damage) {
		 ATK -= damage;
	 }
	 public void subtractACC(int damage) {
		 ACC -= damage;
	 }
}
