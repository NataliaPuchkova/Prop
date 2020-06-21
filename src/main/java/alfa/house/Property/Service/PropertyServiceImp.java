package alfa.house.Property.Service;

import alfa.house.Property.DAO.PropertyRepository;
import alfa.house.Property.Model.InlineResponse200;
import alfa.house.Property.Model.Property;
import ch.qos.logback.core.net.SyslogOutputStream;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImp implements PropertyService{

    @Autowired
    PropertyRepository propertyRepository;

    @Override
    public InlineResponse200 createProperty(Property property) {
        try {
            System.out.println(property.toString());
            propertyRepository.save(property);
        } catch (Exception e) {
            System.out.println("Failure");
            e.printStackTrace();
        }
        return new InlineResponse200();
    }

    @Override
    public void archiveProperty(String id) {

    }

    @Override
    public void updateProperty() {

    }
}
