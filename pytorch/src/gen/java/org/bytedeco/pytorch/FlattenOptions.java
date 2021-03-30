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


// ============================================================================

/** Options for the {@code Flatten} module.
 * 
 *  Example:
 *  <pre>{@code
 *  Flatten model(FlattenOptions().start_dim(2).end_dim(4));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FlattenOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FlattenOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FlattenOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlattenOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FlattenOptions position(long position) {
        return (FlattenOptions)super.position(position);
    }
    @Override public FlattenOptions getPointer(long i) {
        return new FlattenOptions((Pointer)this).position(position + i);
    }

  public native @Cast("int64_t*") @ByRef @NoException LongPointer start_dim();
  public native @Cast("int64_t*") @ByRef @NoException LongPointer end_dim();
}