public class Game {


    private Chapter cha = new Chapter(1);
    private Chapter cha2 = new Chapter(2);
    private Chapter cha3 = new Chapter(3);
    private boolean isGameFinishWithoutDying = false;

    public Game(){

    }

    public void gamePlay() throws InterruptedException {
        cha.addCharactersToPlaces(1);
        cha2.addCharactersToPlaces(2);
        cha3.addCharactersToPlaces(3);

            System.out.println("\nCHAPTER 1 HAS STARTED..\n");
            Thread.sleep(1000);
            cha.play(1);
            /*
            Todo: chapter sonundaki ölü zombi sayısı ve health miktarı görüntülenecek!!!
             */
            Thread.sleep(1000);
            System.out.println("\nCHAPTER 2 HAS STARTED..\n");
            Thread.sleep(1000);

            cha2.play(2);

            Thread.sleep(1000);
            System.out.println("\nCHAPTER 3 HAS STARTED..\n");
            Thread.sleep(1000);


            cha3.play(3);
            isGameFinishWithoutDying();


        if(isGameFinishWithoutDying){
            System.out.println("Congratulations! You completed the game :) ");
        }else{
            System.out.println("You Died :( ");
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
