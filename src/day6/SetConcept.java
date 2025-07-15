package day6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {
    public static void main(String[] args) {
        // 집합 개념 잡고 가기!
        // 수영하고 와서 드럽게 피곤하지만, 지난주를 보아하니, 매일 조금씩이라도 하는 습관이 매우 중요!
        // 이번주는 개념정리하고, 단계별 문제풀고, 코테합_자바편 문제를 도전해볼 생각!

        /*
         * 1. 집합(Set) 이란?
         * - 중복을 허용하지 않는 자료구조
         * - 순서를 보장하지 않음 (HashSet)
         * 원소 존재 여부 확인에 빠름 O(1)~O(logn)
         *
         * 2. 자바의 주요 Set 구현체
         * 종류           특징                         정렬         중복
         * HashSet       가장 많이 사용. 빠른 조회 O(1)    X          중복 제거됨
         * LinkedHashSet 입력 순서를 유지                O(입력 순서)  중복 제거됨
         * TreeSet       자동 정렬됨(기본 오름차순)        O(정렬)      중복 제거됨
         *
         * */

        // 3. 주요 메서드
        Set<String> set = new HashSet<>();

        set.add("apple");       // 원소 추가
        set.contains("apple");  // 존재 여부 확인
        set.remove("apple"); // 원소 제거
        set.size();             // 원소 개수
        set.clear();            // 전체 삭제

        // 4. 집합 간 연산 (교집합, 합집합, 차집합)
        Set<String> set1 = new HashSet<>(List.of("a", "b", "c"));
        Set<String> set2 = new HashSet<>(List.of("b", "c", "d"));

        // 교집합 (공통된 것만 남기기)
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // ["b", "c"]

        // 합집합 (둘 다 합치기)
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2); // ["a", "b", "c", "d"]

        // 차집합 (set1에서 set2 빼기)
        Set<String> diff = new HashSet<>(set1);
        diff.removeAll(set2); // ["a"]

        // 5. TreeSet 정렬 기능
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(5);

        System.out.println(treeSet); // [1, 3, 5]
        System.out.println(treeSet.first()); // 1
        System.out.println(treeSet.last()); // 5
        System.out.println(treeSet.higher(3)); // 5
        System.out.println(treeSet.lower(3)); // 1

        // 요약
        // 중복 제거 : Set은 같은 값을 한 번만 저장함
        // 조히 속도 : HashSet은 매우 빠름 O(1) 예상
        // 정렬된 Set 사용 시 : TreeSet 사용, 자동 오름차순 정렬
        // 순서 유지 필요 시 : LinkedHashSet 사용
        // 집합 연산 : retainAll, addAll, remmoveAll 이용
    }
}

// HashSet, LinkedHashSet, TreeSet 각각 어디에 많이 쓰이는가?
/*
* HashSet - 가장 많이 쓰이는 기본 집합
* 언제 사용하나? 중복 제거가 필요하고, 순서 상관없고, 빠른 탐색(검색/삽입/삭제)이 중요할 때
* 대표 활용 예시 : 배열이나 문자열 중복 제거, 중복 없는 요소들만 저장하고 빠르게 존재 여부 확인할 때
* 해시 기반 문제 (ex. 백준 : 서로 다른 부분 문자열, 회사아ㅔ 있는 사람 듣보잡 등)
*
* LinkedHashSet - 순서 보장되는 집합
* 언제 사용하나? 중복 제거 + 입력 순서를 유지해야 할 때
* 대표 활용 예시 : 입력된 순서를 보존하면서 중복 제거할 때, 순서를 유지한 채 출력해야 하는 문제
*
* 예시
* Set<String> linkedSet = new LinkedHashSet<>();
* linkedSet.add("apple");
* linkedSet.add("banana");
* linkedSet.add("apple");
* System.out.println(linkedSet); // [apple, banana]
*
* TreeSet - 정렬이 필요한 집합
* 언제 사용하나? 자동 정렬(기본 오름차순)이 필요할 때
* 정렬된 순서로 데이터를 순회하거나, 범위 검색이 필요할 때
* 대표 활용 예시 : 최솟값, 최댓값, 특정 기준 이상/이하 원소 탐색
* 값의 범위에 따라 빠르게 탐색할 때(higher, lower, ceiling, floor)
* 오름차순 정렬된 집합 출력 문제
*
* 예시
* TreeSet<Integer> tree = new TreeSet<>();
* tree.add(10);
* tree.add(5);
* tree.add(20);
* System.out.println(tree); // [5, 10, 20]
* System.out.println(tree.higher(10)); // 20
*
* */