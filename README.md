# 문자 인코딩
## 컴퓨터와 문자 인코딩
문자 'A', 'B'를 2진수로 변경하는 수학 공식 같은 것은 세상에 없다.
이런 문제를 해결하기 위해 초창기 컴퓨터 과학자들은 문자 집합을 만들고, 각 문자에 숫자를 연결시키는 방법을 생각해 냈다.
예를 들어 우리가 문자 'A'를 저장하면, 컴퓨터는 문자 집합을 통해 'A'의 숫자 값을 65를 찾는다.
그리고 65를 메모리에 저장한다. 메모리에 저장된 문자를 불러 올 때는 반대로 작동한다. 메모리에 저장된 숫자 값 65를 불러온다.
그리고 문자 집합을 통해 문자 'A'를 찾아서 화면에 출력한다.

* 문자 인코딩: 문자 집합을 통해 문자를 숫자로 변환하는 것
* 문자 디코딩: 문자 집합을 통해 숫자를 문자로 변환하는 것

### ASCII 문자 집합
각 컴퓨터 회사가 독자적인 문자 집합을 사용한다면, 서로 다른 컴퓨터 간에 문자가 올바르게 표시되지 않는 문제가 발생할 수 있다.
이러한 호환성 문제를 해결하기 위해 ASCII(American Standard Code for Information Interchange)라는 표준 문자 집합이 1960년도에 개발되었다.
초기 컴퓨터에서는 주로 영문 알파벳, 숫자, 키보드의 특수문자, 스페이스, 엔터와 같은 기본적인 문자만 표현하면 충분했다.
따라서 7비트를 사용하여 총 128가지 문자를 표현할 수 있는 ASCII 공식 문자 집합이 만들어 졌다.

###  ISO_8859_1
서유럽을 중심으로 컴퓨터 사용 인구가 늘어나면서, 서유럽 문자를 표현하는 문자 집합이 필요해졌다.

ISO_8859_1
* 1980년도
* 기존 ASCII에 서유럽 문자의 추가 필요
* 국제 표준화 기구에서 서유럽 문자를 추가한 새로운 문자 규격을 만듬
* `ISO_8859_1`, `LATIN1`, `ISO-LATIN-1` 등으로 불림
  * 8bit(1byte) 문자 집합 -> 총 256가지 표현 가능
  * 기존 7비트 ASCII(0-127)를 그대로 유지
  * ASCII에 128가지 문자를 추가함
* 기존 ASCII 문자 집합과 호환 가능

### 한글 문자 집합
한국에서도 컴퓨터 사용 인구가 늘어나면서, 한글을 표현할 수 있는 문자 집합이 필요 해졌다.

EUC-KR
* 1980년도
* 초창기 등장한 한글 문자 집합(더 이전에 KS5601이 있었음)
* 모든 한글을 담는 것 보다는 자주 사용하는 한글 2350개만 포함해서 만들었다.
* 한글의 글자는 아주 많기 때문에 256가지만 표현할 수 있는 1byte로 표현하는 것은 불가능하다.
* 2byte(16bit)를 사용하면 65536가지 표현 가능
* ASCII + 자주 사용하는 한글 2350개 + 한국에서 자주 사용하는 기타 글자
  * 한국에서 자주 사용하는 한자 4,888개
  * 일본 가타카나등도 함께 포함
* ASCII는 1byte, 한글은 2byte를 사용한다.
  * 영어를 사용하면 1byte를 한글을 사용하면 2byte를 메모리에 저장한다.
* 기존 ASCII 문자 집합과 호환 가능

MS949
* 1990년도
* 마이크로소프트가 EUC-KR을 확장하여 만든 인코딩
* 한글 초성, 중성, 종성 모두 조합하면 가능한 한글의 수는 총 11,1172자
* EUC-KR은 드물게 사용하는 음절을 표현하지 못함
* 기존 EUC-KR과 호환을 이루면서 한굴 11,172자를 모두 수용하도록 만든 것이 MS949
* EUC-KR과 마찬가지로 ASCII는 1byte, 한글은 2byte를 사용함
* 기존 ASCII 문자 집합과 호환 가능
* 윈도우 시스템에서 계속 사용됨

### 전세계 문자 집합
전세계적으로 컴퓨터 인구가 늘어나면서, 전세계 문자를 대부분 다 표현할 수 있는 문자 집합이 필요해졌다.

문제
* EUC-KR이나 MS949 같은 한글 문자표를 PC에 설치하지 않으면 다른 나라 사람들은 한글로 작성된 문서를 열어볼 수 없다.
* 1980년대 말, 다양한 문자 인코딩 표준이 존재했지만, 이들은 모두 특정 언어 또는 문자 세트를 대상으로 했기 때문에 국제적으로 호환성 문제가 많았다.

유니코드의 등장
* 이를 해결하기 위해 전 세계의 모든 문자들을 단일 문자 세트로 표현할 수 있는 유니코드(Unicode) 표준이 1990년대에 도입되었다.
* 전 세계의 모든 문자와 기호를 하나의 표준으로 통합하여 표현할 수 있는 문자 집합을 만드는 것
* UTF-16, UTF-8의 시작
* 두 표준이 비슷하게 등장, 초반에는 UTF-16이 인기

UTF-16
* 1990년도
* 16bit(2byte)기반
* 자주 사용하는 기본 다국어들은 2byte로 표현, 2byte는 65536가지를 표현할 수 있다.
  * 영어, 유럽 언어, 한국어, 중국어, 일본어등이 2byte를 사용한다.
* 그 외 4byte로 표현 4byte는 42억가지를 표현할 수 있다.
  * 고대 문자, 이모지, 중국어 확장 한자 등
* 단점: ASCII 영문도 2byte를 사용한다. ASCII와 호환되지 않음
  * UTF-16을 사용한다면 영문의 경우 다른 문자 집합 보다 2배의 메모리를 더 사용한다.
  * 웹에 있는 문서의 80% 이상은 영문 문서이다.
  * ASCII와 호환되지 않는다는 점도 큰 단점 중 하나이다.
* 초반에는 UTF-16이 인기, 이 시기에 등장한 자바 언어도 내부적으로 문자를 표현할 때 UTF-16을 사용함, 그래서 자바의 `char`타입이 2byte를 사용함
* 대부분 문자를 2byte로 처리하기 때문에 계산이 편리함

