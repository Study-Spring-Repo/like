package hyena.like.common.exception;

public abstract class ApplicationException extends BaseException {
    protected ApplicationException(final String message) {
        super(message);
    }
}
