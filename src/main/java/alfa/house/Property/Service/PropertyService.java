package alfa.house.Property.Service;

import alfa.house.Property.Model.InlineResponse200;
import alfa.house.Property.Model.Property;

public interface PropertyService {
    InlineResponse200 createProperty(Property property);
    void archiveProperty(String id);
    void updateProperty();
}
