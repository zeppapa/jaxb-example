package legoset;

import javax.xml.bind.annotation.*;
import java.time.Year;
import java.util.Set;
import java.util.List;
import lombok.Data;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces", "tags", "minifigs", "weight", "url"})
@Data
public class LegoSet {
    private String name;
    private String theme;
    private String subtheme;
    private Year year;
    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement (name = "minifig")
    private List<Minifig> minifigs;
    private Weight weight;
    private String url;

    @XmlAttribute
    private int number;

}
