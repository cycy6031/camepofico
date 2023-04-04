package tn.camepofico.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
	private long ps_seq;
	private String ps_subject;
	private String ps_content;
	private Date ps_rdate;
	private Date ps_udate;
	private Member member;
	private Pocategory pocategory;
	private int file_count;
	private int comment_count;
}
