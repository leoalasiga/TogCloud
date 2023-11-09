package com.als.tog.framework.common.exception;

/**
 * 全局错误码枚举
 * 信息响应 (100–199)
 * 成功响应 (200–299)
 * 重定向消息 (300–399)
 * 客户端错误响应 (400–499)
 * 服务端错误响应 (500–599)
 * 参考： https://developer.mozilla.org/zh-CN/docs/Web/HTTP/Status
 *
 *
 * @author 刘嘉杰
 * @version 1.0.0
 * @date 2023/11/9 上午11:25
 */
public interface GlobalErrorCodeConstants {
    /**
     * 成功响应
     */
    ErrorCode SUCCESS = new ErrorCode(200, "成功");

    /**
     * 客户端错误响应
     */
    ErrorCode BAD_REQUEST = new ErrorCode(400, "错误的请求语法");
    ErrorCode UNAUTHORIZED = new ErrorCode(401, "未授权");
    ErrorCode FORBIDDEN = new ErrorCode(403, "没有访问内容的权限");
    ErrorCode NOT_FOUND = new ErrorCode(404, "服务器找不到请求的资源");

    /**
     * 服务端错误响应
     */
    ErrorCode INTERNAL_SERVER_ERROR = new ErrorCode(500, "系统异常");

}
