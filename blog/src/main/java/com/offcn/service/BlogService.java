package com.offcn.service;

import com.github.pagehelper.PageInfo;
import com.offcn.bean.Blog;
import com.offcn.vo.BlogVo;

public interface BlogService {
    PageInfo<BlogVo> queryAll(int pageNum,int pageSize);

    void deleteBlog(int bid);

    BlogVo queryDetail(int bid);
}
