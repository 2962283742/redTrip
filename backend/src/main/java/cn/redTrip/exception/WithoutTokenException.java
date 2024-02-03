package cn.redTrip.exception;

/**
 * @author dzl
 * @date 2024/2/3 23:44
 */
public class WithoutTokenException extends Exception{
    public WithoutTokenException() {
    }

    public WithoutTokenException(String message) {
        super(message);
    }
}
