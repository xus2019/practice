package com.practice.controller;

import com.practice.entity.Goods;
import com.practice.service.GoodsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Goods)表控制层
 *
 * @author makejava
 * @since 2024-03-15 15:24:55
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    /**
     * 服务对象
     */
    @Resource
    private GoodsService goodsService;

    /**
     * 分页查询
     *
     * @param goods       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    /*@GetMapping
    public ResponseEntity<Page<Goods>> queryByPage(Goods goods, PageRequest pageRequest) {
        return ResponseEntity.ok(this.goodsService.queryByPage(goods, pageRequest));
    }*/

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/detail")
    public ResponseEntity<Goods> queryById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(this.goodsService.queryById(id));
    }

}

