// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ LPPool1d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the LPPool1d function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.LPPool1d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::LPPool1dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  LPPool1d model(LPPool1dOptions(1, 2).stride(5).ceil_mode(true));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LPPool1dImpl extends LPPool1dImplBase {
    static { Loader.load(); }

  
    public LPPool1dImpl(double norm_type, @ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size) { super((Pointer)null); allocate(norm_type, kernel_size); }
    @NoDeallocator private native void allocate(double norm_type, @ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size);
    public LPPool1dImpl(@Const @ByRef LPPool1dOptions options_) { super((Pointer)null); allocate(options_); }
    @NoDeallocator private native void allocate(@Const @ByRef LPPool1dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LPPool1dImpl(Pointer p) { super(p); }


  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

}