package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeZone {
    @JsonProperty("TariffPlanID")
    public int tariffPlanID;
    @JsonProperty("TariffPlan")
    public String tariffPlan;
    @JsonProperty("DayTypeID")
    public int dayTypeID;
    @JsonProperty("DayType")
    public DayType dayType;
    @JsonProperty("TimeFrom")
    public Date timeFrom;
    @JsonProperty("TimeTo")
    public Date timeTo;
    @JsonProperty("TimeZoneID")
    public int timeZoneID;
    @JsonProperty("PricePlanID")
    public int pricePlanID;
    @JsonProperty("PricePlan")
    public PricePlan pricePlan;
    @JsonProperty("IgnoreNextTimeZone")
    public boolean ignoreNextTimeZone;
}
