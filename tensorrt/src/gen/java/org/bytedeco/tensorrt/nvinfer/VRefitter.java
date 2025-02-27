// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


@Namespace("nvinfer1::apiv") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class VRefitter extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VRefitter(Pointer p) { super(p); }

    public native @Cast("bool") @NoException(true) boolean setWeights(String layerName, WeightsRole role, @Const @ByVal Weights weights);
    public native @Cast("bool") @NoException(true) boolean setWeights(@Cast("const char*") BytePointer layerName, @Cast("nvinfer1::WeightsRole") int role, @Const @ByVal Weights weights);
    public native @Cast("bool") @NoException(true) boolean refitCudaEngine();
    public native @NoException(true) int getMissing(int size, @Cast("const char**") PointerPointer layerNames, @Cast("nvinfer1::WeightsRole*") IntPointer roles);
    public native @NoException(true) int getMissing(int size, @Cast("const char**") @ByPtrPtr BytePointer layerNames, @Cast("nvinfer1::WeightsRole*") IntPointer roles);
    public native @NoException(true) int getMissing(int size, @Cast("const char**") @ByPtrPtr ByteBuffer layerNames, @Cast("nvinfer1::WeightsRole*") IntBuffer roles);
    public native @NoException(true) int getMissing(int size, @Cast("const char**") @ByPtrPtr byte[] layerNames, @Cast("nvinfer1::WeightsRole*") int[] roles);
    public native @NoException(true) int getAll(int size, @Cast("const char**") PointerPointer layerNames, @Cast("nvinfer1::WeightsRole*") IntPointer roles);
    public native @NoException(true) int getAll(int size, @Cast("const char**") @ByPtrPtr BytePointer layerNames, @Cast("nvinfer1::WeightsRole*") IntPointer roles);
    public native @NoException(true) int getAll(int size, @Cast("const char**") @ByPtrPtr ByteBuffer layerNames, @Cast("nvinfer1::WeightsRole*") IntBuffer roles);
    public native @NoException(true) int getAll(int size, @Cast("const char**") @ByPtrPtr byte[] layerNames, @Cast("nvinfer1::WeightsRole*") int[] roles);
    public native @Cast("bool") @NoException(true) boolean setDynamicRange(String tensorName, float min, float max);
    public native @Cast("bool") @NoException(true) boolean setDynamicRange(@Cast("const char*") BytePointer tensorName, float min, float max);
    public native @NoException(true) float getDynamicRangeMin(String tensorName);
    public native @NoException(true) float getDynamicRangeMin(@Cast("const char*") BytePointer tensorName);
    public native @NoException(true) float getDynamicRangeMax(String tensorName);
    public native @NoException(true) float getDynamicRangeMax(@Cast("const char*") BytePointer tensorName);
    public native @NoException(true) int getTensorsWithDynamicRange(int size, @Cast("const char**") PointerPointer tensorNames);
    public native @NoException(true) int getTensorsWithDynamicRange(int size, @Cast("const char**") @ByPtrPtr BytePointer tensorNames);
    public native @NoException(true) int getTensorsWithDynamicRange(int size, @Cast("const char**") @ByPtrPtr ByteBuffer tensorNames);
    public native @NoException(true) int getTensorsWithDynamicRange(int size, @Cast("const char**") @ByPtrPtr byte[] tensorNames);
    public native @NoException(true) void setErrorRecorder(IErrorRecorder recorder);
    public native @NoException(true) IErrorRecorder getErrorRecorder();
    public native @Cast("bool") @NoException(true) boolean setNamedWeights(String name, @ByVal Weights weights);
    public native @Cast("bool") @NoException(true) boolean setNamedWeights(@Cast("const char*") BytePointer name, @ByVal Weights weights);
    public native @NoException(true) int getMissingWeights(int size, @Cast("const char**") PointerPointer weightsNames);
    public native @NoException(true) int getMissingWeights(int size, @Cast("const char**") @ByPtrPtr BytePointer weightsNames);
    public native @NoException(true) int getMissingWeights(int size, @Cast("const char**") @ByPtrPtr ByteBuffer weightsNames);
    public native @NoException(true) int getMissingWeights(int size, @Cast("const char**") @ByPtrPtr byte[] weightsNames);
    public native @NoException(true) int getAllWeights(int size, @Cast("const char**") PointerPointer weightsNames);
    public native @NoException(true) int getAllWeights(int size, @Cast("const char**") @ByPtrPtr BytePointer weightsNames);
    public native @NoException(true) int getAllWeights(int size, @Cast("const char**") @ByPtrPtr ByteBuffer weightsNames);
    public native @NoException(true) int getAllWeights(int size, @Cast("const char**") @ByPtrPtr byte[] weightsNames);
    public native @NoException(true) ILogger getLogger();
    public native @Cast("bool") @NoException(true) boolean setMaxThreads(int maxThreads);
    public native @NoException(true) int getMaxThreads();
}
