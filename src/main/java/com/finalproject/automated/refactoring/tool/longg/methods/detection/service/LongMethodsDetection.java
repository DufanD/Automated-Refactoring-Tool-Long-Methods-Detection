package com.finalproject.automated.refactoring.tool.longg.methods.detection.service;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import lombok.NonNull;

import java.util.List;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

public interface LongMethodsDetection {

    void detect(@NonNull MethodModel methodModel, @NonNull Long threshold);

    void detect(@NonNull List<MethodModel> methodModels, @NonNull Long threshold);
}
