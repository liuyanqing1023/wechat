package me.hao0.wechat.model.data.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 消息发送分布数据
 * Author: haolin
 * Email: haolin.h0@gmail.com
 * Date: 20/11/15
 */
@Data
@Builder
public class MsgSendDist implements Serializable {

    private static final long serialVersionUID = -2677208070764939927L;

    /**
     * 日期
     */
    @JsonProperty("ref_date")
    private String date;

    /**
     *当日发送消息量分布的区间:
     *  0代表 “0”，1代表“1-5”，2代表“6-10”，3代表“10次以上”
     */
    @JsonProperty("count_interval")
    private Integer countInterval;

    /**
     * 想公众号发送消息的用户数
     */
    @JsonProperty("msg_user")
    private Integer msgUser;

}
