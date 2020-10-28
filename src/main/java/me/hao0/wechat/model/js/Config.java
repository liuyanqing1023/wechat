package me.hao0.wechat.model.js;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 调用JSSDK前需要加载的配置对象(http://mp.weixin.qq.com/wiki/7/aaa137b55fb2e0456bf8dd9148dd613f.html)
 * Author: haolin
 * Email: haolin.h0@gmail.com
 * Date: 15/11/15
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Config implements Serializable {

    private static final long serialVersionUID = -8263857663686622616L;

    /**
     * 微信APP ID
     */
    private String appId;

    /**
     * 时间戳(秒)
     */
    private Long timestamp;

    /**
     * 随机字符串
     */
    private String nonStr;

    /**
     * 签名
     */
    private String signature;
}
