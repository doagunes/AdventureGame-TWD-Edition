import java.util.ArrayList;
import java.util.Random;

public class Chapter {
    private int chapterNo;

    ArrayList<Mission> missions1 = new ArrayList<>();
    ArrayList<Mission> missions2 = new ArrayList<>();
    ArrayList<Mission> missions3 = new ArrayList<>();
    ArrayList<Mission> missions4 = new ArrayList<>();

    Inventory rickInventory = new Inventory("Colt Python");
    Inventory morganInventory = new Inventory();
    Inventory darlyInventory = new Inventory();
    Inventory carlInventory = new Inventory();
    Inventory governorInventory = new Inventory();
    Inventory shaneInventory = new Inventory();
    Inventory loriInventory = new Inventory();
    Inventory zombieInventory = new Inventory();

    Character rick = new MainCharacter("Rick Grimes", rickInventory, 28, (double) 1 /2,
            (double) 1 /4, "Hello how is it going?", "nope, ı don't think so");
    Character darly = new GoodCharacters("Darly Dixon", darlyInventory, 40, (double) 2/3,
            (double) 1/5, "Let's go man", "I ain’t no one’s b*tch");
    Character morgan = new GoodCharacters("Morgan", morganInventory, 22, (double) 7/9,
            (double) 2/5, "Let's go man", "I ain’t no one’s b*tch");
    Character lori = new GoodCharacters("Lori Grimes", loriInventory, 5, (double) 1/12,
            (double) 1/8, "No problem, ı get it", "Maybe this isn’t a world for children anymore.");
    Character shane = new Person("Shane Walsh", shaneInventory, 33, (double) 1/3,
            (double) 1/4, "Okay buddy you are the chief", "Rick, you can’t just be the good guy and expect to live. Okay? Not anymore.");
    Character carl = new GoodCharacters("Carl Grimes", carlInventory, 8, (double) 1/10,
            (double) 1/20, "Okay daddy, love ya", "I am not a kid any more, okay!!");
    Character governor = new Person("Philip Blake(Governor)", governorInventory, 30, (double) 2/10,
            (double) 2/10, "", "I am not a kid any more, okay!!");
    Character zombie = new Zombie("Zombie", zombieInventory, 20, (double) 1 / 10,
            (double) 1 / 10, "whaaaaaaaa", "whaaaaaaaa");


    private int missionIndex = 0;
    private int mission2Index = 0;
    private int mission3Index = 0;

    Mission m11 = new Mission("Escape from the hospital", "attack the zombies or run", zombie);
    Mission m12 = new Mission("Morgan", "Talk to Morgan", morgan);
    Mission m13 = new Mission("Center", "Escape from zombies", zombie);
    Mission m14 = new Mission("Camp", "Talk to Lori", lori);
    Mission m21 = new Mission("Highway", "Talk to Shane", shane);
    Mission m22 = new Mission("Forest", "Save Sofia and kill zombies", zombie);
    Mission m23 = new Mission("Farm", "Talk to Hershel", darly); //darly yerine hershel gelecek
    Mission m24 = new Mission("Forest", "Kill Zombies", zombie);
    Mission m25 = new Mission("Forest", "Kill Shane and escape from the farm", shane);
    Mission m31 = new Mission("Forest", "Talk to Darly", darly);
    Mission m32 = new Mission("Prison", "Talk with Carl", carl);
    Mission m33 = new Mission("Forest", "Kill zombies", zombie);
    Mission m34 = new Mission("WoodBury", "Save Glenn and Maggie", governor);
    Mission m35 = new Mission("Prison", "Battle with the governor and his crew", governor);


    public Chapter(int no) {

        switch (no){
            case 1: missions1.add(m11);
                    missions1.add(m12);
                    missions1.add(m13);
                    missions1.add(m14);
                    break;
            case 2: missions2.add(m21);
                    missions2.add(m22);
                    missions2.add(m23);
                    missions2.add(m24);
                    missions2.add(m25);
                    break;
            case 3: missions3.add(m31);
                    missions3.add(m32);
                    missions3.add(m33);
                    missions3.add(m34);
                    missions3.add(m35);
                    break;
        }

    }

    public void nextMission(){

        if(chapterNo == 1){

                if(missions1.get(missionIndex).isCompleted){
                    missionIndex++;
                }

        } else if(chapterNo == 2){

                if(missions2.get(mission2Index).isCompleted){
                    mission2Index++;
                }

        }else if(chapterNo == 3){

                if(missions3.get(mission3Index).isCompleted){
                    mission3Index++;
                }
        }

    }

    public void showMission(){
        if(chapterNo == 1){

            System.out.println(missions1.get(missionIndex).getName() + "\n" +
                    missions1.get(missionIndex).getDescription());

        } else if(chapterNo == 2){
            System.out.println(missions2.get(mission2Index).getName() + "\n" +
                    missions2.get(mission2Index).getDescription());

        }else if(chapterNo == 3){

            System.out.println(missions3.get(mission3Index).getName() + "\n" +
                    missions3.get(mission3Index).getDescription());

        }

    }

    public void selectChocie() { // seçeneklerden bi tanesi seçilir ve main character'deki selectCharacter
        // bir karaktere eşitlernir
    }

    public void characterAction() {

    }

    public void addZombieToPlace(ArrayList<Character> characterList) {
        Random random = new Random();
        int maxZombieNo = random.nextInt(4) + 3;
        for (int i = 0;i<maxZombieNo;i++) {
            characterList.add(zombie);
        }
    }

    
}