UTF-8
* 1990년도
* 8bit(1byte)기반, 가변길이 인코딩
* 1byte ~ 4byte를 사용해서 문자를 인코딩
  * 1byte: ASCII, 영문, 기본 라틴 문자
  * 2byte: 그리스어, 히브리어, 라틴 확장 문자
  * 3byte: 한글, 한자, 일본어
  * 4byte: 이모지, 고대문자 등
* 단점: 
  * 상대적으로 사용이 복잡함
    * UTF-16은 대부분의 기본 문자들이 2byte로 표현되기 때문에, 문자열의 특정 문자에 접근하거나 문자 수를 세는 작업이 상대적으로 간담함. 반면, UTF-8에서는 각 문자가 가변 길이로 인코딩되므로 이런 작업이 더 복잡함
  * ASCII를 제외한 일부 언어에서 더 많은 용량 사용
    * UTF-8은 ASCII를 1byte로 비 ASCII 문자를 2~4byte로 인코딩 한다.
    * 한글, 한자, 아랍어, 히브리어와 같은 문자들은 UTF-8에서 3~4byte를 차지한다.
* 장점:
  * ASCII 문자는 1byte로 표현 == ASCII 문자 호환
  * 현대의 사실상 표준 인코딩 기술

---
# I/O 기본1
## 스트림
현대의 컴퓨터는 대부분 byte 단위로 데이터를 주고 받는다.
참고로 bit 단위는 너무 작기 때문에 byte 단위를 기본으로 사용한다.
이렇게 데이터를 주고 받는 것을 Input/Output(I/O)라 한다.
자바는 내부에 있는 데이터를 외부에 있는 파일에 저장하거나, 네트워크를 통해 전송하거나, 콘솔에 출력때 모두 byte 단위로 데이터를 주고 받는다.
만약 파일, 네트워크, 콘솔 각각 데이터를 주고 받는 방식이 다르다면 상당히 불편할 것이다.
또한 파일에 저장하던 내용을 네트워크에 전달하거나 콘솔에 출력하도록 변경할 때 너무 많은 코드를 변경해야 할 수 있다.
이런 문제를 해결하기 위해 자바는 `InputStream`, `OutputStream`이라는 기본 추상 클래스를 제공한다.

```mermaid
classDiagram
InputStream <|-- FileInputStream
InputStream <|-- ByteArrayInputStream
InputStream <|-- SocketInputStream

class InputStream {
  read()
  read(byte[])
  readAllBytes()
}

class FileInputStream {
  read()
  read(byte[])
  readAllBytes()
}

class ByteArrayInputStream {
  read()
  read(byte[])
  readAllBytes()
}

class SocketInputStream {
  read()
  read(byte[])
  readAllBytes()
}

```

```mermaid
classDiagram
OutputStream <|-- FileOutputStream
OutputStream <|-- ByteArrayOutputStream
OutputStream <|-- SocketOutputStream

class OutputStream {
  write(int)
  write(byte[])
}

class FileOutputStream {
  write(int)
  write(byte[])
}

class ByteArrayOutputStream {
  write(int)
  write(byte[])
}

class SocketOutputStream {
  write(int)
  write(byte[])
}

```
>정리

`InputStream`과 `OutputStream`이 다양한 스트림들을 추상화하고 기본 기능에 대한 표준을 잡아둔 덕분에 
개발자는 편리하게 입출력 작업을 수행할 수 있다. 이러한 추상화의 장점은 다음과 같다.
* 일관성: 모든 종류의 입출력 작업에 대해 동일한 인터페이스(여기에서는 부모의 메서드)를 사용할 수 있어, 코드의 일관성이 유지된다.
* 유연성: 실제 데이터 소스나 목적지가 무엇인지 관계없이 동일한 방식으로 코드를 작성할 수 있다. 예를 들어, 파일, 네트워크, 메모리 등 다양한 소스에 대해 동일한 메서드를 사용할 수 있다.
* 확장성: 새로운 유형의 입출력 스트림을 쉽게 추가할 수 있다.
* 재사용성: 다양한 스트림 클래스들을 조합하여 복잡한 입출력 작업을 수행할 수 있다. 예를 들어 `BufferdInputStream`을 사용하여 성능을 향상시키거나, `DataInputStream`을 사용하여 기본 데이터 타입을 쉽게 읽을 수있다.
* 에러 처리: 표준화된 예외 처리 메커니즘을 통해 일관된 방식으로 오류를 처리할 수 있다.

## 파일 입출력과 성능 최적화
자바에서 1byte씩 write()나, read()를 호출할 때마다 운영 체제로 시스템 콜이 발생하고, 이 시스템 콜이 자체가 상당한 오버헤드를 유발한다.
운영 체제와 하드웨어가 어느 정도 최적화를 제공하더라도, 자주 발생하는 시스템 콜로 인한 성능 저하는 피할 수 없다.
결국 자바에서 read(), write() 호출 횟수를 줄여서 시스템 콜 횟수도 줄여야 한다.

많은 데이터를 한 번에 전달하면 성능을 최적화 할 수 있다. 이렇게 되면 시스템 콜도 줄어들고 HDD, SDD 같은 장치들의 작동 횟수도 줄어 든다.
그런데 버퍼의 크기가 커진다고 해서 속도가 계속 줄어들지 않는다. 왜냐하면 디스크나 파일 시스템에서 데이터를 읽고 쓰는 기본 단위가 보통 4KB, 8KB이기 때문이다.
결국 버퍼에 많은 데이터를 담아서 보내도 디스크나 파일 시스템에서 해당 단위로 나누어 저장하기 때문에 효율에는 한계가 있다.
따라서 버퍼의 크기는 보통 4KB, 8KB 정도로 잡는 것이 효율적이다.

### BufferedOutputStream
`BufferedOutputStream`은 버퍼 기능을 내부에서 대신 처리해준다. 따라서 단순한 코드를 유지하면서 버퍼를 사용하는 이점도 함께 누릴 수 있다.
* `BufferedOutputStream`은 내부에서 단순히 버퍼 기능만 제공한다. 따라서 반드시 대상 `OutputStream`이 있어야 한다.
* 추가로 사용할 버퍼의 크기도 함께 전달할 수 있다.
* `byte[]`을 직접 다루지 않고 단순하게 코드를 작성할 수 있다.

```mermaid
classDiagram

OutputStream <|-- FileOutputStream
OutputStream <|-- BufferedOutputStream
        
class OutputStream {
  write(int)
  write(byte[])
}

class FileOutputStream {
    
}
class BufferedOutputStream {
  OutputStream out
}
```
* `BufferedOutputStream`은 `OutputStream`을 상속받는다 따라서 개발자 입장에서 보면 `OutputStream`과 같은 기능을 그대로 사용할 수 있다.

