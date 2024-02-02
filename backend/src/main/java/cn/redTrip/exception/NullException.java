package cn.redTrip.exception;

/**
 * @author dzl
 * @date 2024/2/2 23:06
 */
public class NullException extends NullPointerException{
    public NullException() {
    }

    public NullException(String s) {
        super(s);
    }
}
