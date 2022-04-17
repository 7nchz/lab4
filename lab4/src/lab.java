import java.util.LinkedList;
import java.util.List;

public class lab {

    public static void main(String[] args) {
        info amain = new info("Писатель", "Название");
        amain.add(new kniga("Прижизненное издание Тургенева", "1880", ""));
        amain.add(new kniga("Лестерский кодекс", "1504", "Леонардо да Винчи"));
        amain.add(new kniga("География", "150 до н.э", "Клавдий Птолемей"));
        amain.printListTeam();
    }

}

class info {
    String name, avtor;
    List<kniga> rat = new LinkedList<>();

    info(String name, String country) {
        this.name = name;
        this.avtor = avtor;
    }

    void add(kniga akniga) {
        rat.add(akniga);
    }

    public void printListTeam() {
        System.out.println(name + " - " + avtor);
        for (kniga kniga : rat)
            System.out.println(kniga);
    }
}

class kniga {
    private String name;
    private String number;
    private String avtor;

    kniga(String name, String number, String avtor) {
        this.name = name;
        this.number = number;
        this.avtor = avtor;
    }

    @Override
    public String toString() {
        return "kniga{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", country='" + avtor + '\'' +
                '}';
    }
}