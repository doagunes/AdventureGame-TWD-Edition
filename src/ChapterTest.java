import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ChapterTest {
    public static void main(String[] args) {
        Chapter chapter = new Chapter(1);
        chapter.addCharactersToPlaces(1);

        int x = chapter.p11.getCharacters().size();

        chapter.p11.getCharacters().clear();

        for (int i = 0;i<chapter.p11.getCharacters().size();i++) {
            System.out.println(chapter.p11.getCharacters().get(i).name);
        }
        System.out.println("00000");
        for (int i = 0;i<chapter.p12.getCharacters().size();i++) {
            System.out.println(chapter.p12.getCharacters().get(i).name);
        }



    }


}
