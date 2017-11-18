package cn.eeemt.constant;

/**
 * author: HuangXiquan <br/>
 * date: 2017/11/02/002 <br/>
 * time: 23:18 <br/>
 * description:
 */
public enum ViewPermission {
    PUBLIC(0,"公开"), FRIEND(1,"好友可见"),PROTECTED(2,"仅自己可见");
    private Integer value;
    private String desc;

    ViewPermission(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int value(){
        return value;
    }

    public String getDesc(){
        return desc;
    }
}
