/*
 * Copyright (c) 2022-present Charles7c Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package top.charles7c.cnadmin.monitor.model.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import top.charles7c.cnadmin.monitor.enums.LogStatusEnum;

/**
 * 登录日志信息
 *
 * @author Charles7c
 * @since 2023/1/16 23:19
 */
@Data
@Schema(description = "登录日志信息")
public class LoginLogVO extends LogVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志ID
     */
    @Schema(description = "日志ID")
    private Long logId;

    /**
     * 日志描述
     */
    @Schema(description = "日志描述")
    private String description;

    /**
     * 操作状态（1成功 2失败）
     */
    @Schema(description = "操作状态（1成功 2失败）", type = "Integer", allowableValues = {"1", "2"})
    private LogStatusEnum status;

    /**
     * 登录IP
     */
    @Schema(description = "登录IP")
    private String clientIp;

    /**
     * 登录地点
     */
    @Schema(description = "登录地点")
    private String location;

    /**
     * 浏览器
     */
    @Schema(description = "浏览器")
    private String browser;

    /**
     * 错误信息
     */
    @Schema(description = "错误信息")
    private String errorMsg;

    /**
     * 登录时间
     */
    @Schema(description = "登录时间")
    private LocalDateTime createTime;
}
