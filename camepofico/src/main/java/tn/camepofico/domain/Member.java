package tn.camepofico.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private long mb_seq;
    private String mb_name;
    private String mb_email;
    private String mb_password;
    private Date mb_rdate;
    private Date mb_udate;
}
