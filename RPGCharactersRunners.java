
public class RPGCharactersRunners {

	public static void main(String[] args) {
		
		Warrior c1 = new Warrior("Jim");
		Warrior c2 = new Warrior("Bob");
		Warrior c3 = c1; // c3 and c1 refer to the same warrior
		Warrior c4 = new Warrior("Min", 5);
		Warrior c5 = new Warrior ("Jeff", 7);
		
	}

}
