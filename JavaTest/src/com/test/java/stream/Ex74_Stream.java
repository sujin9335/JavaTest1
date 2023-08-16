package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.Student;

public class Ex74_Stream {

	public static void main(String[] args) {
		
		/*
		
			자바 스트림
			1. 입출력 스트림
				- 파일 입출력, 콜솔 입출력, 네트워크 입출력
		
			2. 스트림
				- java 8(JDK 1.8)
				- 람다식 + 람수형 인터페이스
				- 배열(컬렉션)의 탐색(조작) 지원
				- 파일 입출력 지원
				- 디렉토리 탐색 지원
				
			
			배열, 컬렉션 탐색
			1. for문(루프변수)
			2. 향상된 for문
			3. Iterator
			4. 스트림
			
			
			함수형 인터페이스
			1. Consumer
				- (매개변수) -> {구현부}
				
			2. Supplier
				- () -> {return 값}
			
			3. Function
				- (매개변수) -> {return 값}
				
			4. Operator
				- (매개변수) -> {return 값}
				- 매개변수와 반환값의 자료형이 동일
				
			5. Predicate
				- (매개변수) -> {return 값}
				- 반환값이 boolean
			
			
			8-11 정리
			Stream()
			
			.filter(Predicate)
			.map(Function)
			.sorted(Compartor)
			.distinct()
			
			.count()/max()/min()/average()/sum()
			.allMatch()/anyMath()/noneMatch()
			.forEach()
			
			
			
			
		
		*/
		
		
		String path="test.java";
		
		//배포
		//- 개발자 자바 소스 > (전달) > 다른 개발자
		//1. 소스 자체 전달 > MyFile.java
		//2. 컴파일한 실행 파일을 전달 > MyFile.class > 압축(1개 파일) > *.jar
	
		
		
		//import > 같은 프로젝트내에서만 가능
//		MyFile mf=new MyFile();
		
//		System.out.println(mf.getFileNameWithoutExtension(path));
//		
//		System.out.println(mf.getExtension(path));
		
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
		m10();
		
		
		
		
	}//m

	private static void m10() {

		//집계, 통계, Reduce
		//- count(), max(), min(), sum(), avg()
		//- 최종 파이프
		//- 요소들을 가공해서 통계값
		
		System.out.println(Data.getIntList().stream().count());
		
		//Optional<Integer>.get() -(해야 결과나옴)
		System.out.println(Data.getIntList().stream().max((a,b) -> a-b).get());
		
		//Optional<Integer>.get() -(해야 결과나옴)
		System.out.println(Data.getIntList().stream().min((a,b) -> a-b).get());
		
		
		int sum=Data.getIntList().stream()
					.mapToInt(n -> n) // Stream<Interger> (x) Integer(o)
					.sum();
		System.out.println(sum);
		
		double avg=Data.getIntList().stream()
				.mapToInt(n -> n) // Stream<Interger> (x) Integer(o)
				.average().getAsDouble();
		System.out.println(sum);
		
		
		
		
		
	}

	private static void m9() {

		//매칭
		//- allMatch(), anyMatch(), nonMatch()
		//- 최종 파이프
		//- 스트림 요소들이 제시한 조건을 만족 유무 판단
		// a. boolean allMatch(Predicate) > 모든 요소가 조건을 100% 만족
		// b. boolean anyMatch(Predicate) > 일부 요소가 조건을 만족
		// c. boolean noneMatch(Predicate) > 모든 요소가 조건을 만족X
		
		
		//요구사항] 배열 > 짝수만 있는지?
		int[] nums= {2,2,4,4,8};
		
		boolean result=false;
		
		for(int n : nums) {
			if(n%2 == 1) {
				result=true;
				break;
			}
		}
		
		if(result) {
			System.out.println("홀수 발견!!");
		}else {
			System.out.println("짝수 배열~");
		}
		
		System.out.println(Arrays.stream(nums).allMatch(n -> n%2 == 0));
		
		
		if(!Arrays.stream(nums).allMatch(n -> n%2 == 0)) {
			System.out.println("홀수 발견!!");
		}else {
			System.out.println("짝수 배열~");
		}
		
		System.out.println(Arrays.stream(nums).allMatch(n -> n%2 == 0));
		System.out.println(Arrays.stream(nums).anyMatch(n -> n%2 == 0));
		System.out.println(Arrays.stream(nums).noneMatch(n -> n%2 == 0));
		
		
		
		
	}

