// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btShapeMatrix extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btShapeMatrix() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btShapeMatrix(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btShapeMatrix(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btShapeMatrix position(long position) {
        return (btShapeMatrix)super.position(position);
    }
    @Override public btShapeMatrix getPointer(long i) {
        return new btShapeMatrix((Pointer)this).offsetAddress(i);
    }

	public native double m_vec(int i); public native btShapeMatrix m_vec(int i, double setter);
	@MemberGetter public native DoublePointer m_vec();

	public native @ByRef @Name("operator []") DoublePointer get(int i);
}
