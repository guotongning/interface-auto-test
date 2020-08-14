package com.ning.autotest.bean;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/8/14 15:17
 */
public class Joker {
    private String content;
    private String hashId;
    private Long unixtime;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public Long getUnixtime() {
        return unixtime;
    }

    public void setUnixtime(Long unixtime) {
        this.unixtime = unixtime;
    }

    @Override
    public String toString() {
        return "Joker{" +
                "content='" + content + '\'' +
                ", hashId='" + hashId + '\'' +
                ", unixtime=" + unixtime +
                '}';
    }
}