	private static void m8() {
		
		//정렬
		//- sorted()
		//- 중간 파이프
		//- 배열/컬렉션의 sort()의 사용법이 동일 > Comparator 구현
		
		Data.getIntList(10)
			.stream()
			.sorted() //오름차순
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		Data.getIntList(10)
			.stream()
			.sorted((a,b) -> b-a) //내림차순
			.forEach(n -> System.out.println(n));
		
		
		
		
		
		
	}

	private static void m7() {

		//매핑
		//- map(), mapXXX()
		//- 중간 파이프
		//- 변환 작업
		
		List<String> list=Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		list.stream()							//Stream<String>
			.filter(word -> word.length() > 3)  //Stream<String>
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		list.stream()							//Stream<String>
			.map(word -> word.length())			//STream<Integer> //결과가 int로바뀜
			.forEach(num -> System.out.println(num));
		System.out.println();
		
		
		String[] names= {"홍길동", "아무개", "이순신", "권율", "강감찬", "연개소문"
				, "홍길동", "이순신", "남궁장군", "연개소문"};
		
		//이름 추출
		Arrays.stream(names)
			.map(name -> name.substring(1))
			.forEach(name -> System.out.println(name));
		System.out.println();
		
		
		List<Student> slist=new ArrayList<Student>();
		slist.add(new Student("가가가",100,90,80));
		slist.add(new Student("나나나",77,88,99));
		slist.add(new Student("다다다",60,50,40));
		slist.add(new Student("라라라",82,67,91));
		slist.add(new Student("마마마",67,88,68));
		
		slist.stream()
			.map(s -> {
				if(s.getKor()+s.getEng()+s.getMath() >= 180) {
					return s.getName()+":합격";
				}else {
					return s.getName()+":불합격";
				}
			})//Stream<Student> -> Stream<String>
			.forEach(result -> System.out.println(result));
		System.out.println();
		
		
		slist.stream()
			.map(s -> {
				if((s.getKor()+s.getEng()+s.getMath()) >= 180) {
					Result r=new Result();
					r.setName(s.getName());
					r.setResult("합격");
					return r;
					
				}else {
					Result r=new Result();
					r.setName(s.getName());
					r.setResult("불합격");
					return r;
				}
				
				
			})
			.forEach(r -> System.out.println(r));
		
		
		
		
		
	}

	private static void m6() {

		//증복 제거
		//- distinct()
		//- 중간 파이프
		//- 앞의 스트림에서 중복 요소를 제거하고 > 유일한 요소만 남은 새로운 스트림을 반환한다
		
		List<Integer> list=Data.getIntList();
		System.out.println(list.size());
		
		//요구사항] 위의 배열에서 중복값 제거
		//Case 1.
		Set<Integer> set1=new HashSet<Integer>();
		
		for(int n : list) {
			set1.add(n); //중복값 제거
		}
		System.out.println(set1.size());
		
		//Case 2. 
		Set<Integer> set2=new HashSet<Integer>(list); //중복값 제거
		System.out.println(set2.size());
		
		//Case 3. //distinct==중복값 제거, count==갯수(size)
		//list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println(list.stream().count());
		System.out.println(list.stream().distinct().count());
		
		
		String[] names= {"홍길동", "아무개", "이순신", "권율", "강감찬", "연개소문"
							, "홍길동", "이순신", "남궁장군", "연개소문"};
		
		Arrays.stream(names)
			.distinct()
			.filter(name -> name.length() == 3)
			.forEach(name -> System.out.println(name));
		System.out.println();
		System.out.println();
		
		
		
		List<Cup> clist=new ArrayList<Cup>();
		
		clist.add(new Cup(Cup.BlACK, 200));
		clist.add(new Cup(Cup.BLUE, 300));
		clist.add(new Cup(Cup.RED, 400));
		clist.add(new Cup(Cup.WHITE, 500)); //1
		clist.add(new Cup(Cup.WHITE, 600)); //2
		clist.add(new Cup(Cup.BlACK, 700));
		clist.add(new Cup(Cup.BLUE, 800));
		clist.add(new Cup(Cup.RED, 900));
		clist.add(new Cup(Cup.WHITE, 500)); //1
		clist.add(new Cup(Cup.YELLOW, 600)); //2
		
		//Set, distinct() > 중복 객체를 제거하려면?
		//1. hashCode() 재정의
		//2. equals() 재정의
		
		
		clist.stream()
			.distinct()
			.forEach(cup -> System.out.println(cup));
		System.out.println();
		System.out.println();
		
		
	}

