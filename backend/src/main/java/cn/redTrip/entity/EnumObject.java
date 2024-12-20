package cn.redTrip.entity;

import lombok.Data;

/**
 * @author dzl
 * @date 2024/2/3 23:48
 */
@Data
public class EnumObject {
    /**
     * 未登录
     */

    public static Integer USER_NOT_LOGIN = 450;
    /**
     * 注册失败
     * **/
    public static Integer REGISTER_FAIL = 451;

    /**
     * 用户名或密码错误
     * **/

    public static Integer PASSWORD_ERROR = 452;

    /**
     * 手机号重复注册
     * **/
    public static Integer NUMBER_ERROR = 453;


    /**
     * 重复收藏
     */

    public static Integer COLLECTION_ERROR = 454;

    /**
     * 重复喜欢
     */
    public static Integer LIKE_ERROR = 455;


    /**
     * 数据库无数据
     */

    public static Integer UN_DATA = 456;
}
