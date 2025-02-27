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
 // namespace impl

/**
 *  \class IConvolutionLayer
 * 
 *  \brief A convolution layer in a network definition.
 * 
 *  This layer performs a correlation operation between 3-dimensional filter with a 4-dimensional tensor to produce
 *  another 4-dimensional tensor.
 * 
 *  An optional bias argument is supported, which adds a per-channel constant to each value in the output.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IConvolutionLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IConvolutionLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the HW kernel size of the convolution.
     * 
     *  If executing this layer on DLA, both height and width of kernel size must be in the range [1,32].
     * 
     *  @see getKernelSize()
     * 
     *  @deprecated Superseded by setKernelSizeNd. Deprecated prior to TensorRT 8.0 and will be removed in 9.0
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @NoException(true) void setKernelSize(@ByVal DimsHW kernelSize);

    /**
     *  \brief Get the HW kernel size of the convolution.
     * 
     *  @see setKernelSize()
     * 
     *  @deprecated Superseded by getKernelSizeNd. Deprecated prior to TensorRT 8.0 and will be removed in 9.0
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal @NoException(true) DimsHW getKernelSize();

    /**
     *  \brief Set the number of output maps for the convolution.
     * 
     *  If executing this layer on DLA, the number of output maps must be in the range [1,8192].
     * 
     *  @see getNbOutputMaps()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setNbOutputMaps(int nbOutputMaps);

    /**
     *  \brief Get the number of output maps for the convolution.
     * 
     *  @see setNbOutputMaps()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getNbOutputMaps();

    /**
     *  \brief Get the stride of the convolution.
     * 
     *  Default: (1,1)
     * 
     *  If executing this layer on DLA, both height and width of stride must be in the range [1,8].
     * 
     *  @see getStride()
     * 
     *  @deprecated Superseded by setStrideNd. Deprecated prior to TensorRT 8.0 and will be removed in 9.0
     *  */
    
    
    //!
    //!
    //!
    public native @Deprecated @NoException(true) void setStride(@ByVal DimsHW stride);

    /**
     *  \brief Get the stride of the convolution.
     * 
     *  @deprecated Superseded by getStrideNd. Deprecated prior to TensorRT 8.0 and will be removed in 9.0
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal @NoException(true) DimsHW getStride();

    /**
     *  \brief Set the padding of the convolution.
     * 
     *  The input will be zero-padded by this number of elements in the height and width directions.
     *  Padding is symmetric.
     * 
     *  Default: (0,0)
     * 
     *  If executing this layer on DLA, both height and width of padding must be in the range [0,31],
     *  and the padding size must be less than the kernel size.
     * 
     *  @see getPadding()
     * 
     *  @deprecated Superseded by setPaddingNd. Deprecated prior to TensorRT 8.0 and will be removed in 9.0
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @NoException(true) void setPadding(@ByVal DimsHW padding);

    /**
     *  \brief Get the padding of the convolution. If the padding is asymmetric, the pre-padding is returned.
     * 
     *  @see setPadding()
     * 
     *  @deprecated Superseded by getPaddingNd. Deprecated prior to TensorRT 8.0 and will be removed in 9.0
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal @NoException(true) DimsHW getPadding();

    /**
     *  \brief Set the number of groups for a convolution.
     * 
     *  The input tensor channels are  divided into \p nbGroups groups, and a convolution is executed for each group,
     *  using a filter per group. The results of the group convolutions are concatenated to form the output.
     * 
     *  \note When using groups in int8 mode, the size of the groups (i.e. the channel count divided by the group
     *  count) must be a multiple of 4 for both input and output.
     * 
     *  Default: 1
     * 
     *  If executing this layer on DLA, the max number of groups is 8192.
     * 
     *  @see getNbGroups()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setNbGroups(int nbGroups);

    /**
     *  \brief Get the number of groups of the convolution.
     * 
     *  @see setNbGroups()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int getNbGroups();

    /**
     *  \brief Set the kernel weights for the convolution.
     * 
     *  The weights are specified as a contiguous array in \p GKCRS order, where \p G is the number of groups, \p K
     *  the number of output feature maps, \p C the number of input channels, and \p R and \p S are the height and
     *  width of the filter.
     * 
     *  @see getKernelWeights()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setKernelWeights(@ByVal Weights weights);

    /**
     *  \brief Get the kernel weights of the convolution.
     * 
     *  @see setKernelWeights()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) Weights getKernelWeights();

    /**
     *  \brief Set the bias weights for the convolution.
     * 
     *  Bias is optional. To omit bias, set the count value of the weights structure to zero.
     * 
     *  The bias is applied per-channel, so the number of weights (if non-zero) must be equal to the number of output
     *  feature maps.
     * 
     *  @see getBiasWeights()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setBiasWeights(@ByVal Weights weights);

    /**
     *  \brief Get the bias weights for the convolution.
     * 
     *  @see setBiasWeights()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) Weights getBiasWeights();

    /**
     *  \brief Set the dilation for a convolution.
     * 
     *  Default: (1,1)
     * 
     *  If executing this layer on DLA, both height and width must be in the range [1,32].
     * 
     *  @see getDilation()
     * 
     *  @deprecated Superseded by setDilationNd. Deprecated prior to TensorRT 8.0 and will be removed in 9.0
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @NoException(true) void setDilation(@ByVal DimsHW dilation);

    /**
     *  \brief Get the dilation for a convolution.
     * 
     *  @see setDilation()
     * 
     *  @deprecated Superseded by getDilationNd. Deprecated prior to TensorRT 8.0 and will be removed in 9.0
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal @NoException(true) DimsHW getDilation();

    /**
     *  \brief Set the multi-dimension pre-padding of the convolution.
     * 
     *  The start of the input will be zero-padded by this number of elements in each dimension.
     * 
     *  Default: (0, 0, ..., 0)
     * 
     *  If executing this layer on DLA, only support 2D padding, both height and width of padding must be in the range
     *  [0,31], and the padding must be less than the kernel size.
     * 
     *  @see getPrePadding()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setPrePadding(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);

    /**
     *  \brief Get the pre-padding.
     * 
     *  @see setPrePadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPrePadding();

    /**
     *  \brief Set the multi-dimension post-padding of the convolution.
     * 
     *  The end of the input will be zero-padded by this number of elements in each dimension.
     * 
     *  Default: (0, 0, ..., 0)
     * 
     *  If executing this layer on DLA, only support 2D padding, both height and width of padding must be in the range
     *  [0,31], and the padding must be less than the kernel size.
     * 
     *  @see getPostPadding()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setPostPadding(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);

    /**
     *  \brief Get the post-padding.
     * 
     *  @see setPostPadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPostPadding();

    /**
     *  \brief Set the padding mode.
     * 
     *  Padding mode takes precedence if both setPaddingMode and setPre/PostPadding are used.
     * 
     *  Default: kEXPLICIT_ROUND_DOWN
     * 
     *  @see getPaddingMode()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setPaddingMode(PaddingMode paddingMode);
    public native @NoException(true) void setPaddingMode(@Cast("nvinfer1::PaddingMode") int paddingMode);

    /**
     *  \brief Get the padding mode.
     * 
     *  Default: kEXPLICIT_ROUND_DOWN
     * 
     *  @see setPaddingMode()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) PaddingMode getPaddingMode();

    /**
     *  \brief Set the multi-dimension kernel size of the convolution.
     * 
     *  If executing this layer on DLA, only support 2D kernel size, both height and width of kernel size must be in the
     *  range [1,32].
     * 
     *  @see getKernelSizeNd()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setKernelSizeNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 kernelSize);

    /**
     *  \brief Get the multi-dimension kernel size of the convolution.
     * 
     *  @see setKernelSizeNd()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getKernelSizeNd();

    /**
     *  \brief Set the multi-dimension stride of the convolution.
     * 
     *  Default: (1, 1, ..., 1)
     * 
     *  If executing this layer on DLA, only support 2D stride, both height and width of stride must be in the range
     *  [1,8].
     * 
     *  @see getStrideNd() setStride() getStride()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setStrideNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 stride);

    /**
     *  \brief Get the multi-dimension stride of the convolution.
     * 
     *  @see setStrideNd()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getStrideNd();

    /**
     *  \brief Set the multi-dimension padding of the convolution.
     * 
     *  The input will be zero-padded by this number of elements in each dimension.
     *  Padding is symmetric.
     * 
     *  Default: (0, 0, ..., 0)
     * 
     *  If executing this layer on DLA, only support 2D padding, both height and width of padding must be in the range
     *  [0,31], and the padding must be less than the kernel size.
     * 
     *  @see getPaddingNd() setPadding() getPadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setPaddingNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);

    /**
     *  \brief Get the multi-dimension padding of the convolution.
     * 
     *  If the padding is asymmetric, the pre-padding is returned.
     * 
     *  @see setPaddingNd()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPaddingNd();

    /**
     *  \brief Set the multi-dimension dilation of the convolution.
     * 
     *  Default: (1, 1, ..., 1)
     * 
     *  If executing this layer on DLA, only support 2D padding, both height and width must be in the range [1,32].
     * 
     *  @see getDilation()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setDilationNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 dilation);

    /**
     *  \brief Get the multi-dimension dilation of the convolution.
     * 
     *  @see setDilation()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getDilationNd();

    /**
     *  \brief Append or replace an input of this layer with a specific tensor
     * 
     *  @param index the index of the input to modify.
     *  @param tensor the new input tensor
     * 
     *  Only index 0 (data input) is valid, unless explicit-quantization mode is enabled.
     *  In explicit-quantization mode, input with index 1 is the kernel-weights tensor, if present.
     *  The kernel-weights tensor must be a build-time constant (computable at build-time via constant-folding)
     *  and an output of a dequantize layer.
     *  If input index 1 is used then the kernel-weights parameter must be set to empty Weights.
     * 
     *  @see getKernelWeights(), setKernelWeights()
     * 
     *  The indices are as follows:
     * 
     *  - 0: The input activation tensor.
     *  - 1: The kernel weights tensor (a constant tensor).
     * 
     *  If this function is called with the value 1, then the function getNbInputs() changes
     *  from returning 1 to 2. */
}
