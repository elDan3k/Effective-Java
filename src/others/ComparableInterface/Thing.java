package others.ComparableInterface;

import org.jetbrains.annotations.NotNull;

public class Thing implements Comparable {

    //private static int idCounter = 0;

    private int id;

    public Thing() {
        this.id = (int)(Math.random()*100);
    }

    @Override
    public int compareTo(@NotNull Object o) {
        Thing other = (Thing) o;
        if(this.id > other.id) {
            return 1;
        } else if (this.id == other.id) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Thing{" +
                "id=" + id +
                '}';
    }
}
