package com.github.caojiantao.dto;

import lombok.Data;

/**
 * @author caojiantao
 */
@Data
public class ResultDTO<T> {

    private Integer code;
    private T data;
    private String message;
}
