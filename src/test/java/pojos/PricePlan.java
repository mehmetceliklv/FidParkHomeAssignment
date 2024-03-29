package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class PricePlan {
    @JsonProperty("TimeSlicePrices")
    public ArrayList<TimeSlicePrice> timeSlicePrices;
    @JsonProperty("PricePlanID")
    public int pricePlanID;
    @JsonProperty("Notes")
    public String notes;
    @JsonProperty("Number")
    public int number;
}
