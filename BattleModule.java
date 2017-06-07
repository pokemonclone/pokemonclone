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
		public void DamageAttack(Pokemon other) {
			if(this.isHit(other)) {
				if(this.isCritical(other)) {
					//an effective attack deals double damage
					//"It's super effective!!!"
					//code
				}
				else if(this.isIneffective(other)) {
					//an ineffective attack deals half damage
				}
				else {
					
				}
			}
			else {
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
		}
}
