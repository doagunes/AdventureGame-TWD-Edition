import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ChapterTest {
    public static void main(String[] args) {
        Chapter chapter = new Chapter(1);
        chapter.addCharactersToPlaces(1);

        System.out.println(chapter.p11.getCharacters().get(0).health);
        System.out.println(chapter.p11.getCharacters().get(1).health);

        chapter.p11.getCharacters().get(0).health -= 50;

        System.out.println(chapter.p11.getCharacters().get(0).health);
        System.out.println(chapter.p11.getCharacters().get(1).health);


    }


}
