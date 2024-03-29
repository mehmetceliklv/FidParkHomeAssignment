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
public class CardGroup {
    @JsonProperty("CardGroupID")
    public int cardGroupID;
    @JsonProperty("GroupName")
    public String groupName;
    @JsonProperty("TariffPlanID")
    public int tariffPlanID;
    @JsonProperty("TariffPlan")
    public TariffPlan tariffPlan;
    @JsonProperty("Options")
    public int options;
    @JsonProperty("Notes")
    public String notes;
    @JsonProperty("Deleted")
    public boolean deleted;
    @JsonProperty("PaymentMode")
    public int paymentMode;
    @JsonProperty("ValidateAllTokens")
    public boolean validateAllTokens;
    @JsonProperty("User_CardGroup_LINKs")
    public ArrayList<UserCardGroupLINK> user_CardGroup_LINKs;
    @JsonProperty("Zone_CardGroup_TariffPlan_LINKs")
    public ArrayList<ZoneCardGroupTariffPlanLINK> zone_CardGroup_TariffPlan_LINKs;
    @JsonProperty("CardGroup_Product_Links")
    public ArrayList<CardGroupProductLink> cardGroup_Product_Links;
}
