package uebung9;

//---------------------------------------------------------------//

/**
 * Container that can store food elements.
 */
public class IceBox {
    //---------------------------------------------------------------//
    // TODO: attributes and constructor
    int capacity;
    int size;
    Food[] table_;

    public IceBox(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.table_ = new Food[capacity];
    }

    //---------------------------------------------------------------//
    public void add(Food obj) {
        // TODO: implementation

        int index = Math.abs(obj.hashCode() % capacity);

        int i = 1;

        while (table_[index] != null) {
            index = (index + i * i) % capacity;
            i++;
        }
        table_[index] = obj;
        size++;
    }

    //---------------------------------------------------------------//
    public boolean contains(Food obj) {
        int index = Math.abs(obj.hashCode() % capacity);
        while (table_[index] != null) {
            if (table_[index].equals(obj)) {
                return true;
            }
            index = (index + 1) % capacity;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IceBox: ");
        for (int i = 0; i < capacity; i++) {
            if (table_[i] != null) {
                sb.append(table_[i]);
                if (i < capacity - 1) {
                    sb.append(" | ");
                }
            }
        }
        return sb.toString();
    }

    //---------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code


        IceBox iceBox = new IceBox(20);
        Food food = new Food("Fruit", "Apple");
        Food food2 = new Food("Vegetable", "Carrot");
        Food food3 = new Food("Meat", "Beef");
        Food food4 = new Food("Dairy", "Milk");
        Food food5 = new Food("Fruit", "Melon");
        Food food6 = new Food("Vegetable", "Tomato");
        Food food7 = new Food("Meat", "Chicken");
        Food food8 = new Food("Dairy", "Cheese");
        Food food9 = new Food("Fruit", "Apple");


        iceBox.add(food);
        iceBox.add(food2);
        iceBox.add(food3);
        iceBox.add(food4);
        iceBox.add(food5);
        iceBox.add(food6);
        iceBox.add(food7);
        iceBox.add(food8);
        System.out.println(iceBox);
        System.out.println(iceBox.contains(food));
        System.out.println(iceBox.contains(food9));
    }
}
