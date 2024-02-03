package cn.redTrip.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dzl
 * @date 2024/2/2 17:01
 */
@Data
public class CommonResult implements Serializable {

    private Object data;

    private Integer code;

    public CommonResult(Object data, Integer code) {
        this.data = data;
        this.code = code;
    }

    public static CommonResult success(Object data){
        return new CommonResult(data,200);
    }

    public static CommonResult fail(Object data,Integer code){
        return new CommonResult(data,code);
    }

}
