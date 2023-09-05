public class MainCharacter extends Character{
    private Character selectCharacter;
    public MainCharacter(String name, Inventory inventory, double power,
                         double criticalRate, double defenseRate, String goodQuote, String badQuote) {
        super(name, inventory, power, criticalRate, defenseRate, goodQuote, badQuote);
        selectCharacter = null;
        health = 300;
    }

    public Character getSelectCharacter() {
        return selectCharacter;
    }

    public void setSelectCharacter(Character selectCharacter) {
        this.selectCharacter = selectCharacter;
    }

    @Override
    public void act() {
    }
}
