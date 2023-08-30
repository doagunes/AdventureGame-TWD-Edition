import java.util.ArrayList;
import java.util.HashMap;

public class Places {

    private String name;
    private ArrayList<Character> characters = new ArrayList<>();
    private HashMap<Integer, Character> selectionMap = new HashMap<>();

    public Places(String name) { // setCharactersNo methodu dogru calışmıyo cunku constructor cagırırken yani obje oluşturuken +
        // daha characters arraylistine charakterler eklenmemiş durumda bu yuzden setCharacteresNo methodundaki for calışamıyor !!!
        // TODO: 30.08.2023 bu hatayı çöz
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
        for (int i = 1;i<=characters.size();i++) {
            selectionMap.put(i, characters.get(i));
        }
    }
}
