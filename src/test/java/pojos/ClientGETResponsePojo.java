package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientGETResponsePojo {
    public int clientID;
    public String lastNameOrCompany;
    public String firstName;
    public String persCodeOrRegNumber;
    public String email;
    public String mobile;
    public int clientTypeCode;
    public int clientCode;
    public boolean deleted;
    public Date dateCreated;
    public Date lastChangeDateTime;
    public String street;
    public String notes;
    public int workTimeGroupID;
    public int balance;
    public boolean hidden;
    public boolean useCommonGroupLimit;
    public boolean genderIsMale;
    public int pictureID;
    public int defaultCardGroupID;
    public String city;
    public String postName;
    public int groupLimit;
    public int groupLimitOneTimeCards;
    public int groupLimitPermanentCards;
    public String bankAccount;
    public String country;
    public int creditLimit;
    public Object dateOfBirth;
    public int maxCardCount;
    public String passport;
    public String postCode;
    public String phone;
    public String fax;
    public String bankName;
    public String bankCode;
    public Object contractEndDate;
    public int clientGroupID;
}
