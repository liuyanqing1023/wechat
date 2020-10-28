package me.hao0.wechat.model.js;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 临时凭证
 * Author: haolin
 * Email: haolin.h0@gmail.com
 * Date: 14/11/15
 * @see TicketType
 */
@Data
@Builder
public class Ticket implements Serializable {

    private static final long serialVersionUID = 978451551258121101L;

    /**
     * 凭证字符串
     */
    private String ticket;

    /**
     * 凭证类型
     */
    private TicketType type;

    /**
     * 有效时间(s)
     */
    private Integer expire;

    /**
     * 过期时刻(ms)
     */
    private Long expireAt;
}
