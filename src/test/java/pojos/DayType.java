package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class DayType {
    @JsonProperty("DayTypeID")
    public int dayTypeID;
    @JsonProperty("DayTypeName")
    public String dayTypeName;
}
