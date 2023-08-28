public class Person extends BadCharacters{
    public Person(String name, Inventory inventory, double power, double criticalRate,
                  double defenseRate, String goodQuote, String badQuote) {
        super(name, inventory, power, criticalRate, defenseRate, goodQuote, badQuote);
    }

    public void act() {
        System.out.print("1) ");
        talk();
        System.out.println();
        System.out.print("2) ");
        attack();
    }
}
