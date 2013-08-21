package com.generalseguros.comun;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SSOStringUtils {
	
	public static final Integer MD5_SEED = new Integer(1);
	public static final String SEARCH_BY_ALL = "%";
	public static final Integer DEFAULT_LENGTH = ( 8 * 5 ); // genera 8 caracteres
	
	/**
	 * Modifica la cadena <bold> str </bold> modificada usando CommonDB.MD5_SEED 
	 * en formato MD5.
	 * @param str
	 * @return Si no se soporta la codificacion UTF-8 o no se encuentra el algoritmo MD5 regresa la misma cadena.
	 * Sino regresa la cadena modificada con el algoritmo.
	 */
	public static String getMD5String(String str) {
		
		String initialStr = str;

		byte[] bytesOfString = null;
		try {
			str = str + MD5_SEED;
			bytesOfString = str.getBytes("UTF-8");

			MessageDigest messageDigest = null;
			try {
				messageDigest = MessageDigest.getInstance("MD5");
				byte[] digest = messageDigest.digest(bytesOfString);
				StringBuffer hexString = new StringBuffer();

				for (int i = 0; i < digest.length; ++i) {
					String hex = Integer.toHexString(0xFF & digest[i]);
					if (hex.length() == 1) {
						hexString.append('0');
					}
					hexString.append(hex);
				}

				return hexString.toString();

			} catch (NoSuchAlgorithmException e) {

				e.printStackTrace();
			}

		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}

		return initialStr;

	}
	
	public static String getRandomString(int lenght){
		SecureRandom random = new SecureRandom();
		String str = new BigInteger(lenght,random).toString(32);
		return str;
	}
	
	public static String getRandomString(){
		return getRandomString(DEFAULT_LENGTH);
	}

}
