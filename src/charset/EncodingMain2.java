package charset;

import java.nio.charset.Charset;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.*;

public class EncodingMain2 {

    private static final Charset EUC_KR = Charset.forName("EUC-KR");
    private static final Charset MS_949 = Charset.forName("MS949");

    public static void main(String[] args) {

        System.out.println("== 영문 ASCII 인코딩 ==");
        encodingAndDecodeing("A", US_ASCII, US_ASCII);  // ASCII 호환
        encodingAndDecodeing("A", US_ASCII, ISO_8859_1);// ASCII 호환
        encodingAndDecodeing("A", US_ASCII, EUC_KR);    // ASCII 호환
        encodingAndDecodeing("A", US_ASCII, MS_949);    // ASCII 호환
        encodingAndDecodeing("A", US_ASCII, UTF_8);     // ASCII 호환
        encodingAndDecodeing("A", US_ASCII, UTF_16BE);  // ASCII 비호환


        System.out.println("== 한글 ASCII 인코딩 ==");
        encodingAndDecodeing("가", US_ASCII, US_ASCII);
        encodingAndDecodeing("가", ISO_8859_1, ISO_8859_1);
        encodingAndDecodeing("가", EUC_KR, EUC_KR);
        encodingAndDecodeing("가", MS_949, MS_949);
        encodingAndDecodeing("가", UTF_8, UTF_8);
        encodingAndDecodeing("가", UTF_16BE, UTF_16BE);

        System.out.println("== 한글 인코딩 - 복잡한 문자 ==");
        encodingAndDecodeing("뷁", EUC_KR, EUC_KR);
        encodingAndDecodeing("뷁", MS_949, MS_949);
        encodingAndDecodeing("뷁", UTF_8, UTF_8);
        encodingAndDecodeing("뷁", UTF_16BE, UTF_16BE);

        System.out.println("== 한글 인코딩 - 디코딩이 다른 경우 ==");
        encodingAndDecodeing("뷁", EUC_KR, MS_949);
        encodingAndDecodeing("뷁", MS_949, EUC_KR);
        encodingAndDecodeing("뷁", EUC_KR, UTF_8);
        encodingAndDecodeing("뷁", MS_949, UTF_8);

        System.out.println("== 영문 인코딩 - 디코딩이 다른 경우 ==");
        encodingAndDecodeing("A", EUC_KR, UTF_8);
        encodingAndDecodeing("A", MS_949, UTF_8);
        encodingAndDecodeing("A", UTF_8, MS_949);
        encodingAndDecodeing("A", UTF_8, UTF_16BE);
    }

    private static void encodingAndDecodeing(String text, Charset encodingCharset, Charset decodingCharset) {
        byte[] encoded = text.getBytes(encodingCharset);
        String decoded = new String(encoded, decodingCharset);

        System.out.printf("%s -> [%s] 인코딩 -> %s %sbyte -> [%s] 디코딩 -> %s\n",
                text, encodingCharset, Arrays.toString(encoded), decoded.length(), decodingCharset, decoded);
    }
}
