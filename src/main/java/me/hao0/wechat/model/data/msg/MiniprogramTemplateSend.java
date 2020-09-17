package me.hao0.wechat.model.data.msg;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Builder;
import lombok.Data;

/**
 * @author Administrator
 * @Classname MiniprogramTemplateSend
 * @Description TODO
 * @Date 2020-09-17 19:35
 * @Version V1.0
 */
@Data
@Builder
public class MiniprogramTemplateSend {
    private String touser;
    @JSONField(
            name = "template_id"
    )
    private String templateId;
    private String page;
    @JSONField(
            name = "form_id"
    )
    private String formId;
    private JSONObject data;
    @JSONField(
            name = "emphasis_keyword"
    )
    private String emphasisKeyword;
}
