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
public class Area {
    @JsonProperty("ID")
    public int iD;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("ZoneID")
    public int zoneID;
    @JsonProperty("Zone")
    public String zone;
    @JsonProperty("Capacity")
    public int capacity;
    @JsonProperty("Available")
    public int available;
    @JsonProperty("IsarsoftAreas")
    public ArrayList<IsarsoftArea> isarsoftAreas;
}