### 기본 스트림, 보조 스트림
* `FileOutputStream`과 같이 단독으로 사용할 수 있는 스트림을 기본 스트림이라 한다.
* `BufferedOutputStream`과 같이 단독으로 사용할 수 없고, 보조 기능을 제공하는 스트림을 보조 스트림이라 한다.

### BufferedInputStream
```mermaid
classDiagram

InputStream <|-- FileInputStream
InputStream <|-- BufferedInputStream
        
class InputStream {
  read()
  read(byte[])
  readAllBytes()
}

class FileInputStream {
    
}
class BufferedInputStream {
  InputStream input
}
```
* `BufferedInputStream`은 `InputStream`을 상속 받는다. 따라서 개발자 입장에서 보면 `InputStream`과 같은 기능을 그대로 사용할 수 있다.

### 버퍼를 직접 다루는 것보다 BufferedXxx의 성능이 떨어지는 이유
이 이유는 바로 동기화 때문이다. 
* `BufferedOutputStream`을 포함한 `BufferedXxx` 클래스는 모두 동기화 처리가 되어 있다.
* 결과적으로 락을 걸고 푸는 코드도 호출된다는 뜻이다.

#### BufferedXxx 클래스의 특징
`BufferedXxx` 클래스는 자바 초창기에 만들어진 클래스인데, 처음부터 멀티 스레드를 고려해서 만든 클래스이다.
따라서 멀티 스레드에 안전하지만 락을 걸고 푸는 동기화 코드로 인해 성능이 약간 저하될 수 있다.
하지만 싱글 스레드 상황에서는 동기화 락이 필요하지 않기 때문에 직접 버퍼를 다룰 때와 비교해서 성능이 떨어진다.
일반적인 상황이라면 이 정도 성능은 크게 문제가 되지 않기 때문에 싱글 스레드여도 `BufferedXxx` 클래스를 사용하면 충분하다.
매우 큰 데이터를 다루어야 하고, 성능 최적화가 중요하다면 직접 버퍼를 다루는 방법을 고려하자.
아쉽게도 동기화 락이 없는 `BufferedXxx` 클래스는 없다. 꼭 필요한 상황이라면 `BufferedXxx` 클래스를 참고해
동기화 락 코드를 제거한 클래스를 직접 만들어 사용하면 된다.

#### 한 번에 쓰기
파일의 크기가 크지 않다면 간단하게 한 번에 쓰고 읽는 것도 좋은 방법이다.
이 방법은 성능은 가장 빠르지만, 결과적으로 메모리를 한 번에 많이 사용하기 때문에 파일의 크기가 작아야 한다.

> 정리

* 파일의 크기가 크지 않아서, 메모리 사용에 큰 영향을 주지 않는다면 쉽고 빠르게 한 번에 처리하자.
* 성능이 중요하고 큰 파일을 나누어 처리해야 한다면, 버퍼를 직접 다루자.
* 성능이 크게 중요하지 않고, 버퍼 기능이 필요하면 `BufferedXxx` 클래스를 사용하자.
  * `BufferedXxx`는 동기화 코드가 들어 있어서 thread safe하지만 약간의 성능 저하가 있다.

---
# 문자 다루기
스트림은 `byte`만 사용할 수 있으므로, `String`과 같은 문자는 직접 전달할 수 없다.
그래서 개발자가 번거롭게 다음과 같은 변환 과정을 직접 호출해주어야 한다.
* `String` + 문자 집합 => `byte[]`
* `byte[]` + 문자 집합 => `String`

`OutputStreamWriter`, `InputStreamReader`를 사용하면 이 과정을 쉽게 처리할 수 있다.
그런데 `OutputStreamWriter`의 `write()`는 `byte`가 아니라 `String`이나 `char`를 사용한다.
어떻게 된 것일까?

자바는 byte를 다루는 I/O 클래스와 문자를 다루는 I/O 클래스를 둘로 나누어 두었다.

* byte를 다루는 클래스
```mermaid
classDiagram

OutputStream <|-- FileOutputStream
OutputStream <|-- ByteArrayOutputStream
OutputStream <|-- BufferedOutputStream
InputStream <|-- FileInputStream
InputStream <|-- ByteArrayInputStream
InputStream <|-- BufferedInputStream
        
class OutputStream {
  write(int)
  write(byte[])
}

class FileOutputStream {
  
}
class ByteArrayOutputStream {
  
}

class BufferedOutputStream {
  
}

class InputStream {
  read()
  read(byte[])
  readAllBytes()
}

class FileInputStream {
 
}
class ByteArrayInputStream {
  
}

class BufferedInputStream {
  
}
```

* 문자를 다루는 클래스
```mermaid
classDiagram

Writer <|-- OutputStreamWriter
OutputStreamWriter <|-- FileWriter
Writer <|-- BufferedOutputWriter

Reader <|-- InputStreamReader
InputStreamReader <|-- FileReader
Reader <|-- BufferedReader

        
class Writer {
  write(String)
  write(char[])
}

class OutputStreamWriter {
  
}

class BufferedOutputWriter {
  
}

class FileWriter {
  
}

class Reader {
    read()
    read(char[])
}
class InputStreamReader {
  
}

class BufferedReader {
  
}

class FileReader {
    
}
```
여기서 꼭! 기억해야할 중요한 사실이 있다.
모든 데이터는 **byte 단위(숫자)로 저장된다.** 따라서 `Writer`가 아무리 문자룰 다룬다고 해도 문자를 바로 저장할 수는 없다.
이 클래스에 문자를 전달하면 결과적으로 내부에서는 지정된 문자 집합을 사용해서 문자를 byte로 인코딩해서 저장한다.

> 정리
* 기본(기반, 메인) 스트림
  * File, 메모리, 콘솔 등에 직접 접근하는 스트림
  * 단독으로 사용할 수 있음
  * 예) `FileInputStream`, `FileOutputStream`, `FileReader`, `FileWriter`, `ByteArrayInputStream`, `ByteArrayOutputStream`
* 보조 스트림
  * 기본 스트림을 도와주는 스트림
  * 단독으로 사용할 수 없음. 반드시 대상 스트림이 있어야 함
  * 예) `BufferedInputStream`, `BufferedOutputStream`, `InputStreamReader`, `OutputStreamWriter`, `DataOutputStream`, `DataInputStream`, `PrintStream`

