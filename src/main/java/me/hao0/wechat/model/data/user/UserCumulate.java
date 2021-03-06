package me.hao0.wechat.model.data.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户累计数据
 * Author: haolin
 * Email: haolin.h0@gmail.com
 * Date: 20/11/15
 */
@Data
@Builder
public class UserCumulate implements Serializable {

    private static final long serialVersionUID = -1481652103074271866L;

    /**
     * 日期: yyyy-MM-dd
     */
    @JsonProperty("ref_date")
    private String date;

    /**
     * 总用户量
     */
    @JsonProperty("cumulate_user")
    private Integer cumulateCount;
}
