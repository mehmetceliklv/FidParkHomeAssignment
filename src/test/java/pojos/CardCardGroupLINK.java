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
public class CardCardGroupLINK {
    @JsonProperty("ID")
    public int iD;
    @JsonProperty("CardID")
    public int cardID;
    @JsonProperty("Card")
    public String card;
    @JsonProperty("CardGroupID")
    public int cardGroupID;
    @JsonProperty("CardGroup")
    public CardGroup cardGroup;
}
