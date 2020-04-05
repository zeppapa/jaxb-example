package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Weight {

    @XmlValue
    private double value;

    @XmlAttribute
    private String unit;

    public Weight(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }
}
