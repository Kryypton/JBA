package com.kryptonn.jba.security.client;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Kryptonn
 * @version 1.0.1
 * @since 1.0.0
 * TokenResponse is a class that represents the response of the OAuth authentication.
 * <p>
 * The response contains the access token, the token type and the time in seconds at which the access token will expire.
 * </p>
 * <p>
 * The access token is used to authenticate requests to the Battle.net API.
 * </p>
 */
public class TokenResponse {


    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("expires_in")
    private long expiresIn;

    @JsonProperty("sub")
    private String subject;

    /**
     * Constructs a TokenResponse instance with the provided access token, token type and time in seconds at which the access token will expire.
     */
    private TokenResponse() {}

    /**
     * Returns the access token.
     * @return The access token.
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Returns the token type.
     * @return The token type.
     */
    public String getTokenType() {
        return tokenType;
    }

    /**
     * Returns the time in seconds at which the access token will expire.
     * @return The time in seconds at which the access token will expire.
     */
    public long getExpiresIn() {
        return expiresIn;
    }

    /**
     * Returns the subject.
     * @return The subject.
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Returns a string representation of the TokenResponse object.
     * @return A string that "textually represents" the TokenResponse object.
     */
    public String toString() {
        return "TokenResponse{" +
                "accessToken='" + accessToken + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", expiresIn=" + expiresIn +
                ", subject='" + subject + '\'' +
                '}';
    }

    /**
     * Returns a hash code value for the TokenResponse object.
     * @return A hash code value for the TokenResponse object.
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accessToken == null) ? 0 : accessToken.hashCode());
        result = prime * result + ((tokenType == null) ? 0 : tokenType.hashCode());
        result = prime * result + (int) (expiresIn ^ (expiresIn >>> 32));
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this TokenResponse object.
     * @param obj The reference object with which to compare.
     * @return true if this TokenResponse object is the same as the obj argument; false otherwise.
     * @see #hashCode()
     */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TokenResponse other = (TokenResponse) obj;
        if (accessToken == null) {
            if (other.accessToken != null)
                return false;
        } else if (!accessToken.equals(other.accessToken))
            return false;
        if (tokenType == null) {
            if (other.tokenType != null)
                return false;
        } else if (!tokenType.equals(other.tokenType))
            return false;
        if (expiresIn != other.expiresIn)
            return false;
        if (subject == null) {
            if (other.subject != null)
                return false;
        } else if (!subject.equals(other.subject))
            return false;
        return true;
    }
}
