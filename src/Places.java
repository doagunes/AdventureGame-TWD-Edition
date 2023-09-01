import java.util.ArrayList;
import java.util.HashMap;

public class Places {

    private String name;
    private ArrayList<Character> characters = new ArrayList<>();
    private HashMap<Integer, Character> selectionMap = new HashMap<>();

    public Places(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }
    public void setCharactersNo () {
        int counter = 1; //
        for (int i = 0;i<characters.size();i++) {
            if (i != characters.size()-1) {
                if (characters.get(i) != characters.get(i + 1)) {
                    selectionMap.put(counter, characters.get(i));
                    characters.get(i).setCharacterNo(counter);
                    counter++;
                }
            } else {
                selectionMap.put(counter, characters.get(i));
                characters.get(i).setCharacterNo(counter);
                counter++;
            }
        }
    }

    public HashMap<Integer, Character> getSelectionMap() {
        return selectionMap;
    }

    public void setSelectionMap(HashMap<Integer, Character> selectionMap) {
        this.selectionMap = selectionMap;
    }
public class Places {
}
