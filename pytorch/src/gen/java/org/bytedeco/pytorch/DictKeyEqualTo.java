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


@Namespace("c10::detail") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DictKeyEqualTo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DictKeyEqualTo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DictKeyEqualTo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DictKeyEqualTo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DictKeyEqualTo position(long position) {
        return (DictKeyEqualTo)super.position(position);
    }
    @Override public DictKeyEqualTo getPointer(long i) {
        return new DictKeyEqualTo((Pointer)this).offsetAddress(i);
    }

  public native @Cast("bool") @Name("operator ()") boolean apply(@Const @ByRef IValue lhs, @Const @ByRef IValue rhs);
}
