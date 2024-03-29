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
public class ProductGroup {
    @JsonProperty("ProductGroupID")
    public int productGroupID;
    @JsonProperty("ProductGroupName")
    public String productGroupName;
    @JsonProperty("ProductGroupDescription")
    public String productGroupDescription;
    @JsonProperty("ParentProductGroupID")
    public int parentProductGroupID;
    @JsonProperty("Deleted")
    public boolean deleted;
    @JsonProperty("Products")
    public ArrayList<String> products;
}
