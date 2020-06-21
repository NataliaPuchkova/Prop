package alfa.house.Property.Controller;

import alfa.house.Property.Model.InlineResponse200;
import alfa.house.Property.Model.Property;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface PropertyInterface {

    @ApiOperation(value = "Create a property", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully created a property"),
            @ApiResponse(code = 401, message = "You are not authorized"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @PostMapping(value ="/createProperty",  produces = "application/json") // //new annotation since 4.3
    public InlineResponse200 createProperty(Property property);
}
