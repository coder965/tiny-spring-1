/*
 *  Github: https://github.com/AnyOptional
 *  Created by Archer on 2019/10/11.
 *  All rights reserved.
 */

package com.archer.spring.context.event;

import com.archer.spring.context.ApplicationContext;
import com.archer.spring.context.ApplicationEvent;

/**
 * ApplicationContext关闭事件。
 */
public class ContextClosedEvent extends ApplicationEvent {

    public ContextClosedEvent(ApplicationContext context) {
        super(context);
    }
}
