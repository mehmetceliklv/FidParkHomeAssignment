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
public class CarLPN {
    @JsonProperty("CarLPNID")
    public int carLPNID;
    @JsonProperty("Number")
    public String number;
    @JsonProperty("ImagePath")
    public String imagePath;
    @JsonProperty("CardID")
    public int cardID;
    @JsonProperty("Card")
    public String card;
}
