import java.util.Arrays;
import java.util.List;

public class Databas {

    Tomte bladlusen = new Tomte("Bladlusen");
    Tomte myran = new Tomte("Myran");
    Tomte gråsuggan = new Tomte("Gråsuggan");
    Tomte dammråttan = new Tomte("Dammråttan");
    Tomte skumtomten = new Tomte("Skumtomten");
    Tomte räven = new Tomte("Räven");
    Tomte haren = new Tomte("Haren");
    Tomte nyckelpigan = new Tomte("Nyckelpigan");
    Tomte rådjuret = new Tomte("Rådjuret");
    Tomte blyger = new Tomte("Blyger");
    Tomte trötter = new Tomte("Trötter");
    Tomte tröger = new Tomte("Tröger");
    Tomte butter = new Tomte("Butter");
    Tomte glader = new Tomte("Glader");
    Tomte tomten = new Tomte("Tomten");

    public List<Tomte> tomteList = Arrays.asList(
            tomten, glader, butter, tröger, trötter, blyger, rådjuret,
            nyckelpigan, haren, räven, skumtomten, dammråttan, gråsuggan, myran, bladlusen);

    public Databas(){
        tomten.addUnderOrdnad(glader);
        tomten.addUnderOrdnad(butter);

        glader.addÖverOrdnad(tomten);
        glader.addUnderOrdnad(tröger);
        glader.addUnderOrdnad(trötter);
        glader.addUnderOrdnad(blyger);

        tröger.addÖverOrdnad(glader);
        blyger.addÖverOrdnad(glader);

        butter.addÖverOrdnad(tomten);
        butter.addUnderOrdnad(rådjuret);
        butter.addUnderOrdnad(nyckelpigan);
        butter.addUnderOrdnad(haren);
        butter.addUnderOrdnad(räven);

        rådjuret.addÖverOrdnad(butter);
        nyckelpigan.addÖverOrdnad(butter);
        haren.addÖverOrdnad(butter);

        trötter.addÖverOrdnad(glader);
        trötter.addUnderOrdnad(skumtomten);

        skumtomten.addÖverOrdnad(trötter);
        skumtomten.addUnderOrdnad(dammråttan);

        räven.addÖverOrdnad(butter);
        räven.addUnderOrdnad(gråsuggan);
        räven.addUnderOrdnad(myran);

        gråsuggan.addÖverOrdnad(räven);

        myran.addÖverOrdnad(räven);
        myran.addUnderOrdnad(bladlusen);

        bladlusen.addÖverOrdnad(myran);

        dammråttan.addÖverOrdnad(skumtomten);

    }

    public static void main(String[] args) {
        Databas d = new Databas();
    }
}
