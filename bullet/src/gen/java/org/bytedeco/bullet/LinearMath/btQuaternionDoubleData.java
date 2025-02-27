// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btQuaternionDoubleData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btQuaternionDoubleData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btQuaternionDoubleData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btQuaternionDoubleData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btQuaternionDoubleData position(long position) {
        return (btQuaternionDoubleData)super.position(position);
    }
    @Override public btQuaternionDoubleData getPointer(long i) {
        return new btQuaternionDoubleData((Pointer)this).offsetAddress(i);
    }

	public native double m_floats(int i); public native btQuaternionDoubleData m_floats(int i, double setter);
	@MemberGetter public native DoublePointer m_floats();
}
