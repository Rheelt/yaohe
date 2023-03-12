package com.mvp.yaohe.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author litao
 * @date 2023/3/12 7:57 PM
 */
@AllArgsConstructor
@Getter
@ToString
public enum RespStatusEnum {
    /**
     * 错误
     */
    ERROR_500(500, "服务器未知错误，请联系管理员！"),
    ERROR_501(501, "未登录"),
    ERROR_400(400, "错误请求，请重试！"),

    /**
     * OK：操作成功
     */
    SUCCESS(0, "操作成功"),
    FAIL(-1, "操作失败");

    /**
     * 响应码
     * */
    private final int status;

    /**
     * 响应消息
     * */
    private final String msg;
}
