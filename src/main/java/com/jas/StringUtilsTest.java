package com.jas;

import org.apache.commons.lang.StringUtils;
import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/17.
 */
public class StringUtilsTest {

    @Test
    public void isEmpty() {
        assert StringUtils.isEmpty(null);
        assert StringUtils.isBlank("");
    }

    @Test
    public void trim(){
        assert  "foo".equals(StringUtils.trim(" foo "));
    }
}
