package tn.camepofico.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
	private long psSeq;
	private String psSubject;
	private String psContent;
	private Date psRdate;
	private Date psUdate;
	private Member member;
	private Pocategory pocategory;
	private int fileCount;
	private int commentCount;
}
