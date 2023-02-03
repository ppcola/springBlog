package com.offcn.controller;

import com.github.pagehelper.PageInfo;
import com.offcn.bean.Blog;
import com.offcn.service.BlogService;
import com.offcn.utils.ResultVo;
import com.offcn.vo.BlogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    private BlogService blogService;
    
    @RequestMapping("queryAll")
    @ResponseBody
    public PageInfo<BlogVo> queryAll(int pageNum,int pageSize){
        PageInfo<BlogVo> pageInfo = blogService.queryAll(pageNum, pageSize);
        return pageInfo;

    }

    @RequestMapping("del")
    @ResponseBody
    public ResultVo deleteBlog(int bid){
        try {
            blogService.deleteBlog(bid);
            return new ResultVo(true,"删除成功");
        }catch (Exception ex){
            return new ResultVo(false,"删除失败");
        }
    }
    @RequestMapping("detail")
    @ResponseBody
    public BlogVo queryDetail(int bid){
        return blogService.queryDetail(bid);
    }
}
