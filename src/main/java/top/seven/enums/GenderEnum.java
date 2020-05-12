package top.seven.enums;

/**
 * Description: 性别枚举
 * Created At 2020/5/5
 */
public enum GenderEnum {
    UN_KNOWN(0, "未知"),
    MALE(1, "男"),
    FEMALE(2, "女");

    private int type;

    private String desc;

    GenderEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public static int getGender(int type) {
        for (GenderEnum e : GenderEnum.values()) {
            if (e.getType() == type) {
                return type;
            }
        }
        return UN_KNOWN.getType();
    }
}


