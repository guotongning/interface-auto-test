package com.ning.autotest.bean;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/8/14 15:16
 */
public class HttpResult {
    private String reason;
    private String result;
    private Long error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Long getError_code() {
        return error_code;
    }

    public void setError_code(Long error_code) {
        this.error_code = error_code;
    }

    @Override
    public String toString() {
        return "HttpResult{" +
                "reason='" + reason + '\'' +
                ", result='" + result + '\'' +
                ", error_code=" + error_code +
                '}';
    }
}
