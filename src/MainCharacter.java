import java.util.Random;
import java.util.Scanner;

public class MainCharacter extends Character{

    Scanner scanner = new Scanner(System.in);

    double rickCriticalNumber = 0;
    double badCharacterDefenseNumber = 0;
    boolean isCriticalRandom = false;
    boolean isDefenseRandom = false;
    double criticalRandom = 0;
    double defenseRandom = 0;
    int desicionType;

    static double health;

    boolean isGood = false;


    private Character selectCharacter;
    Random random = new Random();
    public MainCharacter(String name, Inventory inventory, double power,
                         double criticalRate, double defenseRate, String goodQuote, String badQuote, boolean isBadChar) {
        super(name, inventory, power, criticalRate, defenseRate, goodQuote, badQuote, isBadChar);
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

    @Override
    public void attackTo(MainCharacter rick) {
    }

    public void warningHealthMetod(){

        // Todo: Sadece attack() metotlarından sonra kullanmayı öneren algoritmayı oluştur!!!
        int desicionNumber = -1;
        if(health > 0 && health < 150){
        while(desicionNumber != 1 || desicionNumber != 2) {
            // Todo: Denemek için böyle sonra değiştirilecek!!!
            try {
                System.out.println("Your health is very low\n" +
                        "1 -> Use Bandage    2 -> Not Use");
                desicionNumber = Integer.parseInt(scanner.nextLine()); //String girildiğinde catch bloğuna girecek!!!!

                if (desicionNumber == 1) {
                    health += 20; // Todo: Değişebilir
                    System.out.println("New Health: " + health);
                    int decreasedBandageNumber = inventory.getBandageNumber() - 1;
                    inventory.setBandageNumber(decreasedBandageNumber);

                    System.out.println("Number of bandages remaining: " + inventory.getBandageNumber());
                    break;

                } else if (desicionNumber == 2) {
                    System.out.println("BEST OF LUCK :))))");
                    break;
                }
            } catch (Exception exception) {
                System.out.println("You should enter valid number!!\n");
            }
        }


        }
    }

    public void isGoodCharacter(){
        isGood = false;
        if(selectCharacter.getClass().equals(GoodCharacters.class)){
            isGood = true;
        }else if(selectCharacter.getClass().equals(BadCharacters.class)){
            isGood = false;
        }
    }

    public void talkWithCharacters(Character character , Character character2, Character character3){
        desicionType = -1;
        while(desicionType != 1 || desicionType != 2){
            try{
                System.out.println("Do you want to start this conversation GOOD or BAD..\n" +
                        "1 -> GOOD     2 -> BAD");
                desicionType = Integer.parseInt(scanner.nextLine());
                if(desicionType == 1){
                    System.out.println(getName() + ": " + goodQuote);
                    System.out.println(getSelectCharacter().getName() + ": " + getSelectCharacter().goodQuote);
                    bandageFromCharacterToRick(character, character2, character3);
                    break;
                }else if(desicionType == 2){
                    System.out.println(getName() + " " + badQuote);
                    System.out.println(getSelectCharacter().getName() + " " + getSelectCharacter().badQuote);
                    break;
                }
            }catch (Exception e){
                System.out.println("You should enter valid number!!\n");
            }

        }

    }

    public void bandageFromCharacterToRick(Character character, Character character2, Character character3){

        // Todo: sınırlama olacak

        if((getSelectCharacter() == character) || (getSelectCharacter() == character2) || (getSelectCharacter() == character3) && desicionType == 1) {
                int increasedBandageNumber = inventory.getBandageNumber() +1;
                inventory.setBandageNumber(increasedBandageNumber);
                System.out.println(getSelectCharacter().getName() + ": " + "Please take this bandage, you will need..");
                System.out.println("Number of bandages remaining: " + inventory.getBandageNumber());
        }
    }



   public void rateCalculation(Character character){

        rickCriticalNumber = criticalRate * 10;
        badCharacterDefenseNumber = character.defenseRate * 10;
        isCriticalRandom = false;
        isDefenseRandom = false;

        criticalRandom = random.nextDouble(11);
        defenseRandom = random.nextDouble(11);

        if(criticalRandom <= rickCriticalNumber){
            isCriticalRandom = true;
        }
        if(defenseRandom <= badCharacterDefenseNumber){
            isDefenseRandom = true;
        }

   }

    public void attackToBadCharacter(Character character){

        rateCalculation(character);
        System.out.println(isCriticalRandom);
        System.out.println(isDefenseRandom);

        if(isCriticalRandom){

            if(isDefenseRandom){
                System.out.println("You hit: " + power);
                character.health -= power;// sadece power'ı printle


            }else {
                System.out.println("You have killed this enemy with head shot");
                 character.health = 0; // headshotla öldü
            }

        }else{

            if(isDefenseRandom){

                double newPower = (1-character.defenseRate) * power;
                System.out.println("You hit: " + newPower);
                character.health -= newPower; //yeni kullanılan power'ı printle

            }else {
                System.out.println("You hit: " + power);
                 character.health -= power; // sadece power'ı printle
            }
        }
    }

}
