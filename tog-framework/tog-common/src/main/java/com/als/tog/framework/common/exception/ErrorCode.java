package com.als.tog.framework.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 错误码对象
 *
 * @author 刘嘉杰
 * @version 1.0.0
 * @date 2023/11/9 上午11:35
 */
@Data
@AllArgsConstructor
public class ErrorCode {
    /**
     * 错误码
     */
    private final Integer code;
    /**
     * 错误提示
     */
    private final String msg;
}
