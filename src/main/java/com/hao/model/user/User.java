package com.hao.model.user;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * 数据库表：user_info
 * @author Mybatis Generator
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    /** 主键 */
    private Long id;

    /** 用户名 */
    private String userName;

    /** 年龄 */
    private Integer age;

    /** 出生日期 */
    private Date birthDate;

    /** 薪水 */
    private BigDecimal salary;

    /** 男Y，女 N，未知，X */
    private String sex;

    /** 0,未知；1工作中2休假中 */
    private Integer status;

    private static final long serialVersionUID = 1L;
}