package cn.redTrip.exceptions;

import org.springframework.dao.DataIntegrityViolationException;

import java.util.zip.DataFormatException;

/**
 * @author dzl
 * @date 2024/2/17 20:45
 */
public class CollectionException extends DataIntegrityViolationException {
    public CollectionException(String msg) {
        super(msg);
    }
}
