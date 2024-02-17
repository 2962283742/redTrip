package cn.redTrip.exceptions;

import org.springframework.dao.DataIntegrityViolationException;

/**
 * @author dzl
 * @date 2024/2/17 21:23
 */
public class LikeException extends DataIntegrityViolationException {
    public LikeException(String msg) {
        super(msg);
    }
}
