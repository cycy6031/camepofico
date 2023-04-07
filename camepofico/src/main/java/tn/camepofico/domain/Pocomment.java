package tn.camepofico.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pocomment {
    private long cm_seq;
    private Post post;
    private Member member;
    private String cm_content;
    private Date cm_rdate;

}
