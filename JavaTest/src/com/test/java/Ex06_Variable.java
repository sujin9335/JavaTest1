package com.test.java;

public class Ex06_Variable {
	
	public static void main(String[] args) {
		
		//목표 > 자료형 + 변수 + 리터럴
		//1. 주변의 데이터 검색! > 제 몸무게 > 저장할 변수 생성
		//2. 형태+길이 > 자료형 결정 > double
		//3. 변수 생성 + 값 대입
		//4. 출력역사
		
		//1회
		double Height=175.5;
		System.out.println("제 키는 :"+" "+Height+"cm 입니다");
		
		byte myMathScore=85;
		short myHome=32;
		int myZipcode=3115;
		long mySealevel=251;
		float myWeight=95.12f;
		double myHeight=175.1;
		char gender='남';
		boolean disabled=false;
		String phoneNum="010-1234-4567";
		
		System.out.println("나의 수학점수는 "+myMathScore+"점 이고 서울에서 집까지의 거리는 "
				+myHome+ "km 이며 우편번호는 "+myZipcode+" 지금 해발 고도는 "+mySealevel
				+"m 몸무게 : "+myWeight+" 키 : "+myHeight+"이다 성별은 "+gender+
				"이고 장애인 여부는"+disabled+" 마지막으로 핸드폰 번호는 "+phoneNum+"입니다");
		
		
		byte myEngScore=55;
		short myHand=22;
		int myPat=1;
		long myfamily=3;
		float myScore=3.5f;
		double myShoes=253.6;
		char firstName='김';
		boolean myCar=true;
		String name="수진";
		
		System.out.println("나의 영어점수는 "+myEngScore+"점 이고 손바닥 길이는 "
				+myHand+ "cm 이며 애완동물의 수는 "+myPat+"마리 가족수는 "+myfamily
				+"명 학점은 : "+myScore+" 신발사이즈 : "+myShoes+"이다 성은 "+firstName+
				"이고 차보유 는"+myCar+" 마지막으로 나머지 이름은 "+name+"입니다");
		
		byte myCodingScore=100;
		short myArm=56;
		int myComputer=2;
		long myElec=3;
		float myScoreAvr=95.4f;
		double myFaHight=171.6;
		char HandFoot='손';
		boolean girlFrie=true;
		String girlFrieName="은지";
		
		System.out.println("나의 코딩점수는 "+myCodingScore+"점 이고 팔 길이는 "
				+myArm+ "cm 이며 보유 컴퓨터 수는 "+myComputer+"대 전자기기 보유 수는 "+myElec
				+"대 고등학교 성적평균은 : "+myScoreAvr+" 아버지 키 : "+myFaHight+"이다 손과발중 "+HandFoot+
				"을 좋아하고 여자친구 여부는 "+girlFrie+" 마지막으로 여친이름은 "+girlFrieName+"입니다");
		
		byte myHistoryScore=99;
		short familyHome=20;
		int familyZipcode=2155;
		long myTableHeight=121;
		float myTableVer=121.3f;
		double myTableHor=75.1;
		char momFirstName='박';
		boolean momDisabled=true;
		String momPhoneNum="010-1234-4587";
		
		System.out.println("나의 역사점수는 "+myHistoryScore+"점 이고 서울에서 본가까지의 거리는 "
				+familyHome+ "km 이며 본우편번호는 "+familyZipcode+" 지금 책상높이는 "+myTableHeight
				+"cm 책상 가로 길이 : "+myTableVer+" 세로 : "+myTableHor+"이다 어머니 성은 "+momFirstName+
				"이고 어머니장애인 여부는"+momDisabled+" 마지막으로 어머니핸드폰 번호는 "+momPhoneNum+"입니다");
		
		byte myArtScore=49;
		short myhomeFhome=34;
		int todayStep=7856;
		long mycarHeight=132;
		float mycarVer=180.6f;
		double mycarHor=75.1;
		char carFirstName='말';
		boolean carOil=true;
		String carNumber="8068";
		
		System.out.println("나의 미술점수는 "+myArtScore+"점 이고 용인집에서 본가까지의 거리는 "
				+myhomeFhome+ "km 이며 오늘 걸은수는 "+todayStep+" 나의 차높이는 "+mycarHeight
				+"cm 차 가로 길이 : "+mycarVer+" 세로 : "+mycarHor+"이다 차의 이름은 "+carFirstName+
				"리부 이고 휘발류차량이 "+carOil+"이며 차번호는 "+carNumber+"입니다");
		
		
		byte carPassenger=5;
		short carFuelTank=62;
		int FuelPrice=1550;
		long carCumulativeDistance=132;
		float FuelEfficiencyAvr=12.6f; //연비
		double FuelEfficiencyMax=23.1;
		char carSafetyGrade='A';
		boolean carRent=false;
		String carName="아반떼";
		
		System.out.printf("자동차 탑승 정원은 %d이고 기름통은 최대 %d 리터 입니다 현재 기름값은 %d원 이며"
				+ "누적거리 %d 이고 복합연비 %.1f 최고연비 %.1f 입니다 안전등급 %s 현재 빌릴수 있는 여부는 "+carRent+" 차량이름은 %s 입니다 \n"
				, carPassenger,carFuelTank,FuelPrice,carCumulativeDistance,FuelEfficiencyAvr,FuelEfficiencyMax
				,carSafetyGrade,carName);
		
		byte toyNume=47;
		short toyLimited=3;
		int toyAdmissionMoney=30000;
		long admissionQuota=132;
		float toyHeightMin=80.6f;
		double toyHeightMax=210.8;
		char toyRating='S';
		boolean admissionStatus=false;
		String museumName="레고랜드";
		
		System.out.printf("%s 박물관에 오신걸 환영합니다 총 %d개의 장난감과 %d종류의 희귀한 장난감이 있으며 입장료는 %d원 입장정원 %d명 입니다 "
				+ "최소 %.1f cm, 최대 %.1f 크기이며 모두 %s 등급을 받은 작품입니다 현재 예약 가능 표시 :"+admissionStatus+"\n"
				,museumName,toyNume,toyLimited,toyAdmissionMoney,admissionQuota,toyHeightMin,toyHeightMax,toyRating);
		
		byte herbivore=21;
		short carnivores=19;
		int animalPlant=431;
		long zooSize=20000;
		float admissionTime=9.30f;
		double closingTime=22.00;
		char animalFood='N';
		boolean zooReservation=true;
		String zooName="사파리 공원";
		
		System.out.printf("%s 안내, 초식동물: %d마리, 육식동물: %d마리, 총동식물: %d, 공원크기: %d평, 입장시간: %.2f 에서 %.2f 까지,"
				+ "먹이주기 가능여부: %s, 예약가능 여부:"+zooReservation+"\n"
				,zooName,herbivore,carnivores,animalPlant,zooSize,admissionTime,closingTime,animalFood);
		
		byte women=49;
		short men=123;
		int marry=800;
		long couple=20000;
		float discount=5.5f;
		double discountMax=22.5;
		char check='Y';
		boolean possibility=true;
		String companyName="결혼까지";
		
		System.out.printf("%s 입니다 현재 여성: %d명 남성: %d명 대기중이며 누적 %d이상 결혼 %d 커플 달성중입니다"
				+ "지인소개시 %.1f 최대 %.1f 까지 할인 가능하며 바로 가입 %s 상태입니다 가능성은"+possibility+"\n"
				,companyName,women,men,marry,couple,discount,discountMax,check);
		
		byte menu=50;
		short totalPeople=300;
		int parking=150;
		long price=20000;
		float totalPer=35.5f;
		double totalperMax=80.5;
		char advertisingCheck='N';
		boolean reconfirm=true;
		String storeName="파티";
		
		System.out.printf("%s 안내, 음식 메뉴는 %d 가지 이상, 입장규모 %d명, 주차가능 %d대, 가격 %d원, 입장 %.1f퍼이상부터 이벤트, %.1f퍼부터는 최대 이벤트"
				+ " 광고 체크 여부 %s, 재확인"+reconfirm+"\n"
				,storeName,menu,totalPeople,parking,price,totalPer,totalperMax,advertisingCheck);	
		
		
	}
}
