package web.spring.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class nboardVo {

	int nboard_no;			//공지글 번호
	String nboard_title;		//공지글 제목
	String nboard_content;	//공지글 내용
	Date nboard_regDate;		//공지글 등록일
	Date nboard_updateDate; 	//공지글 수정일
	String nboard_category;	//공지글 분류 'E' :이벤트 'S' : 세일
	String nboard_public;	//잠긴글 처리 'Y' : 잠김 'N' : 공개
	String user_id;			//유저 아이디
	String file_pictureId;	//썸네일 아이디
}
