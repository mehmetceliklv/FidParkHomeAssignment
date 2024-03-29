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
public class IsarsoftArea {
    @JsonProperty("ID")
    public int iD;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("UuId")
    public String uuId;
    @JsonProperty("AreaID")
    public int areaID;
    @JsonProperty("Area")
    public String area;
    @JsonProperty("VehicleCount")
    public int vehicleCount;
    @JsonProperty("AddedAt")
    public Date addedAt;
    @JsonProperty("LastUpdatedAt")
    public Date lastUpdatedAt;
}