	private static void m5() {

		/*
		
			스트림
			- 데이터 소스로부터 탐색/조작 가능한 도구
			- list.stream().forEach()
			
			파이프, pipe
			- 스트림 객체 메소드
			1. 중간 파이프
				- 반환값 O + 스트림 반환
			
			2. 최종 파이프
				- 반환값 X + void
				- 반환값 O + 다른 자료형 반환
			
			요소 처리
			- forEach()
			- 최종 파이프
			
			필터링
			- filter()
			- 중간 파이프
			- Predicate
			
		
		*/
		
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		
		//요구사항] 짝수만 출력
		for(int n : list) {
			if(n % 2 == 0) {
				System.out.printf("%-4d", n);
			}
		}
		System.out.println();
		
		
		list.stream().forEach(num -> {
			if(num % 2 == 0) {
				System.out.printf("%-4d", num);
			}
		});
		System.out.println();
		
		
		list.stream().filter(num -> num%2 == 0).forEach(num -> {
			System.out.printf("%-4d", num);
		});
		System.out.println();
		System.out.println("======================");
		
		
		
		Data.getStringList().stream()
			.filter(word -> word.length() >= 5)
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		
		Data.getUserList().stream()
			.filter(user -> user.getWeight() > 70 && user.getGender() == 1)
			.forEach(user -> System.out.println(user));
		System.out.println();
		System.out.println();
		
		
		Data.getUserList().stream() // -(&&일때만 filter 추가로 보기좋게 표현할수있음)
			.filter(user -> user.getWeight() > 70)
			.filter(user -> user.getGender() == 1)
			.filter(user -> user.getHeight() == 180)
			.forEach(user -> System.out.println(user));
		System.out.println();
		System.out.println();
		
		
		
		
		
	}

