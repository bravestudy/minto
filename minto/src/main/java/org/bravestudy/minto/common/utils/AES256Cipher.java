package org.bravestudy.minto.common.utils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
/**
 * TODO : libray 패치 필요
 * @author choedaeyeol
 *
 */
@Repository
public class AES256Cipher {
	private static final String password = "zwkamdacqhrgksrd";
	private static String salt = "8R488E8SE654321A";
	private static int pswdIterations = 65536;
	private static int keySize = 256; //256bit encrypt key size
	private static String IV = "1afdewdaghkdlxld";
	
	private Log LOGGER = LogFactory.getLog(this.getClass());
	
	public String encrypt(String plainText) throws UnsupportedEncodingException, 
													NoSuchAlgorithmException, 
													InvalidKeySpecException, 
													NoSuchPaddingException, 
													InvalidKeyException, 
													InvalidAlgorithmParameterException, 
													IllegalBlockSizeException, 
													BadPaddingException  {
		byte[] saltBytes = salt.getBytes("UTF-8");

		SecretKeyFactory factory = SecretKeyFactory
				.getInstance("PBKDF2WithHmacSHA1");
		PBEKeySpec spec = new PBEKeySpec(password.toCharArray(), saltBytes,
				pswdIterations, keySize);

		SecretKey secretKey = factory.generateSecret(spec);
		SecretKeySpec secret = new SecretKeySpec(secretKey.getEncoded(), "AES");

		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, secret, new IvParameterSpec(IV.getBytes("UTF-8")) );
		byte[] encryptedTextBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
		return new Base64().encodeAsString(encryptedTextBytes);
	}

	@SuppressWarnings("static-access")
	public String decrypt(String encryptedText) throws UnsupportedEncodingException, 
														NoSuchAlgorithmException, 
														InvalidKeySpecException, 
														NoSuchPaddingException, 
														InvalidKeyException, 
														InvalidAlgorithmParameterException, 
														IllegalBlockSizeException, 
														BadPaddingException {

		byte[] saltBytes = salt.getBytes("UTF-8");
		byte[] encryptedTextBytes = new Base64().decodeBase64(encryptedText);

		SecretKeyFactory factory = SecretKeyFactory
				.getInstance("PBKDF2WithHmacSHA1");
		PBEKeySpec spec = new PBEKeySpec(password.toCharArray(), saltBytes,
				pswdIterations, keySize);

		SecretKey secretKey = factory.generateSecret(spec);
		SecretKeySpec secret = new SecretKeySpec(secretKey.getEncoded(), "AES");

		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(IV.getBytes("UTF-8")));

		byte[] decryptedTextBytes = null;
		try {
			decryptedTextBytes = cipher.doFinal(encryptedTextBytes);
		} catch (IllegalBlockSizeException e) {
			LOGGER.error(ExceptionUtils.getFullStackTrace(e));
		} catch (BadPaddingException e) {
			LOGGER.error(ExceptionUtils.getFullStackTrace(e));
		}

		return new String(decryptedTextBytes);
	}
}
