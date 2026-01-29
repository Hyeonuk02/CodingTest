import java.io.*;   // 입출력(IO) 관련 클래스들을 사용하기 위한 import (BufferedReader, InputStreamReader 등)
import java.util.*; // 유틸리티 관련 클래스들을 사용하기 위한 import (Arrays, StringTokenizer 등)

public class Main { // 백준에서는 클래스 이름이 반드시 Main 이어야 함
    public static void main(String[] args) throws Exception {
        /*
         * [입력 준비]
         * System.in           : 표준 입력(키보드 입력). "바이트(byte)" 단위로 들어옴
         * InputStreamReader   : 바이트 스트림(System.in)을 "문자(char)" 스트림으로 변환해줌
         * BufferedReader      : 문자 스트림을 "버퍼"에 모아두고, 한 줄 단위(readLine)로 빠르게 읽게 해줌
         *
         * 즉, 키보드 입력(바이트)을 문자로 바꾸고, 그걸 빠르게 한 줄씩 읽기 위한 3단 조합.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
         * [첫 줄 입력]
         * br.readLine()            : 한 줄을 문자열(String)로 읽음 (예: "5")
         * Integer.parseInt("5")    : 문자열을 int로 변환 (예: 5)
         */
        int N = Integer.parseInt(br.readLine());

        /*
         * [배열 생성]
         * int[] arr = new int[N] : 크기가 N인 정수 배열 생성
         * (자바 배열은 생성 시 기본값 0으로 채워짐)
         */
        int[] arr = new int[N];

        /*
         * [N개의 정수 입력 받기]
         * 문제 2750은 숫자들이 "각 줄에 하나씩" 들어오므로, readLine()을 N번 호출하면 됨.
         */
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine()); // 한 줄 읽고 -> int로 변환 -> 배열에 저장
        }

        /*
         * [정렬]
         * Arrays.sort(arr) : 자바 표준 라이브러리로 배열을 오름차순 정렬
         * 코테에서 가장 많이 쓰는 정렬 방법.
         */
        Arrays.sort(arr);

        /*
         * [출력 준비 - StringBuilder]
         * 자바에서 System.out.println()을 반복 호출하면 느려질 수 있음.
         * 그래서 출력할 내용을 StringBuilder에 모아두고 마지막에 한 번에 출력하는 패턴을 많이 씀.
         */
        StringBuilder sb = new StringBuilder();

        /*
         * [정렬된 결과를 문자열로 만들기]
         * sb.append(arr[i])  : 숫자를 문자열 형태로 뒤에 붙임
         * sb.append('\n')    : 줄바꿈 문자 추가 (한 줄에 하나씩 출력해야 하므로)
         *
         * append()는 자기 자신(sb)을 반환해서 .append(...).append(...)처럼 이어서 쓸 수 있음(체이닝).
         */
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append('\n');
        }

        /*
         * [출력]
         * StringBuilder에 모아둔 내용을
         * toString()으로 실제 String으로 변환한 뒤 한 번에 출력
         */
        System.out.print(sb.toString());
    }
}
