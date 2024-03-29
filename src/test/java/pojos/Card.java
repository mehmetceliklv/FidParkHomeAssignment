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
public class Card {
    @JsonProperty("CardID")
    public int cardID;
    @JsonProperty("CardUSN")
    public String cardUSN;
    @JsonProperty("CardGroupID")
    public int cardGroupID;
    @JsonProperty("CardGroup")
    public CardGroup cardGroup;
    @JsonProperty("BeginDate")
    public Date beginDate;
    @JsonProperty("ExpiryDate")
    public Date expiryDate;
    @JsonProperty("CardTypeID")
    public int cardTypeID;
    @JsonProperty("IsInGroup")
    public boolean isInGroup;
    @JsonProperty("Notes")
    public String notes;
    @JsonProperty("CardHolder")
    public String cardHolder;
    public int amountPaid;
    public int apb;
    public int pendingBalance;
    public int pendingBalanceDecimal;
    public int userLanguage;
    @JsonProperty("Locked")
    public boolean locked;
    @JsonProperty("UseClientBalance")
    public boolean useClientBalance;
    @JsonProperty("PictureID")
    public int pictureID;
    @JsonProperty("Picture")
    public Picture picture;
    @JsonProperty("ClientID")
    public int clientID;
    @JsonProperty("Client")
    public String client;
    public Date entranceDateTime;
    public Date exitDateTime;
    @JsonProperty("LimitWarningSentDT")
    public Date limitWarningSentDT;
    @JsonProperty("CardLPN")
    public String cardLPN;
    public int entranceTerminal;
    public int exitTerminal;
    public Date exitTillDateTime;
    @JsonProperty("IsBooking")
    public boolean isBooking;
    @JsonProperty("CurrentSessionID")
    public String currentSessionID;
    @JsonProperty("SwapCardGroupIDOnExitTo")
    public int swapCardGroupIDOnExitTo;
    @JsonProperty("DateCreated")
    public Date dateCreated;
    @JsonProperty("CurrentProductLinkID")
    public int currentProductLinkID;
    @JsonProperty("GenerousTimeEnabled")
    public boolean generousTimeEnabled;
    @JsonProperty("CarLPNs")
    public ArrayList<CarLPN> carLPNs;
    @JsonProperty("USNs")
    public ArrayList<USN> uSNs;
    @JsonProperty("USNsList")
    public ArrayList<String> uSNsList;
    @JsonProperty("AccessGroupIDs")
    public String accessGroupIDs;
    @JsonProperty("Card_CardGroup_LINKs")
    public ArrayList<CardCardGroupLINK> card_CardGroup_LINKs;
    @JsonProperty("IsWebPass")
    public boolean isWebPass;
    @JsonProperty("LastChangeDateTime")
    public Date lastChangeDateTime;
    @JsonProperty("BookingID")
    public int bookingID;
    @JsonProperty("SetForBookingCheck")
    public boolean setForBookingCheck;
    @JsonProperty("SetForGroupLimitCheck")
    public boolean setForGroupLimitCheck;
    @JsonProperty("IsMobillyAutomatic")
    public boolean isMobillyAutomatic;
}
