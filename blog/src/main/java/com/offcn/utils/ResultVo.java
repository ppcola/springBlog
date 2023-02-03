package com.offcn.utils;

public class ResultVo {
    public ResultVo() {
    }

    public ResultVo(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    private boolean flag;//操作成功与否标识 true--成功  false--失败
    private String msg;//操作后响应字符串类型提示

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
