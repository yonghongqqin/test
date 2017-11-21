package com.hengdu.core.common.utils;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by Yonghong on NOV 2,2017.
 */
@Component
public class DateTimeUtils implements Serializable {

	private static final long serialVersionUID = 7340995993959152196L;

	public Date now() {
		return Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
	}
}
