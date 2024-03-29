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
public class ClientGroup {
    @JsonProperty("ID")
    public int iD;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("ManagerName")
    public String managerName;
    @JsonProperty("ManagerPhone")
    public String managerPhone;
    @JsonProperty("ManagerEmail")
    public String managerEmail;
}
