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
public class TariffPlan {
    @JsonProperty("TariffPlanID")
    public int tariffPlanID;
    @JsonProperty("TariffPlanName")
    public String tariffPlanName;
    @JsonProperty("Deleted")
    public boolean deleted;
    @JsonProperty("ExitTolerance")
    public int exitTolerance;
    @JsonProperty("MinimumFee")
    public int minimumFee;
    @JsonProperty("GenerousTime")
    public int generousTime;
    @JsonProperty("MaxDayPrice")
    public int maxDayPrice;
    @JsonProperty("MaxWeekPrice")
    public int maxWeekPrice;
    @JsonProperty("MaxMonthPrice")
    public int maxMonthPrice;
    @JsonProperty("RestartMethode")
    public String restartMethode;
    @JsonProperty("MaximumMethode")
    public String maximumMethode;
    @JsonProperty("BorderMethode")
    public String borderMethode;
    @JsonProperty("GracePeriod")
    public int gracePeriod;
    @JsonProperty("AdditionalFee")
    public int additionalFee;
    @JsonProperty("Notes")
    public String notes;
    @JsonProperty("TimeZones")
    public ArrayList<TimeZone> timeZones;
}
