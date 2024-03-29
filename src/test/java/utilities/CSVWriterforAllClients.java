package utilities;

import pojos.AllClientsGETCountResponsePojo;
import pojos.ClientGETCountResponsePojo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriterforAllClients {
    public static void writeAllClientsToCSV(AllClientsGETCountResponsePojo allClients, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Check if allClients is not null
            if (allClients != null) {
                // Write CSV header
                writer.append("clientID,lastNameOrCompany,firstname,email,mobile,clientTypeCode,status,clientCode\n");

                // Write client details
                List<ClientGETCountResponsePojo> clients = allClients.getData();
                for (ClientGETCountResponsePojo client : clients) {
                    writer.append(String.format("%d,%s,%s,%s,%s,%d,%b,%d\n",
                            client.getClientID(),
                            client.getLastNameOrCompany(),
                            client.getFirstName(),
                            client.getEmail(),
                            client.getMobile(),
                            client.getClientTypeCode(),
                            client.isDeleted(),
                            client.getClientCode()));
                }

                System.out.println("CSV file has been successfully created at " + filePath);
            } else {
                System.out.println("The 'allClients' object is null. Cannot write to CSV.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to CSV: " + e.getMessage());
        }
    }

    // Example usage
    public static void main(String[] args) {
        // Assuming allClientsGETResponsePojo contains the response body mapped to AllActiveClientsGETResponsePojo object
        String filePath = "AllClients.csv";
        writeAllClientsToCSV(new AllClientsGETCountResponsePojo(), filePath);
    }
}
