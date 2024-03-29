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
public class ClientProductLink {
    @JsonProperty("Client_Product_Link_ID")
    public int client_Product_Link_ID;
    @JsonProperty("ClientID")
    public int clientID;
    @JsonProperty("Client")
    public String client;
    @JsonProperty("ProductID")
    public int productID;
    @JsonProperty("Product")
    public Product product;
    @JsonProperty("CardID")
    public int cardID;
    @JsonProperty("IsPaid")
    public boolean isPaid;
    @JsonProperty("LastChangeDateTime")
    public Date lastChangeDateTime;
    @JsonProperty("IsUsed")
    public boolean isUsed;
    @JsonProperty("UsedAmount")
    public int usedAmount;
    @JsonProperty("CreatedDateTime")
    public Date createdDateTime;
    @JsonProperty("UsedFrom")
    public Date usedFrom;
    @JsonProperty("UsedTo")
    public Date usedTo;
    @JsonProperty("UsageFee")
    public int usageFee;
    @JsonProperty("BalticPayUniqueID")
    public String balticPayUniqueID;
    @JsonProperty("BalticPayTransactionState")
    public String balticPayTransactionState;
    @JsonProperty("BalticPayInvoiceID")
    public String balticPayInvoiceID;
    @JsonProperty("BalticPayRegistrationID")
    public String balticPayRegistrationID;
    @JsonProperty("BalticPayRequestedSum")
    public int balticPayRequestedSum;
    @JsonProperty("ScheduledPaymenDate")
    public Date scheduledPaymenDate;
}
