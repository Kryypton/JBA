package com.kryptonn.jba.exception;

/**
 * Thrown to indicate that the client ID or the client secret is not valid.
 * <p>
 *    The client ID and the client secret are provided by Blizzard when you register your application.
 * </p>
 * @see com.kryptonn.jba.builder.JBABuilderOAuth
 * @see com.kryptonn.jba.client.JBA
 */
public class JBAClientInfoNotValidException extends Exception {

    /**
     * Constructs a JBAClientInfoNotValidException with no detail message.
     */
    public JBAClientInfoNotValidException() {
        super();
    }

    /**
     * Constructs a JBAClientInfoNotValidException with the specified detail message.
     * @param message The detail message.
     */
    public JBAClientInfoNotValidException(String message) {
        super(message);
    }

    /**
     * Constructs a JBAClientInfoNotValidException with the specified detail message and cause.
     * @param message The detail message.
     * @param cause The cause.
     */
    public JBAClientInfoNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a JBAClientInfoNotValidException with the specified cause.
     * @param cause The cause.
     */
    public JBAClientInfoNotValidException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a JBAClientInfoNotValidException with the specified detail message, cause, suppression enabled or disabled, and writable stack trace enabled or disabled.
     * @param message The detail message.
     * @param cause The cause.
     * @param enableSuppression Whether or not suppression is enabled or disabled.
     * @param writableStackTrace Whether or not the stack trace should be writable.
     */
    protected JBAClientInfoNotValidException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
