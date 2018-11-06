package cn.caojiantao.common.dto;

import lombok.Data;

/**
 * @author caojiantao
 * @date 2018-11-06 23:37:11
 * @description API接口响应实体类
 */
@Data
public class ResultDTO<T> {

    private Integer code;
    private T data;
    private String message;
}
