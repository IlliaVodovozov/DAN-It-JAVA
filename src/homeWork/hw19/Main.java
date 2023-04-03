package homeWork.hw19;

public class Main {
    public static void main(String[] args) {
        Computer myPC = new Computer("Dell", 1000, 8, 4);
        myPC.getInfo();
        System.out.println("___________");

        Tree tree1 = new Tree("сосна", 250);
        Tree tree2 = new Tree(300, 20, "Красный");
        Tree tree3 = new Tree();
        Tree tree4 = new Tree("ель");

        System.out.println("Tree 1: " + tree1.getType() + ", " + tree1.getHeight() + ", " + tree1.getCountOfSticks() + ", " + tree1.getColour());
        System.out.println("Tree 2: " + tree2.getType() + ", " + tree2.getHeight() + ", " + tree2.getCountOfSticks() + ", " + tree2.getColour());
        System.out.println("Tree 3: " + tree3.getType() + ", " + tree3.getHeight() + ", " + tree3.getCountOfSticks() + ", " + tree3.getColour());
        System.out.println("Tree 4: " + tree4.getType() + ", " + tree4.getHeight() + ", " + tree4.getCountOfSticks() + ", " + tree4.getColour());
        System.out.println("___________");

    }
}
