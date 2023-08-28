public class Person extends BadCharacters{
    public Person(String name, Inventory inventory, double power, double criticalRate,
                  double defenseRate, String goodQuote, String badQuote) {
        super(name, inventory, power, criticalRate, defenseRate, goodQuote, badQuote);
    }
    public void talk() {
        System.out.println("1)Talk with " + getName());
    }
    public void attack() {
        System.out.println("2)Attack to " + getName());
    }

    public void act() {
        talk();
        attack();
    }
}
