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
public class FidParkUserUserGroupLINK {
    @JsonProperty("UserID")
    public int userID;
    @JsonProperty("User")
    public String user;
    @JsonProperty("UserGroupID")
    public int userGroupID;
    @JsonProperty("UserGroup")
    public UserGroup userGroup;
}
