package com.offcn.mapper;

import com.offcn.bean.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BookMapper {
    List<Book> queryAll();
    int insert(Map<String,Object> map);
    int delete(int bid);
    List<Book> queryByAuthorAndTitle(@Param("bauthor") String author, @Param("btitle") String title);
}
