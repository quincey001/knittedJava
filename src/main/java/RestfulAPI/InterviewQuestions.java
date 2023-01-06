package RestfulAPI;

public class InterviewQuestions {
    /**
     * how are restful apis stateless?
     * statefulness 有状态性，statelessness 无状态性
     * an application that is considered stateful stores data from client on its own servers.
     * if a username and password were passed from the client to the server as a form of authentication
     * and the server stores that data, then the server is stateful.
     * the server is storing data from the client.
     * On the other hand, the rest architecture requires that the client states is not stored on the server.
     *
     *
     * Explain the HTTP methods?
     * REST web service will use HTTP methods and client requests, the most common method are GET, POST,
     * PUT, DELETE. these four methods correspond to crud operations.
     *
     *
     * Expain the HTTP State codes?
     * restful web services uses HTTP status codes in server response, the most common types of status codes
     * are 200(successful request and response),
     * 400( client-side error),
     * 500( server-side error),
     * 404( resource not found)
     *
     * what is a URL?
     * URL stands for uniform resource identifier, it identifies every resource in the rest architecture,
     * A url can be one of two types, urn which identifies a resource through a unique and persistent name,
     * and url is your typical web address.
     *
     * what are best practices in making the URL for RESTful web-services?
     * urls should be mostly standardized when developing a restful web service,this way clients can more
     * easily work with the web service.
     * here are five best practices when making restful urls,
     * (1)developing them with the understanding that forward slashes indicate hierarchy
     * (2)use plural nouns for branches
     * (3)use hyphens for multiple words
     * (4)use lowercase
     * (5)refrain from using file extensions
     *
     * what are the differences between REST and SOAP?
     * REST is an architecture to develop web services,
     * soap or simple object access protocol serves as a protocol for changing structured information by
     * apis.
     * REST has flexible standards, saap standards are much more strict.
     * REST allows for data transfer in JSON XML and others, soap only support XML.
     * Soap is used in cases where more regulated and staple data needs to be transferred.
     *
     *
     * What are the difference between REST and AJAX?
     *
     *
     *
     *
     */
}
