import java.util.ArrayList;

public class Mission {


    private String description;
    private Places place;
    private Character mustSelect;//doğru seçeneği belirlemek için oluşturuldu!!!
    boolean isCompleted;

    public Mission(String description, Character mustSelect, Places place) {

        this.description = description;
        this.mustSelect = mustSelect;
        this.isCompleted = false;
        this.place = place;


    }
    public Mission() {


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

    public boolean isCompleted() {
        return isCompleted;
    }

}
