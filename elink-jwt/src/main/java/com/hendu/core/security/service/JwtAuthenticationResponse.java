package com.hendu.core.security.service;

import java.io.Serializable;

/**
 * Created by Yonghong on NOV 2,2017.
 */
public class JwtAuthenticationResponse implements Serializable {

	private static final long serialVersionUID = 6349592589115718273L;
	private final String token;

	public JwtAuthenticationResponse(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}
}
