import java.util.Random;

public class MainCharacter extends Character{

    double rickCriticalNumber = 0;
    double badCharacterDefenseNumber = 0;
    boolean isCriticalRandom = false;
    boolean isDefenseRandom = false;
    double criticalRandom = 0;
    double defenseRandom = 0;

    private Character selectCharacter;
    Random random = new Random();
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

   public void rateCalculation(BadCharacters character){

        rickCriticalNumber = criticalRate * 10;
        badCharacterDefenseNumber = character.defenseRate * 10;
        isCriticalRandom = false;
        isDefenseRandom = false;

        criticalRandom = random.nextDouble(11);
        defenseRandom = random.nextDouble(11);

        if(criticalRandom >= 0 || criticalRandom <= rickCriticalNumber){
            isCriticalRandom = true;
        }
        if(defenseRandom >= 0 || defenseRandom <= badCharacterDefenseNumber){
            isDefenseRandom = true;
        }

   }

    public double attackToBadCharacter(BadCharacters character){

        rateCalculation(character);

        if(isCriticalRandom){

            if(isDefenseRandom){

                return character.health - power;

            }else {

                return character.health = 0;
            }

        }else{

            if(isDefenseRandom){

                double newPower = (1-character.defenseRate) * power;
                
                return character.health - newPower;

            }else {

                return character.health - power;
            }
        }
    }

}