---
# I/O 활용

## 객체 직렬화
자바 객체 직렬화(Serialization)는 메모리에 있는 객체 인스턴스를 바이트 스트림으로 변환하여 파일에 저장하거나 네트워크를 통해 전송할 수 있도록 하는 기능이다.
이 과정에서 객체의 상태를 유지하여 나중에 역직렬화(Deserialization)를 통해 원래의 객체로 복원할 수 있다.

객체 직렬화를 사용하려면 직렬화 하려는 클래스에 반드시 `Serializable` 인터페이스를 구현해야 한다.
```java
package java.io;

public interface Serializable {}
```
* 이 인터페이스에는 아무런 기능이 없다. 단지 직렬화 가능한 클래스라는 것을 표시하기 위한 인터페이스일 뿐이다.
* 메서드 없이 단지 표시가 목적인 인터페이스를 마커 인터페이스라 한다.
* 만약 해당 인터페이스가 없는 객체를 직렬화 하려면 다음과 같은 예외가 발생한다. `java.io.NotSerializableException: io.member.Member`

객체 직렬화 덕분애 객체를 매우 편리하게 저장하고 불러올 수 있었다.
객체 직렬화를 사용하면 객체를 바이트로 변환할 수 있어, 모든 종류의 스트림에 전달할 수 있다.
이는 파일에 저장하는 것은 물론, 네트워크를 통해 객체를 전송하는 것도 가능하게 한다.
이러한 특성 때문에 초기에는 분산 시스템에서 활용되었다.
그러나 객체 직렬화는 1990년대에 등장한 기술로, 초창기에는 인기가 있었지만 시간이 지나면서 여러 단점이 드러났다.
또한 대안 기술이 등장하면서 점점 그 사용이 줄어들게 되었다.
현재는 객체 직렬화를 거의 사용하지 않는다.

## 객체 직렬화의 한계
* 버전 관리의 어려움
  * 클래스 구조가 변경되면 이전에 직렬화된 객체와의 호환성 문제가 발생한다.
  * serialVersionUID 관리가 복잡하다.
* 플랫폼 종속성
  * 자바 직렬화는 자바 플랫폼에 종속적이여서 다른 언어나 시스템과의 상호 운용성이 떨어진다.
* 성능 이슈
  * 직렬화/역직렬화 과정이 상대적으로 느리고 리소스를 많이 사용한다.
* 크기 효율성
  * 직렬화 된 데이터의 크기가 상대적으로 크다.

## 객체 직렬화의 대안
* XML
  * 플랫폼 종속성 문제를 해결하기 위해 2000년대 초반 XML이라는 기술이 인기를 끌었다.
  * XML은 유연하고 강력했지만, 복잡성과 무거움이라는 문제가 있었다.
  * 태그를 포함한 XML 문서의 크기가 커서 네트워크 전송 비용도 증가했다.
* JSON
  * 가볍고 간결하며, 자바스크립트와 자연수러운 호환성 덕분에 웹 개발자들 사이에서 빠르게 확산되었다.
  * 2000년대 후반, 웹 API와 RESTful 서비스가 대중화 되면서 JSON은 표준 데이터 교환 포맷으로 자리잡았다.
* Protofuf, Avro - 더 적응 용량, 더 빠른 성능
  * 만약 매우 작은 용량으로 더 빠른 속도가 필요하다면 Protobuf, Avro 같은 대안 기술이 있다.
  * 이런 기술은 호환성은 떨어지지만 byte 기반에, 용량과 성능 최적화가 되어있으므로 매우 빠르다.
  * 다만 byte 기반이므로 JSON처럼 사람이 직접 읽기는 어렵다.

---
# File, Files
자바 1.0에서 `File` 클래스가 등장했다. 이후에 자바 1,7에서 `Files` 클래스를 대체할 `Files`와 `Path`가 등장했다.

## Files의 특징
* 성능과 편의성이 모두 개선되었다.
* `File`은 과거의 호환성을 유지하기 위해 남겨둔 기능이다. 이제는 `Files` 사용을 먼저 고려하자.
* `File` 클래스는 물론이고, `File`과 관련된 스트림(`FileInputStream`, `FileWriter`)의 사용을 고민하기 전에 `Files`에 있는 기능을 먼저 찾아보자 성능도 좋고, 사용하기도 더 편리하다.

## 파일 복사 최적화
```java
try (FileInputStream fis = new FileInputStream("temp/copy.dat"); 
     FileOutputStream fos = new FileOutputStream("temp/copy_new.dat")) {
    fos.write(fis.readAllBytes());
}
```
* `FileInputStream`에서 `readAllbytes`를 통해 한 번에 모든 데이터를 읽고 `write(bytes)`를 통해 한 번에 모든 데이터를 저장한다.
* 파일 -> 자바 -> 파일의 과정을 거친다.
* 자바가 `copy.dat`파일의 데이터를 자바 프로세스가 사용하는 메모리에 불러온다. 그리고 메모리에 있는 데이터를 `copy_new.dat`에 전달한다.

```java
Path source = Path.of("temp/copy.dat");
Path target = Path.of("temp/copy_new.dat");
Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
```
* `Files.copy()`는 자바에서 파일 데이터를 불러오지 않고, 운영체제의 파일 복사 기능을 사용한다.
* 파일을 다루어야 할 일이 있다면 항상 `Files`의 기능을 먼저 고려하자.
* 만약 파일의 정보를 읽어서 처리해야 하거나, 스트림을 통해 네트워크에 전달해야 한다면 스트림을 직접 사용해야 한다.

---
# 네트워크 - 기본 이론
## 클라이언트와 서버
클라이언트-서버 개념의 기본 이해
* 클라이언트: 클라이언트는 서비스를 요청하는 쪽이다.
* 서버: 클라이언트의 요청을 받아들이고, 그 요청에 맞게 서비스를 제공하는 쪽이다.

객체와 클라이언트-서버 관계
* Main 객체가 Service 객체의 메서드를 호출하면 Main 객체는 Service 객체에게 특정 작업을 요청한 것이다.
* Main은 클라이언트이고 Service는 서버가 된다.

네트워크와 클라이언트-서버
* 네트워크는 여러 대의 컴퓨터가 서로 연결되어 데이터를 주고 받을 수 있는 환경을 의미한다.
* 사용자가 PC나 스마트폰을 이용헤 웹사이트에 접속 할 때, 이런 장치가 클라이언트의 역할을 하고, 웹사이트를 운영하는 컴퓨터가 서버 역할을 한다.

