package com.mvp.yaohe.vo;

import com.mvp.yaohe.enums.RespStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author litao
 * @date 2023/3/12 7:57 PM
 * 统一返回类
 */
@Getter
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class BasicResultVO<T> {
    /**
     * 响应码
     */
    private int status;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 回传数据
     */
    private T data;

    public BasicResultVO(RespStatusEnum respStatus) {
        this.status = respStatus.getStatus();
        this.msg = respStatus.getMsg();
    }

    public BasicResultVO(RespStatusEnum respStatus, T data) {
        this.status = respStatus.getStatus();
        this.msg = respStatus.getMsg();
        this.data = data;
    }

    public static BasicResultVO<Void> success() {
        return new BasicResultVO<>(RespStatusEnum.SUCCESS);
    }

    public static <T> BasicResultVO<T> success(T data) {
        return new BasicResultVO<>(RespStatusEnum.SUCCESS, data);
    }

    public static BasicResultVO<Void> fail() {
        return new BasicResultVO<>(RespStatusEnum.FAIL);
    }

    public static <T> BasicResultVO<T> fail(T data) {
        return new BasicResultVO<>(RespStatusEnum.FAIL, data);
    }
}
