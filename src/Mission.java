import java.util.ArrayList;

public class Mission {

    private String name;
    private String description;
    private Places place;
    private Character mustSelect;//doğru seçeneği belirlemek için oluşturuldu!!!
    boolean isCompleted;

    public Mission(String name, String description, Character mustSelect) {
        this.name = name;
        this.description = description;
        this.mustSelect = mustSelect;
        this.isCompleted = false;


    }

    public Character getMustSelect() {
        return mustSelect;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

}
