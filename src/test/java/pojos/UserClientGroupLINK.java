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
public class UserClientGroupLINK {
    @JsonProperty("ID")
    public int iD;
    @JsonProperty("UserID")
    public int userID;
    @JsonProperty("FidParkUser")
    public String fidParkUser;
    @JsonProperty("ClientGroupID")
    public int clientGroupID;
    @JsonProperty("ClientGroup")
    public ClientGroup clientGroup;
}
