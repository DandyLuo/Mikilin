package com.simonalong.mikilin.value;

import com.simonalong.mikilin.annotation.FieldBlackMatcher;
import com.simonalong.mikilin.annotation.FieldWhiteMatcher;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhouzhenyong
 * @since 2018/12/26 下午10:58
 */
@Data
@Accessors(chain = true)
public class AEntity {
    @FieldWhiteMatcher({"a", "b", "c", "null"})
    private String name;
    @FieldBlackMatcher({"null"})
    private Integer age;
    private String address;
}