---
# 네트워크 - 프로그램
자바의 `InetAddress`클래스를 사용하면 호스트 이름으로 대상 IP를 찾을 수 있다.
찾는 과정은 다음과 같다.
1. 자바는 `InetAddress.getByName("호스트명")`메서드를 사용해서 해당하는 IP주소를 조회합니다.
2. 이 과정에서 시스템의 호스트 파일을 먼저 확인합니다.
3. 호스트 파일에 정의되있지 않다면, DNS 서버에 요청ㅇ해서 IP 주소를 얻는다.

## 서버 소켓
서버는 특정 포트를 열어두어야 한다. 그래야 클라이언트가 해당 포트를 지정해서 접속할 수 있다.
* 서버는 서버 소켓(ServerSocket)이라는 특별한 소켓을 사용한다.
* 지정한 포트를 사용해서 서버 소켓을 생성하면, 클라이언트는 해당 포트로 서버에 연결할 수 있다.

예)
* 서버가 12345 포트로 서버 소켓을 열어둔다. 클라이언트는 12345 포트로 서버에 접속할 수 있다.
* 클라이언트가 12345 포트에 연결을 시도한다.
* 이때 OS 계층에서 TCP 3way handshake가 발생하고 TCP 연결이 완료된다.
* TCP 연결이 완료되면 서버는 OS backlog queue라는 곳에 클라이언트와 서버의 TCP 연결 정보를 보관한다.
  * 이 연결 정보를 보면 클라이언트의 IP, PORT, 서버의 IP, PORT 정보가 모두 들어있다.

## 클라이언트와 랜덤 포트
TCP 연결시에는 클라이언트 서버 모두 IP, 포트 정보가 필요하다. 
그런데 생각해보면 클라이언트는 자신의 포트를 지정한 적이 없다.
서버의 경우 포트가 명확하게 지정되어야 한다. 그래야 클라이언트에서 서버에 어떤 포트로 접속할지 알 수 있다.
반면 서버에 접속하는 클라이언트의 경우에는 자신의 포트가 명확하게 지정되어있지 않아도 된다.
클라이언트는 보통 포트를 생략하는데, 생략할 경우 클라이언트 PC에 남아있는 포트 중 하나가 랜덤으로 할당된다.

## `accept()`
```java
Socket socket = serverSocket.accept();
```
* 서버 소켓은 단지 클라이언트와 서버의 TCP 연결만 지원하는 특별한 소켓이다.
* 실제 클라이언트와 서버가 정보를 주고 받으려면 `Socket` 객체가 필요하다.(서버 소켓이 아니다.)
* `serverSocket.accept()`메서드를 호출하면 TCP 연결 정보를 기반으로, `Socket` 객체를 만들어서 반환한다.
* `accept()`를 호출하면 backlog queue에서 TCP 연결 정보를 조회한다.
  * 만약 TCP 연결 정보가 없다면, 연결 정보가 생성될 때까지 대기한다.(블로킹)
* 해당 정보를 기반으로 `Socket` 객체를 생성한다.
* 사용한 TCP 연결 정보는 backlog queue에서 제거된다.

## Socket 생성후
* 클라이언트와 서버의 `Socket`은 TCP로 연결되어 있고, 스트림을 통해 메세지를 주고 받을 수 있다.
```java
DataInputStream input = new DataInputStream(socket.getInputStream());
DataOutputStream output = new DataOutputStream(socket.getOutputStream());
```
* `Socket`은 클라이언트와 서버가 데이터를 주고 받기 위한 스트림을 제공한다.
* `InputStream`: 서버 입장에서 보면 클라이언트가 전달한 데이터를 서버가 받을 때 사용한다.
* `OutputStream`: 서버에서 클라이언트에 데이터를 전달할 때 사용한다.

클라이언트의 Output은 서버의 Input이고 반대로 서버의 Output은 클라이언트의 Input이다.
자신을 기준으로 생각하면 된다.

---
## 자원 정리
### `try-catch-finally`
아래와 같은 문제점이 있다.
* `close()` 시점에 실수로 예외를 던지면, 이후 다른 자원을 닫을 수없는 문제
* `finally` 블럭 안에서 자원을 닫을 때 예외가 발생하면, 핵심 예외가 `finally`에서 발생한 부가 예외로 바뀌어 버린다. 그리고 핵심 예외가 사라진다.
* `resource`변수를 선언하면서 동시에 할당할 수 없음(`try`, `finally` 코드 블록과 변수 스코프가 다른 문제)
* `catch` 이후에 `finally` 호출, 자원 정리가 조금 늦어진다.
* 개발자가 실수로 `close()`를 호출하지 않을 가능성
* 개발자가 `close()` 호출 순서를 실수(보통 자원 생성 순서의 반대로 닫아야한다.)

### `try-catch-finally`
`try-with-resource`는 단순하게 `close()`를 자동 호출하는 정도의 기능만 제공하는 것이 아니다.
* 리소스 누수 방지: 모든 리소스가 제대로 닫히도록 보장한다. 실수로 `finally` 블록을 적지 않건, `finally` 블럭 안에서 자원 해제 코드를 누락하는 문제들을 예방할 수 있다.
* 코드 간결성 및 가독성 향상: 명시적 `close()` 호출이 필요 없어 코드가 더 간결하고 읽기 쉬워진다.
* 스코프 범위 한정: 리소스로 사용되는 변수의 스코프가 `try` 블럭 안으로 한정된다.
* 조금 더 빠른 자원 해제: 기존에는 `try-catch-finally` 순서로 동작하며 `catch` 이후에 자원을 반납했다. `try-with-resource` 구문은 `try` 블럭이 끝나면 즉시 `close()`를 호출한다.
* 자원 정리 순서: 나중에 선언한 자원을 가장 먼저 정리한다.
* 부가 예외 포함: 핵심 예외에 `Suppressed`로 담아서 반환한다. 핵심 예외에서 `e.getSuppressed()`를 통해 활용할 수 있다.

### 셧다운 훅(Shutdown Hook)
자바는 프로세스가 종료될 때, 자원 정리나 로그 기록과 같은 종료 작업을 마무리 할 수 있는 셧다운 훅이라는 기능을 지원한다.
프로세스 종료는 크게 2가지로 분류할 수 있다.
* 정상 종료
  * 모든 non 데몬 스레드의 실행 완료로 자바 프로세스 정상 종료
  * 사용자가 Ctrl + C를 눌러서 프로그램을 중단
  * `kill` 명령어 전달 (`kill -9` 제외)
