package com.simonalong.mikilin.condition;

import com.simonalong.mikilin.annotation.Matcher;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhouzhenyong
 * @since 2019/4/14 下午4:12
 */
@Data
@Accessors(chain = true)
public class ConditionEntity3 {

    @Matcher(condition = "min(#current, #root.num2) > #root.num3")
    private Integer num1;
    private Integer num2;
    private Integer num3;
}
