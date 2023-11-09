package com.als.tog.framework.common.pojo;

import com.als.tog.framework.common.exception.GlobalErrorCodeConstants;
import lombok.Data;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Objects;

/**
 * 通用返回
 *
 * @author 刘嘉杰
 * @version 1.0.0
 * @date 2023/11/9 上午11:17
 */
@Data
public class CommonResult<T> implements Serializable {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 返回值
     */
    private T data;

    /**
     * 消息提示
     */
    private String msg;

    /**
     *
     * 成功响应
     * @param data
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> result = new CommonResult<>();
        result.setCode(GlobalErrorCodeConstants.SUCCESS.getCode());
        result.setData(data);
        result.setMsg("");
        return result;
    }

    /**
     * 判断是否成功
     * @param code
     * @return
     */
    public static boolean isSuccess(Integer code) {
        return Objects.equals(code, GlobalErrorCodeConstants.SUCCESS.getCode());
    }


    /**
     * 错误响应
     * @param code
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> error(Integer code, String msg) {
        Assert.isTrue(!isSuccess(code),"响应code错误！");
        CommonResult<T> result = new CommonResult<>();
        result.setCode(GlobalErrorCodeConstants.SUCCESS.getCode());
        result.setMsg(msg);
        return result;
    }


}
