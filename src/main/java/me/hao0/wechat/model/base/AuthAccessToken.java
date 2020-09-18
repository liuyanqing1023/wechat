package me.hao0.wechat.model.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户同意授权后，通过code获取的访问Token
 * Author: haolin
 * Email: haolin.h0@gmail.com
 * @since 1.9.1
 * <p>
 *     <a href="http://mp.weixin.qq.com/wiki/17/c0f37d5704f0b64713d5d2c37b468d75.html" target="_blank">参考链接</a>
 * </p>
 */
@Data
@Builder
public class AuthAccessToken implements Serializable {

    private static final long serialVersionUID = 7082882275191271333L;

    /**
     * accessToken
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * 用户刷新access_token
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    /**
     * 用户唯一标识，请注意，在未关注公众号时，用户访问公众号的网页，也会产生一个用户和公众号唯一的OpenID
     */
    @JsonProperty("openid")
    private String openId;

    /**
     * 用户授权的作用域，使用逗号（,）分隔
     */
    private String scope;

    /**
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
     * <p>
     *     <a href="https://open.weixin.qq.com/cgi-bin/frame?t=resource/res_main_tmpl&lang=zh_CN&target=res/app_wx_login" target="_blank">详见</a>
     * </p>
     */
    @JsonProperty("unionid")
    private String unionId;

    /**
     * 有效时间(s)
     */
    @JsonProperty("expires_in")
    private Integer expire;

    /**
     * 过期时刻(ms)
     */
    private Long expiredAt;
}
