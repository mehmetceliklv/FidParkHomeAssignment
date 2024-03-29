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
public class ZoneCardGroupTariffPlanLINK {
    @JsonProperty("ZoneID")
    public int zoneID;
    @JsonProperty("Zone")
    public Zone zone;
    @JsonProperty("CardGroupID")
    public int cardGroupID;
    @JsonProperty("CardGroup")
    public String cardGroup;
    @JsonProperty("TariffPlanID")
    public int tariffPlanID;
    @JsonProperty("TariffPlan")
    public TariffPlan tariffPlan;
    @JsonProperty("TimeTableID")
    public int timeTableID;
    @JsonProperty("TimeTable")
    public TimeTable timeTable;
}
