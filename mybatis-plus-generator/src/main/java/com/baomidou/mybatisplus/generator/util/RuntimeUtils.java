/*
 * Copyright (c) 2011-2020, baomidou (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.generator.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * 运行工具类
 *
 * @author nieqiurong 2020/11/13.
 * @since 3.5.0
 */
public class RuntimeUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(RuntimeUtils.class);

    public static void openDir(String outDir) throws IOException {
        String osName = System.getProperty("os.name");
        if (osName != null) {
            if (osName.contains("Mac")) {
                Runtime.getRuntime().exec("open " + outDir);
            } else if (osName.contains("Windows")) {
                Runtime.getRuntime().exec("cmd /c start " + outDir);
            } else {
                LOGGER.debug("文件输出目录:{}", outDir);
            }
        } else {
            LOGGER.warn("读取操作系统失败");
        }
    }

}
