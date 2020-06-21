package alfa.house.Property.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

//@Component
@Validated
@Getter @Setter @NoArgsConstructor
public class InlineResponse200 {

    @JsonProperty("errors")
    private List<Error> errors = null;

    @JsonProperty("returnCode")
    private String returnCode = null;

}
