package org.vblog.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sang on 2017/12/21.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tags {
    private Long id;
    private String tagName;
}
