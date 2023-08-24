import java.util.ArrayList;

public class Chapter {

    private int chapterNo;


    ArrayList<Mission> missions1 = new ArrayList<>();
    ArrayList<Mission> missions2 = new ArrayList<>();
    ArrayList<Mission> missions3 = new ArrayList<>();
    ArrayList<Mission> missions4 = new ArrayList<>();

    private int missionIndex = 0;
    private int mission2Index = 0;
    private int mission3Index = 0;


    Mission m11 = new Mission("Hospital", "Escape from the hospital");
    Mission m12 = new Mission("Morgan", "Talk to Morgan");
    Mission m13 = new Mission("Center", "Escape from zombies");
    Mission m14 = new Mission("Camp", "Talk to Lori");
    Mission m21 = new Mission("Highway", "Talk to Shane");
    Mission m22 = new Mission("Forest", "Save Sofia");
    Mission m23 = new Mission("Farm", "Talk to Hershel");
    Mission m24 = new Mission("Forest", "Kill Zombies");
    Mission m25 = new Mission("Forest", "Kill Shane and escape from the farm");
    Mission m31 = new Mission("Forest", "Talk to Darl");
    Mission m32 = new Mission("Prison", "Talk with Carl");
    Mission m33 = new Mission("Forest", "Kill zombies");
    Mission m34 = new Mission("WoodBury", "Save Glenn and Maggie");
    Mission m35 = new Mission("Prison", "Battle with the governor and his crew");



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

}
