package RestfulAPI;

public class AdvancedInterviewQuestions {
    /**
     * 1----------------what are differences between PUT, POST AND PATCH?
     * put used to update existing resource, replace the entire resource with a new resource
     * post used to create resource.
     * the patch alters only the data that is specified
     *
     *
     * 2----------------what is a payload in the context of a REST api?
     * payload refers(means) to data that has been transferred through the REST API
     *
     * 3-----------------what is a REST message?
     * message refers to the back and forth communication via request and response by the client and server
     *
     * 4------------------what are the core components of an HTTP Request?
     * there are five components in HTTP Request,
     * Method,
     * URL(used to identify the resource),
     * http version(indicate the http version that is being used),
     * request header(contains the metadata which can be the message format, cache settings content etc),
     * request body(contains the content or data that is being sent ).
     *
     * 5-------------------what are the core components of an HTTP Response?
     * There are four components in the HTTP Response,
     * status code(indicates the success or failure of a request)
     * http version
     * response header(response metadata like content length, content type, date etc)
     * response body(return data)
     *
     * 6--------------------what is an idempotent method and why are they important?
     * when using RESTful web services, a client may make numerous requests to a server at a time,
     * an idempotent method is one that yields the same response, regardless of(无论) how many times a
     * request is sent.
     * pressing a button on a webpage that makes a get request to a resource after the nth press of a
     * button the api response will still be the same as the first press
     *
     * 7-------------------what is the difference between idempotent and safe http methods?
     * idempotent method is one that can be called multiple times without changing response
     * safe method is one that does not change a resource meaning it may read but not right
     * for example, a get method is considered to be safe.
     *
     *
     * 8-------------------explain caching in a RESTful Architecture?
     * a client may request the same data from a rest api many times,
     * in this case it's beneficial for for the response to be cached
     * this way less bandwidth is needed and the client may retrieve data faster.
     * each rest api contains specific metadata related to the caching of responses
     * for example, the headers of cache control and expires specify what responses may
     * be cached by who and for how long
     *
     *
     * 9-------------------what is json?(javasript object notation)
     * JSON is a syntax for storing and exchanging data
     *
     *
     */
}
