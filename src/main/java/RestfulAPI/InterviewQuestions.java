package RestfulAPI;

public class InterviewQuestions {
    /**
     * 1----------how are restful apis stateless?
     * statefulness 有状态性，statelessness 无状态性
     * an application that is considered stateful stores data from client on its own servers.
     * if a username and password were passed from the client to the server as a form of authentication
     * and the server stores that data, then the server is stateful.
     * the server is storing data from the client.
     * On the other hand, the rest architecture requires that the client states is not stored on the server.
     *
     *
     * 2----------Explain the HTTP methods?
     * REST web service will use HTTP methods and client requests, the most common method are GET, POST,
     * PUT, DELETE. these four methods correspond to crud operations.
     *
     *
     * 3-----------Explain the HTTP State codes?
     * restful web services uses HTTP status codes in server response, the most common types of status codes
     * are 200(successful request and response),
     * 400( client-side error),
     * 500( server-side error),
     * 404( resource not found)
     *
     * 4-----------what is a URL?
     * URL stands for uniform resource identifier, it identifies every resource in the rest architecture,
     * A url can be one of two types, urn which identifies a resource through a unique and persistent name,
     * and url is your typical web address.
     *
     * 5------------what are best practices in making the URL for RESTful web-services?
     * urls should be mostly standardized when developing a restful web service,this way clients can more
     * easily work with the web service.
     * here are five best practices when making restful urls,
     * (1)developing them with the understanding that forward slashes indicate hierarchy
     * (2)use plural nouns for branches
     * (3)use hyphens for multiple words
     * (4)use lowercase
     * (5)refrain from using file extensions
     *
     * 6----------------what are the differences between REST and SOAP?
     * REST is an architecture to develop web services,
     * soap or simple object access protocol serves as a protocol for changing structured information by
     * apis.
     * REST has flexible standards, saap standards are much more strict.
     * REST allows for data transfer in JSON XML and others, soap only support XML.
     * Soap is used in cases where more regulated and staple data needs to be transferred.
     *
     *
     * 7------------------What are the difference between REST and AJAX?
     * Ajax refers to asynchronous JavaScript and XML, which is a collection of web technologies for
     * making asynchronous web requests.
     * RESTful API is an architecture for handling HTTP requests
     * this means that a RESTful api may handle Ajax clients and that ajax may be used to send restful requests
     * but restful api could never be implemented nor replaced by ajax.
     *
     * 8-----------------What are the tools that you used to develop and test REST apis?
     * tools depend on the language used
     * node.js frameworks like express are commonly used for testing.
     * postman is used to ensure resources are being delivered and each facet of a rest api is performing
     * as designed.
     *
     * 9------------------what are real-world examples of REST APIs?
     * For developer, RESTful APIs are used to manipulate data using the four main HTTP Methods.
     *
     *
     * 10------------------pros and cons for REST API?
     * pros:
     * easy to learn
     * wide range of data transfers like json and xml
     * statelessness
     * scalability
     * cons:
     * lack of built-in security
     * need to be versioned for backwards compatibility
     * consistency in URLs difficult to maintain for complex projects
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
