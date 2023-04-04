package tn.camepofico.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fileup {
    private long fu_seq;
    private String fu_orgnm;
    private String fu_savednm;
    private String fu_savedpath;
    private Post post;
}
