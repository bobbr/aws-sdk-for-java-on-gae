/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Suspend Processes Request Marshaller
 */
public class SuspendProcessesRequestMarshaller implements Marshaller<Request<SuspendProcessesRequest>, SuspendProcessesRequest> {

    public Request<SuspendProcessesRequest> marshall(SuspendProcessesRequest suspendProcessesRequest) {
        Request<SuspendProcessesRequest> request = new DefaultRequest<SuspendProcessesRequest>(suspendProcessesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "SuspendProcesses");
        request.addParameter("Version", "2010-08-01");
        if (suspendProcessesRequest != null) {
            if (suspendProcessesRequest.getAutoScalingGroupName() != null) {
                request.addParameter("AutoScalingGroupName", StringUtils.fromString(suspendProcessesRequest.getAutoScalingGroupName()));
            }
        }
        if (suspendProcessesRequest != null) {
            java.util.List<String> scalingProcessesList = suspendProcessesRequest.getScalingProcesses();
            int scalingProcessesListIndex = 1;

            for (String scalingProcessesListValue : scalingProcessesList) {
                if (scalingProcessesListValue != null) {
                    request.addParameter("ScalingProcesses.member." + scalingProcessesListIndex, StringUtils.fromString(scalingProcessesListValue));
                }
                scalingProcessesListIndex++;
            }
        }


        return request;
    }
}
