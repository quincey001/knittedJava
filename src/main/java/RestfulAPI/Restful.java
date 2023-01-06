package RestfulAPI;

public class Restful {
    /**
     * API(application program interface) are ways for two programs to talk to each other.
     *
     * REST stands for Representational State Transfer, it is a set of constraints that set out how
     * an api should work, REST api means that the api adheres(遵循 follows) to the rest architecture.
     *
     *
     * Benefit:
     * Scalability-------:
     * Systems that implement REST API can scale efficiently because REST optimize client-server interactions.
     * (Statelessness: the server does not have to retain past client request information)
     * (Well-manged caching: eliminates some client-server interactions)
     *
     * Flexibility------:
     * RESTful Web services support total client-server separation.
     *
     * Independence-------:
     * You can write both client and server applications in various programming languages without
     * affecting the API design.
     *
     * GET Method:
     * clients use GET to access resources that are located at the specified URL on server.
     *
     * POST method:
     * Clients use POST to send data to the server. sending the same POST request multiple times has the
     * side effect of creating the same resource multiple times.
     *
     * PUT method:
     * Clients use PUT to update existing resources on the server. Sending the same PUT request
     * multiple time in a restful api web service gives the same result.
     *
     * DELETE method:
     * Clients use DELETE to remove the resource.
     *
     *
     * http header: are the metadata exchanged between the client and server.
     *
     * RESTful Authentication methods:
     * authentication is the process of verifying an identity. A RESTful api service must authenticate
     * request before it can send a request.
     *
     * (Basic authentication, Bearer authentication)
     * API KEY
     * OAuth
     *
     * status code
     * 200: generic success response
     * 201: Post method success response
     * 400: Incorrect request
     * 404: Resource not found
     * 500: internal server error
     */
}
