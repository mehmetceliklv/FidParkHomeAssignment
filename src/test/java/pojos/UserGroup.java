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
public class UserGroup {
    @JsonProperty("UserGroupID")
    public int userGroupID;
    @JsonProperty("GroupName")
    public String groupName;
    @JsonProperty("Deleted")
    public boolean deleted;
    @JsonProperty("UserGroup_UserRight_LINKs")
    public ArrayList<UserGroupUserRightLINK> userGroup_UserRight_LINKs;
    @JsonProperty("FidParkUser_UserGroup_LINKs")
    public ArrayList<String> fidParkUser_UserGroup_LINKs;
}
