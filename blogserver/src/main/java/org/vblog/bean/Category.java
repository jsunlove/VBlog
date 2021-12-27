package org.vblog.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * Created by sang on 2017/12/19.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private Long id;
    private String cateName;
    private Timestamp date;
}
