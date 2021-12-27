package org.vblog.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sang on 2017/12/17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    private String status;
    private String msg;
}
