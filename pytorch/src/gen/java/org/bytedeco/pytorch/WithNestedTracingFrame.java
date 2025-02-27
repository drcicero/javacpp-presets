// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("torch::jit::tracer") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class WithNestedTracingFrame extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WithNestedTracingFrame(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WithNestedTracingFrame(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public WithNestedTracingFrame position(long position) {
        return (WithNestedTracingFrame)super.position(position);
    }
    @Override public WithNestedTracingFrame getPointer(long i) {
        return new WithNestedTracingFrame((Pointer)this).offsetAddress(i);
    }

  // NOLINTNEXTLINE(modernize-use-equals-default)
  public WithNestedTracingFrame() { super((Pointer)null); allocate(); }
  private native void allocate();

  // NOLINTNEXTLINE(modernize-use-equals-default)
}
