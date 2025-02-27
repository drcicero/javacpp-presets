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


/**
 *  \class IExecutionContext
 * 
 *  \brief Context for executing inference using an engine, with functionally unsafe features.
 * 
 *  Multiple execution contexts may exist for one ICudaEngine instance, allowing the same
 *  engine to be used for the execution of multiple batches simultaneously. If the engine supports
 *  dynamic shapes, each execution context in concurrent use must use a separate optimization profile.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI. */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IExecutionContext extends INoCopy {
    static { Loader.load(); }
    /** Default native constructor. */
    public IExecutionContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IExecutionContext(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IExecutionContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IExecutionContext position(long position) {
        return (IExecutionContext)super.position(position);
    }
    @Override public IExecutionContext getPointer(long i) {
        return new IExecutionContext((Pointer)this).offsetAddress(i);
    }


    /**
     *  \brief Synchronously execute inference on a batch.
     * 
     *  This method requires an array of input and output buffers. The mapping from tensor names to indices
     *  can be queried using ICudaEngine::getBindingIndex()
     * 
     *  @param batchSize The batch size. This is at most the max batch size value supplied to the builder when the
     *  engine was built. If the network is created with NetworkDefinitionCreationFlag::kEXPLICIT_BATCH flag, please use
     *  executeV2() instead, and this batchSize argument has no effect.
     *  @param bindings An array of pointers to input and output buffers for the network.
     * 
     *  @return True if execution succeeded.
     * 
     *  @deprecated Deprecated in TensorRT 8.4. Superseded by executeV2() if the network is created with
     *  NetworkDefinitionCreationFlag::kEXPLICIT_BATCH flag.
     * 
     *  \warning This function will trigger layer resource updates if hasImplicitBatchDimension()
     *           returns true and batchSize changes between subsequent calls, possibly resulting
     *           in performance bottlenecks.
     * 
     *  @see ICudaEngine::getBindingIndex() ICudaEngine::getMaxBatchSize()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @Deprecated @NoException(true) boolean execute(int batchSize, @Cast("void*const*") PointerPointer bindings);
    public native @Cast("bool") @Deprecated @NoException(true) boolean execute(int batchSize, @Cast("void*const*") @ByPtrPtr Pointer bindings);

    /**
     *  \brief Asynchronously execute inference on a batch.
     * 
     *  This method requires an array of input and output buffers. The mapping from tensor names to indices can be
     *  queried using ICudaEngine::getBindingIndex()
     * 
     *  @param batchSize The batch size. This is at most the max batch size value supplied to the builder when the
     *  engine was built. If the network is created with NetworkDefinitionCreationFlag::kEXPLICIT_BATCH flag, please use
     *  enqueueV2() instead, and this batchSize argument has no effect.
     *  @param bindings An array of pointers to input and output buffers for the network.
     *  @param stream A cuda stream on which the inference kernels will be enqueued.
     *  @param inputConsumed An optional event which will be signaled when the input buffers can be refilled with new
     *  data.
     * 
     *  @return True if the kernels were enqueued successfully.
     * 
     *  @deprecated Deprecated in TensorRT 8.4. Superseded by enqueueV2() if the network is created with
     *  NetworkDefinitionCreationFlag::kEXPLICIT_BATCH flag.
     * 
     *  @see ICudaEngine::getBindingIndex() ICudaEngine::getMaxBatchSize()
     * 
     *  \warning Calling enqueue() in from the same IExecutionContext object with different CUDA streams concurrently
     *           results in undefined behavior. To perform inference concurrently in multiple streams, use one execution
     *           context per stream.
     * 
     *  \warning This function will trigger layer resource updates if hasImplicitBatchDimension()
     *           returns true and batchSize changes between subsequent calls, possibly resulting in performance
     *           bottlenecks.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @Deprecated @NoException(true) boolean enqueue(
            int batchSize, @Cast("void*const*") PointerPointer bindings, CUstream_st stream, @ByPtrPtr CUevent_st inputConsumed);
    public native @Cast("bool") @Deprecated @NoException(true) boolean enqueue(
            int batchSize, @Cast("void*const*") @ByPtrPtr Pointer bindings, CUstream_st stream, @ByPtrPtr CUevent_st inputConsumed);

    /**
     *  \brief Set the debug sync flag.
     * 
     *  If this flag is set to true, the engine will log the successful execution for each kernel during executeV2(). It
     *  has no effect when using enqueueV2().
     * 
     *  @see getDebugSync()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setDebugSync(@Cast("bool") boolean sync);

    /**
     *  \brief Get the debug sync flag.
     * 
     *  @see setDebugSync()
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean getDebugSync();

    /**
     *  \brief Set the profiler.
     * 
     *  @see IProfiler getProfiler()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setProfiler(IProfiler profiler);

    /**
     *  \brief Get the profiler.
     * 
     *  @see IProfiler setProfiler()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) IProfiler getProfiler();

    /**
     *  \brief Get the associated engine.
     * 
     *  @see ICudaEngine
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Const @ByRef @NoException(true) ICudaEngine getEngine();

    /**
     *  \brief Destroy this object.
     * 
     *  @deprecated Use {@code delete} instead. Deprecated in TRT 8.0.
     * 
     *  \warning Calling destroy on a managed pointer will result in a double-free error.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @NoException(true) void destroy();

    /**
     *  \brief Set the name of the execution context.
     * 
     *  This method copies the name string.
     * 
     *  @see getName()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setName(String name);
    public native @NoException(true) void setName(@Cast("const char*") BytePointer name);

    /**
     *  \brief Return the name of the execution context.
     * 
     *  @see setName()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) String getName();

    /**
     *  \brief Set the device memory for use by this execution context.
     * 
     *  The memory must be aligned with cuda memory alignment property (using cudaGetDeviceProperties()), and its size
     *  must be at least that returned by getDeviceMemorySize(). Setting memory to nullptr is acceptable if
     *  getDeviceMemorySize() returns 0. If using enqueueV2() to run the network, the memory is in use from the invocation
     *  of enqueueV2() until network execution is complete. If using executeV2(), it is in use until executeV2() returns.
     *  Releasing or otherwise using the memory for other purposes during this time will result in undefined behavior.
     * 
     *  @see ICudaEngine::getDeviceMemorySize() ICudaEngine::createExecutionContextWithoutDeviceMemory()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setDeviceMemory(Pointer memory);

    /**
     *  \brief Return the strides of the buffer for the given binding.
     * 
     *  The strides are in units of elements, not components or bytes.
     *  For example, for TensorFormat::kHWC8, a stride of one spans 8 scalars.
     * 
     *  Note that strides can be different for different execution contexts
     *  with dynamic shapes.
     * 
     *  If the bindingIndex is invalid or there are dynamic dimensions that have not been
     *  set yet, returns Dims with Dims::nbDims = -1.
     * 
     *  @param bindingIndex The binding index.
     * 
     *  @see getBindingComponentsPerElement
     *  */
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getStrides(int bindingIndex);
    /**
     *  \brief Select an optimization profile for the current context.
     * 
     *  @param profileIndex Index of the profile. It must lie between 0 and
     *         getEngine().getNbOptimizationProfiles() - 1
     * 
     *  The selected profile will be used in subsequent calls to executeV2() or enqueueV2().
     * 
     *  When an optimization profile is switched via this API, TensorRT may
     *  enqueue GPU memory copy operations required to set up the new profile during the subsequent enqueueV2()
     *  operations. To avoid these calls during enqueueV2(), use setOptimizationProfileAsync() instead.
     * 
     *  If the associated CUDA engine has dynamic inputs, this method must be called at least once
     *  with a unique profileIndex before calling execute or enqueue (i.e. the profile index
     *  may not be in use by another execution context that has not been destroyed yet).
     *  For the first execution context that is created for an engine, setOptimizationProfile(0)
     *  is called implicitly.
     * 
     *  If the associated CUDA engine does not have inputs with dynamic shapes, this method need not be
     *  called, in which case the default profile index of 0 will be used (this is particularly
     *  the case for all safe engines).
     * 
     *  setOptimizationProfile() must be called before calling setBindingDimensions() and
     *  setInputShapeBinding() for all dynamic input tensors or input shape tensors, which in
     *  turn must be called before either executeV2() or enqueueV2().
     * 
     *  \warning This function will trigger layer resource updates on the next
     *           call of enqueueV2()/executeV2(), possibly resulting in performance bottlenecks.
     * 
     *  @return true if the call succeeded, else false (e.g. input out of range)
     * 
     *  @deprecated Superseded by setOptimizationProfileAsync. Deprecated prior to TensorRT 8.0 and will be
     *  removed in 9.0.
     * 
     *  @see ICudaEngine::getNbOptimizationProfiles() IExecutionContext::setOptimizationProfileAsync()
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") @Deprecated @NoException(true) boolean setOptimizationProfile(int profileIndex);

    /**
     *  \brief Get the index of the currently selected optimization profile.
     * 
     *  If the profile index has not been set yet (implicitly to 0 for the first execution context
     *  to be created, or explicitly for all subsequent contexts), an invalid value of -1 will be returned
     *  and all calls to enqueueV2() or executeV2() will fail until a valid profile index has been set.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getOptimizationProfile();

    /**
     *  \brief Set the dynamic dimensions of a binding
     * 
     *  @param bindingIndex index of an input tensor whose dimensions must be compatible with
     *         the network definition (i.e. only the wildcard dimension -1 can be replaced with a
     *         new dimension >= 0).
     * 
     *  @param dimensions specifies the dimensions of the input tensor. It must be in the valid
     *         range for the currently selected optimization profile, and the corresponding engine must
     *         not be safety-certified.
     * 
     *  This method requires the engine to be built without an implicit batch dimension.
     *  This method will fail unless a valid optimization profile is defined for the current
     *  execution context (getOptimizationProfile() must not be -1).
     * 
     *  For all dynamic non-output bindings (which have at least one wildcard dimension of -1),
     *  this method needs to be called before either enqueueV2() or executeV2() may be called.
     *  This can be checked using the method allInputDimensionsSpecified().
     * 
     *  \warning This function will trigger layer resource updates on the next
     *           call of enqueueV2()/executeV2(), possibly resulting in performance bottlenecks,
     *           if the dimensions are different than the previous set dimensions.
     * 
     *  @return false if an error occurs (e.g. bindingIndex is out of range for the currently selected
     *          optimization profile or binding dimension is inconsistent with min-max range of the
     *          optimization profile), else true. Note that the network can still be invalid for certain
     *          combinations of input shapes that lead to invalid output shapes. To confirm the correctness
     *          of the network input shapes, check whether the output binding has valid
     *          dimensions using getBindingDimensions() on the output bindingIndex.
     * 
     *  @see ICudaEngine::getBindingIndex
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean setBindingDimensions(int bindingIndex, @ByVal @Cast("nvinfer1::Dims*") Dims32 dimensions);

    /**
     *  \brief Get the dynamic dimensions of a binding
     * 
     *  If the engine was built with an implicit batch dimension, same as ICudaEngine::getBindingDimensions.
     * 
     *  If setBindingDimensions() has been called on this binding (or if there are no
     *  dynamic dimensions), all dimensions will be positive. Otherwise, it is necessary to
     *  call setBindingDimensions() before enqueueV2() or executeV2() may be called.
     * 
     *  If the bindingIndex is out of range, an invalid Dims with nbDims == -1 is returned.
     *  The same invalid Dims will be returned if the engine was not built with an implicit
     *  batch dimension and if the execution context is not currently associated with a valid
     *  optimization profile (i.e. if getOptimizationProfile() returns -1).
     * 
     *  If ICudaEngine::bindingIsInput(bindingIndex) is false, then both
     *  allInputDimensionsSpecified() and allInputShapesSpecified() must be true
     *  before calling this method.
     * 
     *  @return Currently selected binding dimensions
     * 
     *  For backwards compatibility with earlier versions of TensorRT, a bindingIndex that does not belong
     *  to the current profile is corrected as described for ICudaEngine::getProfileDimensions.
     * 
     *  @see ICudaEngine::getProfileDimensions
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getBindingDimensions(int bindingIndex);

    /**
     *  \brief Set values of input tensor required by shape calculations.
     * 
     *  @param bindingIndex index of an input tensor for which
     *         ICudaEngine::isShapeBinding(bindingIndex) and ICudaEngine::bindingIsInput(bindingIndex)
     *         are both true.
     * 
     *  @param data pointer to values of the input tensor.  The number of values should be
     *          the product of the dimensions returned by getBindingDimensions(bindingIndex).
     * 
     *  If ICudaEngine::isShapeBinding(bindingIndex) and ICudaEngine::bindingIsInput(bindingIndex)
     *  are both true, this method must be called before enqueueV2() or executeV2() may be called.
     *  This method will fail unless a valid optimization profile is defined for the current
     *  execution context (getOptimizationProfile() must not be -1).
     * 
     *  \warning This function will trigger layer resource updates on the next call of
     *           enqueueV2()/executeV2(), possibly resulting in performance bottlenecks, if the
     *           shapes are different than the previous set shapes.
     * 
     *  @return false if an error occurs (e.g. bindingIndex is out of range for the currently selected
     *          optimization profile or shape data is inconsistent with min-max range of the
     *          optimization profile), else true. Note that the network can still be invalid for certain
     *          combinations of input shapes that lead to invalid output shapes. To confirm the correctness
     *          of the network input shapes, check whether the output binding has valid
     *          dimensions using getBindingDimensions() on the output bindingIndex. */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean setInputShapeBinding(int bindingIndex, @Const IntPointer data);
    public native @Cast("bool") @NoException(true) boolean setInputShapeBinding(int bindingIndex, @Const IntBuffer data);
    public native @Cast("bool") @NoException(true) boolean setInputShapeBinding(int bindingIndex, @Const int[] data);

    /**
     *  \brief Get values of an input tensor required for shape calculations or an output tensor produced by shape
     *  calculations.
     * 
     *  @param bindingIndex index of an input or output tensor for which
     *         ICudaEngine::isShapeBinding(bindingIndex) is true.
     * 
     *  @param data pointer to where values will be written.  The number of values written is
     *         the product of the dimensions returned by getBindingDimensions(bindingIndex).
     * 
     *  If ICudaEngine::bindingIsInput(bindingIndex) is false, then both
     *  allInputDimensionsSpecified() and allInputShapesSpecified() must be true
     *  before calling this method. The method will also fail if no valid optimization profile
     *  has been set for the current execution context, i.e. if getOptimizationProfile() returns -1.
     * 
     *  @see isShapeBinding(bindingIndex)
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean getShapeBinding(int bindingIndex, IntPointer data);
    public native @Cast("bool") @NoException(true) boolean getShapeBinding(int bindingIndex, IntBuffer data);
    public native @Cast("bool") @NoException(true) boolean getShapeBinding(int bindingIndex, int[] data);

    /**
     *  \brief Whether all dynamic dimensions of input tensors have been specified
     * 
     *  @return True if all dynamic dimensions of input tensors have been specified
     *          by calling setBindingDimensions().
     * 
     *  Trivially true if network has no dynamically shaped input tensors.
     * 
     *  @see setBindingDimensions(bindingIndex,dimensions)
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean allInputDimensionsSpecified();

    /**
     *  \brief Whether all input shape bindings have been specified
     * 
     *  @return True if all input shape bindings have been specified by setInputShapeBinding().
     * 
     *  Trivially true if network has no input shape bindings.
     * 
     *  @see isShapeBinding(bindingIndex)
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean allInputShapesSpecified();

    /**
     *  \brief Set the ErrorRecorder for this interface
     * 
     *  Assigns the ErrorRecorder to this interface. The ErrorRecorder will track all errors during execution.
     *  This function will call incRefCount of the registered ErrorRecorder at least once. Setting
     *  recorder to nullptr unregisters the recorder with the interface, resulting in a call to decRefCount if
     *  a recorder has been registered.
     * 
     *  If an error recorder is not set, messages will be sent to the global log stream.
     * 
     *  @param recorder The error recorder to register with this interface. */
    //
    /** @see getErrorRecorder()
    /** */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setErrorRecorder(IErrorRecorder recorder);

    /**
     *  \brief Get the ErrorRecorder assigned to this interface.
     * 
     *  Retrieves the assigned error recorder object for the given class. A nullptr will be returned if
     *  an error handler has not been set.
     * 
     *  @return A pointer to the IErrorRecorder object that has been registered.
     * 
     *  @see setErrorRecorder()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) IErrorRecorder getErrorRecorder();

    /**
     *  \brief Synchronously execute inference a network.
     * 
     *  This method requires an array of input and output buffers. The mapping from tensor names to indices can be
     *  queried using ICudaEngine::getBindingIndex().
     *  This method only works for execution contexts built with full dimension networks.
     *  @param bindings An array of pointers to input and output buffers for the network.
     * 
     *  @return True if execution succeeded.
     * 
     *  @see ICudaEngine::getBindingIndex() ICudaEngine::getMaxBatchSize()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean executeV2(@Cast("void*const*") PointerPointer bindings);
    public native @Cast("bool") @NoException(true) boolean executeV2(@Cast("void*const*") @ByPtrPtr Pointer bindings);

    /**
     *  \brief Asynchronously execute inference.
     * 
     *  This method requires an array of input and output buffers. The mapping from tensor names to indices can be
     *  queried using ICudaEngine::getBindingIndex().
     *  This method only works for execution contexts built with full dimension networks.
     *  @param bindings An array of pointers to input and output buffers for the network.
     *  @param stream A cuda stream on which the inference kernels will be enqueued
     *  @param inputConsumed An optional event which will be signaled when the input buffers can be refilled with new
     *  data
     * 
     *  @return True if the kernels were enqueued successfully.
     * 
     *  @see ICudaEngine::getBindingIndex() ICudaEngine::getMaxBatchSize()
     * 
     *  \note Calling enqueueV2() with a stream in CUDA graph capture mode has a known issue. If dynamic shapes are
     *        used, the first enqueueV2() call after a setInputShapeBinding() call will cause failure in stream capture
     *        due to resource allocation. Please call enqueueV2() once before capturing the graph.
     * 
     *  \warning Calling enqueueV2() in from the same IExecutionContext object with different CUDA streams concurrently
     *           results in undefined behavior. To perform inference concurrently in multiple streams, use one execution
     *           context per stream.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean enqueueV2(@Cast("void*const*") PointerPointer bindings, CUstream_st stream, @ByPtrPtr CUevent_st inputConsumed);
    public native @Cast("bool") @NoException(true) boolean enqueueV2(@Cast("void*const*") @ByPtrPtr Pointer bindings, CUstream_st stream, @ByPtrPtr CUevent_st inputConsumed);

    /**
     *  \brief Select an optimization profile for the current context with async
     *  semantics.
     * 
     *  @param profileIndex Index of the profile. The value must lie between 0 and
     *         getEngine().getNbOptimizationProfiles() - 1
     * 
     *  @param stream A cuda stream on which the cudaMemcpyAsyncs may be
     *  enqueued
     * 
     *  When an optimization profile is switched via this API, TensorRT may
     *  require that data is copied via cudaMemcpyAsync. It is the
     *  application’s responsibility to guarantee that synchronization between
     *  the profile sync stream and the enqueue stream occurs.
     * 
     *  The selected profile will be used in subsequent calls to executeV2() or
     *  enqueueV2().
     *  If the associated CUDA engine has inputs with dynamic shapes, the
     *  optimization profile must be set with a unique profileIndex before
     *  calling execute or enqueue.
     *  For the first execution context that is created for an engine,
     *  setOptimizationProfile(0) is called implicitly.
     * 
     *  If the associated CUDA engine does not have inputs with dynamic shapes,
     *  this method need not be called, in which case the default profile index
     *  of 0 will be used.
     * 
     *  setOptimizationProfileAsync() must be called before calling
     *  setBindingDimensions() and setInputShapeBinding() for all dynamic input
     *  tensors or input shape tensors, which in turn must be called before
     *  either executeV2() or enqueueV2().
     * 
     *  \warning This function will trigger layer resource updates on the next call of
     *           enqueueV2()/executeV2(), possibly resulting in performance bottlenecks.
     * 
     *  \warning Not synchronizing the stream used at enqueue with the stream
     *  used to set optimization profile asynchronously using this API will
     *  result in undefined behavior.
     * 
     *  @return true if the call succeeded, else false (e.g. input out of range)
     * 
     *  @see ICudaEngine::getNbOptimizationProfiles()
     *  @see IExecutionContext::setOptimizationProfile() */
    
    
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean setOptimizationProfileAsync(int profileIndex, CUstream_st stream);

    /**
     *  \brief Set whether enqueue emits layer timing to the profiler
     * 
     *  If set to true (default), enqueue is synchronous and does layer timing profiling implicitly if
     *  there is a profiler attached.
     *  If set to false, enqueue will be asynchronous if there is a profiler attached. An extra method
     *  reportToProfiler() needs to be called to obtain the profiling data and report to the profiler attached.
     * 
     *  @see IExecutionContext::getEnqueueEmitsProfile()
     *  @see IExecutionContext::reportToProfiler() */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setEnqueueEmitsProfile(@Cast("bool") boolean enqueueEmitsProfile);

    /**
     *  \brief Get the enqueueEmitsProfile state.
     * 
     *  @return The enqueueEmitsProfile state.
     * 
     *  @see IExecutionContext::setEnqueueEmitsProfile() */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean getEnqueueEmitsProfile();

    /**
     *  \brief Calculate layer timing info for the current optimization profile in IExecutionContext
     *  and update the profiler after one iteration of inference launch.
     * 
     *  If IExecutionContext::getEnqueueEmitsProfile() returns true, the enqueue function will calculate layer timing
     *  implicitly if a profiler is provided. This function returns true and does nothing.
     * 
     *  If IExecutionContext::getEnqueueEmitsProfile() returns false, the enqueue function will record the CUDA event
     *  timers if a profiler is provided. But it will not perform the layer timing calculation.
     *  IExecutionContext::reportToProfiler() needs to be called explicitly to calculate layer timing for the previous
     *  inference launch.
     * 
     *  In the CUDA graph launch scenario, it will record the same set of CUDA events
     *  as in regular enqueue functions if the graph is captured from an IExecutionContext with profiler enabled.
     *  This function needs to be called after graph launch to report the layer timing info to the profiler.
     * 
     *  \warning profiling CUDA graphs is only available from CUDA 11.1 onwards.
     *  \warning reportToProfiler uses the stream of the previous enqueue call, so the stream must be live otherwise
     *  behavior is undefined.
     * 
     *  @return true if the call succeeded, else false (e.g. profiler not provided, in CUDA graph capture mode, etc.)
     * 
     *  @see IExecutionContext::setEnqueueEmitsProfile()
     *  @see IExecutionContext::getEnqueueEmitsProfile() */
    public native @Cast("bool") @NoException(true) boolean reportToProfiler();
}
