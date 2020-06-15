package soap.client;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;

public class Client {
    public static void main(String[] args) {
        try {
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            String url = "http://localhost:8080/SoapService/service?wsdl";
            String soapMessage = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:mys=\"http://www.mysoap.example.com\">\n" +
                    "   <soapenv:Header/>\n" +
                    "   <soapenv:Body>\n" +
                    "      <mys:getAllPharmacies/>\n" +
                    "   </soapenv:Body>\n" +
                    "</soapenv:Envelope>";
            System.out.println("Connected");
            soapConnection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
