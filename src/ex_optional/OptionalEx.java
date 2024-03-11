package ex_optional;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalEx {
    public static String getSomeString(){
        return null; // 항상 null을 반환하는 메서드
    }

    public static Optional<String> getOptionalString(){
        return Optional.empty(); // null이 아니라, 비어있는 Optional을 반환한다.
    }

    public static Optional<String> getOptionalString2(){
        return Optional.of("public void static"); // Returns an Optional describing the given non-null value.
    }
    public static void main(String[] args) {
        /**
         * 기존의 null을 처리하던 방법: if문을 사용한다.
         */
        String isThisNull = getSomeString(); // null
        if(null != isThisNull) System.out.println("null이 아닙니다.");

        /**
         * Optional을 사용하는 방법
         */
        Optional<String> isThisOptional = getOptionalString(); // null
        isThisOptional.ifPresent(System.out::println); // 실행 안된다.

        Optional<String> isThisOptional2 = getOptionalString2(); // null이 아니다.
        isThisOptional2.ifPresent(System.out::println); // 실행된다.

        /**
         * 직접 Optional을 반환하는 메서드를 선언하는 일은 아마 적을 것이다.
         * 하지만 Optional 타입을 반환하는 경우에 어떻게 사용하는 지는 알아야한다.
         */
    }
}
