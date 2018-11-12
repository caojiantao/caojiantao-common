package com.github.caojiantao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author caojiantao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDTO<T> {

    private Integer code;
    private T data;
    private String message;

    public static <T> ResultDTO success(T data) {
        return new ResultDTO<>(200, data, null);
    }

    public static <T> ResultDTO success(String message) {
        return new ResultDTO<>(200, null, message);
    }

    public static <T> ResultDTO failure(String message) {
        return new ResultDTO<>(500, null, message);
    }
}
