import java.util.ArrayList;
import java.util.List;

public class Tomte {

    private String namn;
    private List<Tomte> överOrdnad = new ArrayList<>();
    private List<Tomte> underOrdnad = new ArrayList<>();

    public Tomte(String namn) {
        this.namn = namn;
    }

    public String getNamn() {
        return namn;
    }

    public List<Tomte> getÖverOrdnad() {
        return this.överOrdnad;
    }

    public void addÖverOrdnad(Tomte tomte) {
        this.överOrdnad.add(tomte);
    }

    public List<Tomte> getUnderOrdnad() {
        return this.underOrdnad;
    }

    public void addUnderOrdnad(Tomte tomte) {
        this.underOrdnad.add(tomte);
    }

}