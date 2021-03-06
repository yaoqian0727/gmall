package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.gmall.pms.entity.Brand;


/**
 * 品牌
 *
 * @author jiangli
 * @since  2020-01-10 04:05:29
 */
public interface BrandService extends IService<Brand> {

    PageVo queryPage(QueryCondition params);
}

