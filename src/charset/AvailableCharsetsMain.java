package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.SortedMap;

public class AvailableCharsetsMain {

    public static void main(String[] args) {
        // 이용가능한 모든 Charset 자바 + OS
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        for (Charset charset : charsets.values()) {
            System.out.println(charset.name());
        }

        System.out.println("=====");
        // 문자 조회(대소문자 구분 x)
        Charset ms949 = Charset.forName("MS949");
        System.out.println("MS949 :" + ms949.name());

        Set<String> ms949Aliases = ms949.aliases();
        for (String alias : ms949Aliases) {
            System.out.println(alias);
        }

        System.out.println("=====");
        // UTF-8 문자로 조회
        Charset utf8 = Charset.forName("utf-8");
        System.out.println("utf8 :" + utf8.name());

        Set<String> utf8Aliases = utf8.aliases();
        for (String alias : utf8Aliases) {
            System.out.println(alias);
        }

        // UTF-8 상수로 조회
        Charset utf8_ = StandardCharsets.UTF_8;
        System.out.println("utf8 :" + utf8_.name());

        System.out.println("=====");

        // 시스템의 기본  Charset 조회
        Charset osCharset = Charset.defaultCharset();
        System.out.println("osCharset :" + osCharset.name());
    }
}
