package com.project.erpsystem.dao;

import java.util.ArrayList;

import com.project.erpsystem.vo.PayVo;

public class PayDao {

	public static ArrayList<PayVo> pl;
	
	static {
		pl=new ArrayList<PayVo>();
	}



	public static PayVo getPay(String inputYear, String inputMonth) {
		PayVo pay=new PayVo();
		
		//페이 폴더에 접속하여 해당 년도, 달로 된 txt 파일에 접속하여 자신의 로그인 티켓 정보의 사원번호를 검색해 출력
		
		
		
		
		return pay;
	}

	
}
