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
public class Picture {
    @JsonProperty("PictureID")
    public int pictureID;
    @JsonProperty("PictureData")
    public String pictureData;
    @JsonProperty("Zone")
    public ArrayList<Zone> zone;
    @JsonProperty("Zone1")
    public ArrayList<Zone1> zone1;
    @JsonProperty("Zone2")
    public ArrayList<Zone2> zone2;
}
