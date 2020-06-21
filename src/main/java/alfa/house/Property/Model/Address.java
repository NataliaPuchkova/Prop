package alfa.house.Property.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.persistence.*;

//@Component
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "@Entity\n" +
        "@Table(name=\"addresses\")\nhandler"})
@Getter @Setter @NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonInclude
    @Column(name="propertyId", nullable = false)
    private String propertyId;

    @JsonInclude
    @Column(name="country", nullable = false)
    private String country;

    @JsonInclude
    @Column(name="street", nullable = false)
    private String street;

    @JsonInclude
    @Column(name="unit", nullable = false)
    private String unit;

    @JsonInclude
    @Column(name="city", nullable = false)
    private String city;

    @JsonInclude
    @Column(name="state", nullable = false)
    private String state;

    @JsonInclude
    @Column(name="zipcode", nullable = false)
    private int zipcode;
}
