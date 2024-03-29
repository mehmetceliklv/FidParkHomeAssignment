package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientGETCountResponsePojo {

    public int clientID;
    public String lastNameOrCompany;
    public String firstName;
    public String clientAssociation;
    public String persCodeOrRegNumber;
    public String email;
    public String mobile;
    public int clientTypeCode;
    public boolean clientTypeCodeBool;
    public String fullName;
    public int clientCode;
    public ArrayList<Object> cardUSNs;
    public boolean deleted;
    public String encryptedPassword;
    public Object confirmPassword;
    public Date dateCreated;
    public Date lastChangeDateTime;
    public String street;
    public String notes;
    public int workTimeGroupID;
    public Object workTimeGroup;
    public double balance;
    public boolean hidden;
    public boolean useCommonGroupLimit;
    public boolean genderIsMale;
    public int pictureID;
    public Object picture;
    public String imageString;
    public int defaultCardGroupID;
    public String city;
    public String postName;
    public int groupLimit;
    public int groupLimitOneTimeCards;
    public int groupLimitPermanentCards;
    public String bankAccount;
    public String country;
    public double creditLimit;
    public Object dateOfBirth;
    public Object maxCardCount;
    public String passport;
    public String postCode;
    public String phone;
    public String fax;
    public String bankName;
    public String bankCode;
    public Object contractEndDate;
    public Object client_Product_Links;
    public int clientGroupID;
    public Object clientGroup;

}
