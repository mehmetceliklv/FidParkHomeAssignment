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
public class TimeTableDetail {
    @JsonProperty("TimeTableDetailID")
    public int timeTableDetailID;
    @JsonProperty("TimeTableID")
    public int timeTableID;
    @JsonProperty("TimeTable")
    public String timeTable;
    @JsonProperty("DayTypeID")
    public int dayTypeID;
    @JsonProperty("DayType")
    public DayType dayType;
    @JsonProperty("BeginTime")
    public Date beginTime;
    @JsonProperty("EndTime")
    public Date endTime;
}
