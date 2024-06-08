package uebung9;

//-----------------------------------------------------------------//
public class Food {
    //---------------------------------------------------------------//
    // TODO: attributes and constructor

    String category;
    String name;

    public Food(String category, String name) {
        this.category = category;
        this.name = name;
    }

    //---------------------------------------------------------------//
    @Override
    public int hashCode() {
        // TODO: implementation

        int index = 1;

        index = 17 * index + (category == null ? 0 : category.hashCode());
        index = 17 * index + (name == null ? 0 : name.hashCode());

        return index;
    }

    //---------------------------------------------------------------//
    public String toString() {
        // TODO: implementation
        return "{" + this.category + ", " + this.name + "}";
    }
}
