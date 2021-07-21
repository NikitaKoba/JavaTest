package test;


import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;




public class modifire {
    public String getSignature(String key, String request) throws Exception {
        byte[] secretKey = key.getBytes("UTF8");
        String algorithm = "HmacSHA1";
        Mac mac = Mac.getInstance(algorithm);
        mac.init(new SecretKeySpec(secretKey, algorithm));
        byte[] hash = mac.doFinal(request.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hash);

    }
}
class call {
    public static void main(String[] args) throws Exception {
        modifire mynewGenerate = new modifire();
        System.out.println(mynewGenerate.getSignature("HN0ANDN7Mctg2G16","/api/v3/clients/2721196031/auth{\"dateTime\":\"2021-07-20T08:06:50\",\"dboType\":\"OMP\",\"dboClientId\":\"965\",\"login\":\"#2721196031\",\"device\":{\"uid\":\"ee01bcb5688f443c\",\"name\":\"SM-A105F\",\"system\":\"29\",\"type\":\"ANDROID\",\"vendor\":\"samsung\",\"ip\":\"87.238.235.149\",\"isNewDevice\":false},\"appVersion\":\"5.19.0\",\"authorizationType\":\"PASSWORD_LOGINASS\",\"remoteSoftwareTypes\":[],\"deviceHackFlg\":false}"));

    }
}

