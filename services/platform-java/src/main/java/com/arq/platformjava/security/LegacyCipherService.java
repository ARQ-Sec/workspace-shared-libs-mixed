package com.arq.platformjava.security;
import javax.crypto.Cipher;
public class LegacyCipherService { public Cipher cipher() throws Exception { return Cipher.getInstance("AES/ECB/PKCS5Padding"); } }