* 강제 종료
  * 운영체제에서 프로세스를 더 이상 유지할 수 없다고 판단할 때 사용
  * 리눅스/유닉스의 `kill -9`나 윈도우의 `taskkill /F`

정상 종료의 경우에는 셧다운 훅이 작동해서 프로세스 종료 전에 필요한 후 처리를 할 수 있다.
반면에 강제 종료의 경우에는 셧다운 훅이 작동하지 않는다.

---
## 네트워크 예외
1. 연결 예외
   * `java.net.UnknownHostException`
     * 호스트를 알 수 없음
     * IP, 도메인 이름이 존재 하지 않는다.
   * `java.net.ConnectException: Connection refused`
     * `Connection refused` 메세지는 연결이 거졀 되었다는 뜻이다.
     * 연결이 거절되었다는 것은, 우선은 네트워크를 통해 해당 IP의 서버에 접속은 했다는 뜻이다.
     * 해당 서버가 사용하지 않는 포트인 경우 TCP 연결을 거절한다.
     * 해당 서버가 기동중이지만 사용하는 PORT가 없을 경우 주로 발생한다.
     * 네트워크 방화벽 등에서 무단 연결로 인지하고 연결을 막을 때도 발생한다.
     * 서버의 OS는 이때 TCP RST(Rset)라는 패킷을 보내서 연결을 거절한다.
     * 클라이언트가 연결 시도중 RST 패킷을 받으면 이 예외가 발생한다.
2. 타임 아웃
   * connect timeout: 연결시도 후 일정 시간안에 연결이 안되는 경우 발생
   * read timeout: 서버가 일정 시간 안에 응답을 주지 않으면 발생
3. 정상 종료
   * 클라이언트와 서버가 연결이 되어 있다.
   * 서버가 연결 종료를 위해 `sokect.close()`를 호출한다.
     * 서버는 클라이언트에게 `FIN` 패킷을 전달한다.
   * 클라이언트는 `FIN` 패킷을 받는다.
     * 클라이언트 OS는 `FIN` 패킷에 대한 `ACK` 패킷을 서버에게 전달 한다.
   * 클라이언트도 종료를 위해 `soket.close()`를 호출한다.
     * 클라이언트는 서버에 `FIN` 패킷을 전달한다.
     * 서버 OS는 `FIN` 패킷에 대한 `ACK` 패킷을 클라이언테에게 전달 한다.
4. 강제 종료
   * 클라이언트와 서버가 연결되어 있다.
   * 서버가 연결 종료를 위해 `sokect.close()`를 호출한다.
     * 서버는 클라이언트에게 `FIN` 패킷을 전달한다.
   * 클라이언트는 `FIN` 패킷을 받는다.
     * 클라이언트 OS는 `FIN` 패킷에 대한 `ACK` 패킷을 서버에게 전달 한다.
   * 클라이언트는 `output.write(1)`를 통해 서버에 메세지를 전달한다.
     * 데이터를 전송하는 `PUSH` 패킷이 서버에 전달 된다.
   * 서버는 이미 `FIN`으로 종료 요청을 했는데 `PUSH`패킷으로 데이터가 전달 되었다.
   * 서버는 TCP 연결에 문제가 있다고 판단하고 즉각 연결을 종료하라는 `RST` 패킷을 클라이언트에게 전송한다.

`RST` 패킷이 도착했다는 것은 현재 TCP 연결에 심각한 문제가 있으므로 해당 연결을 더 이상 사용하면 안된다는 의미이다.

### 네트워크 종료와 예외 정리
네트워크에서 이런 예외를 다 따로 따로 이해하고 다루어야 할까?
사실 어떤 문제가 언제 발생할지 자세하게 다 구분해서 처리하기는 어렵다.
따라서 기본적으로 정상 종료, 강제 종료 모두 자원을 정리하고 닫도록 설계하면 된다.
예를 들어 `SocketException`, `EOFException`은 모두 `IOException`의 자식이다.
따라서 `IOException`이 발생하면 자원을 정리하면된다.
---
# HTTP 서버 만들기
## URL 인코딩
### URL이 ASCII를 사용하는 이유
HTTP 메세지에서 시작라인(URL을 포함)과 HTTP 헤더의 이름은 항상 ASCII를 사용해야 한다.
HTTP 메세지 바디는 UTF-8과 같은 다른 인코딩을 사용할 수 있다.
지금처럼 UTF-8이 표준화된 시대에 왜 URL은 ASCII만 사용할 수 있을까?

* 인터넷이 처음 인터넷이 설계되던 시기(1980~1990년대)에, 대부분의 컴퓨터 시스템은 ASCII 문자 집합을 사용했다.
* 전 세계에서 사용하는 다양한 컴퓨터 시스템과 네트워크 장비 간의 호환성을 보장하기 위해, URL은단일한 문자 인코딩 체계를 사용해야 했다. 그 당시 모든 시스템이 비-ASCII 문자를 처리할 수 없었기 때문에, ASCII는 가장 보편적이고 일관된 선택이었다.
* HTTP URL이 ASCII만을 지원하는 이유는 초기 인터넷의 기술적 제약과 전 세계적인 호환성을 유지하기 위한 선택이다.
* 순수한 UTF-8로 URL을 표현하려면, 전 세계 모든 네트워크 장비, 서버, 클라이언트 소프트웨어가 이를 지원해야 한다. 그러나 여전히 많은 시스템에서 ASCII 기반 표준에 의존하고 있기 때문에 순수한 UTF-8 URL을 사용하면 호환성 문제가 발생할 수 있다.
* HTTP 스펙은 매우 보수적이고 호환성을 가장 우선시 한다.

### 퍼센트(%) 인코딩
한글로 UTF-8 인코딩으로 표현하면 한 글자에 3byte의 데이터를 사용한다.
가, 나, 다를 UTF-8 인코딩의 16진수로 표현하면 다음과 같다.
참고: 2진수는 (0, 1), 10진수는 (0~9), 16진수(0~9, A, B, C, D, E, F)
* 가: EA, BO, 80 (3byte)
* 나: EB, 82, 98 (3byte)
* 다: EB, 8B, A4 (3byte)

