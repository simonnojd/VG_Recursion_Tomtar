import java.util.ArrayList;
import java.util.List;

public class Main {

    Databas d = new Databas();
    List<String> tomteNamnLista = new ArrayList<>();

    public Main() {
        System.out.println(chefsLista("bladlusen", 0));
        clear();
        System.out.println(chefsLista("glader", 0));
        clear();
        System.out.println(chefsLista("nyckelpigan", 0));
        clear();
        System.out.println(chefsLista("Gråsuggan",0));
    }

    public List<String> chefsLista(String tomteNamn, int index) {
        if (tomteNamn.equalsIgnoreCase("Tomten")) {
            return tomteNamnLista;
        }
        for (Tomte tomte : d.tomteList) {
            if (tomte.getNamn().equalsIgnoreCase(tomteNamn)) {
                for (Tomte e : tomte.getÖverOrdnad()) {
                    tomteNamnLista.add(e.getNamn());
                }
            }
        }
        return chefsLista(tomteNamnLista.get(index), index + 1);
    }

    public void clear() {
        tomteNamnLista.clear();
    }

    public static void main(String[] args) { new Main(); }
}