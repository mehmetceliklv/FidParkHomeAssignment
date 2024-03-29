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
public class UserRight {
    @JsonProperty("UserRightID")
    public int userRightID;
    @JsonProperty("RightName")
    public String rightName;
    @JsonProperty("RightDescription")
    public String rightDescription;
    @JsonProperty("UserGroup_UserRight_LINKs")
    public ArrayList<String> userGroup_UserRight_LINKs;
}
