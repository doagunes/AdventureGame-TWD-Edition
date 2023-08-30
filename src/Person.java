public class Person extends BadCharacters{
    public Person(String name, Inventory inventory, double power, double criticalRate,
                  double defenseRate, String goodQuote, String badQuote) {
        super(name, inventory, power, criticalRate, defenseRate, goodQuote, badQuote);
    }

    public void act() {
        talk();
        System.out.println();
        attack();
    }
}
