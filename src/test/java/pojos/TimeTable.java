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
public class TimeTable {
    @JsonProperty("TimeTableID")
    public int timeTableID;
    @JsonProperty("TimeTableName")
    public String timeTableName;
    @JsonProperty("Deleted")
    public boolean deleted;
    @JsonProperty("System")
    public boolean system;
    @JsonProperty("TimeTableDetails")
    public ArrayList<TimeTableDetail> timeTableDetails;
}
