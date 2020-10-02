// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief The preference for memory preallocation of fixed-width type outputs
 *  in kernel execution. */
@Namespace("arrow::compute") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class MemAllocation extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MemAllocation() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MemAllocation(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MemAllocation(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MemAllocation position(long position) {
        return (MemAllocation)super.position(position);
    }
    @Override public MemAllocation getPointer(long i) {
        return new MemAllocation(this).position(position + i);
    }

  public enum type {
    // For data types that support pre-allocation (i.e. fixed-width), the
    // kernel expects to be provided a pre-allocated data buffer to write
    // into. Non-fixed-width types must always allocate their own data
    // buffers. The allocation made for the same length as the execution batch,
    // so vector kernels yielding differently sized output should not use this.
    //
    // It is valid for the data to not be preallocated but the validity bitmap
    // is (or is computed using the intersection/bitwise-and method).
    //
    // For variable-size output types like BinaryType or StringType, or for
    // nested types, this option has no effect.
    PREALLOCATE(0),

    // The kernel is responsible for allocating its own data buffer for
    // fixed-width type outputs.
    NO_PREALLOCATE(1);

      public final int value;
      private type(int v) { this.value = v; }
      private type(type e) { this.value = e.value; }
      public type intern() { for (type e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
}