URL은 ASCII 문자만 표현할 수 있으므로, UTF-8 문자를 표현할 수 없다.
그래서 한글 "가"를 예를 들면 "가"를 UTF-8 16진수로 표현한 각각의 바이트 문자 앞에 %를 붙이는 것이다.
* q=가
* q=%EA%B0%80

이렇게 하면 약간 억지스럽기는 하지만 ASCII 문자를 사용해서 16진수로 표현된 UTF-8을 표현할 수 있다.
`%EA%B0%80`는 모드 ASCII에 포함되는 문자이다.
이렇게 각각의 16진수 byte를 문자로 표현하고, 해당 문자 옆에 `%`를 붙이는 것을 퍼센트 인코딩이라 한다.

### 퍼센트 인코딩, 디코딩 진행 과정
1. 클라이언트가 "가" 전송 희망
2. 클라이언트 % 인코딩 :`%EA%B0%80`
   1. "가"를 UTF-8로 인코딩
   2. `EA`, `B0`, `80` 3byte 획득
   3. 각 byte를 16진수 문자로 표현하고 각각의 앞에 `%`를 붙임
3. 클라이언트 -> 서버 전송 `q=%EA%B0%80`
4. 서버: `%EA%B0%80` ASCII 문자를 전달 받음
   1. `%`가 붙은 경우 디코딩해야 하는 문자로 인식
   2. `EA`, `B0`, `80`을 byte로 변환, 3byte 획득
   3. `EA`, `B0`, `80`(3byte)를 UTF-8로 디코딩 -> 문자 "가" 획득

## 웹 애플리케이션 서버의 역사
실무 개발자가 목표라면, 웹 애플리케이션 서버(Web Application Server), 줄여서 WAS라는 단어를 많이 듣게 될 것이다.
Web Server가 아니라 중간에 Application이 들어가는 이유는, 웹 서버의 역할을 하면서 추가로 애플리케이션, 그러니까 프로그램 코드도 수행할 수있는 서버라는 뜻이다.
HTTP와 웹이 처음 등장하면서, 많은 회사에서 직접 HTTP 서버와 비슷한 기능을 개발하기 시작했다. 그런데 문제는 각각의 서버간에 호환성이 전혀 없는 것이다.
예를 들어 A회사의 HTTP 서버를 사용하다가 B회사의 HTTP 서버로 번경하려면 인터페이스가 다르기 때문에 코드를 너무많이 수정해야 했다.

## 서블릿과 웹 애플리케이션 서버
이런 문제를 해결하기위해 1990년대 자바 진영에서는 서블릿이라는 표준이 등장하게 된다.

```java
package jakarta.servlet;

import java.io.IOException;

public interface Servlet {
    void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException;
}
```
* 서블릿은 `Servlet`, `HttpServlet`, `ServletRequest`, `ServletResponse`를 포함한 많은 표준은 제공한다.
* HTTP 서버를 만드는 회사들은 모두 서블릿 기반으로 제공한다.

서블릿을 제공하는 주요 자바 웹 애플리케이션 서버(WAS)는 다음과 같다.
* 오픈소스
  * Apache Tomcat
  * Jetty
  * Glass Fish
  * Undertow
* 상용
  * IBM WebSphere
  * Oracle WebLogic
---
# 리플렉션
## 클래스와 메타데이터
클래스가 제공하는 다양한 정보를 동적으로 분석하고 사용하는 기능을 리플렉션(Reflection)이라 한다.
리플렉션을 통해 프로그램 실행 중에 클래스, 메서드, 필드 등에 대한 정보를 얻거나, 새로운 객체를 생성하고 메서드를 호출하며, 필드의 값을 읽고 쓸 수 있다.

리플렉션을 통해 얻을 수 있는 정보는 다음과 같다.
* 클래스의 메타데이터: 클래스의 이름, 부모 클래스, 구현된 인터페이스 등.
* 필드 정보: 필드의 이름, 접근 제어자를 확인하고, 해당 필드의 값을 읽거나 수정할 수 있다.
* 메서드 정보: 메서드 이름, 반환 타입, 매개변수 정보를 확인하고, 실행 중에 동적으로 메서드를 호출 할 수 있다.
* 생성 정보: 생성자의 매개변수 타입과 개수를 확인하고, 동적으로 객체를 생성할 수 있다.

## 필드 탐색과 값 변경
`fields()` vs `declaredFields()`
* `fields()`: 해당 클래스와 상위 클래스에서 상속된 모든 public 필드를 반환
* `declaredFields()`: 해당 클래스에서 선언된 모든 필드를 반환하며, 접근 제어자에 관계없이 반환, 상속된 필드는 포함하지 않음

```java
 User user = new User("id1", "userA", 20);
System.out.println("기존 이름 = " + user.getName());

Class<User> userClass = User.class;
Field nameField = userClass.getDeclaredField("name");

// private 필드에 접근 허용, private 메서드도 이렇게 호출 가능
nameField.setAccessible(true);
nameField.set(user, "userB");

System.out.println(user.getName());
```
리플렉션과 주의사항
리플렉션을 활용하면 `private` 접근 제어자도 직접 접근해서 값을 변경할 수 있다.
하지만 이는 객체 지향 프로그래밍의 원칙을 위반하는 행위로 간주될 수 있다.
`private`접근 제어자는 클래스 내부에서만 데이터를 보호하고, 외부에서의 직접적인 접근을 방지하기 위해 사용된다.
리플렉션을 통해 이러한 접근 제한을 무시하는 것은 캡슐화 및 유지보수성에 악영향을 미칠 수 있다.
예를 들어, 클래스의 내부 구조나 구현 세부 사항이 변경될 경우 리플렉션을 사용하는 코드는 쉽게 깨질 수 있으며, 이는 예상치 못한 버그를 초래할 수 있다.

따라서 리플렉션을 사용할 때는 반드시 신중하게 접근해야 하며, 가능한 경우 접근 메서드(예: getter, setter)를 사용하는 것이 바람직하다.
리플렉션은 주로 테스트나 라이브러리 개발 같은 특별한 상황에서 유용하게 사용되지만, 일반적인 애플리케이션 코드에서는 권장되지 않는다.
이를 무분별하게 사용하면 코드의 가독성과 안정성을 크게 저하시킬 수 있다.

---
# 애노테이션
영단어 Annotation은 일반적으로 '주석' 또는 '메모'를 의미한다.   
애노테이션은 코드에 추가적인 정보를 주석처럼 제공한다.   
하지만 일반 주석과 달리 컴파일러나 런타임에서 해석될 수 있는 메타데이터를 제공한다.   
즉, 애노테이션을 달아놓은 것처럼 특정 정보나 지시를 추가하는 도구로, 코드에 대한 메타데이터를 표현하는 방법이다.

