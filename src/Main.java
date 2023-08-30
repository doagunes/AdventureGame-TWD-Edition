// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Chapter cha = new Chapter(1);
        Mission mis = new Mission();
        /*
        for(int i=0;i<cha.missions1.size();i++){
            cha.showMission(1);
            cha.nextMission(1);
            System.out.println(cha.getMissionIndex());
        }

         */

        cha.addZombieToPlace(1);
        cha.addCharactersToPlaces();
        cha.showSelections(1);

    }
}