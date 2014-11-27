import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

public class post {

  public static void main(String[] args) {
Client client = ClientBuilder.newClient();
Entity payload = Entity.json("{'title': 'Buy cheese and bread for breakfast.'}");
Response response = client.target("http://private-47919a-javaexamples.apiary-mock.com")
  .path("/notes")
  .request(MediaType.APPLICATION_JSON_TYPE)
  .post(payload);

System.out.println("status: " + response.getStatus());
System.out.println("headers: " + response.getHeaders());
System.out.println("body:" + response.readEntity(String.class));
  }

}
