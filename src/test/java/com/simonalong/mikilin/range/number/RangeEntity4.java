package com.simonalong.mikilin.range.number;

import com.simonalong.mikilin.annotation.Matcher;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhouzhenyong
 * @since 2019/4/14 下午12:12
 */
@Data
@Accessors(chain = true)
public class RangeEntity4 {

    /**
     * 属性为大于等于100
     */
    @Matcher(range = "(100, null)")
    private Integer num1;

    @Matcher(range = "[100, null)")
    private Integer num2;

    @Matcher(range = "(null, 50)")
    private Integer num3;

    @Matcher(range = "(null, 50]")
    private Integer num4;
}
