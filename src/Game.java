public class Game {


    private Chapter cha = new Chapter(1);
    private Chapter cha2 = new Chapter(2);
    private Chapter cha3 = new Chapter(3);
    private boolean isGameFinishWithoutDying = false;

    public Game(){

    }

    public void gamePlay(){
        cha.addCharactersToPlaces(1);
        cha2.addCharactersToPlaces(2);
        cha3.addCharactersToPlaces(3);

        while(MainCharacter.health > 0 && !isGameFinishWithoutDying){
            cha.play(1);

            System.out.println("*********");
            cha2.play(2);

            System.out.println("*********");

            cha3.play(3);
            isGameFinishWithoutDying();

        }

        if(MainCharacter.health > 0){
            System.out.println("Congratulations! You completed the game :) ...");
        }else if(MainCharacter.health <= 0){
            System.out.println("You Died :( ...");
        }
        System.out.println("\nGAME OVER!");
        System.exit(0);
    }

    public void isGameFinishWithoutDying(){
        isGameFinishWithoutDying = false;

        if(cha3.getMission3Index() == cha3.missions3.size()){
            isGameFinishWithoutDying = true;
        }else {
            isGameFinishWithoutDying = false;
        }
    }

}
