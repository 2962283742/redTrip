package cn.redTrip.common;

/**
 * @author dzl
 * @date 2024/2/3 20:18
 */
public class UserLocalThread extends ThreadLocal<Integer>{
    private static ThreadLocal threadLocal = new ThreadLocal<Integer>();


    public static Integer getThreadLocal() {
        return Integer.parseInt((String) threadLocal.get());
    }

    public static void setThreadLocal(Object obj) {
        threadLocal.set(obj);
    }
}
