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
public class UserCardGroupLINK {
    @JsonProperty("UserID")
    public int userID;
    @JsonProperty("User")
    public User user;
    @JsonProperty("CardGroupID")
    public int cardGroupID;
    @JsonProperty("CardGroup")
    public String cardGroup;
}
