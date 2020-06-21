package alfa.house.Property.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

//@Component
@Entity
@Table(name="property")
@JsonIgnoreProperties({"hibernateLazyInitializer", "@Entity\n" +
        "@Table(name=\"property\")\nhandler"})
@Getter @Setter @NoArgsConstructor
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int propertyId;

    // user that owns/lists this property
    //@JsonInclude
    @Column(name="userId", nullable = true)
    private String userId;

    // apartment/house/room/other
    //@JsonInclude
    @Column(name="type", nullable = true)
    private String type;

    // specifics, such as entire house, guest house, 1 room, entire apartment
    @JsonInclude
    @Column(name="subType", nullable = true)
    private String subType;

    // is property shared with the host or other guests?
    @JsonInclude
    @Column(name="isShared", nullable = true)
    private boolean isShared;

    // maximum guests allowed to stay at the property
    @JsonInclude
    @Column(name="maxGuests", nullable = true)
    private int maxGuests;

    // title of the listing
    @JsonInclude
    @Column(name="title", nullable = true)
    private String title;

    // total of bedrooms that can be used by guests
    @JsonInclude
    @ElementCollection
    @CollectionTable(name = "bedroom", joinColumns = @JoinColumn(name = "propertyId"))
    @Column(name="bedroom", nullable = true)
    private List<Bedroom> bedrooms;

    // total of beds that can be used by guests
    @JsonInclude
    @Column(name="beds", nullable = true)
    private int beds;

    // total of bathrooms that can be used by guests. Can be 1.5 b/c of just toilet available
    @JsonInclude
    @Column(name="bathrooms", nullable = true)
    private float bathrooms;

    // addressId that points to full address of the property
    @JsonInclude
    @Column(name="addressId", nullable = true)
    private String addressId;

    // full list of amenities inside the property: shampoo, grill, washer
    @JsonInclude
    @ElementCollection
    @Column(name="amenity", nullable = true)
    private List<String> amenities;

    // full list of amenities inside the property: gym, tennis courts, swimming pool
    @JsonInclude
    @ElementCollection
    @Column(name="specialAmenity", nullable = true)
    private List<String> specialAmenities;

    // full list of photo id's pointing to photos of the property
    @JsonInclude
    @ElementCollection
    @CollectionTable(name = "photo", joinColumns = @JoinColumn(name = "propertyId"))
    @Column(name="photo", nullable = true)
    private List<String> photos;

    // main summary that is supposed to describe the property to the guests
    @JsonInclude
    @Column(name="mainSummary", nullable = true)
    private String mainSummary;

    // additional optional summary
    @JsonInclude
    @Column(name="additionalSummary")
    private String additionalSummary;

    // is host around if there are any concerns? who to call?
    @JsonInclude
    @Column(name="hostAvailability", nullable = true)
    private String hostAvailability;

    // neighborhood summary that is supposed to describe the neighborhood
    @Column(name="neighborhoodSummary")
    private String neighborhoodSummary;

    // transportation summary that is supposed to describe the neighborhood
    @Column(name="transportationSummary")
    private String transportationSummary;

    // check-in time for the guests
    @JsonInclude
    @Column(name="checkinTime", nullable = true)
    private String checkinTime;

    // check-out time for the guests
    @JsonInclude
    @Column(name="checkoutTime", nullable = true)
    private Time checkoutTime;

    // Minimum of nights guests can stay, default is zero == no min
    @JsonInclude
    @Column(name="nightsMin", nullable = true)
    private int nightsMin;

    // Maximum of nights guests can stay, default is zero == no max
    @JsonInclude
    @Column(name="nightMax", nullable = true)
    private int nightsMax;

    // calendar that shows availability of the property
    @JsonInclude
    @Column(name="calendarId", nullable = true)
    private String calendarId;

    // total price of the property on an average day with all fees and taxes
    @JsonInclude
    @Column(name="priceId", nullable = true)
    private String priceId;

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("propertyId:").append(propertyId).append("\n");
        str.append("userId:").append(userId).append("\n");
        str.append("type:").append(type).append("\n");
        str.append("subtype:").append(subType).append("\n");
        str.append("isShared:").append(isShared).append("\n");
        str.append("maxGuests:").append(maxGuests).append("\n");
        str.append("title:").append(title).append("\n");
        if (bedrooms!=null) str.append("bedrooms:").append(bedrooms.toString()).append("\n");
        return str.toString();
    }
}
