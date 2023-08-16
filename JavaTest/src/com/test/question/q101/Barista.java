package com.test.question.q101;

public class Barista {

	Espresso makeEspresso(int bean) {
		Espresso es=new Espresso();
		es.setBean(bean);
		Coffee.bean+=bean;
		Coffee.espresso++;
		Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
		return es;
	}
//	에스프레소 1잔을 만든다.
//	int bean : 원두량(g)
//	return Espreeso : 에스프레소 1잔
	Espresso[] makeEspressoes(int bean, int count) {
		Espresso[] ess=new Espresso[count];
		for(int i=0; i<count; i++) {
			Espresso es=new Espresso();
			es.setBean(bean);
			Coffee.bean+=bean;
			Coffee.espresso++;
			Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
			ess[i]=es;
		}
		return ess;
	}
//	에스프레소 N잔을 만든다.
//	int bean : 원두량(g)
//	int count : 음료 개수(잔)
//	return Espresso[] : 에스프레소 N잔
	Latte makeLatte(int bean, int milk) {
		Latte la=new Latte();
		la.setBean(bean);
		la.setMilk(milk);
		Coffee.bean+=bean;
		Coffee.milk+=milk;
		Coffee.latte++;
		Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
		Coffee.milkTotalPrice+=milk*Coffee.milkUnitPrice;
		
		return la;
	}
//	라테 1잔을 만든다.
//	int baen : 원두량(g)
//	int milk : 우유량(ml)
//	return Latte : 라테 1잔
	Latte[] makeLattes(int bean, int milk, int count) {
		Latte[] las=new Latte[count];
		for(int i=0; i<count; i++) {
			Latte la=new Latte();
			la.setBean(bean);
			la.setMilk(milk);
			Coffee.bean+=bean;
			Coffee.milk+=milk;
			Coffee.latte++;
			Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
			Coffee.milkTotalPrice+=milk*Coffee.milkUnitPrice;
			las[i]=la;
		}
		
		
		
		
		return las;
	}
//	라테 N잔을 만든다.
//	int baen : 원두량(g)
//	int milk : 우유량(ml)
//	int count : 음료 개수(잔)
//	return Latte[] : 라테 N잔
	
//	Latte la=new Latte();
//	la.setBean(bean);
//	la.setMilk(milk);
//	Coffee.bean+=bean;
//	Coffee.milk++;
//	Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
//	Coffee.milkTotalPrice+=milk*Coffee.milkUnitPrice;
	
	
	Americano makeAmericano(int bean, int water, int ice) {
		Americano am=new Americano();
		am.setBean(bean);
		am.setWater(water);
		am.setIce(ice);
		Coffee.americano++;
		Coffee.bean+=bean;
		Coffee.ice+=ice;
		Coffee.water+=water;
		Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
		Coffee.waterTotalPrice+=water*Coffee.waterUnitPrice;
		Coffee.iceTotalPrice+=ice*Coffee.iceUnitPrice;
		
		return am;
	}
//	아메리카노 1잔을 만든다.
//	int baen : 원두량(g)
//	int water : 물량(ml)
//	int ice : 얼음 개수(개)
//	return Americano : 아메리카노 1잔
	Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		Americano[] ams=new Americano[count];
		Americano am=new Americano();
		for(int i=0; i<count; i++) {
			am.setBean(bean);
			am.setWater(water);
			am.setIce(ice);
			Coffee.americano++;
			Coffee.bean+=bean;
			Coffee.ice+=ice;
			Coffee.water+=water;
			Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
			Coffee.waterTotalPrice+=water*Coffee.waterUnitPrice;
			Coffee.iceTotalPrice+=ice*Coffee.iceUnitPrice;
			ams[i]=am;
		}
		
		
		return ams;
	}
//	아메리카노 N잔을 만든다.
//	int baen : 원두량(g)
//	int water : 물량(ml)
//	int ice : 얼음 개수(개)
//	int count : 음료 개수(잔)
//	return Americano[] : 아메리카노 N잔
	void result() {
		String result="";
		result+="=================================\n";
		result+="판매 결과\n";
		result+="=================================\n";
		result+="\n";
		result+="---------------------------------\n";
		result+="음료 판매량\n";
		result+="---------------------------------\n";
		result+=String.format("에스프레소: %d잔\n", Coffee.espresso);
		result+=String.format("아메리카노: %d잔\n", Coffee.americano);
		result+=String.format("라테: %d잔\n", Coffee.latte);
		result+="\n";
		result+="---------------------------------\n";
		result+="원자제 소비량\n";
		result+="---------------------------------\n";
		result+=String.format("원두: %,dg\n", Coffee.bean);
		result+=String.format("물: %,dml\n", Coffee.water);
		result+=String.format("얼음: %,d개\n", Coffee.ice);
		result+=String.format("우유: %,dml\n", Coffee.milk);
		result+="\n";
		result+="---------------------------------\n";
		result+="매출액\n";
		result+="---------------------------------\n";
		result+=String.format("원두: %,d원\n", Coffee.beanTotalPrice);
		result+=String.format("물: %,d원\n", Coffee.waterTotalPrice);
		result+=String.format("얼음: %,d원\n", Coffee.iceTotalPrice);
		result+=String.format("우유: %,d원\n", Coffee.milkTotalPrice);
		
		
		
		
		
		System.out.println(result);
		
	}
	
//	판매 결과를 출력한다.
//	음료 판매량(에스프레소 판매 개수, 라테 판매 개수, 아메리카노 판매 개수)
//	원자재 소비량(원두 소비량, 물 소비량, 우유 소비량, 얼음 소비량)
//	매출액(원두 판매액, 물 판매액, 우유 판매액, 얼음 판매액)
}
