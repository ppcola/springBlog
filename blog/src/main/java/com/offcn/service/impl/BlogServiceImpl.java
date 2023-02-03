package com.offcn.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.offcn.bean.Blog;
import com.offcn.bean.EvaluateExample;
import com.offcn.mapper.BlogMapper;
import com.offcn.mapper.EvaluateMapper;
import com.offcn.service.BlogService;
import com.offcn.vo.BlogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;
    @Autowired
    private EvaluateMapper evaluateMapper;
    @Override
    public PageInfo<BlogVo> queryAll(int pageNum,int pageSize) {
        //设置分页参数
        PageHelper.startPage(pageNum,pageSize);
        List<BlogVo> blogVoList  = blogMapper.queryAll();
        PageInfo<BlogVo> pageInfo = new PageInfo<>(blogVoList);
        return pageInfo;
    }

    @Override
    public void deleteBlog(int bid) {
        //1先删评论
        EvaluateExample evaluateExample = new EvaluateExample();
        EvaluateExample.Criteria criteria = evaluateExample.createCriteria();
        criteria.andBFkEqualTo(bid);
        evaluateMapper.deleteByExample(evaluateExample);
        //2删除博客
        blogMapper.deleteByPrimaryKey(bid);
    }

    @Override
    public BlogVo queryDetail(int bid) {
        return blogMapper.queryDetail(bid);
    }

}
