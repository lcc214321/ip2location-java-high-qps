/**
 * Copyright [2019-2020] [wujiuye]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wujiuye.ip2location.proxy;

/**
 * @author wujiuye
 * @version 1.0 on 2019/11/2 {描述：
 * 让外部能够拿到被代理的对象
 * }
 */
public interface OperationProxy<T> {

    /**
     * 获取被代理的对象
     *
     * @return
     */
    T getProxy();

}
