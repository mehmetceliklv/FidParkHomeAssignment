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
public class UserGroupUserRightLINK {
    @JsonProperty("UserRightID")
    public int userRightID;
    @JsonProperty("UserRight")
    public UserRight userRight;
    @JsonProperty("UserGroupID")
    public int userGroupID;
    @JsonProperty("UserGroup")
    public String userGroup;
}
