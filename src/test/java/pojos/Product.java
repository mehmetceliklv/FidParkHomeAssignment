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
public class Product {
    @JsonProperty("ProductID")
    public int productID;
    @JsonProperty("ProductName")
    public String productName;
    @JsonProperty("ProductDescription")
    public String productDescription;
    @JsonProperty("FunctionID")
    public int functionID;
    @JsonProperty("FunctionParameters")
    public String functionParameters;
    @JsonProperty("TranslationKeyword")
    public String translationKeyword;
    @JsonProperty("Price")
    public int price;
    @JsonProperty("Deleted")
    public boolean deleted;
    @JsonProperty("ValidFrom")
    public Date validFrom;
    @JsonProperty("ValidTill")
    public Date validTill;
    @JsonProperty("Code")
    public String code;
    @JsonProperty("Code2")
    public String code2;
    @JsonProperty("IsForWeb")
    public boolean isForWeb;
    @JsonProperty("SellingTimeTableID")
    public int sellingTimeTableID;
    @JsonProperty("TimeTable")
    public TimeTable timeTable;
    @JsonProperty("SequenceNumber")
    public int sequenceNumber;
    @JsonProperty("VAT_ID")
    public int vAT_ID;
    @JsonProperty("Picture")
    public String picture;
    @JsonProperty("ProductGroupID")
    public int productGroupID;
    @JsonProperty("ProductGroup")
    public ProductGroup productGroup;
    @JsonProperty("CardGroup_Product_Links")
    public ArrayList<CardGroupProductLink> cardGroup_Product_Links;
    @JsonProperty("Border_Product_Link_Starts")
    public ArrayList<BorderProductLinkStart> border_Product_Link_Starts;
    @JsonProperty("Border_Product_Link_Stops")
    public ArrayList<BorderProductLinkStop> border_Product_Link_Stops;
    @JsonProperty("Border_Product_Link_Pauses")
    public ArrayList<BorderProductLinkPause> border_Product_Link_Pauses;
}
