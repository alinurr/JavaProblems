package OOP;

public class Monster extends Item {
    public Monster(int location, String description) {
        super(location, description);
    }

    public static void main(String[] args) {
        // creating an item object
        Item Item1 = new Item(1, "Foot Ball");
        System.out.println("Item Location: " + Item1.getLocation());
        System.out.println("Item Description: " + Item1.getDescription());

        Item Item2 = new Item(2, "Rugby Ball");
        System.out.println("\nItem Location: " + Item2.getLocation());
        System.out.println("Item Description: " + Item2.getDescription());


        // Creating an Mosnter Object
        Monster Mitem = new Monster(3, "Cricket Bat");
        System.out.println("\nItem Location: " + Mitem.getLocation());
        System.out.println("Item Description: " + Mitem.getDescription());

        Monster Mitem2 = new Monster(4, "Rugby Boot");
        System.out.println("\nItem Location: " + Mitem2.getLocation());
        System.out.println("Item Description: " + Mitem2.getDescription());

    }
}
