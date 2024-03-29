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
public class CardGroupProductLink {
    @JsonProperty("CardGroupProductLinkID")
    public int cardGroupProductLinkID;
    @JsonProperty("CardGroupID")
    public int cardGroupID;
    @JsonProperty("ProductID")
    public int productID;
    @JsonProperty("Product")
    public String product;
}
