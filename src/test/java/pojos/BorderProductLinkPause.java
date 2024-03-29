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
public class BorderProductLinkPause {
    @JsonProperty("BorderProductLink_PauseID")
    public int borderProductLink_PauseID;
    @JsonProperty("BorderID")
    public int borderID;
    @JsonProperty("ProductID")
    public int productID;
    @JsonProperty("Product")
    public String product;
}
