package com.zmt.mianshiyanexttry.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zmt.mianshiyanexttry.model.dto.mockinterview.MockInterviewAddRequest;
import com.zmt.mianshiyanexttry.model.dto.mockinterview.MockInterviewEventRequest;
import com.zmt.mianshiyanexttry.model.dto.mockinterview.MockInterviewQueryRequest;
import com.zmt.mianshiyanexttry.model.entity.MockInterview;
import com.zmt.mianshiyanexttry.model.entity.User;

public interface MockInterviewService extends IService<MockInterview> {

    /**
     * 创建模拟面试
     *
     * @param mockInterviewAddRequest
     * @param loginUser
     * @return
     */
    Long createMockInterview(MockInterviewAddRequest mockInterviewAddRequest, User loginUser);

    /**
     * 构造查询条件
     *
     * @param mockInterviewQueryRequest
     * @return
     */
    QueryWrapper<MockInterview> getQueryWrapper(MockInterviewQueryRequest mockInterviewQueryRequest);

    /**
     * 处理模拟面试事件
     * @param mockInterviewEventRequest
     * @param loginUser
     * @return AI 给出的回复
     */
    String handleMockInterviewEvent(MockInterviewEventRequest mockInterviewEventRequest, User loginUser);
}
