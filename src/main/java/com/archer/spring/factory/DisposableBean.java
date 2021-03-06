/*
 *  Github: https://github.com/AnyOptional
 *  Created by Archer on 2019/9/26.
 *  All rights reserved.
 */

package com.archer.spring.factory;

/**
 * Bean的生命周期标记接口。
 */
public interface DisposableBean {

    /**
     * 在BeanFactory销毁单例bean时调用
     */
    void destroy() throws Exception;
}
