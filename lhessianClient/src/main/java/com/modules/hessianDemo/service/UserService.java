package com.modules.hessianDemo.service;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2019/1/22 10:50
 * @Version: 1.0
 */
public interface UserService {

    /**
     * @MethodName getDataFromServer
     * @Description 从服务端获取数据
     * @param param
     * @Return java.lang.String
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2019/1/22 9:44
     */
    public String getDataFromServer(String param);

    /**
     * @MethodName getDataFromClien
     * @Description 从客户端获取数据
     * @param param
     * @Return java.lang.String
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2019/1/22 9:48
     */
    public String getDataFromClient(String param);
}
