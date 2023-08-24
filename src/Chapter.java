public class Chapter {
    Inventory rickInventory = new Inventory("Colt Python");
    Inventory morganInventory = new Inventory();
    Inventory darlyInventory = new Inventory();
    Inventory carlInventory = new Inventory();
    Inventory governorInventory = new Inventory();
    Inventory shaneInventory = new Inventory();
    Inventory loriInventory = new Inventory();
    Inventory zombieInventory = new Inventory();

    Character rick = new MainCharacter("Rick Grimes", rickInventory, 28, (double) 1 /2,
            (double) 1 /4, "Hello how is it going?", "nope, ı don't think so");
    Character darly = new GoodCharacters("Darly Dixon", darlyInventory, 40, (double) 2/3,
            (double) 1/5, "Let's go man", "I ain’t no one’s b*tch");
    Character morgan = new GoodCharacters("Morgan", morganInventory, 22, (double) 7/9,
            (double) 2/5, "Let's go man", "I ain’t no one’s b*tch");
    Character lori = new GoodCharacters("Lori Grimes", loriInventory, 5, (double) 1/12,
            (double) 1/8, "No problem, ı get it", "Maybe this isn’t a world for children anymore.");
    Character shane = new Person("Shane Walsh", shaneInventory, 33, (double) 1/3,
            (double) 1/4, "Okay buddy you are the chief", "Rick, you can’t just be the good guy and expect to live. Okay? Not anymore.");
    Character carl = new GoodCharacters("Carl Grimes", carlInventory, 8, (double) 1/10,
            (double) 1/20, "Okay daddy, love ya", "I am not a kid any more, okay!!");
    Character governor = new Person("Philip Blake(Governor)", governorInventory, 30, (double) 2/10,
            (double) 2/10, "", "I am not a kid any more, okay!!");
    Character zombie = new Zombie("Zombie", zombieInventory, 20, (double) 1/4,
            (double) 1/10, "whaaaaaaaa", "whaaaaaaaa");


}
