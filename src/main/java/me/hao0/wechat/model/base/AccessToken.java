package me.hao0.wechat.model.base;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 访问Token
 * Author: haolin
 * Email: haolin.h0@gmail.com
 * Date: 10/11/15
 * @since 1.0.0
 */
@Data
@Builder
public class AccessToken implements Serializable {

    private static final long serialVersionUID = 6038499458891708844L;

    /**
     * accessToken
     */
    private String accessToken;

    /**
     * 有效时间(s)
     */
    private Integer expire;

    /**
     * 过期时刻(ms)
     */
    private Long expiredAt;
}
