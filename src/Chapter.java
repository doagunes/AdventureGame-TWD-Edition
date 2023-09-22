import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Chapter {
    Scanner mySc = new Scanner(System.in);
    private int chapterNo;
    public static int selectionNo = 0;

    private boolean continueAttack = true;
    int maxZombieNo;



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
    Inventory hershelInventory = new Inventory();
    Inventory carolInventory = new Inventory();
    Inventory michonneInventory = new Inventory();



    MainCharacter rick = new MainCharacter("Rick Grimes", rickInventory, 28, (double) 5/10,
            (double) 3 /10, "Hello how is it going?", "nope, ı don't think so", false);
    Character darly= new GoodCharacters("Darly Dixon", darlyInventory, 35, (double) 2/3,
            (double) 3 /10, "Hello how is it going?", "nope, ı don't think so", false);
    Character morgan = new GoodCharacters("Morgan", morganInventory, 22, (double) 7/9,
            (double) 4/10, "We’re not doing careful. We’re doing right", "This world... we're always on our own.", false);
    Character lori = new GoodCharacters("Lori Grimes", loriInventory, 5, (double) 1/12,
            (double) 1/10, "No problem, ı get it",  "Maybe this isn’t a world for children anymore.",false);
    BadCharacters shane = new Person("Shane Walsh", shaneInventory, 33, (double) 4/100,
            (double) 3/10, "Okay buddy you are the chief", "Rick, you can’t just be the good guy and expect to live. Okay? Not anymore."
    ,true);
    Character carl = new GoodCharacters("Carl Grimes", carlInventory, 8, (double) 1/10,
            (double) 1/10, "Okay daddy, love ya", "I am not a kid any more, okay!!", false);
    BadCharacters governor = new Person("Philip Blake(Governor)", governorInventory, 30, (double) 3/100,
            (double) 2/10, "You're making the decisions today, Rick!", "Liar!!!", true);
    BadCharacters zombie = new Zombie("Zombie", zombieInventory, 20, (double) 1/100,
            (double) 2/10, "whaaaaaaaa", "whaaaaaaaa", true);
    Character glenn = new GoodCharacters("Glenn Rhee", glennInventory, 33, (double) 1/4,
            (double) 3/10, "ı am in love with maggie", "ı am not a chinesee ı am a korean mother fu*kerrrrrr!!", false);
    Character maggie = new GoodCharacters("Maggie Greene", maggieInventory, 22, (double) 7/9,
            (double) 2/10, "okay let's do it", "ı am with glenn fu*k of", false);
    Character hershel = new GoodCharacters("Hershel Greene", hershelInventory, 10, (double) 1/9,
            (double) 2/10, "be with god, amen", "hey you who the hell you that you can cut my leg huh ??!!", false);
    Character carol = new GoodCharacters("Carol", carolInventory, 8, (double) 1/9,
            (double) 4/10, "I miss my vibrator.", "Some people just can't give up. Like us.", false);
    Character michonne = new GoodCharacters("Michonne", michonneInventory, 25, (double) 6/9,
            (double) 5/10, "We’re gonna catch up with a lot of things and we’re gonna end them.", "Anger makes you stupid. Stupid gets you killed.", false);
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
    Places p24 = new Places("Forest");
    Places p25 = new Places("Forest");
    Places p31 = new Places("Forest");
    Places p32 = new Places("Prison");
    Places p33 = new Places("WoodBury");
    Places p34 = new Places("Forest");
    Places p35 = new Places("Prison");
    Places p41 = new Places("Prison");
    Places p42 = new Places("Forest");
    Places p43 = new Places("Not Named"); // Todo: Get Named
    Places p44 = new Places("Not Named"); // Todo: Get Named


    Mission m11 = new Mission("Attack the zombies or run", zombie, p11);
    Mission m12 = new Mission("Talk to Morgan", morgan, p12);
    Mission m13 = new Mission("Escape from zombies", zombie, p13);
    Mission m14 = new Mission("Talk to Lori", lori, p14);
    Mission m21 = new Mission("Talk to Carol", carol, p21);
    Mission m22 = new Mission("Save Sofia and kill zombies", zombie, p22);
    Mission m23 = new Mission("Talk to Hershel", hershel, p23); //darly yerine hershel gelecek
    Mission m24 = new Mission("Kill Zombies", zombie, p24);
    Mission m25 = new Mission("Kill Shane and escape from the farm", shane, p25);
    Mission m31 = new Mission("Talk to Darly", darly, p31);
    Mission m32 = new Mission("Talk with Carl", carl, p32);
    Mission m33 = new Mission("Save Glenn and Maggie", glenn, p33);
    Mission m34 = new Mission("Kill zombies", zombie, p34);
    Mission m35 = new Mission("Battle with the governor and his crew", governor, p35); // Todo: Vali ölmeyecek şekilde tekrardan kodla!!!

    /*
       Todo: Burada mission 4 objeleri oluşturulacak!!!!

     */

    public void attackScreen(Character enemy) { // fonksiyonu kullanırken paramtere olan enemy yerine rick.getSelectedCharacter() gelicek method içinde kullanılmayı kolaylaştırıyor
        for (Character character : p11.getCharacters()) {
            System.out.println(character.name);
        }
        System.out.println("*******");
        for (Character character : p12.getCharacters()) {
            System.out.println(character.name);
        }
        int turnNo = 1;
        continueAttack = true;
        System.out.println(rick.getSelectCharacter().health);
        while (MainCharacter.health > 0 && rick.getSelectCharacter().health > 0 && continueAttack) {
            if (turnNo % 2 != 0) { // turn is on rick
                showCharsInfo();
                rick.warningHealthMetod(); // Todo: BENHURA SORRR
                isUserWantToEscape();
                if(!continueAttack){
                    break;
                }
                System.out.println("Turn is yours you can attack..");
                rick.attackToBadCharacter(rick.getSelectCharacter()); //
                turnNo++;
            } else {
                showCharsInfo();
                System.out.println("Turn is on : " + enemy.name);
                enemy.attackTo(rick);
                turnNo++;
            }
        }

        //if (rick.getSelectCharacter().health <= 0) {rick.getSelectCharacter().setHealth(100);}
    }
    public void isUserWantToEscape() {
        int escapeNo;// if it would 1 then our continueAttack will be false
        boolean hataliGiris = true;

        while (hataliGiris) {
            System.out.println("If you want to end attack end escape please press 1, if you want to continue then press 0");
            String userEnter = mySc.nextLine();
            try {
                escapeNo = Integer.parseInt(userEnter);
                if (escapeNo == 1) {
                    hataliGiris = false;
                    continueAttack = false;
                } else if (escapeNo == 0){
                    continueAttack = true;
                    break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("You haven't entered a valid number please try again with valid numbers \n");
            }
        }
    }

    public void actionDirection() {
        rick.isGoodCharacter();
        if (!rick.isGood) {
            attackScreen(rick.getSelectCharacter());
        } else {
            rick.talkWithCharacters(lori, carol, hershel);
        }
    }

    public Chapter(int chapterNo) {




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
                    places2.add(p24);
                    places2.add(p25);
                    break;

            case 3: missions3.add(m31);
                    missions3.add(m32);
                    missions3.add(m33);
                    missions3.add(m34);
                    missions3.add(m35);
                    places3.add(p31);
                    places3.add(p32);
                    places3.add(p33);
                    places3.add(p34);
                    places3.add(p35);
                    break;

            case 4: places4.add(p41);
                    places4.add(p42);
                    places4.add(p43);
                    places4.add(p44);
                    break;

        }

    }

    public void nextMission(int chapterNo){ // paramatere var chapter no diye
        if(chapterNo == 1){


                missions1.get(missionIndex).isMissionCompleted(rick, maxZombieNo);


            for(Mission missions : missions1){
                    missions.isMissionCompleted(rick);
                }

            if(missions1.get(missionIndex).isMissionCompleted){
                missionIndex++;
            }

        } else if(chapterNo == 2){


            missions2.get(mission2Index).isMissionCompleted(rick, maxZombieNo);


            for(Mission missions2 : missions2){
                missions2.isMissionCompleted(rick);
            }

            if(missions2.get(mission2Index).isMissionCompleted){
                mission2Index++;
            }

        }else if(chapterNo == 3){


            missions3.get(mission3Index).isMissionCompleted(rick, maxZombieNo);


            for(Mission missions3 : missions3){
                missions3.isMissionCompleted(rick);
            }

            if(missions3.get(mission3Index).isMissionCompleted){
                mission3Index++;
            }
        }

    }

    public void showMission(int chapterNo){
        if(chapterNo == 1){

            System.out.println("Place Name: " + missions1.get(missionIndex).getPlace().getName() + "\n" +
                    "Mission Description: " + missions1.get(missionIndex).getDescription() );

        } else if(chapterNo == 2){
            System.out.println("Place name: " + missions2.get(mission2Index).getPlace().getName() + "\n" +
                    "Mission Description: " + missions2.get(mission2Index).getDescription() );

        }else if(chapterNo == 3){

            System.out.println("Place name: " + missions3.get(mission3Index).getPlace().getName() + "\n" +
                    "Mission Description: " + missions3.get(mission3Index).getDescription() );

        }

    }

    public int selection(int maxLimit) {
        selectionNo = -1;
        String selection = null;
        while (selectionNo <= 0 || selectionNo > maxLimit) {
            try {
                System.out.println("Please select what do you want: ");

                selection = mySc.nextLine();
                selectionNo = Integer.parseInt(selection);
                //mySc.nextLine();

                selectionNo = mySc.nextInt();

            } catch (Exception exception) {
                System.out.println("You have entered invalid character please try again!!");
            }
        }
        return selectionNo;
    }

    public void assignTheSelection(Places place, int maxLimit) {  // 1) 2) 3) 4)
        int selectedNo = selection(maxLimit); // 2.şık mesela
        rick.setSelectCharacter(place.getSelectionMap().get(selectedNo));
    }


    public void play(int chapterNo){
        // Todo: rick öldüğünde bu metottan çıkacak!!!
        if(chapterNo == 1){
            for(missionIndex=0;missionIndex<missions1.size();){
                if(MainCharacter.health <= 0){
                    return; //metottan çıkılması için break yerine kullanıldı!!!
                }
                showMission(chapterNo);
                System.out.println();
                missions1.get(missionIndex).getPlace().setCharactersNo();
                for(int j=0;j<missions1.get(missionIndex).getPlace().getCharacters().size();j++){
                    missions1.get(missionIndex).getPlace().getCharacters().get(j).act();
                    System.out.println("\n");

                }
                assignTheSelection(missions1.get(missionIndex).getPlace(), missions1.get(missionIndex).getPlace().
                        getCharacters().get(missions1.get(missionIndex).getPlace().getCharacters().size()-1).getCharacterNo());
                actionDirection();
                nextMission(chapterNo);
            }

        }

        else if(chapterNo == 2){
            for(mission2Index=0;mission2Index<missions2.size();){
                if(MainCharacter.health <= 0){
                    return;
                }
                showMission(chapterNo);
                System.out.println();
                for(int j=0;j<missions2.get(mission2Index).getPlace().getCharacters().size();j++){
                    missions2.get(mission2Index).getPlace().setCharactersNo();
                    missions2.get(mission2Index).getPlace().getCharacters().get(j).act();
                    System.out.println("\n");
                }
                assignTheSelection(missions2.get(mission2Index).getPlace(), missions2.get(mission2Index).getPlace().
                        getCharacters().get(missions2.get(mission2Index).getPlace().getCharacters().size()-1).getCharacterNo());

                actionDirection();
                nextMission(chapterNo);

                nextMission(no);

            }
        }

        else if(chapterNo == 3){
            for(mission3Index=0;mission3Index<missions3.size();){
                if(MainCharacter.health <= 0){
                    return;
                }
                showMission(chapterNo);
                System.out.println();
                for(int j=0;j<missions3.get(mission3Index).getPlace().getCharacters().size();j++){
                    missions3.get(mission3Index).getPlace().setCharactersNo();
                    missions3.get(mission3Index).getPlace().getCharacters().get(j).act();
                    System.out.println("\n");

                }
                assignTheSelection(missions3.get(mission3Index).getPlace(), missions3.get(mission3Index).getPlace().
                        getCharacters().get(missions3.get(mission3Index).getPlace().getCharacters().size()-1).getCharacterNo());
                actionDirection();
                nextMission(chapterNo);
                if(mission3Index == missions3.size()){
                    return;
                }

                assignTheSelection(missions3.get(mission3Index).getPlace(), missions3.get(mission3Index).getPlace().
                        getCharacters().get(missions3.get(mission3Index).getPlace().getCharacters().size()-1).getCharacterNo());
                nextMission(no);

            }
        }

        /*
        Todo: Burası düzenlenecek
        else if(no == 4){
            for(mission2Index=0;mission2Index<missions2.size();){
                showMission(no);
                for(int j=0;j<missions2.get(mission2Index).getPlace().getCharacters().size();j++){
                    missions2.get(mission2Index).getPlace().getCharacters().get(j).act();
                    System.out.println("\n");

                }
                nextMission(no);
            }
        }

         */

    }
    public void showCharsInfo() {
        String formattedText1 = String.format("%-22s %-15s", rick.getName(), rick.getSelectCharacter().name);
        String formattedText2 = String.format("Health: %-14f Health: %-15f", rick.health, rick.getSelectCharacter().health);
        String formattedText3 = String.format("Power: %-15f Power: %-15f", rick.power, rick.getSelectCharacter().power);

        System.out.println(formattedText1);
        System.out.println(formattedText2);
        System.out.println(formattedText3);
    }


    public void addZombieToPlace(int chapterNo) {
        Random random = new Random();
        ArrayList<Mission> currentMissionList = new ArrayList<>();
        maxZombieNo = random.nextInt(4) + 3; // 3 ila 6 arasında ranodm bi sayı çıkıyor (6 dahil);
        switch (chapterNo) {
            case 1 -> currentMissionList = missions1;
            case 2 -> currentMissionList = missions2;
            case 3 -> currentMissionList = missions3;
            case 4 -> currentMissionList = missions4;
        }

        for (int i = 0;i<currentMissionList.size();i++) {
            if (!currentMissionList.get(i).getPlace().getName().equals("Camp") && !currentMissionList.get(i).getPlace().getName().equals("Farm")
                    && !currentMissionList.get(i).getPlace().getName().equals("Prison") && !currentMissionList.get(i).getPlace().getName().equals("WoodBury")) {
                for (int j = 0;j<maxZombieNo;j++) {
                    currentMissionList.get(i).getPlace().getCharacters().add(new Zombie("Zombie", zombieInventory, 20, (double) 1/100,
                            (double) 2/10, "whaaaaaaaa", "whaaaaaaaa", true));


                }
            }
        }

    }
    public void addCharactersToPlaces (int chapterNo) {
        addZombieToPlace(chapterNo);
        switch (chapterNo) {
            case 1:

                m12.getPlace().getCharacters().add(morgan);
                m13.getPlace().getCharacters().add(glenn);
                m14.getPlace().getCharacters().add(carl);
                m14.getPlace().getCharacters().add(lori);
                m14.getPlace().getCharacters().add(darly);
                m14.getPlace().getCharacters().add(shane);
                break;
            case 2:
                m21.getPlace().getCharacters().add(carol);
                m21.getPlace().getCharacters().add(shane);
                m21.getPlace().getCharacters().add(lori);
                m21.getPlace().getCharacters().add(darly);
                m23.getPlace().getCharacters().add(hershel);
                m23.getPlace().getCharacters().add(maggie);
                m23.getPlace().getCharacters().add(glenn);
                m23.getPlace().getCharacters().add(carl);
                m23.getPlace().getCharacters().add(darly);
                m23.getPlace().getCharacters().add(shane);
                m25.getPlace().getCharacters().add(shane);
                break;
            case 3:
                m31.getPlace().getCharacters().add(darly);
                m32.getPlace().getCharacters().add(carl);
                m32.getPlace().getCharacters().add(maggie);
                m32.getPlace().getCharacters().add(glenn);
                m32.getPlace().getCharacters().add(lori);
                m33.getPlace().getCharacters().add(governor);
                m33.getPlace().getCharacters().add(maggie);
                m33.getPlace().getCharacters().add(glenn);
                m34.getPlace().getCharacters().add(darly);
                m35.getPlace().getCharacters().add(governor);
                m35.getPlace().getCharacters().add(darly);
                m35.getPlace().getCharacters().add(carol);
                m35.getPlace().getCharacters().add(carl);
                m35.getPlace().getCharacters().add(maggie);
                m35.getPlace().getCharacters().add(glenn);
                m35.getPlace().getCharacters().add(hershel);
                break;
            case 4:
                System.out.println("Daha mission 4 objeleri oluşturulmadı onlar oluşturulunca case 4 tamamlanıcak");
                break;
        }
    }




    public void addOneMoreBadPerson() {

    }

}
