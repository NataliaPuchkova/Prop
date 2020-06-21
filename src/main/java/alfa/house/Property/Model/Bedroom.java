package alfa.house.Property.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Map;

//@Entity
//@Table(name="bedroom")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "@Entity\n" +
//        "@Table(name=\"bedroom\")\nhandler"})
@Embeddable
@Getter @Setter @NoArgsConstructor
public class Bedroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonInclude
    @Column(name="propertyId", nullable = false)
    private String propertyId;

    // ex: 'Bedroom 1' or 'Master Bedroom'
    @JsonInclude
    @Column(name="title", nullable = false)
    private String title;

    @JsonInclude
    @Column(name="img", nullable = false)
    private String img;

    // Beds available in this bedroom
    // <'Queen', 1>
//    @JsonInclude
//    @ElementCollection
   // @JoinTable(name="bed", joinColumns=@JoinColumn(name="ID"))
   // @MapKeyColumn (name="bedType")
   // @Column(name="beds", nullable = false)
   // private Map<String, Integer> beds;

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("title:").append(title).append(", img=").append(img);
        return str.toString();
    }

}
