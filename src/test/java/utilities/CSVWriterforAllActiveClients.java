package utilities;

import pojos.AllActiveClientsGETResponsePojo;
import pojos.ClientGETResponsePojo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class CSVWriterforAllActiveClients {
    public static void writeActiveClientsToCSV(AllActiveClientsGETResponsePojo allClients, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Write CSV header
            writer.append("clientID,lastNameOrCompany,firstname,email,mobile,clientTypeCode,deleted,clientCode\n");

            // Write client details
            List<ClientGETResponsePojo> clients = allClients.getValue();
            for (ClientGETResponsePojo client : clients) {
                writer.append(String.format("%d,%s,%s,%s,%s,%s,%b,%d\n",
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
        } catch (IOException e) {
            System.out.println("An error occurred while writing to CSV: " + e.getMessage());
        }
    }

    // Example usage
    public static void main(String[] args) {
        // Assuming allClientsGETResponsePojo contains the response body mapped to AllActiveClientsGETResponsePojo object
        String filePath = "AllActiveClients.csv";
        writeActiveClientsToCSV(new AllActiveClientsGETResponsePojo(), filePath);
    }
}
