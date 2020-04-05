package legoset;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import jaxb.JAXBHelper;

public class Main {

    public static void main(String[] args) throws Exception {
        LegoSet legoset = new LegoSet();
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);

        //legoset.setTags = Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo");
        Set<String> tags = new HashSet<>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");

        legoset.setTags(tags);

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("Imperial Mudtrooper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper", 1));
        legoset.setMinifigs(minifigs);

        Weight weight = new Weight(0.89, "kg");
        legoset.setWeight(weight);
        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        legoset.setNumber(75211);

        JAXBHelper.toXML(legoset, System.out);

    }
}
