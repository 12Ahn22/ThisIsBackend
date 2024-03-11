package ex_stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx {
    // forEach 스트림
    public static void main(String[] args) {
        Integer[] intergerArray = new Integer[]{1, 2, 3, 4, 5}; // 자바에서 배열은 {}

        /**
         * forEach - 각 요소마다 할 일 지정
         */
        // 스트림은 컬렉션을 편리하게 쓰기 위한 API이기 때문에 컬렉션화 시켜서 사용해야한다.
        List<Integer> list = Arrays.asList(intergerArray); // a fixed-size list backed by the specified array.
        System.out.println("::forEach::");
        list.stream() // Returns a sequential Stream with this collection as its source.
                .forEach(System.out::print);
//        list.forEach(System.out::println); // stream()없이도 forEach문 사용 가능
        System.out.println();

        /**
         * filter - 필터링
         */
        List<Integer> evenList = list.stream()
                .filter(v -> v%2 == 0) // filter를 통해 짝수만 수집
                .toList();

        /**
         * distinct - 중복제거, 중복은 요소의 equals 메서드를 활용
         */
        Integer[] integerArray2 = new Integer[]{1,1,2,2,3,3,4,4,5,5};
        List<Integer> list2 = Arrays.asList(integerArray2);
        List<Integer> distinctList = list2.stream() //
                .distinct().toList();
        System.out.println("::distinct::");
        distinctList.forEach(System.out::print);
        System.out.println();

        /**
         * map - 각 요소들에 특정 연산을 적용한 후 새로운 스트림 생성
         */
        String[] lowercaseArray = new String[]{"public","static","void"};
        List<String> list3 = Arrays.asList(lowercaseArray);
        List<String> uppercaseArray = list3.stream().map(String::toUpperCase).toList();
        System.out.println("::map::");
        uppercaseArray.forEach(System.out::println);

        /**
         * collect와 toList
         * toList는 자바 16버전부터 사용가능한 문법이다.
         * toList()를 사용하면 Stream을 간단하게 List로 만들 수 있다.
         * 자바 16이전 버전은 .collect(Collection.toList())를 사용해야한다.
         */

    }
}
