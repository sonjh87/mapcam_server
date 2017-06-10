package com.jboc.server.mysql;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
/**
 * Created by son on 2017-06-10 0010.
 */
@Data
@Getter @Setter
public class UserVO {
    private int NO;
    private String ID;
    private String PASSWORD;


}