## 애노테이션 정의
```java
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnoElement {

    String value();
    int count() default 0;
    String[] tags() default {};
    
    Class<? extends MyLogger> annoData() default MyLogger.class;
}
```
* 애노테이션은 `@interface` 키워드로 정의한다.
* 애노테이션은 속성을 가질 수 있는데, 인터페이스와 비슷하게 정의한다.

### 애노테이션 정의 규칙
데이터 타입
* 기본 타입
* String
* `Class`(메타데이터) 또는 인터페이스
* enum
* 다른 애노테이션 타입
* 위의 타입들의 배열
* 앞서 설명한 타입 외에는 정의할 수 없다. 일반적인 클래스를 사용할 수 없다.

default 값
* 요소에 default 값을 지정할 수 있다.
* 예: `String value() default "기본값`;

요소 이름
* 메서드 형태로 정의 된다.
* 괄호()를 포함하되 매개변수는 없어야 한다.

반환 값
* `void`를 반환 타입으로 사용할 수 없다.

예외
* 예외를 선언할 수 없다.

특별한 요소 이름
`value`라는 이름의 요소를 하나만 가질 경우, 애노테이션 사용 시 요소 이름을 생략할 수 있다.

## 메타 애노테이션
애노테이션을 정의하는데 사용하는 특별한 애노테이션을 메타 애노테이션이라 한다.
* @Retention
  * RetentionPolicy.SOURCE
  * RetentionPolicy.CLASS
  * RetentionPolicy.RUNTIME
* @Target
* @Documented
* @Inherited

### @Retention
애노테이션의 생존 기간을 지정한다.
```java
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Retention {
    RetentionPolicy value();
}
```
```java
public enum RetentionPolicy {
    SOURCE,
    CLASS,
    RUNTIME
}
```
* `RetentionPolicy.SOURCE`: 소스 코드에 남아 있다. 컴파일 시점에 제거 된다.
* `RetentionPolicy.CLASS`: 컴파일 후 `.class` 파일까지는 남아있지만 자바 실행 시점에 제거된다.
* `RetentionPolicy.RUNTIME`: 자바 실행 중에도 남아 있다. 대부분 이 설정을 사용한다.

### @Target
애노테이션을 적용할 수 있는 위치를 지정한다.

```java
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Retention {
    ElementType[] value();
}
```
```java
public enum ElementType {
    TYPE,
    FIELD,
    METHOD,
    PARAMETER,
    CONSTRUCTOR,
    LOCAL_VARIABLE,
    ANNOTATION_TYPE,
    PACKAGE,
    TYPE_PARAMETER,
    TYPE_USE,
    MODULE,
    RECORD_COMPONENT;
}
```
* 이름만으로 충분히 이해가 된다. 주로 `TYPE`, `FIELD`, `METHOD`를 사용한다.

### @Document
자바 API 문서를 만들 때 해당 애노테이션이 함께 포함되는지 지정한다.

### @Inherited
자식 클래스가 애노테이션을 상속 받을 수 있다.

## 애노테이션과 상속
모든 애노테이션은 `java.lang.annoation.Annotation` 인터페이스를 묵시적으로 상속 받는다.
```java
public interface Annotation {
    boolean equals(Object obj);
    int hashCode();
    String toString();
    Class<? extends Annotation> annotationType();
}
```
`java.lang.annoation.Annotation` 인터페이스는 개발자가 직접 구현하거나 확장할 수 있는 것이 아니라,
자바 언어 자체에서 애노테이션을 위한 기반으로 사용된다. 이 인터페이스는 다음과 같은 메서드를 제공한다.
* boolean equals(Object obj): 두 애노테이션의 동일성을 비교한다.
* int hashCode(): 애노테이션의 해시코드를 반환한다.
* String toString(): 애노테이션의 문자열 표현을 반환한다.
* Class<? extends Annotation> annotationType(): 애노테이션의 타입을 반환한다.

모든 애노테이션은 기본적으로 `Annotation` 인터페이스를 확장하며, 이로 인해 자바에서 애노테이션은 특별한 형태의 인터페이스로 간주된다.
하지만 자바에서 애노테이션을 정의할 때, 개발자가 명식저으로 `Annotation` 인터페이스를 상속하거나 구현할 필요는 없다.
애노테이션을 `@interface` 키워드를 통해 정의하면, 자바 컴파일러가 자동으로 `Annotation` 인터페이스를 확장하도록 처리해준다.

### 애노테이션 정의
```java
public @interface MyCustomAnnotation {}
```

### 자바가 자동으로 처리
```java
public interface MyCustomAnnotation extends java.lang.annotation.Annotation {}
```

#### 애노테이션과 상속
* 애노테이션은 다른 애노테이션이나 인터페이스를 직접 상속할 수 없다.
* 오직 `java.lang.annotation.Annotation` 인터페이스만 상속한다.
* 따라서 애노테이션 사이에는 상속이라는 개념이 존재하지 않는다.

## @Inherited
애노테이션을 정의할 때 `@Inherited` 메타 애노테이션을 붙이면,
애노테잉션을 적용한 클래스의 자식도 해당 애노테이션을 부여 받을 수 있다.
단 주의할 점은 클래스 상속에서만 작동하고, 인터페이스의 구현체에는 적용되지 않는다.

### @Inherited 클래스가 상속에만 적용되는 이유
1. 클래스 상속과 인터페이스 구현의 차이
   * 클래스 상속은 자식 클래스가 부모 클래스의 상속과 메서드를 상속받는 개념이다. 즉, 자식 클래스는 부모 클래스의 특성을 이어 받으므로, 부모 클래스에 정의된 애노테이션을 자식 클래스가 자동으로 상속받을 수 있는 논리적 기반이 있다.
   * 인터페이스는 메서드의 시그니처만을 정의할 뿐, 상태나 행위를 가지지 않기 때문에, 인터페이스의 구현체가 애노테이션을 상속한다는 개념이 맞지 않는다.
2. 인터페이스와 다중 구현, 다이아몬드 문제
    * 인터페이스는 다중 구현이 가능하다. 만약 인터페이스의 애노테이션을 구현 클래스에 상속하게 되면 여러 인터페이스의 이노테이션간 충돌이나 모호한 상황이 발생할 수 있다.
---
