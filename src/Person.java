public class Person extends BadCharacters{
    public Person(String name, Inventory inventory, double power, double criticalRate,
                  double defenseRate, String goodQuote, String badQuote,boolean isBadChar) {
        super(name, inventory, power, criticalRate, defenseRate, goodQuote, badQuote, isBadChar);
    }

    public void act() {
        attack();
    }

}
