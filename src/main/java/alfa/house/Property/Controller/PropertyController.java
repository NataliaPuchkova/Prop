package alfa.house.Property.Controller;

import alfa.house.Property.Model.InlineResponse200;
import alfa.house.Property.Model.Property;
import alfa.house.Property.Service.PropertyServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {// implements PropertyInterface {

    @Autowired
    PropertyServiceImp service;

    @GetMapping(value ="/hello") // //new annotation since 4.3
    public String hello() {
        return "Hello!";
    }

 //   @Override
    @PostMapping(value ="/createProperty",  produces = "application/json") // //new annotation since 4.3
    public InlineResponse200 createProperty(@RequestBody @Validated Property property) {
        return service.createProperty(property);
    }

}
