package com.ants.monitor.bean;

/**
 * Created by zxg on 15/11/2.
 */
public class ResultVO {

    private boolean success;
    private String code = "000";
    private String msg = "";
    private Object data;

    public static ResultVO wrapSuccessfulResult() {
        ResultVO vo = new ResultVO();
        vo.setSuccess(true);
        return vo;
    }
    public static ResultVO wrapSuccessfulResult(Object data) {
        ResultVO vo = new ResultVO();
        vo.setSuccess(true);
        vo.setData(data);
        return vo;
    }

    public static ResultVO wrapErrorResult(String msgStr) {
        ResultVO vo = new ResultVO();
        vo.setSuccess(false);

        vo.setMsg(msgStr);

        return vo;
    }


    public static ResultVO wrapErrorResult(String code,String msgStr) {
        ResultVO vo = new ResultVO();
        vo.setCode(code);
        vo.setSuccess(false);
        vo.setMsg(msgStr);

        return vo;
    }
    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }
    /**
     * @param success the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }
    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }
    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }
    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }
    
    

}
