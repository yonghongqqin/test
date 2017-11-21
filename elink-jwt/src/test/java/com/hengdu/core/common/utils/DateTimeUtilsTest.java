package com.hengdu.core.common.utils;

import org.junit.Test;

import com.hengdu.core.common.utils.DateTimeUtils;

import java.util.Date;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by Yonghong on NOV 2,2017.
 */
public class DateTimeUtilsTest {
	@Test
	public void now() throws Exception {
		assertThat(new DateTimeUtils().now()).isCloseTo(new Date(), 1000);
	}

}