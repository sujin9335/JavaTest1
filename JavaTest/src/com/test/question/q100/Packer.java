package com.test.question.q100;

public class Packer {

	static int pencilCount;
	static int eraserCount;
	static int ballPoinPenCount;
	static int rulerCount;
	
	void packing(Pencil pencil) {
		if(pencil.getHardness().equals("4B")
			|| pencil.getHardness().equals("3B")
			|| pencil.getHardness().equals("2B")
			|| pencil.getHardness().equals("B")
			|| pencil.getHardness().equals("HB")
			|| pencil.getHardness().equals("H")	
			|| pencil.getHardness().equals("2H")		
			|| pencil.getHardness().equals("3H")	
			|| pencil.getHardness().equals("4H")) {
			System.out.printf("포장 전 검수 : %s 진하기 연필입니다.\n",pencil.getHardness());
			System.out.println("포장을 완료 했습니다");
			Packer.pencilCount++;
			}
	}
	
	void packing(Eraser eraser) {
		if(eraser.getSize().equals("Large") 
			|| eraser.getSize().equals("Medium") 
			|| eraser.getSize().equals("Small")) {
			System.out.printf("포장 전 검수 : %s 사이즈 지우개입니다.\n",eraser.getSize());
			System.out.println("포장을 완료 했습니다");
			Packer.eraserCount++;
			}
		
	}
	
	void packing(BallPointPen ballPointPen) {
		if(ballPointPen.getThickness() == 0.3
			|| ballPointPen.getThickness() == 0.5
			|| ballPointPen.getThickness() == 0.7
			|| ballPointPen.getThickness() == 1
			|| ballPointPen.getThickness() == 1.5) {
			if(ballPointPen.getColor().equals("red")
				|| ballPointPen.getColor().equals("blue")
				|| ballPointPen.getColor().equals("green")
				|| ballPointPen.getColor().equals("black")) {
				System.out.printf("포장 전 검수 : %s 색상 %.1fmm 볼펜입니다.\n"
									,ballPointPen.getColor(), ballPointPen.getThickness());
				System.out.println("포장을 완료 했습니다");
				Packer.ballPoinPenCount++;
			}
		}
	}
	
	void packing(Ruler ruler) {
		
		
		if(ruler.getLength() == 30 || ruler.getLength() == 50 || ruler.getLength() == 100) {
			if(ruler.getShape().equals("줄자")
				|| ruler.getShape().equals("운형자")
				|| ruler.getShape().equals("삼각자")) {
				System.out.printf("포장 전 검수 : %dcm  %s입니다.\n"
						,ruler.getLength(),ruler.getShape());
				System.out.println("포장을 완료 했습니다");
				Packer.rulerCount++;
			}
				
		}
		
	}
	
	void countPacking(int type) {
		
		String result="";
		result+="=====================\n";
		result+="포장 결과\n";
		result+="=====================\n";
		switch(type) {
			case 0 : result+=String.format("연필 %d회\n", Packer.pencilCount);
					result+=String.format("지우개 %d회\n", Packer.eraserCount);
					result+=String.format("볼펜 %d회\n", Packer.ballPoinPenCount);
					result+=String.format("자 %d회\n", Packer.rulerCount);
					break;
			case 1 : result+=String.format("연필 %d회\n", Packer.pencilCount);break;	
			case 2 : result+=String.format("지우개 %d회\n", Packer.eraserCount);break;	
			case 3 : result+=String.format("볼펜 %d회\n", Packer.ballPoinPenCount);break;	
			case 4 : result+=String.format("자 %d회\n", Packer.rulerCount);break;	
		}
		System.out.println(result);
	}
	
	
	
}
