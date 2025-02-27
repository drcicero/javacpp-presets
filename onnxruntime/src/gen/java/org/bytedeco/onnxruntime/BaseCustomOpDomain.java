// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Name("Ort::Base<OrtCustomOpDomain>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseCustomOpDomain extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseCustomOpDomain(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseCustomOpDomain(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseCustomOpDomain position(long position) {
        return (BaseCustomOpDomain)super.position(position);
    }
    @Override public BaseCustomOpDomain getPointer(long i) {
        return new BaseCustomOpDomain((Pointer)this).offsetAddress(i);
    }


  public BaseCustomOpDomain() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseCustomOpDomain(OrtCustomOpDomain p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtCustomOpDomain p);

  public native @Name("operator OrtCustomOpDomain*") OrtCustomOpDomain asOrtCustomOpDomain();

  /** \brief Releases ownership of the contained pointer */
  public native OrtCustomOpDomain release();
}