	private static void m4() {

		//스트림을 열어오는 방법
		//1. 배열로부터
		//2. 컬렉션으로부터
		
		//3. 숫자범위로부터
		//4. 파일로부터
		//5. 디렉토리부터
		
		//1. 배열로부터
		int[] nums1= {10,20,30};
		
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();
		
		//2. 컬렉션으로부터
		ArrayList<Integer> nums2=new ArrayList<Integer>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		
		//3. 숫자범위로부터
		
		//Stream<Integer> : 범용 스트림 > forEach > Consumer<Integer>
		//IntStream       : 전용 스트림 > forEach > IntConsumer
		
		//-(내가 1~9까지의 숫자가 필요할때 쓰는 방법)
		IntStream.range(1, 10).forEach(num -> System.out.println(num));
		
		System.out.println();
		
		
		try {
			
			//4. 파일로부터
			//- 스트림 > 파일 읽기
			
			//java.io > 버전업 > java.nio
			
			//. : 현재 실행파일이 있는 폴더
			//- 자바 콘솔 프로젝트에서는 프로젝트 루트 폴더를 표현
			Path path=Paths.get(".\\data\\number.txt");
			
			Files.lines(path).forEach(line -> System.out.println(line));
			System.out.println();
			
			
			//5. 디렉토리부터
			//- 목록보기 > dir.listFiles()
			Path dir=Paths.get("C:\\class\\dev\\eclipse");
			
			Files.list(dir).forEach(p -> {
				System.out.println(p.getFileName());
				System.out.println(p.toFile().isFile());
				System.out.println();
			});
			
			
		} catch (Exception e) {
			System.out.println("at Ex74_Stream.m4");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void m3() {

		Data.getIntList().stream()
				.forEach(num -> System.out.printf("%4d",num));
		
		System.out.println();
		
		
		
		
		
		Data.getUserList().stream().forEach(user -> {
			System.out.println("[회원정보]");
			System.out.println("이름: "+user.getName());
			System.out.println("나이: "+user.getAge());
			System.out.println("성별: "+user.getGender());
			System.out.println();
		});
		
		
		Data.getItemList().stream().forEach(item -> {
			System.out.println(item.getName());
			System.out.println(item.getColor());
			System.out.println();
		});
		
		
	}

	private static void m2() {

		//배열(컬렉션) 탐색
		List<String> list=Data.getStringList(10);
		
		//1.for
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println();
		
		
		//2.for
		for(String word : list) {
			System.out.print(word+" ");
		}
		System.out.println();
		System.out.println();
		
		//3, Interator
		Iterator<String> iter=list.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.println();
		
		
		//4. Stream
		Stream<String> stream=list.stream();
		
		Consumer<String> c1=str -> System.out.print(str+" ");
		
		//forEach 메소드
		//1. stream으로 부터 얻어낸 데이터 > 1개씩 가져온다. (향상된 for문처럼)
		//2. 가져온 데이터 > Consumer.accept() 메소드의 인자 전달 + 메소드 호출
		//3. 반복 x 요소만큼
		stream.forEach(c1); //한번 for 다돌면 끝 더이상 재호출 안됨

		stream=list.stream();
		stream.forEach(c1);//
		System.out.println();
		
		
		//메소드 체이닝 > 삼수형 프로그래밍 방식
		list.stream().forEach(str -> System.out.print(str));
		
		
	}

	private static void m1() {
		
		int[] nums1=Data.getIntArray();
		System.out.println(Arrays.toString(nums1));	
		System.out.println(nums1.length);
		
		int[] nums2=Data.getIntArray(5);
		System.out.println(Arrays.toString(nums1));	
		System.out.println(nums2.length);
		
		//List<Integer>
		List<Integer> nums3=Data.getIntList();
		System.out.println(nums3.size());
		
		List<Integer> nums4=Data.getIntList(5);
		System.out.println(nums4);
		
		
		String[] txt=Data.getStringArray();
		System.out.println(Arrays.toString(txt));
		
		Item[] items=Data.getItemArray();
		System.out.println(Arrays.toString(items));
		
		User[] list=Data.getUserArray();
		System.out.println(Arrays.toString(list));
		
		
	}
}

//이전 > set 수입
class Cup{
	
	public final static int BlACK=1;
	public final static int WHITE=2;
	public final static int RED=3;
	public final static int YELLOW=4;
	public final static int BLUE=5;
	
	//private String color2; //주관식 > colo2 = "white"
	
	
	private int color;// 객관식 > 빨강, 파랑.... 선택 > 열거값
	private int size;
	
	public Cup() {
		// TODO Auto-generated constructor stub
	}

	public Cup(int color, int size) {
		super();
		this.color = color;
		this.size = size;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Cup [color=" + color + ", size=" + size + "]";
	}
	
	
	//개발자의 의도대로 객체를 비교하려면...
	@Override
	public int hashCode() {
		
		return (""+this.color + this.size).hashCode();
//		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.hashCode() == obj.hashCode();
//		return super.equals(obj);
	}
	
	
	
}


//Stream<Student> -> map() -> Stream<Result>
class Result{
	
	private String name;
	private String result;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Result [name=" + name + ", result=" + result + "]";
	}
	
	
}







