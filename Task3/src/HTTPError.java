package task3;

public enum HTTPError {
    err100("Continue"),
    err101("Switching Protocols"),
    err102("Processing"),
    err103("Early Hints"),
    err200("OK"),
    err201("Created"),
    err202("Accepted"),
    err203("Non-Authoritative Information"),
    err204("No Content"),
    err205("Reset Content"),
    err206("Partial Content"),
    err207("Multi-Status"),
    err208("Already Reported"),
    err226("IM Used"),
    err300("Multiple Choices"),
    err301("Moved Permanently"),
    err302("Found"),
    err303("See Other"),
    err304("Not Modified"),
    err305("Use Proxy"),
    err306("Unused"),
    err307("Temporary Redirect"),
    err308("Permanent Redirect"),
    err400("Bad Request"),
    err401("Unauthorized"),
    err402("Payment Required"),
    err403("Forbidden"),
    err404("Not Found"),
    err405("Method Not Allowed"),
    err406("Not Acceptable"),
    err407("Proxy Authentication Required"),
    err408("Request Timeout"),
    err409("Conflict"),
    err410("Gone"),
    err411("Length Required"),
    err412("Precondition Failed"),
    err413("Payload Too Large"),
    err414("URI Too Long"),
    err415("Unsupported Media Type"),
    err416("Range Not Satisfiable"),
    err417("Expectation Failed"),
    err421("Misdirected Request"),
    err422("Unprocessable Entity"),
    err423("Locked"),
    err424("Failed Dependency"),
    err425("Too Early"),
    err426("Upgrade Required"),
    err427("Unassigned"),
    err428("Precondition Required"),
    err429("Too Many Requests"),
    err431("Request Header Fields Too Large"),
    err451("Unavailable For Legal Reasons"),
    err500("Internal Server Error"),
    err501("Not Implemented"),
    err502("Bad Gateway"),
    err503("Service Unavailable"),
    err504("Gateway Timeout"),
    err505("HTTP Version Not Supported"),
    err506("Variant Also Negotiates"),
    err507("Insufficient Storage"),
    err508("Loop Detected"),
    err510("Not Extended"),
    err511("Network Authentication Required");

    private final String codename;

    HTTPError (String codename) {
        this.codename = codename;
    }

    public String getCode() {
        return codename;
    }

}
