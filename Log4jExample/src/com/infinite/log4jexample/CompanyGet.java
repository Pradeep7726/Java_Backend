package com.infinite.log4jexample;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.spec.SecretKeySpec;

import org.apache.log4j.Logger;

public class CompanyGet {
	private static SecretKeySpec secretKey;
	private static byte[] key;
	private static final Logger logger=Logger.getLogger(CompanyGet.class);

	public static void setKey(final String myKey) {
		MessageDigest sha = null;
		try {
			key = myKey.getBytes("UTF-8");
			sha = MessageDigest.getInstance("SHA-1");
			key = sha.digest(key);
			key = Arrays.copyOf(key, 16);
			secretKey = new SecretKeySpec(key, "AES");
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
