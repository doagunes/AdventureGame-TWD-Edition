public class Mission {

    private String description;
    private Places place;
    private Character mustSelect;//doğru seçeneği belirlemek için oluşturuldu!!!
    private int zombieCounter = 0;

    boolean isMissionCompleted;

    public Mission(String description, Character mustSelect, Places place) {

        this.description = description;
        this.mustSelect = mustSelect;
        this.isMissionCompleted = false;
        this.place = place;


    }
    public Mission() {


    }

    public void isMissionCompleted(MainCharacter rick, int zombieNo){

        isMissionCompleted = false;
        /*

        if (rick.getSelectCharacter().name.equals(mustSelect.name)) {
            if (rick.getSelectCharacter().health <= 0) {
                if (rick.getSelectCharacter().name.equals("Zombie")) {
                    zombieCounter++;

                }
            }
        } else {
            isMissionCompleted = false;
        }

         */
        if(rick.getSelectCharacter().name.equals(mustSelect.name)){
            if (rick.getSelectCharacter().name.equals("Zombie")) {
                if (rick.getSelectCharacter().health <= 0) {
                    zombieCounter++;
                    System.out.println("BURAYA GİRDİİİİİ");
                    deleteSelections();
                    isMissionCompleted = (zombieNo == zombieCounter);
                } else {

                    isMissionCompleted = false;
                }
            } else if (rick.getSelectCharacter().getClass().equals(BadCharacters.class)) {
                if (rick.getSelectCharacter().health <= 0) {
                    System.out.println("BURAYA GİRDİİİİİ");
                    deleteSelections();
                    isMissionCompleted = true;
                }
            } else if (rick.getSelectCharacter().getClass().equals(GoodCharacters.class)) {

                isMissionCompleted = true;
            }
        } else {

                if (rick.getSelectCharacter().name.equals("Zombie")) {
                    if (rick.getSelectCharacter().health <= 0) {
                        zombieCounter++;
                        System.out.println("BURAYA GİRDİİİİİ");
                        deleteSelections();

                    }
                }

                isMissionCompleted = false;

        }

        /*
        if(rick.getSelectCharacter().name.equals(mustSelect.name)){
            if (rick.getSelectCharacter().health <= 0) {

                if(rick.getSelectCharacter().name.equals("Zombie")){
                    zombieCounter++;
                    if (zombieNo == zombieCounter) {
                        isMissionCompleted = true;
                        zombieCounter=0;
                    } else {
                        isMissionCompleted = false;
                    }

                place.eliminateSelection();
                zombieCounter++;
                if (zombieNo == zombieCounter) {
                    isMissionCompleted = true;
                    zombieCounter=0;

                } else {
                    isMissionCompleted = true;
                }

            }else if(rick.getSelectCharacter().getClass().equals(GoodCharacters.class)){
                place.eliminateSelection();
                isMissionCompleted = true;
            }
        }else{
            if (rick.getSelectCharacter().health <= 0) {
                zombieCounter++;
            }
            isMissionCompleted = false;
        }
        }

         */
    }

    public Places getPlace() {
        return place;
    }

    public Character getMustSelect() {
        return mustSelect;
    }

    public String getDescription() {
        return description;
    }

    public void setPlace(Places place) {
        this.place = place;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMustSelect(Character mustSelect) {
        this.mustSelect = mustSelect;
    }

    public boolean isMissionCompleted() {
        return isMissionCompleted;
    }

    private void deleteSelections () {
        place.getSelectionMap().remove(Chapter.selectionNo);
        place.getCharacters().remove(Chapter.selectionNo-1);
    }


}