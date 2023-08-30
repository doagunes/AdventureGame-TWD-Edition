import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Chapter {
    Scanner mySc = new Scanner(System.in);
    private int chapterNo;
    private int selectionNo = 0;

    Mission mis = new Mission();
    ArrayList<Mission> missions1 = new ArrayList<>();
    ArrayList<Mission> missions2 = new ArrayList<>();
    ArrayList<Mission> missions3 = new ArrayList<>();
    ArrayList<Mission> missions4 = new ArrayList<>();

    ArrayList<Places> places1 = new ArrayList<>();
    ArrayList<Places> places2 = new ArrayList<>();
    ArrayList<Places> places3 = new ArrayList<>();
    ArrayList<Places> places4 = new ArrayList<>();


    Inventory rickInventory = new Inventory("Colt Python");
    Inventory morganInventory = new Inventory();
    Inventory darlyInventory = new Inventory();
    Inventory carlInventory = new Inventory();
    Inventory governorInventory = new Inventory();
    Inventory shaneInventory = new Inventory();
    Inventory loriInventory = new Inventory();
    Inventory zombieInventory = new Inventory();
    Inventory glennInventory = new Inventory();
    Inventory maggieInventory = new Inventory();

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
    Character glenn = new GoodCharacters("Glenn Rhee", glennInventory, 33, (double) 1/4,
            (double) 1/5, "Let'", "I ain’t no one’s b*tch");
    Character maggie = new GoodCharacters("Maggie Greene", maggieInventory, 22, (double) 7/9,
            (double) 2/5, "Let's go man", "I ain’t no one’s b*tch");

    int missionIndex = 0;
    private int mission2Index = 0;
    private int mission3Index = 0;

    public int getMissionIndex() {
        return missionIndex;
    }

    public int getMission2Index() {
        return mission2Index;
    }

    public int getMission3Index() {
        return mission3Index;
    }

    Places p11 = new Places("Hospital");
    Places p12 = new Places("Neighbourhood");
    Places p13 = new Places("City Center");
    Places p14 = new Places("Camp");
    Places p21 = new Places("Highway");
    Places p22 = new Places("Forest");
    Places p23 = new Places("Farm");
    Places p31 = new Places("Forest");
    Places p32 = new Places("Prison");
    Places p33 = new Places("WoodBury");
    Places p41 = new Places("Prison");
    Places p42 = new Places("Forest");
    Places p43 = new Places("Not Named"); // Todo: Get Named
    Places p44 = new Places("Not Named"); // Todo: Get Named


    Mission m11 = new Mission("Escape from the hospital", "attack the zombies or run", zombie, p11);
    Mission m12 = new Mission("Morgan", "Talk to Morgan", morgan, p12);
    Mission m13 = new Mission("Center", "Escape from zombies", zombie, p13);
    Mission m14 = new Mission("Camp", "Talk to Lori", lori, p14);
    Mission m21 = new Mission("Highway", "Talk to Shane", shane, p21);
    Mission m22 = new Mission("Forest", "Save Sofia and kill zombies", zombie, p22);
    Mission m23 = new Mission("Farm", "Talk to Hershel", darly, p23); //darly yerine hershel gelecek
    Mission m24 = new Mission("Forest", "Kill Zombies", zombie, p22);
    Mission m25 = new Mission("Forest", "Kill Shane and escape from the farm", shane, p22);
    Mission m31 = new Mission("Forest", "Talk to Darly", darly, p31);
    Mission m32 = new Mission("Prison", "Talk with Carl", carl, p32);
    Mission m33 = new Mission("Forest", "Kill zombies", zombie, p31);
    Mission m34 = new Mission("WoodBury", "Save Glenn and Maggie", governor, p33);
    Mission m35 = new Mission("Prison", "Battle with the governor and his crew", governor, p32);

    /*
        Burada mission 4 objeleri oluşturulacak!!!!

     */



    public Chapter(int chapterNo) {
/*
 switch-case'te break'ler silindi çünkü diğer arraylistlere ekleme yapamadı sadece 1'e yaptı
 */
        switch (chapterNo){
            case 1: missions1.add(m11);
                    missions1.add(m12);
                    missions1.add(m13);
                    missions1.add(m14);
                    places1.add(p11);
                    places1.add(p12);
                    places1.add(p13);
                    places1.add(p14);
                    break;

            case 2: missions2.add(m21);
                    missions2.add(m22);
                    missions2.add(m23);
                    missions2.add(m24);
                    missions2.add(m25);
                    places2.add(p21);
                    places2.add(p22);
                    places2.add(p23);
                break;

            case 3: missions3.add(m31);
                    missions3.add(m32);
                    missions3.add(m33);
                    missions3.add(m34);
                    missions3.add(m35);
                    places3.add(p31);
                    places3.add(p32);
                    places3.add(p33);
                break;

            case 4: places4.add(p41);
                    places4.add(p42);
                    places4.add(p43);
                    places4.add(p44);
                break;

        }

    }

    public void nextMission(int chapterNo){

        mis.isCompleted = false;
        if(chapterNo == 1){
                mis.isCompleted = true;
                if(mis.isCompleted){
                    missionIndex++;
                }

        } else if(chapterNo == 2){
            mis.isCompleted = true;
            if(mis.isCompleted){
                    mission2Index++;
                }

        }else if(chapterNo == 3){

                if(missions3.get(mission3Index).isCompleted){
                    mission3Index++;
                }
        }

    }

    public void showMission(int chapterNo){
        if(chapterNo == 1){

            System.out.println("Mission name: " + missions1.get(missionIndex).getName() + "\n" +
                    "Mission Description: " + missions1.get(missionIndex).getDescription());

        } else if(chapterNo == 2){
            System.out.println("Mission name: " + missions2.get(mission2Index).getName() + "\n" +
                    "Mission Description: " + missions2.get(mission2Index).getDescription());

        }else if(chapterNo == 3){

            System.out.println(missions3.get(mission3Index).getName() + "\n" +
                    missions3.get(mission3Index).getDescription());

        }

    }

    public void selection() {
        System.out.println("please select what do you want.");
        while (selectionNo != 0) {
            try {
                selectionNo = mySc.nextInt();
            } catch (Exception exception) {
                System.out.println("You have entered invalid character please try again!!");
            }
        }
    }

    public void characterAction() {

    }


    public void showSelections(int no){
        if(no == 1){
            for(missionIndex=0;missionIndex<missions1.size();){
                showMission(no);
                for(int j=0;j<missions1.get(missionIndex).getPlace().getCharacters().size();j++){
                    //Todo: Burayı düzenle
                    places1.get(missionIndex).getCharacters().get(j).act();
                    System.out.println("\n");
                }
                nextMission(no);

            }
        }

        else if(no == 2){
            for(mission2Index=0;mission2Index<places2.size();){
                showMission(no);
                for(int j=0;j<places2.get(mission2Index).getCharacters().size();j++){
                    places2.get(mission2Index).getCharacters().get(j).act();
                    System.out.println("\n");

                }
                nextMission(no);
            }
        }

        else if(no == 3){
            for(int i=0;i<places3.size();i++){
                for(int j=0;j<places3.get(i).getCharacters().size();j++){
                    places3.get(i).getCharacters().get(j).act();
                }
            }
        }

        else if(no == 4){
            for(int i=0;i<places4.size();i++){
                for(int j=0;j<places4.get(i).getCharacters().size();j++){
                    places4.get(i).getCharacters().get(j).act();
                }
            }
        }

    }

    public void addZombieToPlace(int chapterNo) {
        Random random = new Random();
        int maxZombieNo = random.nextInt(4) + 3; // 3 ila 6 arasında ranodm bi sayı çıkıyor (6 dahil);
        ArrayList<Places> currentPlacesList = new ArrayList<>();
        switch (chapterNo) {
            case 1 -> currentPlacesList = places1;
            case 2 -> currentPlacesList = places2;
            case 3 -> currentPlacesList = places3;
            case 4 -> currentPlacesList = places4;
        }
        for (int i = 0;i<currentPlacesList.size();i++) {
            if (!currentPlacesList.get(i).getName().equals("Camp") && !currentPlacesList.get(i).getName().equals("Farm")
                    && !currentPlacesList.get(i).getName().equals("Prison") && !currentPlacesList.get(i).getName().equals("WoodBury")) {
                for (int j = 0;j<maxZombieNo;j++) {
                    currentPlacesList.get(i).getCharacters().add(zombie);


                }
            }
        }

    }
    public void addCharactersToPlaces (int chapterNo) {
        addZombieToPlace(chapterNo);
        ArrayList<Places> currentPlaceList = new ArrayList<>();
        ArrayList<Mission> currentMissionList = new ArrayList<>();
        switch (chapterNo) {
            case 1:
                currentPlaceList = places1;
                m12.getPlace().getCharacters().add(glenn);
                m13.getPlace().getCharacters().add(lori);
                m13.getPlace().getCharacters().add(carl);
                m14.getPlace().getCharacters().add(darly);
                for (Places places : currentPlaceList) {
                    places.setCharactersNo();
                }
                break;
            case 2:
                currentPlaceList = places2;
                m21.getPlace().getCharacters().add(shane);
                m21.getPlace().getCharacters().add(lori);
                m22.getPlace().getCharacters().add(maggie);
                m22.getPlace().getCharacters().add(glenn);
                m22.getPlace().getCharacters().add(carl);
                m23.getPlace().getCharacters().add(darly);
                m23.getPlace().getCharacters().add(shane);
                for (Places places : currentPlaceList) {
                    places.setCharactersNo();
                }
                break;
            case 3:
                currentPlaceList = places3;
                m31.getPlace().getCharacters().add(lori);
                m32.getPlace().getCharacters().add(governor);
                m32.getPlace().getCharacters().add(carl);
                m33.getPlace().getCharacters().add(darly);
                for (Places places : currentPlaceList) {
                    places.setCharactersNo();
                }
                break;
            case 4:
                System.out.println("Daha mission 4 objeleri oluşturulmadı onlar oluşturulunca case 4 tamamlanıcak");
                break;
        }
    }
    public void addOneMoreBadPerson() {

    }

}
