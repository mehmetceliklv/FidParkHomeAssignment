package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @JsonProperty("UserID")
    public int userID;
    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("LoginName")
    public String loginName;
    @JsonProperty("EncryptedPassword")
    public String encryptedPassword;
    @JsonProperty("ConfirmPassword")
    public String confirmPassword;
    @JsonProperty("Deleted")
    public boolean deleted;
    @JsonProperty("ClientAssociation")
    public String clientAssociation;
    @JsonProperty("ZoneName")
    public String zoneName;
    @JsonProperty("MaxOverlappingLPNRegistrations")
    public int maxOverlappingLPNRegistrations;
    @JsonProperty("LPNRegistrationDurationHours")
    public int lPNRegistrationDurationHours;
    @JsonProperty("DefaultLanguageID")
    public int defaultLanguageID;
    @JsonProperty("FidParkUser_UserGroup_LINKs")
    public ArrayList<FidParkUserUserGroupLINK> fidParkUser_UserGroup_LINKs;
    @JsonProperty("User_Zone_LINKs")
    public ArrayList<UserZoneLINK> user_Zone_LINKs;
    @JsonProperty("LastChangeDateTime")
    public Date lastChangeDateTime;
    @JsonProperty("IPAddress")
    public String iPAddress;
    @JsonProperty("SkinName")
    public String skinName;
    @JsonProperty("Locked")
    public boolean locked;
    @JsonProperty("User_CardGroup_LINKs")
    public ArrayList<String> user_CardGroup_LINKs;
    @JsonProperty("User_ClientGroup_LINKs")
    public ArrayList<UserClientGroupLINK> user_ClientGroup_LINKs;
}
