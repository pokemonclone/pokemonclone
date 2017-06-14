package mainpackage;

public class BattleModule extends Pokemon {
	
	/* Trying to implement the DamgeAttack/Attack methods has
	 * its problems. Can I change the HP or stats of the
	 * Pokemon I am attacking??? Or will I have to make
	 * the defending pokemon an implicit parameter to make
	 * sure that I can subtract any damage done from its HP.
	 * This will affect all the other code as I will have to
	 * know whether to have the attacker or the defender
	 * as the implicit or explicit parameter.
	 */
		public void NormalAttack(Pokemon other) {
			if(this.isHit(other)) {
					other.subtractHP(this.getATK());
			}
			else {
				/* MISS CONDITION: NO DAMAGE DEALT */
				
				//we need to find a way to implement messages
				//like this one into the UI
				System.out.println(this.getName() + " missed!");
			}
		}
		
		public void WaterAttack(Pokemon other) {
			if(this.isHit(other)) {
				if(other.getType().equals("Fire")) {
					//an effective attack deals double damage
					//"It's super effective!!!"
					other.subtractHP((this.getATK() * 2));
					System.out.println("It's super effective!!!");
				}
				else if(other.getType().equals("Grass")) {
					//an ineffective attack deals half damage
					//"It's not very effective..."
					
					other.subtractHP((this.getATK() / 2));
					System.out.println("It's not very effective...");
				}
				else {
					other.subtractHP(this.getATK());
				}
			}
			else {
				/* MISS CONDITION: NO DAMAGE DEALT */
				
				//we need to find a way to implement messages
				//like this one into the UI
				System.out.println(this.getName() + " missed!");
			}
		}
		
		public void FireAttack(Pokemon other) {
			if(this.isHit(other)) {
				if(other.getType().equals("Grass")) {
					//an effective attack deals double damage
					//"It's super effective!!!"
					other.subtractHP((this.getATK() * 2));
					System.out.println("It's super effective!!!");
				}
				else if(other.getType().equals("Water")) {
					//an ineffective attack deals half damage
					//"It's not very effective..."
					
					other.subtractHP((this.getATK() / 2));
					System.out.println("It's not very effective...");
				}
				else {
					other.subtractHP(this.getATK());
				}
			}
			else {
				/* MISS CONDITION: NO DAMAGE DEALT */
				
				//we need to find a way to implement messages
				//like this one into the UI
				System.out.println(this.getName() + " missed!");
			}
		}
		
		public void GrassAttack(Pokemon other) {
			if(this.isHit(other)) {
				if(other.getType().equals("Water")) {
					//an effective attack deals double damage
					//"It's super effective!!!"
					other.subtractHP((this.getATK() * 2));
					System.out.println("It's super effective!!!");
				}
				else if(other.getType().equals("Fire")) {
					//an ineffective attack deals half damage
					//"It's not very effective..."
					
					other.subtractHP((this.getATK() / 2));
					System.out.println("It's not very effective...");
				}
				else {
					other.subtractHP(this.getATK());
				}
			}
			else {
				/* MISS CONDITION: NO DAMAGE DEALT */
				
				//we need to find a way to implement messages
				//like this one into the UI
				System.out.println(this.getName() + " missed!");
			}
		}

		public void Leer(Pokemon other) {
			if(this.isHit(other)) {
				other.subtractAGI(this.getATK()/2);
			}
			else {
				/* MISS CONDITION: NO DAMAGE DEALT */
				
				//we need to find a way to implement messages
				//like this one into the UI
				System.out.println(this.getName() + " missed!");
			}
		}
		
		public void  BuffATK() {
			//increases ATK by 5 (subtracts a negative)
			this.subtractATK(-5);
		}
		
		public void Growl(Pokemon other) {
			if(this.isHit(other)) {
				//decreases opponent's attack by a fourth of attacker's ATK
				other.subtractATK(this.getATK()/4);
			}
			else {
				/* MISS CONDITION: NO DAMAGE DEALT */
				
				//we need to find a way to implement messages
				//like this one into the UI
				System.out.println(this.getName() + " missed!");
			}
		}
		
		public boolean isHit(Pokemon other) {
			int z = 100 - (this.getACC() - other.getAGI());
			if(((int)(Math.random() * 100)) <= z) {
				return false;
			}
			else {
				return true;
			}
		}
		
		
		// Fire beats Grass, Grass beats Water, Water beats Fire
		// Normal type beats none
		/* this is getting frustrated at me for using this,
		so i may have to move it to pokemon or have battlemodule
		extend pokemon vvvvv */
		/*
		public boolean isCritical(Pokemon other) {
			if((this.getType()).equals("Fire")) {
				if(other.getType().equals("Grass")) return true;
				if(other.getType().equals("Water")) return false;
				if(other.getType().equals("Fire")) return false;
				return false;
			}
			else if(this.getType().equals("Water")) {
				if(other.getType().equals("Grass")) return false;
				if(other.getType().equals("Water")) return false;
				if(other.getType().equals("Fire")) return true;
				return false;
			}
			else if(this.getType().equals("Grass")){
				if(other.getType().equals("Grass")) return false;
				if(other.getType().equals("Water")) return true;
				if(other.getType().equals("Fire")) return false;
				return false;
			}
			else return false;
		}
		//Fire is weak to Water, Grass is weak to Water, Water is
		//weak to Grass, Normal type is weak to none
		public boolean isIneffective(Pokemon other) {
			if((this.getType()).equals("Fire")) {
				if(other.getType().equals("Grass")) return false;
				if(other.getType().equals("Water")) return true;
				if(other.getType().equals("Fire")) return false;
				return false;
			}
			else if(this.getType().equals("Water")) {
				if(other.getType().equals("Grass")) return true;
				if(other.getType().equals("Water")) return false;
				if(other.getType().equals("Fire")) return false;
				return false;
			}
			else if(this.getType().equals("Grass")){
				if(other.getType().equals("Grass")) return false;
				if(other.getType().equals("Water")) return false;
				if(other.getType().equals("Fire")) return true;
				return false;
			}
			else return false;
		} */
}
