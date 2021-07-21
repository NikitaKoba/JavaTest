package test;


import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;




public class modifire {
    public String getSignature(String key, String request) throws Exception {//Объявляем get Signature(Со стринговыми значениями key,requst)
        byte[] secretKey = key.getBytes("UTF8"); //Объявление secretKey = получаение байтов для key.
        String algorithm = "HmacSHA1"; //Объявляем алгоритм шифровки в стринг и передаем в getInstance
        Mac mac = Mac.getInstance(algorithm);//Получаем из String algorithm значение "HmacSHA1"
        mac.init(new SecretKeySpec(secretKey, algorithm)); //Инициализируем Mac передавая изначальный секретный ключ
        byte[] hash = mac.doFinal(request.getBytes(StandardCharsets.UTF_8));//Кодируем реквест в ютф8,Метод doFinal () класса Mac используется для завершения операции Mac
        return Base64.getEncoder().encodeToString(hash);//переводим в base64 в строку hash.

    }
}
class call {
    public static void main(String[] args) throws Exception {
        modifire mynewGenerate = new modifire(); //Объект класса
        System.out.println(mynewGenerate.getSignature("HN0ANDN7Mctg2G16","/api/v3/clients/2721196031/auth{\"dateTime\":\"2021-07-20T08:06:50\",\"dboType\":\"OMP\",\"dboClientId\":\"965\",\"login\":\"#2721196031\",\"device\":{\"uid\":\"ee01bcb5688f443c\",\"name\":\"SM-A105F\",\"system\":\"29\",\"type\":\"ANDROID\",\"vendor\":\"samsung\",\"ip\":\"87.238.235.149\",\"isNewDevice\":false},\"appVersion\":\"5.19.0\",\"authorizationType\":\"PASSWORD_LOGINASS\",\"remoteSoftwareTypes\":[],\"deviceHackFlg\":false}"));

    }
}

