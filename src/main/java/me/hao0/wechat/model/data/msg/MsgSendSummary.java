package me.hao0.wechat.model.data.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;
import me.hao0.wechat.serializer.MsgTypeDeserializer;

import java.io.Serializable;

/**
 * 消息发送分析
 * Author: haolin
 * Email: haolin.h0@gmail.com
 * Date: 20/11/15
 */
@Data
public class MsgSendSummary implements Serializable {

    private static final long serialVersionUID = -8877051363122800450L;

    /**
     * 日期
     */
    @JsonProperty("ref_date")
    private String date;

    /**
     * 消息类型
     */
    @JsonProperty("msg_type")
    @JsonDeserialize(using = MsgTypeDeserializer.class)
    private MsgType msgType;

    /**
     * 向公众号发送了消息的用户数
     */
    @JsonProperty("msg_user")
    private Integer msgUser;

    /**
     * 向公众号发送的消息数
     */
    @JsonProperty("msg_count")
    private Integer msgCount;
}
