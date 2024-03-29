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
public class Zone1 {
    @JsonProperty("ID")
    public int iD;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Deleted")
    public boolean deleted;
    @JsonProperty("Capacity")
    public int capacity;
    @JsonProperty("FreePlaces")
    public int freePlaces;
    @JsonProperty("MaxBookablePlaces")
    public int maxBookablePlaces;
    @JsonProperty("BookedPlaces")
    public int bookedPlaces;
    @JsonProperty("MinutesLimitInsideZone")
    public int minutesLimitInsideZone;
    @JsonProperty("Longitude")
    public int longitude;
    @JsonProperty("Latitude")
    public int latitude;
    @JsonProperty("BookingCheckAdvanceDays")
    public int bookingCheckAdvanceDays;
    @JsonProperty("ReservedPlaces")
    public int reservedPlaces;
    @JsonProperty("CurrentCarCount")
    public int currentCarCount;
    @JsonProperty("Bitmap1ID")
    public int bitmap1ID;
    @JsonProperty("Bitmap2ID")
    public int bitmap2ID;
    @JsonProperty("Bitmap3ID")
    public int bitmap3ID;
    @JsonProperty("Areas")
    public ArrayList<Area> areas;
    @JsonProperty("HasAnyExitTerminals")
    public boolean hasAnyExitTerminals;
    @JsonProperty("BookingCardGroupID")
    public int bookingCardGroupID;
    @JsonProperty("TicketHTML")
    public String ticketHTML;
    @JsonProperty("ZoneID")
    public int zoneID;
    @JsonProperty("ZoneName")
    public String zoneName;
    @JsonProperty("MandatoryQueueCheckUponExit")
    public boolean mandatoryQueueCheckUponExit;
    @JsonProperty("BookingEnabled")
    public boolean bookingEnabled;
    @JsonProperty("ParkingSpaceCountingMode")
    public int parkingSpaceCountingMode;
}
