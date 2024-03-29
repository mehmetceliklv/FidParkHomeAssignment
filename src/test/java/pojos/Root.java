package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {
      @JsonProperty("clientID")
      public int clientID;
      @JsonProperty("LastNameOrCompany")
      public String lastNameOrCompany;
      @JsonProperty("FirstName")
      public String firstName;
//    @JsonProperty("ClientAssociation")
//    public String clientAssociation;
      @JsonProperty("PersCodeOrRegNumber")
      public String persCodeOrRegNumber;
      @JsonProperty("Email")
      public String email;
//    @JsonProperty("Mobile")
//    public String mobile;
//    @JsonProperty("ClientTypeCode")
//    public int clientTypeCode;
//    @JsonProperty("ClientTypeCodeBool")
//    public boolean clientTypeCodeBool;
//    @JsonProperty("ClientCode")
//    public int clientCode;
//    @JsonProperty("Cards")
//    public ArrayList<Card> cards;
//    @JsonProperty("Deleted")
//    public boolean deleted;
//    @JsonProperty("EncryptedPassword")
//    public String encryptedPassword;
//    @JsonProperty("ConfirmPassword")
//    public String confirmPassword;
//    @JsonProperty("DateCreated")
//    public Date dateCreated;
//    @JsonProperty("LastChangeDateTime")
//    public Date lastChangeDateTime;
//    @JsonProperty("Street")
//    public String street;
//    @JsonProperty("Notes")
//    public String notes;
//    @JsonProperty("WorkTimeGroupID")
//    public int workTimeGroupID;
//    @JsonProperty("WorkTimeGroup")
//    public WorkTimeGroup workTimeGroup;
//    @JsonProperty("Balance")
//    public int balance;
//    @JsonProperty("Hidden")
//    public boolean hidden;
//    @JsonProperty("UseCommonGroupLimit")
//    public boolean useCommonGroupLimit;
//    @JsonProperty("GenderIsMale")
//    public boolean genderIsMale;
//    @JsonProperty("PictureID")
//    public int pictureID;
//    @JsonProperty("Picture")
//    public Picture picture;
//    @JsonProperty("ImageString")
//    public String imageString;
//    @JsonProperty("DefaultCardGroupID")
//    public int defaultCardGroupID;
      @JsonProperty("City")
      public String city;
//    @JsonProperty("PostName")
//    public String postName;
//    @JsonProperty("GroupLimit")
//    public int groupLimit;
//    @JsonProperty("GroupLimitOneTimeCards")
//    public int groupLimitOneTimeCards;
//    @JsonProperty("GroupLimitPermanentCards")
//    public int groupLimitPermanentCards;
//    @JsonProperty("BankAccount")
//    public String bankAccount;
//    @JsonProperty("Country")
//    public String country;
//    @JsonProperty("CreditLimit")
//    public int creditLimit;
//    @JsonProperty("DateOfBirth")
//    public Date dateOfBirth;
//    @JsonProperty("MaxCardCount")
//    public int maxCardCount;
//    @JsonProperty("Passport")
//    public String passport;
//    @JsonProperty("PostCode")
//    public String postCode;
//    @JsonProperty("Phone")
//    public String phone;
//    @JsonProperty("Fax")
//    public String fax;
//    @JsonProperty("BankName")
//    public String bankName;
//    @JsonProperty("BankCode")
//    public String bankCode;
//    @JsonProperty("ContractEndDate")
//    public Date contractEndDate;
//    @JsonProperty("Client_Product_Links")
//    public ArrayList<ClientProductLink> client_Product_Links;
//    @JsonProperty("ClientGroupID")
//    public int clientGroupID;
//    @JsonProperty("ClientGroup")
//    public ClientGroup clientGroup;
}
