package utilities;

import pojos.ClientCreationResponsePojo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CSVWriter {
    public static void writeUserToCSV(ClientCreationResponsePojo client, String csvFileName) throws IOException {
        File csvFile = new File(csvFileName + ".csv");
        FileWriter fileWriter = new FileWriter(csvFile, true); // Append mode to add new content to the existing file

        if (!csvFile.exists() || csvFile.length() == 0) {
            fileWriter.write("\"clientID\",\"email\",\"lastname\",\"name\",\"personalCode\",\"city\"\n");
        }

        StringBuilder line = new StringBuilder();
        line.append("\"").append(String.valueOf(client.getClientID()).replaceAll("\"", "\"\"")).append("\",");
        line.append("\"").append(client.getEmail().replaceAll("\"", "\"\"")).append("\",");
        line.append("\"").append(client.getLastNameOrCompany().replaceAll("\"", "\"\"")).append("\",");
        line.append("\"").append(client.getFirstName().replaceAll("\"", "\"\"")).append("\",");
        line.append("\"").append(client.getPersCodeOrRegNumber().replaceAll("\"", "\"\"")).append("\",");
        line.append("\"").append(client.getCity().replaceAll("\"", "\"\"")).append("\"\n");

        fileWriter.write(line.toString());

        fileWriter.close();
        System.out.println("Client written to " + csvFileName + ".csv");

    }

    public static void main(String[] args) throws IOException {
        ClientCreationResponsePojo user1 = new ClientCreationResponsePojo("John","Doe", "john.doe@example.com", "1234");
        ClientCreationResponsePojo user2 = new ClientCreationResponsePojo("Jane","Smith", "jane.smith@example.com", "4567");

        writeUserToCSV(user1, "clientsCreated");
        writeUserToCSV(user2, "clientsCreated");
    }
}
