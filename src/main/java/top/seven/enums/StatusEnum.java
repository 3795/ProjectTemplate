package top.seven.enums;

/**
 * Description: 通用状态枚举
 * Created At 2020/5/4
 */
public enum StatusEnum {
    OFF(0, "禁用"),
    ON(1, "启用"),
    ;
    private int status;

    StatusEnum(int status, String desc) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }}


