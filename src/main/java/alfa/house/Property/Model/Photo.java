package alfa.house.Property.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="photo")
@JsonIgnoreProperties({"hibernateLazyInitializer", "@Entity\n" +
        "@Table(name=\"photo\")\nhandler"})
@Getter @Setter @NoArgsConstructor
public class Photo {

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

    // Image Url from S3
    @JsonInclude
    @Column(name="imageUrl", nullable = false)
    private String imageUrl;

}
