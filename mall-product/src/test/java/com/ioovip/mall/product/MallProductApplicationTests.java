package com.ioovip.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ioovip.mall.product.entity.BrandEntity;
import com.ioovip.mall.product.service.BrandService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("tester");
        brandEntity.setName("family");
        brandService.save(brandEntity);
        System.out.println("保存成功。。。");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        list.forEach((item)->{
            System.out.println("item -> " + item);
        });
    }

}
