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
public class TimeSlicePrice {
    @JsonProperty("SliceIndex")
    public int sliceIndex;
    @JsonProperty("Price")
    public int price;
    @JsonProperty("TimeSlice")
    public int timeSlice;
    @JsonProperty("TimeSlicePriceID")
    public int timeSlicePriceID;
    @JsonProperty("PricePlanID")
    public int pricePlanID;
    @JsonProperty("PricePlan")
    public String pricePlan;
}
