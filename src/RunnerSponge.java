/*
 * 1. In a Runner class, make Spongebob. Use the methods below to make him eat, and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */
public class RunnerSponge {
	public static void main(String[] args) {
		SeaCreature sbob = new SeaCreature("Spongebob");
		sbob.eat();
		sbob.laugh();
		SeaCreature Pat = new SeaCreature("Patrick");
		Pat.eat();
		Pat.laugh();
		SeaCreature sward = new SeaCreature("Squidward");
		sward.eat();
		sward.laugh();
	}
}
