public abstract class Character {
    String name;
    Inventory inventory;
    double health;
    double power;
    double criticalRate;
    int killedCharacterNo;
    double defenseRate;
    String goodQuote;
    String badQuote;

    public Character(String name, Inventory inventory, double power, double criticalRate,
                     double defenseRate, String goodQuote, String badQuote) {
        killedCharacterNo = 0;
        this.name = name;
        this.inventory = inventory;
        this.power = power;
        this.criticalRate = criticalRate;
        this.defenseRate = defenseRate;
        this.goodQuote = goodQuote;
        this.badQuote = badQuote;
    }

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getCriticalRate() {
        return criticalRate;
    }

    public void setCriticalRate(double criticalRate) {
        this.criticalRate = criticalRate;
    }

    public int getKilledCharacterNo() {
        return killedCharacterNo;
    }

    public void setKilledCharacterNo(int killedCharacterNo) {
        this.killedCharacterNo = killedCharacterNo;
    }

    public double getDefenseRate() {
        return defenseRate;
    }

    public void setDefenseRate(double defenseRate) {
        this.defenseRate = defenseRate;
    }

    public String getGoodQuote() {
        return goodQuote;
    }

    public void setGoodQuote(String goodQuote) {
        this.goodQuote = goodQuote;
    }

    public String getBadQuote() {
        return badQuote;
    }

    public void setBadQuote(String badQuote) {
        this.badQuote = badQuote;
    }
}
