package hyena.like.common.exception;

public abstract class BaseException extends RuntimeException {

    protected BaseException(final String message) {
        super(message);
    }
}
