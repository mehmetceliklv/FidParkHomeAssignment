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
public class UserZoneLINK {
    @JsonProperty("ID")
    public int iD;
    @JsonProperty("UserID")
    public int userID;
    @JsonProperty("User")
    public String user;
    @JsonProperty("ZoneID")
    public int zoneID;
    @JsonProperty("Zone")
    public Zone zone;
}
