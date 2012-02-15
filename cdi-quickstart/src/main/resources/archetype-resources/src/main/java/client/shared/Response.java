package ${package}.client.shared;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.enterprise.client.cdi.api.Conversational;

/**
 * A marshallable bean that carries the response event from the server back to
 * the client.
 */
@Portable
@Conversational
public class Response {
    private int id;
    private String message;

    public Response() {
    }

    public Response(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}